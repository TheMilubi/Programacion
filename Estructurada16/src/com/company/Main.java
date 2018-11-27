package com.company;

import java.util.Scanner;

//Escribir todos los números impares entre dos números A y B introducidos por teclado.
//Antes habrá que comprobar cuál de los dos números A y B es mayor.
public class Main {

    public static void main(String[] args) {
	    int a, b, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos numeros");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a<b){
            i = a;
            while(i<=b){
                if(i%2==1)System.out.println(i);
                ++i;
            }
        }
        else if (b<a){
            i = a;
            while(i>=b){
                if(i%2==1)System.out.println(i);
                --i;
            }
        }
    }
}
