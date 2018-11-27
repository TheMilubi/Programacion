package com.company;
//Escribe una función primosRelativos a la que le pasas dos números enteros y te dice si son primos relativos,
//es decir, si no tienen ningún divisor común además del 1.
public class Main {

    public static void main(String[] args) {
        primosRelativos(2,200);
        primosRelativos(3,10);
    }
    public static void primosRelativos(int a, int b){
        boolean primos;
        int mcd=0;
        int i = Math.min(a,b);
        while(mcd==0){
            mcd = (a%i==0&&b%i==0)?i:0;
            i--;
        }
        primos = (mcd == 1);
        System.out.println(primos?"Son primos relativos":("No son primos relativos, el mcd es "+mcd));
    }
}
