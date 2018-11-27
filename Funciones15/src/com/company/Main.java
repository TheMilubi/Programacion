package com.company;

import java.util.Scanner;

//Escribe una función “leeNúmero” a la que le pasas dos parámetros (a y b) y nos lee del teclado un número comprendido
// entre a y b (ambos incluidos). Si el número no es correcto, te vuelve a pedir que lo introduzcas.
public class Main {

    public static void main(String[] args) {
        int numero;
        numero = leeNumero(25, 45);
        System.out.println("El numero que has introducido es "+numero);
    }
    public static int leeNumero(int minimo, int maximo){
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.println("Dime un numero entre "+minimo+" y "+maximo+": ");
            numero = sc.nextInt();
        } while (numero<minimo||numero>maximo);
        return numero;
    }
}
