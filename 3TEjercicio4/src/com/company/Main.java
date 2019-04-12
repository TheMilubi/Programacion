package com.company;

import java.security.InvalidParameterException;

public class Main {

    public static void main(String[] args) {
        dibujaXestrellas(1);
        dibujaXestrellas(3);
        dibujaXestrellas(9);
        dibujaXestrellas(25);

    }
    static void dibujaXestrellas(int pisos){
        try {
            if (pisos % 2 == 0 || pisos < 3) {
                throw new InvalidParameterException("Solo números impares y minimo 3");
            } else {
                for (int i = 0; i < pisos / 2; i++) {
                    System.out.println(repiteChar(i, ' ') + repiteChar(pisos - i * 2, 'X'));
                }
                for (int i = pisos / 2; i >= 0; i--) {
                    System.out.println(repiteChar(i, ' ') + repiteChar(pisos - i * 2, 'X'));
                }
            }
        }catch (InvalidParameterException e){
            System.out.println(e.getMessage());
        }
    }
    static String repiteChar(int n, char c){
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s+c;
        }
        return s;
    }
}
