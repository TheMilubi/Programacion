package com.company;

import java.util.Scanner;

//Escribe una función “Min” que nos devuelva el menor de los dos números que le pasemos por parámetro.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Dime dos números: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("El numero minimo es "+ min(a,b));
    }
    static int min(int a, int b){
        int min;
        min = (a < b) ? a : b;
        return min;
    }
    
    
}
