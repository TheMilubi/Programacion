package com.company;

public class Main {

    public static void main(String[] args) {
        int [] tarjeta = {5,5,6,5,8,6,6,6,4,5,2,2,7,3,0,7};
        System.out.println(compruebaTarjeta(tarjeta)?"Tarjeta valida":"Tarjeta invalida");
    }
    public static boolean compruebaTarjeta(int [] a){
        boolean valida;
        if(a.length!=16){
            valida = false;
            System.out.println("Tarjeta no valida");
        }
        else{
            multiplicaTarjeta(a);
            reduceTarjeta(a);
            int suma = sumaNumeros(a);
            valida = (suma % 10 == 0);

        }
        return valida;
    }
    private static void multiplicaTarjeta(int [] a){
        for (int i = 0; i < a.length; i+=2){
            a[i] = a[i] * 2;
        }
    }
    private static void reduceTarjeta(int [] a){
        for(int i = 0; i < a.length; i++){
            if(a[i]>=10){
                a[i] = a[i]- 9;
            }
        }
    }
    private static int sumaNumeros(int [] a){
        int suma = 0;
        for (int i = 0; i < a.length; i++){
            suma = suma + a[i];
        }
        return suma;
    }
}
