package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Escribe una función “Max” que nos devuelva el mayor de los dos números que le pasemos por parámetro.
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Dime dos números: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("El numero maximo es "+ max(a,b));
    }
    static int max(int a, int b){
        int max;
        max = (a > b) ? a : b;
        return max;
    }
}
