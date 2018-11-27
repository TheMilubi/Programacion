package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Escribe una función que nos calcule el “MCD” de dos números.
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Dime dos números: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("El mcd de "+a+" y "+b+" es "+mcd(a,b));
    }
    static int mcd(int a, int b){
        int mcd = 0;
        int i = (a < b)? a : b;
        while(mcd == 0){
            mcd = (a % i == 0 && b % i == 0) ? i : 0;
            i--;
        }
        return mcd;
    }
}
