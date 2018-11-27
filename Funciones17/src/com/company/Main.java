package com.company;

import java.util.Scanner;

// Escribe una función “factorial” que nos calcule el factorial de un número entero.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factor;
        System.out.println("Dime el factor: ");
        factor = sc.nextInt();
        System.out.println(factorial(factor));
    }
    public static long factorial(int factor){
        long factorial = 0;
        if (factor == 0){
            factorial = 1;
        }
        else if(factor>0){
            factorial = 1;
            for (int i = 1 ; i<=factor; i++){
                factorial = factorial * i;
            }
        }else{
            System.out.println("No pases un factor negativo");
        }
        return factorial;
    }
}
