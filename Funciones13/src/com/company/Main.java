package com.company;

import java.util.Scanner;

// Escribe una función “notaEnTexto” a la que le pasamos la nota de un alumno como un double y nos devolverá
// la calificación en formato texto (“aprobado”, “suficiente”, etc.).
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        System.out.println("Dime la nota: ");
        nota = sc.nextDouble();
        System.out.println("Has sacado un "+notaEnTexto(nota));
    }
    public static String notaEnTexto(double nota){
        String notaTexto;
        if(nota<0||nota>10){
            notaTexto = "nota no valida";
        }
        else if (nota<5) notaTexto = "insuficiente";
        else if (nota<6) notaTexto = "suficiente";
        else if (nota<7) notaTexto = "bien";
        else if (nota<9) notaTexto = "notable";
        else notaTexto = "sobresaliente";
        return notaTexto;
    }
}
