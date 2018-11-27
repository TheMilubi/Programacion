package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int postivos = 0, negativos = 0, pares = 0, impares = 0, numero;
        System.out.println("Escribe un numero");
        numero = sc.nextInt();
        while(numero!=0){
            if(numero%2==0) pares++;
            else impares++;
            if(numero>0) postivos++;
            else negativos++;
            System.out.println("Escribe un numero");
            numero = sc.nextInt();
        }
        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+impares);
        System.out.println("Positivos: "+postivos);
        System.out.println("Negativos: "+negativos);
    }
}
