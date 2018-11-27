package com.company;

//36. Escribe un programa que nos escriba los 10 primeros números que no sean múltiplos ni
//de 2 ni de 3.

public class Main {

    public static void main(String[] args) {
        int i = 0, n = 1;
        while(i <= 10){
            if(n%2!=0 && n%3!=0){
                System.out.println(n);
                i++;
            }
            n++;
        }
    }
}
