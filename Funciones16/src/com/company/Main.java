package com.company;
// Escribe una función “elevado” a la que le pasas dos números enteros (a y b) y te devuelve el valor de “a” elevado
// a “b” (sin usar la función Math.pow) (o sea, multiplicando un número muchas veces).

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base,exponente;
        do {
            System.out.println("Dime la base y exponente: ");
            base = sc.nextInt();
            exponente = sc.nextInt();
        } while (exponente<0);
        System.out.println(elevado(base,exponente));
    }
    public static int elevado(int base, int exponente){
        int potencia = base;
        if (exponente == 0) potencia = 1;
        else if (exponente>0){
            for (int i = 2; i <= exponente; i++){
                potencia = potencia * base;
            }
        }
        else{
            System.out.println("No escribas exponentes negativos");
        }
        return potencia;
    }
}
