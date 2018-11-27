package com.company;

import java.util.Scanner;

//Calcular en el mismo bucle el valor máximo, el valor mínimo y la media aritmética de
//una serie de 10 números introducidos por teclado.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num, maximo, minimo, sumatorio, media;
        int i = 1;

        System.out.println("Introduce un numero: ");
        num = scanner.nextDouble();
        maximo = minimo = sumatorio = num;

        for (;i < 10;i++) {
            System.out.println("Introduce un numero: ");
            num = scanner.nextDouble();
            if (num < minimo) minimo = num;
            else maximo = num;
            sumatorio += num;
        }
        media = sumatorio/10;

        System.out.println("Maximo: "+maximo+"\nMinimo: "+minimo+"\nMedia: "+media);


    }
}
