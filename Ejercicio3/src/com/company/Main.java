package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Escribe los dos numeros del intervalo:");
        a = sc.nextInt();
        b = sc.nextInt();
        serieParesImpares(a,b);
    }
    //La serie puede ser de numero positivos y negativos
    public static void serieParesImpares(int a, int b){
        if(a<=b){
            for(int i = a; i <= b; i+=2){
                System.out.println(i);
            }
        }
        else{
            for(int i = a; i >= b; i-=2){
                System.out.println(i);
            }
        }
    }
}
