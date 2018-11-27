package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Escribe una función “ImprimeSerie” a la que le pases dos enteros y te escriba por la
    //pantalla todos los valores comprendidos entre ambos. Lo hará en orden ascendente si
    //el primero es menor que el segundo y descendente en caso contrario. Usa “for”
        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime dos numeros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        imprimeSerie(a,b);
    }
    static void imprimeSerie(int a, int b){
        if (a < b){
            for(int i = a; i <= b; i ++){
                System.out.println(i);
            }
        }
        else{
            for(int i = a; i >= b; i --){
                System.out.println(i);
            }
        }
    }
}
