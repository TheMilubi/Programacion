package com.company;

import java.util.Scanner;

//Escribe un programa que te pide dos números. Si el primero es menor que el segundo,
//escribe todos los números comprendidos entre ambos en orden ascendente. Si el
//primero es mayor que el segundo, escribe todos los números comprendidos entre
//ambos en orden descendente.
public class Main {

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe dos numeros: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if(num1<num2){
            int i = num1;
            for(;i <= num2;i++){
                System.out.println(i);
            }
        }else{
            int i = num1;
            for(;i >= num2;i--){
                System.out.println(i);
            }
        }

    }
}
