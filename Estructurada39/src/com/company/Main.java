package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //39. Escribe un programa que calcule el minimo común multiplo de 2 números.
        Scanner sc = new Scanner(System.in);
        int mcm, mcd = 0, a , b;
        System.out.println("Ecribe dos numeros enteros");
        a = sc.nextInt();
        b = sc.nextInt();
        int i = (a<b)? a : b;
        while ( mcd == 0 ){
            if(a%i == 0 && b%i == 0)mcd = i;
            i --;
        }
        mcm = a*b/mcd;
        System.out.println("El M.C.M es "+mcm);
    }
}