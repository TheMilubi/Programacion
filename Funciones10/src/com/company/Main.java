package com.company;

import java.util.Scanner;

//Escribe una función “Primo” que nos devuelva “verdadero” si el número
// que le pasamos por parámetro es primo y “falso” en caso contrario.
public class Main {

    public static void main(String[] args) {
        // Escribe una función que nos calcule el “mcm” de dos números.
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Dime un numero: ");
        a = sc.nextInt();
        System.out.println((primo(a)?"El numero es primo":"El numero no es primo"));
    }
    static boolean primo(int a){
        boolean primo;
        int numDiv = 0;
        for(int i = 1; i <= a; i++){
            numDiv = (a % i == 0) ? numDiv + 1 : numDiv;
        }
        primo = (numDiv == 2);
        return primo;
    }
}
