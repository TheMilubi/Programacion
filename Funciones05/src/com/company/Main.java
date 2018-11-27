package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Escribe una función “Signo” a la que le pasemos un número y nos devuelva “1” si es
        //positivo, “0” si es cero y “-1” si es negativo.
        int a,signo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        a = sc.nextInt();
        signo = signo(a);
        switch (signo){
            case -1:
            {
                System.out.println("Numero negativo");
                break;
            }
            case 0:
            {
                System.out.println("Numero igual a cero");
                break;
            }
            case 1:
            {
                System.out.println("Numero positivo");
                break;
            }
        }
    }
    static int signo(int a){
        int signo;
        if (a <0) signo = - 1;
        else if (a > 0) signo = 1;
        else signo = 0;
        return signo;
    }
}
