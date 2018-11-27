package com.company;

import java.util.Scanner;

//Determinar el número de cifras de un número entero. El algoritmo debe funcionar para
//números de hasta 5 cifras, considerando los negativos. Por ejemplo, si se introduce el
//número 5342, la respuesta del programa debe ser 4. Si se introduce -250, la respuesta
//debe ser 3.
public class Main {

    public static void main(String[] args) {
	    int numero,cifras;
	    cifras = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        numero = sc.nextInt();
        while(numero / 10 != 0 ){
            numero = numero / 10;
            ++cifras;
        }
        System.out.println("Tiene " + cifras + " cifras.");
    }
}
