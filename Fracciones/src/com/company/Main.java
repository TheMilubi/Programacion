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
        Fraccion f1 = new Fraccion(1.5);
        Fraccion f2 = new Fraccion(0.5);
        int op;
        do {
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    Fraccion f = f1.add(f2);
                    f.simplificar();
                    System.out.println(f);
                }
                break;
                case 2: {
                    Fraccion f = f1.substract(f2);
                    f.simplificar();
                    System.out.println(f);
                }
                break;
                case 3: {
                    Fraccion f = f1.multiply(f2);
                    f.simplificar();
                    System.out.println(f);
                }
                break;
                case 4: {
                    Fraccion f = f1.divide(f2);
                    f.simplificar();
                    System.out.println(f);
                }
                break;
                case 5: {
                    boolean f = f1.equals(f2);
                    System.out.println(f);
                }
                break;
                case 6: {
                    int f = f1.compareTo(f2);
                    System.out.println(f);
                }
                break;
                default:
                    System.out.println("Saliendo...");
            }
        }while (op > 0 && op < 7);

    }
}
