package com.company;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menu");
            System.out.println("************");
            System.out.print("Escribe el numero del ejercicio [1-8]: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 0: System.out.println("Saliendo...");break;
                case 1: {
                    String extension = "iml";
                    System.out.println("Hay "+cuantosFicheros(extension)+" fichero(s) con la extension "+extension);
                }
            }
        }while (opcion!=0);
    }
    //1. Escribe la función cuantosFicheros a la que le pasas una extensión de archivo y te
    //devuelve un entero que nos dice cuántos ficheros con esa extensión hay en el
    //directorio actual.
    //Ej.: CuantosFicheros(“txt”) nos dirá cuántos ficheros .txt hay.
    public static int cuantosFicheros(String extension){
        int numero = 0;
        File directorio = new File(".");
        File[] ficheros = directorio.listFiles();
        for (int i = 0; i < ficheros.length; i++) {
            if(ficheros[i].isFile()){
                String nombre = ficheros[i].getName();
                String[] nomExt = nombre.split("[.]");
                String ext = nomExt[nomExt.length-1];
                if (extension.contentEquals(ext)){
                    numero++;
                }
            }
        }

        return numero;
    }
    //
}
