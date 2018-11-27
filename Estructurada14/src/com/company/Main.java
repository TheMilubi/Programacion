package com.company;

import java.util.Scanner;

//Escribe un programa que te pida dos números con la condición de que el segundo sea
//mayor que el primero, en caso contrario te pregunta de nuevo el número hasta que sea
//correcto. Si los números son correctos, escribe todos los números comprendidos entre
//el primer y el segundo número (ambos inclusive).
public class Main {

    public static void main(String[] args) {
	    int i,num1, num2;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Escribe dos numeros, el segundo mayor que el primero");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        }while(num2<num1);
        i = num1;
        while(i <= num2){
            System.out.println(i);
            ++i;
        }
    }
}
