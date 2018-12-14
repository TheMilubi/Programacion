package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] a = new int[0];
        sucesionFibonacci(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sucesionFibonacci(int [] a){
        if(a.length==0){
            System.out.println("Array no valido");
        }
        else if(a.length<2)a[0] = 0;
        else {
            a[0] = 0;
            a[1] = 1;
        }
        for (int i = 2; i < a.length; i++){
            a[i] = a[i-1] + a[i - 2];
        }
    }
}
