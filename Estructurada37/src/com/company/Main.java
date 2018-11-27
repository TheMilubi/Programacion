package com.company;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

//37. Escribe un programa que nos presente un menú con 3 opciones. Eligiendo la opción “a”
//nos escribirá todos los múltiplos de 11 comprendidos entre 1 y 100. Eligiendo la opción
//“b” lo mismo, pero con los múltiplos de 17. Eligiendo la opción “c” lo mismo, pero con
//los múltiplos de 23.
public class Main {

    public static void main(String[] args) {
	    String opcion;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("a: multiplos de 11\nb: multiplos de 17\nc: multiplos de 23");
            opcion = sc.next();
        }while (! opcion.equals("a") && ! opcion.equals("b") && ! opcion.equals("c"));
        switch (opcion){
            case "a":
                {
                int n = 1;
                while (11 * n < 100){
                    System.out.println("Multiplo nº"+n+" de 11: "+(n*11));
                    n++;
                }
                break;}
            case "b":
                {
                int n = 1;
                while (17 * n < 100){
                    System.out.println("Multiplo nº"+n+" de 17: "+(n*17));
                    n++;
                }
                break;}
            case "c":
                {
                int n = 1;
                while (23 * n < 100){
                    System.out.println("Multiplo nº"+n+" de 23: "+(n*23));
                    n++;
                }
                break;}

        }

    }
}
