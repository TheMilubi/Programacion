package com.company;

import java.util.Scanner;

//Escribe una función “pulgadasACentimetros” a la que le pases un valor en pulgadas (de tipo double)
//y te devuelva el valor en centímetros. Haz también la función “centímetrosAPulgadas”.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pulgadas,centimetros;
        do{
            System.out.println("Dime longitud en pulgadas: ");
            pulgadas = sc.nextDouble();
        }while (pulgadas<0);
        do{
            System.out.println("Dime longitud en centimetros: ");
            centimetros = sc.nextDouble();
        }while (pulgadas<0);
        System.out.println(pulgadas+" pulgadas = "+ pulgadasACentimetros(pulgadas)+" centimetros");
        System.out.println(centimetros+" centimetros = "+ centimetrosAPulgadas(centimetros)+" pulgadas");
    }
    public static double pulgadasACentimetros(double pulgadas){
        double centimetros;
        centimetros = pulgadas * 2.54;
        return centimetros;
    }
    public static double centimetrosAPulgadas(double centimetros){
        double pulgadas;
        pulgadas = centimetros / 2.54;
        return pulgadas;
    }
}
