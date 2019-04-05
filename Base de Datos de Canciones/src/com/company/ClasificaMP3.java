package com.company;

import java.io.*;
import java.util.*;
import java.nio.file.*;

public class ClasificaMP3 {
    private MusicaDB db = null;
    public ClasificaMP3(MusicaDB db){
        this.db = db;
    }
    public void nuevaCancion(String ruta){
        Scanner sc = new Scanner(System.in);
        Cancion cancion = new Cancion();
        String nombre = "";
        if (db.existeFichero(ruta)){
            //Si la ruta a la cancion ya esta en la bd, no se añade
            System.out.println("La cancion ya existe en la bd");
        }
        else {
            if(Files.exists(Path.of(ruta))) {
                cancion.ruta = ruta;
                String fichero = ruta.substring(ruta.lastIndexOf("/") + 1);
                if (fichero.contains("-")) {
                    //Mira si contiene el nombre del artista
                    cancion.titulo = fichero.substring(fichero.lastIndexOf("-")+1,fichero.lastIndexOf(".")).trim();
                    nombre = fichero.substring(0,fichero.lastIndexOf("-")).trim();
                    cancion.idArtista = db.buscaArtista(nombre);
                    if (cancion.idArtista == -1){
                        cancion.idArtista = db.insertaArtista(nombre);
                    }
                }
                else {
                    //Si no contiene el nombre del artista
                    cancion.titulo = fichero.substring(0,fichero.lastIndexOf(".")).trim();
                    System.out.println("Artista: ");
                    nombre = sc.nextLine();
                    cancion.idArtista = db.buscaArtista(nombre);
                    if (cancion.idArtista == -1){
                        cancion.idArtista = db.insertaArtista(nombre);
                    }
                }
                //Pregunta por el resto de la informacion de la cancion
                System.out.println("Estilo: ");
                String estilo = sc.next();
                cancion.idEstilo = db.buscaEstilo(estilo);
                if(cancion.idEstilo==-1){
                    cancion.idEstilo = db.insertaEstilo(estilo);
                }
                System.out.println("Año: ");
                cancion.anno = sc.nextInt();
                System.out.println("Estrellas: ");
                cancion.estrellas = sc.nextInt();
                cancion.id = db.insertaCancion(cancion.ruta,cancion.titulo,cancion.idArtista,cancion.idEstilo,cancion.anno,cancion.estrellas);
                System.out.println(cancion);
            }
        }
    }
    public void buscaCanciones(String directorio){
        try {
            File d = new File(directorio);
            //Comprueba que el directorio existe
            if (d.exists()) {
                File[] ficheros = d.listFiles();
                if (ficheros.length > 0) {
                    for (int i = 0; i < ficheros.length; i++) {
                        //Si no es un directorio y tiene la extension mp3, se procesa con nueva cancion
                        if (ficheros[i].isFile() && ficheros[i].getName().endsWith(".mp3")) {
                            System.out.println(ficheros[i].getAbsolutePath());
                            this.nuevaCancion(ficheros[i].getAbsolutePath());
                        }
                    }
                }
            }
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public void buscaCancionesRecursivo(String directorio){
        try {
            File d = new File(directorio);
            //Comprueba que el directorio existe
            if (d.exists()) {
                File[] ficheros = d.listFiles();
                if (ficheros.length > 0) {
                    for (int i = 0; i < ficheros.length; i++) {
                        //Si no es un directorio y tiene la extension mp3, se procesa con nueva cancion
                        if (ficheros[i].isDirectory()){
                            buscaCanciones(ficheros[i].getAbsolutePath());
                        }
                        else if (ficheros[i].getName().endsWith(".mp3")) {
                            System.out.println(ficheros[i].getAbsolutePath());
                            this.nuevaCancion(ficheros[i].getAbsolutePath());
                        }
                    }
                }
            }
        }catch (NullPointerException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    private void escribeFicheroM3U(String fichero, List<Cancion> lista){
        File f = new File(fichero);
        if(f.getName().endsWith(".m3u")){
            try {
                f.createNewFile();
                FileWriter fw = new FileWriter(f);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("#EXTM3U");
                bw.newLine();bw.newLine();
                for (Cancion c:lista) {
                    bw.write(String.format("#EXTINF:0, %s - %s\n",db.artista(c.idArtista),db.estilo(c.idEstilo)));
                    bw.newLine();
                    bw.write(c.ruta);
                    bw.newLine();bw.newLine();
                }
                bw.close();
                fw.close();
            }catch (Exception e){
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
    public void generaListaReproduccionAleatoria(String fichero){
        List<Cancion> listaCanciones = db.listadoCanciones();
        Collections.shuffle(listaCanciones);
        escribeFicheroM3U(fichero,listaCanciones);
    }
    public void generaListaReproduccion(String fichero) {
        List<Cancion> listaCanciones = db.listadoCanciones();
        escribeFicheroM3U(fichero,listaCanciones);
    }
    public boolean generaListaReproduccionArtista(String fichero, String artista, boolean aleatorio){
        boolean existe = true;
        if(db.buscaArtista(artista)==-1){
            System.out.println("El artista no existe en la bd");
            existe = false;
        }
        else {
            List<Cancion> listaCanciones = db.listadoCancionesPorArtista(db.buscaArtista(artista));
            if (aleatorio) {
                Collections.shuffle(listaCanciones);
            }
            escribeFicheroM3U(fichero, listaCanciones);
        }
        return existe;
    }
    public boolean generaListaReproduccionEstilo(String fichero, String estilo, boolean aleatorio){
        boolean existe = true;
        if(db.buscaEstilo(estilo)==-1){
            System.out.println("El estilo no existe en la bd");
            existe = false;
        }
        else {
            List<Cancion> listaCanciones = db.listadoCancionesPorEstilo(db.buscaEstilo(estilo));
            if (aleatorio) {
                Collections.shuffle(listaCanciones);
            }
            escribeFicheroM3U(fichero, listaCanciones);
        }
        return existe;
    }
    public void generaListaReproduccionEstrellas(String fichero, int minimo, int maximo, boolean aleatorio){
        List<Cancion> listaCanciones = db.listadoCancionesPorEstrellas(minimo,maximo);
        if (aleatorio) {
            Collections.shuffle(listaCanciones);
        }
        escribeFicheroM3U(fichero, listaCanciones);
    }
    public void generaListaReproduccionAnno(String fichero, int minimo, int maximo, boolean aleatorio){
        List<Cancion> listaCanciones = db.listadoCancionesPorAnno(minimo,maximo);
        if (aleatorio) {
            Collections.shuffle(listaCanciones);
        }
        escribeFicheroM3U(fichero, listaCanciones);
    }
}
