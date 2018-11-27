package com.company;

import java.util.Scanner;

//  Escribe una función “resolucionCamara” a la que le pasas el número de MegaPixels que tiene una cámara
//  digital (puede ser un double) y nos dice cuál es la resolución máxima de las fotos que hace la cámara.
//  Como no podemos devolver dos valores (la altura y la anchura de la imagen), los escribiremos por pantalla.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double megapixeles;
        System.out.println("Dime el numero de megapixeles de tu camara: ");
        megapixeles = sc.nextDouble();
        resolucionCamara(megapixeles);
    }
    public static void resolucionCamara(double megapixeles){
        int anchura = 0, altura = 0;
        double ratio = 4/3.0;
        altura = (int)Math.sqrt(megapixeles*1000000 / (ratio));
        anchura = (int)(altura*ratio);
        System.out.println("La resolucion es "+anchura+"x"+altura+" pixeles");
    }
}
