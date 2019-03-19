package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Baraja baraja = null;
        double puntuacion = 0;
        boolean pasado = false;
        System.out.println("7 y media");
        System.out.println("------------------------");
        System.out.println("Tipo de baraja: 1(Simple) o 2(Doble):");
        int tipo = sc.nextInt();
        while (tipo<1||tipo>2){
            System.out.println("Introduce '1' o '2'");
            tipo = sc.nextInt();
        }
        try{
            baraja = new Baraja(tipo,true);
            List<Carta> manoJugador = new LinkedList<>();
            Carta c = baraja.robar();
            manoJugador.add(c);
            System.out.println(c.nombreCarta());
            puntuacion = puntuacion + c.valor7ymedia();
            System.out.println("Tu puntuacion: "+puntuacion);
            System.out.println("¿Quieres mas? (s/n)");
            String res = sc.next();
            while (puntuacion<7.5&&res.equals("s")){
                c = baraja.robar();
                System.out.println(c.nombreCarta());
                manoJugador.add(c);
                puntuacion = puntuacion + c.valor7ymedia();
                System.out.println("Tu puntuacion: "+puntuacion);
                if(puntuacion<7.5) {
                    System.out.println("¿Quieres mas? (s/n)");
                    res = sc.next();
                }
            }
            if(puntuacion==7.5){
                System.out.println("¡SIETE Y MEDIA!");
                System.out.println("Tus cartas: ");
                for (Carta card:manoJugador) {
                    System.out.println(card.nombreCarta());
                }
            } else if(puntuacion>7.5){
                System.out.println("WHAT A NOOB!");
                System.out.println("Tu puntuacion final: "+puntuacion);
                System.out.println("Tus cartas: ");
                for (Carta card:manoJugador) {
                    System.out.println(card.nombreCarta());
                }
            }
            else {
                System.out.println("Tu puntuacion final: "+puntuacion);
                System.out.println("Tus cartas: ");
                for (Carta card:manoJugador) {
                    System.out.println(card.nombreCarta());
                }
            }
        }catch (Exception e){
            System.out.println(e+": "+e.getMessage());
        }

    }
}
