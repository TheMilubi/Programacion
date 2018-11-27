package com.company;

import java.util.Scanner;

//Escribe un programa que le pide al usuario la nota de un alumno (un número real). El
//programa escribirá “Suspenso” si la nota está entre 0 y 5; “Suficiente” si la nota está
//entre 5 y 6; “Bien” si la nota está entre 6 y 7; “Notable” si la nota está entre 7 y 9 y
//“Sobresaliente” si está entre 9 y 10. Si la nota no es válida, el programa nos vuelve a
//pedir un valor hasta que introduzcamos una correcta.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f;
        do{
            System.out.println("Escribe la nota: ");
            f = scanner.nextDouble();
        }while (f<0||f>10);
        if(f<5)System.out.println("SUSPENSO");
        else if(f<6) System.out.println("SUFICIENTE");
        else if(f<7) System.out.println("BIEN");
        else if(f<9) System.out.println("NOTABLE");
        else if(f<=10) System.out.println("SOBRESALIENTE");
    }
}
