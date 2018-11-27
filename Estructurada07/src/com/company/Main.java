package com.company;

import java.util.Scanner;

//Calcular las dos soluciones de una ecuación de segundo grado, del tipo ax2 + bx + c = 0.
//Los coeficientes a, b y c deberá introducirlos el usuario a través del teclado.
public class Main {

    public static void main(String[] args) {
        double a,b,c,sqrt,solucion1 = 0,solucion2 = 0;
        Scanner sc = new Scanner(System.in);
	    System.out.println("Introduce los coeficientes de la ecuacion (a b c): ");
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    sqrt = b * b - 4*a*c;
	    if(sqrt == 0){
	        solucion1 = (- b + Math.sqrt(sqrt))/ (2*a);
            System.out.println("La raiz unica es " + solucion1);
        }else if (sqrt > 0){
	        solucion1 = (- b + Math.sqrt(sqrt))/ (2*a);
            solucion2 = (- b - Math.sqrt(sqrt))/ (2*a);
            System.out.println("Las raices son " + solucion1 + " y " + solucion2);
	    }else System.out.println("SIN SOLUCION");

    }
}
