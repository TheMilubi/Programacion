package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int divisores = 0, numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        numero = sc.nextInt();
        for(int i = 1; i <= numero;i++){
            if (numero % i == 0)divisores++;
        }
        System.out.println((divisores==2)?"El numero es primo":"El numero NO es primo");
    }
}
