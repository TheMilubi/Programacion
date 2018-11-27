package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura, base;
        System.out.println("Dime la altura y base del triangulo: ");
        do{
            altura = sc.nextDouble();
            base = sc.nextDouble();
        }while (base<0||altura<0);
        System.out.println("El area del triangulo es "+ areaTriangulo(base,altura));
    }
    // Escribe una función “areaTriangulo” que te calcule el área de un triángulo.
    // Habrá que pasarle como parámetros la base y la altura.
    public static double areaTriangulo(double base, double altura){
        double area;
        area = base*altura/2;
        return area;
    }
}
