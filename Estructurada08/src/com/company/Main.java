package com.company;

import java.util.Scanner;

//Dados tres números enteros, A, B, C, determinar cuál es el mayor, cuál el menor y cuál
//el mediano.
public class Main {

    public static void main(String[] args) {
        int a, b, c, mayor, menor, mediano;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indroduce 3 numeros ( a b c ):");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if(a <= b && b <= c){
            menor = a;
            mediano = b;
            mayor = c;
            System.out.println("Menor: "+menor+"\nMediano: "+mediano+"\nMayor: "+mayor);
        }else if(a <= c && c <= b){
            menor = a;
            mediano = c;
            mayor = b;
            System.out.println("Menor: " + menor + "\nMediano: " + mediano + "\nMayor: " + mayor);
        }else if(c <= b && b <= a) {
            menor = c;
            mediano = b;
            mayor = a;
            System.out.println("Menor: " + menor + "\nMediano: " + mediano + "\nMayor: " + mayor);
        }else if (c <= a && a <= b){
            menor = c;
            mediano = a;
            mayor = b;
            System.out.println("Menor: " + menor + "\nMediano: " + mediano + "\nMayor: " + mayor);
        }else if (b <= a && a <= c){
            menor = b;
            mediano = a;
            mayor = c;
            System.out.println("Menor: " + menor + "\nMediano: " + mediano + "\nMayor: " + mayor);
        }else if (b <= c && c <= a){
            menor = b;
            mediano = c;
            mayor = a;
            System.out.println("Menor: " + menor + "\nMediano: " + mediano + "\nMayor: " + mayor);
        }
    }
}
