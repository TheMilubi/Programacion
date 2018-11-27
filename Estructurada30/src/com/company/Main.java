package com.company;

//Calcular la suma de todos los números pares entre 1 y 1000. Es decir, 2 + 4 + 6 + ... + 998
//+ 1000.
public class Main {

    public static void main(String[] args) {
        int i = 1,suma = 0;
        for(;i<=1000;i++){
            if(i%2==0) suma+=i;
        }
        System.out.println("La suma de los numeros pares es igual a " + suma);
    }
}
