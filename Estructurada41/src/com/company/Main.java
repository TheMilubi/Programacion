package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int divisores = 0, numero;
        for(numero = 0; numero <=1000; numero++){
            divisores = 0;
            for(int i = 1; i <= numero;i++){
                if (numero % i == 0)divisores++;
            }
            if (divisores==2) System.out.println("El numero "+numero+" es primo");

        }
    }
}
