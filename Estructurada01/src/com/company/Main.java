package com.company;

import java.util.Scanner;

// Leídos dos números por teclado, A y B, calcular la resta del mayor menos el menor. Por
// ejemplo, si A = 8 y B = 3, el resultado debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el
// resultado debe ser B – A, es decir, 3.
public class Main {

    public static void main(String[] args) {
	    int A, B, R;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer numero:");
        A = sc.nextInt();
        System.out.println("Dime el segundo numero:");
        B = sc.nextInt();
        if (A > B) R = A - B;
        else R = B - A;
        System.out.println("El resultado es "+ R);
    }
}
