package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//3. Escribe una función “TablaMultiplicar” a la que le pases un entero y nos escriba la
    //tabla de multiplicar de ese número
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        a = sc.nextInt();
        tablaMultiplicar(a);
    }
    static void tablaMultiplicar(int x){
        for (int i = 1; i <= 10; i++){
            System.out.println(x + " x " + i + " = " + x * i);
        }
    }
}
