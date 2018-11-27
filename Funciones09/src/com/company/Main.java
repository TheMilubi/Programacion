package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Escribe una función que nos calcule el “mcm” de dos números.
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Dime dos números: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("El mcm de "+a+" y "+b+" es "+mcm(a,b));
    }
    static int mcm(int a, int b){
        int mcm = 0;
        int i = (a > b)? a : b;
        while(mcm == 0){
            mcm = (i % a == 0 && i % b == 0) ? i : 0;
            i++;
        }
        return mcm;
    }
}