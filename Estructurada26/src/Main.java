package com.company;

import java.util.Scanner;

//Escribe un programa que te pregunte si quieres números pares o impares. Si te dice
//pares, escribe los números pares del 1 al 10 y si te dice impares, escribe los números
//impares del 1 al 10.
public class Main {

    public static void main(String[] args) {
        String respuesta;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿pares o impares?");
        respuesta = sc.next();
        if(respuesta.equalsIgnoreCase("pares")){
            int i = 2;
            for(;i <= 10;i+=2){
                System.out.println(i);
            }
        }else if(respuesta.equalsIgnoreCase("impares")){
            int i = 1;
            for (;i <= 10;i+=2){
                System.out.println(i);
            }
        }else{
            System.out.println("Opción incorrecta");
        }
    }
}
