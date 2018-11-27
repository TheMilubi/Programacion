package com.company;

import java.util.Scanner;

//  Escribe una función “leeNatural” que nos lea un número natural desde el teclado. La función nos pondrá un texto
//  en el que se nos indica que introduzcamos un número y después nos leerá el número del teclado.
//  Si el número introducido es 0 o negativo, nos volverá a pedir otro número.
public class Main {

    public static void main(String[] args) {
	    int numero;
	    numero = leeNatural();
	    System.out.println("El numero que has introducido es "+numero);
    }
    public static int leeNatural(){
        Scanner sc = new Scanner(System.in);
        int natural;
        do {
            System.out.println("Dime un numero natural: ");
            natural = sc.nextInt();
        } while (natural<0);
        return natural;
    }
}
