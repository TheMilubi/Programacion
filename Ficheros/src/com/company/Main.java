package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Menu");
        System.out.println("************");
        System.out.print("Escribe el numero del ejercicio [1-21]: ");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:{
                escribeFicheroNumRandom10("Fichero1");
            }break;
            case 2:{
                System.out.println(sumaFicheroInt10("Fichero1"));
            }break;
            case 3:{
                escribeFicheroNumRandom("Fichero3",7);
            }break;
            case 4:{
                System.out.println(sumaFicheroInt("Fichero3"));
            }break;
            case 5:{
                escribeFicheroTexto("Fichero5");
            }break;
            case 6:{
                leeFicheroTexto("Fichero5");
            }break;
            case 7:{
                copiaFicheroTexto("Fichero5","Fichero7");
            }break;
            case 8:{
                invierteLineasFichero("Fichero5","Fichero8");
            }break;
            case 9:{
                invierteFichero("Fichero5","Fichero9");
            }break;
            case 10:{
                separaPalabrasFichero("Fichero5","Fichero10");
            }break;
            case 11:{
                escribeFichero1_100("FicheroBin11");
            }break;
            case 12:{
                leeFicheroInt100("FicheroBin11");
            }break;
            case 13:{
                escribeFicheroIntAleatorio("FicheroBin13",10);
            }break;
            case 14:{
                escribeFicheroIntAleatorioPro("FicheroBin14",10,-7,7);
            }break;
            case 15:{
                System.out.println("FICHERO 13:");
                leeFicheroInt("FicheroBin13");
                System.out.println("FICHERO 14:");
                leeFicheroInt("FicheroBin14");
            }break;
            case 16:{
                System.out.println(sumaFicheroIntBin("FicheroBin11"));
            }break;
            case 17:{
                System.out.println(leeFicheroIntLista("FicheroBin11"));
            }break;
            case 18:{
                List<Integer> lista = leeFicheroIntLista("FicheroBin11");
                escribeFicheroIntLista("FicheroBin18",lista);
                leeFicheroInt("FicheroBin18");
            }break;
            case 19:{
                ordenaFicheroInt("FicheroBin14");
                leeFicheroInt("FicheroBin14");
            }break;
            case 20:{
                separaFicheroInt("FicheroBin14");
                System.out.println("Negativos:");
                leeFicheroInt("FicheroBin14Negativos");
                System.out.println("Positivos:");
                leeFicheroInt("FicheroBin14Positivos");
            }break;
            case 21:{
                invierteFicheroInt("FicheroBin14");
                leeFicheroInt("FicheroBin14");
            }break;
            default: System.out.println("Opcion no valida");
        }
    }
    //Escribe una función escribeFicheroNumRandom10 a la que le pasas un nombre de
    //fichero y te crea un fichero con ese nombre que contiene 10 números aleatorios en
    //diferentes líneas.
    public static void escribeFicheroNumRandom10(String nombre){
        try{
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);
            Random r = new Random();
            for (int i = 0; i < 10; i++) {

                bw.write(""+r.nextInt(10)+"\n");
            }
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("Error en escribeFicheroNumRandom10: "+e.getMessage());
        }
    }
    //2. Escribe una función sumaFicheroInt10 a la que le pasas un fichero con 10 líneas (que
    //debe contener enteros en diferentes líneas, como el del ejercicio anterior) y te
    //devuelve la suma de todos los números contenidos en el fichero.
    public static int sumaFicheroInt10(String nombre){
        int contador = 0;
        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            String s;
            s = br.readLine();
            while (s != null){
                contador += Integer.valueOf(s);
                s = br.readLine();
            }
            br.close();
            fr.close();
        }catch (Exception e){
            System.out.println("Error en sumaFicheroInt10: "+ e.getMessage());
        }
        return contador;
    }
    //3. Escribe una función escribeFicheroNumRandom a la que le pasas un nombre de
    //fichero y un entero y te escribe tantos números aleatorios como le hayas dicho en un
    //fichero de texto
    public static void escribeFicheroNumRandom(String nombre, int cantidad){
        try{
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);
            Random r = new Random();
            for (int i = 0; i < cantidad; i++) {

                bw.write(""+r.nextInt(10)+"\n");
            }
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("Error en escribeFicheroNumRandom10: "+e.getMessage());
        }
    }
    //4. Escribe una función sumaFicheroInt a la que le pasas un nombre de fichero y te
    //devuelve un entero resultante de sumar todos los números contenidos en el fichero
    //(que puede tener tantas líneas como haga falta).
    public static int sumaFicheroInt(String nombre){
        int contador = 0;
        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            String s;
            s = br.readLine();
            while (s != null){
                contador += Integer.valueOf(s);
                s = br.readLine();
            }
            br.close();
            fr.close();
        }catch (Exception e){
            System.out.println("Error en sumaFicheroInt10: "+ e.getMessage());
        }
        return contador;
    }
    //5. Escribe una función escribeFicheroTexto a la que le pasas un nombre de fichero. La
    //función ira pidiendo al usuario que escriba líneas de texto, que se irán guardando en el
    //fichero, hasta que introduzca una línea en blanco (“”)
    public static void escribeFicheroTexto(String nombre){
        try{
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            while (s.length()>0) {

                bw.write(s+"\n");
                s = sc.nextLine();
            }
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("Error en escribeFicheroNumRandom10: "+e.getMessage());
        }
    }
    //6. Escribe la función leeFicheroTexto a la que le pasas un nombre de fichero y te pone el
    //contenido de fichero por pantalla.
    public static void leeFicheroTexto(String nombre){
        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            String s;
            s = br.readLine();
            while (s != null){
                System.out.println(s);
                s = br.readLine();
            }
            br.close();
            fr.close();
        }catch (Exception e){
            System.out.println("Error en sumaFicheroInt10: "+ e.getMessage());
        }
    }
    //7. Escribe la función copiaFicheroTexto a la que le pasas dos nombres de fichero y copias
    //el contenido del primer fichero en el segundo.
    public static void copiaFicheroTexto(String origen, String destino){
        try {
            FileReader fr = new FileReader(origen);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(destino);
            BufferedWriter bw = new BufferedWriter(fw);
            String s;
            s = br.readLine();
            while (s != null){
                bw.write(s+"\n");
                s = br.readLine();
            }
            br.close();
            fr.close();
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("Error en sumaFicheroInt10: "+ e.getMessage());
        }
    }
    //8. Escribe la función invierteLineasFichero a las que la pasas dos nombres de fichero y te
    //copia las líneas del primer fichero al segundo fichero, pero invertidas (con el primer
    //carácter al final y el último al principio, etc.). Podéis usar la función de invertir cadenas
    //que ya tenéis hecha.
    public static void invierteLineasFichero(String origen, String destino){
        try {
            FileReader fr = new FileReader(origen);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(destino);
            BufferedWriter bw = new BufferedWriter(fw);
            String s = br.readLine();

            while (s != null){
                bw.write(invierteCadena(s+"\n"));
                s = br.readLine();
            }
            br.close();
            fr.close();
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("Error en invierteLineasFichero: "+ e.getMessage());
        }
    }
    //9. Escribe la función invierteFicheroTexto a la que le pasas un nombre de fichero y te
    //invierte el contenido del fichero, es decir, la primera línea la pone la última, la segunda
    //la pone la penúltima, etc. Hay varias formas de hacerlo; la más fácil es con una lista de
    //cadenas
    public static void invierteFichero(String origen, String destino){
        try {
            FileReader fr = new FileReader(origen);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(destino);
            BufferedWriter bw = new BufferedWriter(fw);
            String s = br.readLine();
            String texto = "";
            while (s != null) {
                texto = texto + s;
                s = br.readLine();
                if (s != null) {
                    texto = texto + "\n";
                }
            }
            bw.write(invierteCadena(texto));
            br.close();
            fr.close();
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("Error en invierteFichero: "+ e.getMessage());
        }
    }
    public static String invierteCadena(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    //10. Escribe la función separaPalabrasFichero a la que le pasas dos nombres de fichero. Te
    //cogerá el primer fichero (que contendrá frases) y te separará las palabras, que
    //escribirá en el segundo fichero (que tendrá una palabra en cada línea)
    public static void separaPalabrasFichero(String origen, String destino){
        try {
            FileReader fr = new FileReader(origen);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(destino);
            BufferedWriter bw = new BufferedWriter(fw);
            String s = br.readLine();
            String [] texto;
            while (s != null) {
                texto = s.split(" ");
                for (int i = 0; i < texto.length; i++) {
                    bw.write(texto[i]+"\n");
                }
                s = br.readLine();
            }
            br.close();
            fr.close();
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("Error en separaPalabrasFichero: "+ e.getMessage());
        }
    }
    //11. Escribe una función escribeFichero1_100 que te escriba en un fichero binario cuyo
    //nombre le pasas por parámetro (p.ej.: “datos01.bin”) los valores enteros desde 1 hasta
    //100
    public static void escribeFichero1_100(String nombre){
        try {

            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream bos = new DataOutputStream(fos);
            for (int i = 1; i < 101; i++) {
                bos.writeInt(i);
            }
            bos.close();
            fos.close();
        }catch (Exception e){
            System.out.println("Error en escribeFichero1_100: "+ e.getMessage());
        }
    }
    //12. Escribe una función leeFicheroInt100 que te lea del fichero que le pasas por
    //parámetro los 100 primeros valores enteros.
    public static void leeFicheroInt100(String nombre){
        try {

            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream bis = new DataInputStream(fis);
            while(bis.available()>0){
                System.out.println(bis.readInt());
            }
            bis.close();
            fis.close();
        }catch (Exception e){
            System.out.println("Error en leeFicheroInt100: "+ e.getMessage());
        }
    }
    //13. Escribe una función escribeFicheroIntAleatorio a la que le pasas el nombre del fichero
    //y cuántos números aleatorios queremos escribir en el mismo. Los números aleatorios
    //serán entre 1 y 100 y serán de tipo int.
    public static void escribeFicheroIntAleatorio(String nombre, int cantidad){
        Random r = new Random();
        try {
            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream bos = new DataOutputStream(fos);
            for (int i = 0; i < cantidad; i++) {
                bos.writeInt(r.nextInt(100)+1);
            }
            bos.close();
            fos.close();
        }catch (Exception e){
            System.out.println("Error en escribeFicheroIntAleatorio: "+ e.getMessage());
        }
    }
    //14. Escribe una función escribeFicheroIntAleatorioPro a la que le pasas lo siguiente: el
    //nombre del fichero, número de valores que se van a generar, el valor mínimo y el valor
    //máximo. Así, escribeFicheroIntAleatorioPro(“datos.bin”, 10, -5, 5) nos escribirá diez
    //valores aleatorios entre -5 y 5 en el fichero datos.bin.
    public static void escribeFicheroIntAleatorioPro(String nombre, int cantidad, int min, int max){
        Random r = new Random();
        try {
            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream bos = new DataOutputStream(fos);
            for (int i = 0; i < cantidad; i++) {
                bos.writeInt(r.nextInt(max-min+1)+min);
            }
            bos.close();
            fos.close();
        }catch (Exception e){
            System.out.println("Error en escribeFicheroIntAleatorioPro: "+ e.getMessage());
        }
    }
    //15. Escribe una función leeFicheroInt que te lea del fichero que le pasas por parámetro
    //todos los valores enteros que haya en él.
    public static void leeFicheroInt(String nombre){
        try {

            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream bis = new DataInputStream(fis);
            while(bis.available()>0){
                System.out.println(bis.readInt());
            }
            bis.close();
            fis.close();
        }catch (Exception e){
            System.out.println("Error en leeFicheroInt: "+ e.getMessage());
        }
    }
    //16. Escribe una función sumaFicheroInt que te lea de un fichero todos los valores enteros,
    //los sume y te devuelva el resultado.
    public static int sumaFicheroIntBin(String nombre){
        int suma = 0;
        try {

            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream bis = new DataInputStream(fis);
            while(bis.available()>0){
                suma+=bis.readInt();
            }
            bis.close();
            fis.close();
        }catch (Exception e){
            System.out.println("Error en sumaFicheroIntBin: "+ e.getMessage());
        }
        return suma;
    }
    //17. Escribe una función leeFicheroIntLista que te lea de un fichero todos los valores
    //enteros. Los valores los irá almacenando en una lista de enteros que devolverá. El
    //prototipo de la función será: List<Integer> LeeFicheroIntLista(String nombre_fichero).
    public static List<Integer> leeFicheroIntLista(String nombre){
        List<Integer> lista = new LinkedList<>();
        try {

            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream bis = new DataInputStream(fis);
            while(bis.available()>0){
                lista.add(bis.readInt());
            }
            bis.close();
            fis.close();
        }catch (Exception e){
            System.out.println("Error en leeFicheroIntLista: "+ e.getMessage());
        }
        return lista;
    }
    //18. Escribe una función escribeFicheroIntLista que te escriba en un fichero todos los
    //valores enteros de la lista que le pasamos por parámetro. El prototipo de la función
    //será: void LeeFicheroIntLista(String nombre_fichero, List<Integer> lista).
    public static void escribeFicheroIntLista(String nombre, List<Integer> lista){
        try {
            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream bos = new DataOutputStream(fos);
            for (int i = 0; i < lista.size(); i++) {
                bos.writeInt(lista.get(i));
            }
            bos.close();
            fos.close();
        }catch (Exception e){
            System.out.println("Error en escribeFicheroIntLista: "+ e.getMessage());
        }
    }
    //19. Escribe una función ordenaFicheroInt que te lea de un fichero los valores enteros que
    //haya, los ordene y vuelva a escribir en el mismo fichero los valores ya ordenados
    public static void ordenaFicheroInt(String nombre){
        List<Integer> lista = new LinkedList<>();
        lista = leeFicheroIntLista(nombre);
        lista.sort(Integer::compareTo);
        escribeFicheroIntLista(nombre,lista);
    }
    //20. Escribe una función separaFicheroInt a la que le pasaremos el nombre del fichero que
    //queremos separar. La función nos creará dos ficheros que tendrán el mismo nombre
    //que el de origen pero añadiéndole “positivos” o “negativos” detrás (ej.: “datos.bin” ->
    //“datos.binpositivos”, “datos.binnegativos”). En un fichero guardaremos todos los
    //números positivos que haya en el primer fichero y en el otro los negativos.
    public static void separaFicheroInt(String nombre){
        String nNegativos, nPositivos;
        nNegativos= nombre+"Negativos";
        nPositivos = nombre+"Positivos";
        List<Integer> lista, listaNeg, listaPos;
        listaNeg = new LinkedList<>();
        listaPos = new LinkedList<>();
        lista = leeFicheroIntLista(nombre);
        for (int num:lista) {
            if(num <0){
                listaNeg.add(num);
            }
            else if(num > 0) {
                listaPos.add(num);
            }
        }
        escribeFicheroIntLista(nPositivos,listaPos);
        escribeFicheroIntLista(nNegativos,listaNeg);
    }
    //21. Escribe una función invierteFicheroInt a la que le pasaremos un fichero que contiene
    //enteros e invertirá la posición de los valores dentro del fichero, es decir, lo escribirá de
    //atrás para delante.
    public static void invierteFicheroInt(String nombre){
        List<Integer> lista = leeFicheroIntLista(nombre);
        List<Integer> listaInv = new LinkedList<>();
        for (int i = lista.size()-1; i >= 0 ; i--) {
            listaInv.add(lista.get(i));
        }
        escribeFicheroIntLista(nombre, listaInv);
    }
}
