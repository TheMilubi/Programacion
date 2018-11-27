package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        System.out.println("Dime el precio de tu compra: ");
        precio = sc.nextDouble();
        System.out.println("Te descuentan: "+descuento(precio));
        System.out.println("El precio final es "+precioFinal(precio));
    }
    public static double descuento(double valorCompra){
        double descuento = 0;
        if (valorCompra<0){
            System.out.println("Valor de compra no valido");
        }else{
            if (valorCompra<100) descuento = valorCompra / 100 * 7.5;//0 a 99
            else if (valorCompra<300) descuento = valorCompra / 100 * 10;//100 a 299
            else if (valorCompra<500) descuento = valorCompra / 100 * 12.5;//300 a 499
            else descuento = valorCompra / 100 * 15;//500 o mas
        }
        return descuento;
    }
    public static double precioFinal(double valorCompra){
        double precioFinal;
        precioFinal = valorCompra - descuento(valorCompra);
        return precioFinal;
    }
}
