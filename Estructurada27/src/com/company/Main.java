package com.company;

import java.util.Scanner;

//Escribe un programa que te escribe la tabla de multiplicar del número que le introduzcas
//por teclado.
public class Main {

    public static void main(String[] args) {
        int numero,i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        numero = sc.nextInt();
        for(;i <= 10;i++){
            System.out.println(numero + " x " + i + " = "+  numero * i);
        }
    }
}
