package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("---------------------------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Igualar");
        System.out.println("6. Comparar");
        Scanner sc = new Scanner(System.in);
        Dinero d1 = new Dinero(tipoMoneda.EURO,1);
        Dinero d2 = new Dinero(tipoMoneda.DOLAR,1);
        Dinero d3 = new Dinero(tipoMoneda.LIBRA,1);
        Dinero d4 = new Dinero(tipoMoneda.YEN,1500);
        int op;
        do {
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    Dinero f = d1.add(d2);
                    System.out.println(f);
                }
                break;
                case 2: {
                    Dinero f = d3.substract(d1);
                    System.out.println(f);
                }
                break;
                case 3: {
                    Dinero f = d2.multiply(5);
                    System.out.println(f.toString(tipoMoneda.EURO));
                }
                break;
                case 4: {
                    Dinero f = d4.divide(2);
                    System.out.println(f.toString(tipoMoneda.EURO));
                }
                break;
                case 5: {
                    boolean f = d1.equals(d2);
                    System.out.println(f);
                }
                break;
                case 6: {
                    int f = d1.compareTo(d2);
                    System.out.println(f);
                }
                break;
                default:
                    System.out.println("Saliendo...");
            }
        }while (op > 0 && op < 7);
    }
}
