package com.company;

import java.util.Scanner;

//Leer tres números por teclado, X, Y y Z, y decidir si están ordenados de menor a mayor.
public class Main {

    public static void main(String[] args) {
	    int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 numeros X , Y y Z: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if (x < y && y < z) System.out.println("Ordenado");
        else System.out.println("NO ordenado");
    }
}
