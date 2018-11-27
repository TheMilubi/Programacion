package com.company;

//Leer un número real y un tipo de moneda, que puede ser "euro" o "peseta". Convertir
//la cantidad al tipo de moneda indicado, suponiendo que está expresada en la otra. Por
//ejemplo, si la cantidad es 15 y la moneda es "peseta", se supondrá que se trata de 15 €
//y que hay que convertirlos a pesetas y, por lo tanto, el resultado debe ser 2495

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double moneda;
        String tipo;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Introduce la cantidad y tipo (euro/peseta): ");
	    moneda = sc.nextInt();
	    tipo = sc.next();
	    if (tipo.equals("euro")){
	        System.out.println(moneda * 166.386 + " Pesetas");
        }
        else if (tipo.equals("peseta")){
            System.out.println(moneda / 166.386 + " Euros");
        }else {
            System.out.println("Tipo no valido");
        }
    }
}
