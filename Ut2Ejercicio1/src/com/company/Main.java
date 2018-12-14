package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int [] a = new int[15];
        sucesionFibonacci(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sucesionFibonacci(int [] a){
        a[0] = 0;
        a[1] = 1;
        for (int i = 2; i < a.length; i++){
            a[i] = a[i-1] + a[i - 2];
        }
    }
}
