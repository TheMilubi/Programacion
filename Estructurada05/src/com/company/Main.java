package com.company;

import java.util.Scanner;

//Como el anterior, pero para averiguar si los números son consecutivos.
public class Main {

    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 3 numeros X , Y y Z: ");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        if (y == (x+1)  && z == (y+1) || y == (x-1)  && z == (y-1)  ) System.out.println("Consecutivos");
        else System.out.println("NO consecutivos");
    }
}
