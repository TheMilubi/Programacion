package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 1. Escribe una función que te diga si un número es par o no. La función se llamará “Par” y
    //nos devolverá un valor booleano que será “verdadero” si el número es par y “falso” si
    //es impar.
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        a = sc.nextInt();
        if (par(a))System.out.println("El numero es par");
        else System.out.println("El numero es impar");
    }
    static boolean par (int x){
        boolean par;
        par = (x % 2 == 0);
        return par;
    }
}
