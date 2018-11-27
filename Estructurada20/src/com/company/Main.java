package com.company;

import java.util.Scanner;

//Calcular el valor máximo de una serie de 10 números introducidos por teclado.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double serie,maximo;
        int i = 1;
        System.out.println("Introduce un numero: ");
        serie = scanner.nextDouble();
        maximo = serie;
        while(i < 10){
            System.out.println("Introduce un numero: ");
            serie = scanner.nextDouble();
            if(serie > maximo) maximo = serie;
            i++;
        }
        System.out.println("El maximos es "+ maximo);

    }
}
