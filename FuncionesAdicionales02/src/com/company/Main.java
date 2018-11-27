package com.company;
// Escribe una función centigradosAFahrenheit que nos convierta una temperatura que está en grados centígrados a
// grados Fahrenheit. La función tendrá un parámetro, que será un número real, y devolverá otro número real.
// La fórmula es: Temp.(F)=1,8*Temp.(C°)+32.
// Escribe una función fahrenheitACentigrados que nos convierta una temperatura que está en grados Fahrenheit
// a grados centígrados. La función tendrá un parámetro, que será un número real, y devolverá otro número real.
// La fórmula es: Temp.(C)=(Temp.(F)-32)/1,8.
public class Main {

    public static void main(String[] args) {
        System.out.println(centigradosAFahrenheit(50));
        System.out.println(fahrenheitACentigrados(50));
    }
    public static double centigradosAFahrenheit (double centigrados){
        double fahrenheit = 0;
        fahrenheit = centigrados * 1.8 + 32;
        return fahrenheit;
    }
    public static double fahrenheitACentigrados (double fahrenheit){
        double centigrados = 0;
        centigrados = (fahrenheit - 32)/1.8;
        return centigrados;
    }

}
