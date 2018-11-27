package com.company;

import java.util.Scanner;

//Calcular el valor medio de una serie de valores enteros positivos introducidos por
//teclado. Para terminar de introducir valores, el usuario debe teclear un número
//negativo.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivo, suma = 0,i = 0;
        System.out.println("Escribe un numero positivo");
        positivo = sc.nextInt();
        do{
            suma += positivo;
            i ++;
            System.out.println("Escribe un numero positivo, y si quieres acabar escribe uno negativo");
            positivo = sc.nextInt();
        }while (positivo >= 0);
        System.out.println("La media es " + ((double)suma/i));
    }
}
