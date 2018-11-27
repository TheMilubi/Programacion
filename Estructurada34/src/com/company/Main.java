package com.company;

//. Calcular el factorial de un número entero N. Recuerda que el factorial de un número es
//el producto de ese número por todos los enteros menores que él. Por ejemplo, el
//factorial de 5 (simbolizado 5!) se calcula como: 5! = 5 x 4 x 3 x 2 x 1.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n,i;
        long factorial;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Escribe un numero positivo: ");
            n = scanner.nextInt();
        }while (n < 0);
        factorial = n;
        i = n - 1;
        for (;i > 0;i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial: "+ factorial);
    }
}
