package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        List<FichaAlumno> registro = new LinkedList<>();
        do {
            System.out.println("Menu");
            System.out.println("************");
            System.out.print("Escribe el numero del ejercicio [1-8]: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0: System.out.println("Saliendo...");break;
                case 1: {
                    leeAlumnoLista(registro);
                }
                break;
                case 2: {
                    imprimeListaAlumnos(registro);
                }
                break;
                case 3: {
                    escribeFicheroAlumnosBinario(registro,"Fichero3");
                }break;
                case 4:{
                    leeFicheroAlumnosBinario(registro,"Fichero3");
                }break;
                case 5:{
                    escribeFicheroAlumnosTexto(registro,"Fichero5");
                }break;
                case 6:{
                    leeFicheroAlumnosTexto(registro,"Fichero5");
                }break;
                case 7:{
                    escribeFicheroAlumnosCSV(registro,"Fichero7");
                }break;
                case 8:{
                    leeFicheroAlumnosCSV(registro,"Fichero7");
                }break;

                default:
                    System.out.println("Opcion no valida");
            }
        }while (opcion!=0);
    }
    public static class FichaAlumno{
        public FichaAlumno(String nombre, int edad, double calificacion){
            this.nombre = nombre;
            this.edad = edad;
            this.calificacion = calificacion;
        }
        public String nombre;
        public int edad;
        public double calificacion;
    }
    //1. Escribe una función leeAlumnoLista a la que le pasas la lista de alumnos y te pide un
    //nuevo alumno desde el teclado, cuyos datos se añadirán a la lista.
    public static void leeAlumnoLista(List<FichaAlumno> lista){
        Scanner sc = new Scanner(System.in);
        System.out.println("Alumno");
        System.out.println("---------------------");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Calificacion: ");
        double calificacion = sc.nextDouble();
        lista.add(new FichaAlumno(nombre,edad,calificacion));
    }
    //2. Escribe una función imprimeListaAlumnos a la que la pasas la lista de alumnos y te la
    //imprime por pantalla
    public static void imprimeListaAlumnos(List<FichaAlumno> lista){
        System.out.println("Lista de Alumnos: ");
        System.out.println("-------------------------------------------------------");
        int cont = 1;
        for (FichaAlumno x:lista) {
            System.out.println("Ficha de Alumno "+cont);
            System.out.println("Nombre: "+x.nombre);
            System.out.println("Edad: "+ x.edad);
            System.out.println("Calificacion: "+x.calificacion);
            System.out.println("-------------------------------------------------------");
            cont++;
        }
    }
    //3. Escribe una función escribeFicheroAlumnosBinario a la que le pasas la lista y el
    //nombre del fichero y te escribe la lista en el fichero. La estructura del fichero será la
    //siguiente:
    //- Al principio habrá un entero que será el número de alumnos que hay en la
    //lista.
    //- Después irán los registros, escribiéndose un String para el nombre, un int
    //para la edad y un double para la nota.
    //- Iremos escribiendo todos los registros uno a uno hasta el final
    public static void escribeFicheroAlumnosBinario(List<FichaAlumno> lista, String nombre){
        try{
            FileOutputStream fos = new FileOutputStream(nombre);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(lista.size());
            for (FichaAlumno x: lista) {
                dos.writeUTF(x.nombre);
                dos.writeInt(x.edad);
                dos.writeDouble(x.calificacion);
            }
            dos.close();
            fos.close();
            System.out.println("Escrito!");
        }catch (Exception e){
            System.out.println("Error en escribeFicheroAlumnosBinario: "+e.getMessage());
            e.printStackTrace();
        }
    }
    //4. Escribe una función leeFicheroAlumnosBinario a la que le pasas una lista y el nombre
    //del fichero y leerá la lista desde el fichero. El fichero tendrá la misma estructura que el
    //del ejercicio anterior (evidentemente). La lista que nos pasen la borraremos antes de
    //leer los datos del fichero.
    //Para poder meter el alumno en la lista primero tendremos que crear un registro de
    //tipo FichaAlumno:
    //FichaAlumno fa = new FichaAlumno();
    //Guardaremos los tres valores que hemos leído en el registro y lo añadiremos a la lista.
    public static void leeFicheroAlumnosBinario(List<FichaAlumno> lista, String nombre){
        lista.clear();
        try{
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);
            int size = dis.readInt();
            while (lista.size()<size){
                lista.add(new FichaAlumno(dis.readUTF(),dis.readInt(),dis.readDouble()));
            }
            dis.close();
            fis.close();
            System.out.println("Leido!");
        }catch (Exception e){
            System.out.println("Error en leeFicheroAlumnosBinario: "+e.getMessage());
            e.printStackTrace();
        }
    }
    //5. Escribe la función escribeFicheroAlumnosTexto similar a la función del ejercicio 3 pero
    //usando un fichero de texto. La estructura del fichero será similar, pero ahora
    //guardaremos un valor en cada línea. Ejemplo:
    //2
    //Pedro
    //23
    //7,2
    //Juan
    //15
    //2,1
    public static void escribeFicheroAlumnosTexto(List<FichaAlumno> lista, String nombre){
        try {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(lista.size()));
            bw.newLine();
            for (FichaAlumno x:lista ) {
                bw.write(x.nombre);
                bw.newLine();
                bw.write(String.valueOf(x.edad));
                bw.newLine();
                bw.write(String.valueOf(x.calificacion));
                bw.newLine();
            }
            bw.close();
            fw.close();
            System.out.println("Escrito!");
        }catch (Exception e){
            System.out.println("Error en escribeFicheroAlumnosTexto: "+e.getMessage());
            e.printStackTrace();
        }
    }
    //6. Escribe la función leeFicheroAlumnosTexto similar a la función del ejercicio 4 pero que
    //funciona con los ficheros de texto del ejercicio anterior.
    public static void leeFicheroAlumnosTexto(List<FichaAlumno> lista,String nombre){
        lista.clear();
        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            int size = Integer.valueOf(br.readLine());
            while (lista.size()<size){
                lista.add(new FichaAlumno(br.readLine(),Integer.valueOf(br.readLine()),Double.valueOf(br.readLine())));
            }
            br.close();
            fr.close();
            System.out.println("Leido!");
        }catch (Exception e){
            System.out.println("Error en leeFicheroAlumnosTexto: "+e.getMessage());
            e.printStackTrace();
        }
    }
    //7. Escribe la función escribeFicheroAlumnosCSV. En este caso, no vamos a guardar el
    //número de registros en la primera línea, ya que los ficheros CSV estándar no lo hacen.
    //Como carácter separador usaremos el punto y coma, ya que uno de los datos que
    //usamos ya contiene comas.
    //Un ejemplo del fichero sería:
    //Pedro;23;7,2
    //Juan;15;2,1
    public static void escribeFicheroAlumnosCSV(List<FichaAlumno> lista, String nombre){
        try {
            FileWriter fw = new FileWriter(nombre);
            BufferedWriter bw = new BufferedWriter(fw);
            for (FichaAlumno x:lista ) {
                bw.write(x.nombre);
                bw.write(";");
                bw.write(String.valueOf(x.edad));
                bw.write(";");
                bw.write(String.valueOf(x.calificacion));
                bw.newLine();

            }
            bw.close();
            fw.close();
            System.out.println("Escrito!");
        }catch (Exception e){
            System.out.println("Error en escribeFicheroAlumnosTexto: "+e.getMessage());
            e.printStackTrace();
        }
    }
    //8. Escribe la función leeFicheroAlumnosCSV que lee los datos del fichero anterior en una
    //lista. Para separar los datos, lo más fácil es usar la función Split de las cadenas. Con
    //esto conseguiremos un array de cadenas compuesto por tres cadenas: “Nombre”,
    //“Edad”, “Calificación”, que tendremos que convertir al tipo de dato adecuado y meter
    //en un registro FichaAlumno y luego en la lista.
    public static void leeFicheroAlumnosCSV(List<FichaAlumno> lista,String nombre){
        lista.clear();
        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            while (s != null){
                String[] array = s.split(";");
                if(array.length==3){
                    String n = array[0];
                    int e = Integer.valueOf(array[1]);
                    double c = Double.valueOf(array[2]);
                    lista.add(new FichaAlumno(n,e,c));
                }
                s = br.readLine();
            }
            br.close();
            fr.close();
            System.out.println("Leido!");
        }catch (Exception e){
            System.out.println("Error en leeFicheroAlumnosTexto: "+e.getMessage());
            e.printStackTrace();
        }
    }
}
