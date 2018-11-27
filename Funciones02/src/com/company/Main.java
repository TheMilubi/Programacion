package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 2. Escribe una función que nos diga si un año es bisiesto o no. La función se llamará
        //“Bisiesto” y nos devolverá “verdadero” si es bisiesto y “falso” si no lo es.
        int anno;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el año: ");
        anno = sc.nextInt();
        if (bisiesto(anno)) System.out.println("El año es bisiesto");
        else System.out.println("El año no es bisiesto");
    }
    static boolean bisiesto(int x){
        boolean bisiesto = ((x % 4 == 0)&&(x % 100 != 0)||(x % 400 == 0));
        return bisiesto;
    }
}
