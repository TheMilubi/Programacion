package com.company;

public class Main {

    public static void main(String[] args) {
	    romboHueco(9);
	    romboHueco(7);
	    romboHueco(71);
    }
    public static void romboHueco(int alt){
        if(alt<3 || alt%2 == 0){
            System.out.println("Altura no valida");
        }
        else{
            int espAnterior = alt/2;
            int espInterior = 1;
            repiteCaracter(espAnterior,' ');
            System.out.print('*');
            System.out.println();
            espAnterior--;
            for(int i = 0; i < (alt/2);i++){
                repiteCaracter(espAnterior,' ');
                repiteCaracter(1,'*');
                repiteCaracter(espInterior,' ');
                System.out.print('*');
                System.out.println();
                espAnterior = espAnterior-1;
                espInterior = espInterior+2;

            }
            espAnterior = espAnterior+2;
            espInterior = espInterior-4;
            for(int i = 0; i < (alt/2-1);i++){
                repiteCaracter(espAnterior,' ');
                System.out.print('*');
                repiteCaracter(espInterior,' ');
                System.out.print('*');
                System.out.println();
                espAnterior = espAnterior+1;
                espInterior = espInterior-2;
            }
            repiteCaracter(espAnterior,' ');
            System.out.print('*');
            System.out.println();
        }
    }
    public static void repiteCaracter(int numero, char caracter){
        for(int i = 0; i < numero; i++){
            System.out.print(caracter);
        }
    }
}
