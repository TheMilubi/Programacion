package com.company;

import java.io.*;
import java.util.*;

public class Grupo {
    private List<Alumno> listaAlumnos;
    public Grupo(){
        listaAlumnos = new LinkedList<>();
    }
    public void insertaAlumnoLista(Alumno a){
        listaAlumnos.add(a);
    }
    public void insertaAlumnoLista(String nombre, int edad, double calificacion){
        try {
            listaAlumnos.add(new Alumno(nombre, edad, calificacion));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String toString(){
        String str = "";
        for (Alumno a:listaAlumnos) {
            str = str+a.getNombre()+";"+a.getEdad()+";"+a.getCalificacion()+"\n";
        }
        return str;
    }
    public void escribeFicheroBinario(String fichero){
        try{
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(listaAlumnos.size());
            for (Alumno x: listaAlumnos) {
                dos.writeUTF(x.getNombre());
                dos.writeInt(x.getEdad());
                dos.writeDouble(x.getCalificacion());
            }
            dos.close();
            fos.close();
            System.out.println("Escrito!");
        }catch (Exception e){
            System.out.println("Error en escribeFicheroBinario: "+e.getMessage());
            e.printStackTrace();
        }
    }
    public void leeFicheroBinario(String fichero){
        listaAlumnos.clear();
        try{
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);
            int size = dis.readInt();
            while (listaAlumnos.size()<size){
                listaAlumnos.add(new Alumno(dis.readUTF(),dis.readInt(),dis.readDouble()));
            }
            dis.close();
            fis.close();
            System.out.println("Leido!");
        }catch (Exception e){
            System.out.println("Error en leeFicheroBinario: "+e.getMessage());
            e.printStackTrace();
        }
    }
    public void escribeFicheroTexto(String fichero){
        try {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(listaAlumnos.size()));
            bw.newLine();
            for (Alumno x: listaAlumnos ) {
                bw.write(x.getNombre());
                bw.newLine();
                bw.write(String.valueOf(x.getEdad()));
                bw.newLine();
                bw.write(String.valueOf(x.getCalificacion()));
                bw.newLine();
            }
            bw.close();
            fw.close();
            System.out.println("Escrito!");
        }catch (Exception e){
            System.out.println("Error en escribeFicheroTexto: "+e.getMessage());
            e.printStackTrace();
        }
    }
    public void leeFicheroTexto(String fichero){
        listaAlumnos.clear();
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            int size = Integer.valueOf(br.readLine());
            while (listaAlumnos.size()<size){
                listaAlumnos.add(new Alumno(br.readLine(),Integer.valueOf(br.readLine()),Double.valueOf(br.readLine())));
            }
            br.close();
            fr.close();
            System.out.println("Leido!");
        }catch (Exception e){
            System.out.println("Error en leeFicheroTexto: "+e.getMessage());
            e.printStackTrace();
        }
    }
    public void escribeFicheroCSV(String fichero){
        try {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(this.toString());
            bw.close();
            fw.close();
            System.out.println("Escrito!");
        }catch (Exception e){
            System.out.println("Error en escribeFicheroCSV: "+e.getMessage());
            e.printStackTrace();
        }
    }
    public void leeFicheroCSV(String fichero){
        listaAlumnos.clear();
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            while (s != null){
                String[] array = s.split(";");
                if(array.length==3){
                    String n = array[0];
                    int e = Integer.valueOf(array[1]);
                    double c = Double.valueOf(array[2]);
                    listaAlumnos.add(new Alumno(n,e,c));
                }
                s = br.readLine();
            }
            br.close();
            fr.close();
            System.out.println("Leido!");
        }catch (Exception e){
            System.out.println("Error en leeFicheroCSV: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
