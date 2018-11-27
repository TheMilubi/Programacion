package com.company;

public class Main {

    public static void main(String[] args) {
        rombo(5);
    }
    public static void repiteCaracter(int numero, char caracter){
        for(int i = 0; i < numero; i++){
            System.out.print(caracter);
        }
    }
    public static void rombo(int pisos){
        int asterisco = 1;
        int espacio = pisos - asterisco;
        for(int i = 1; i <= pisos*2-1; i++){
            repiteCaracter(espacio,' ');
            repiteCaracter(asterisco, '*');
            System.out.println();
            asterisco = (i<pisos)? asterisco+2:asterisco-2;
            espacio = (i<pisos)? espacio-1:espacio+1;
        }

    }
}
