package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU:");
        System.out.println("1. Jugador vs Jugador");
        System.out.println("2. Jugador vs Ordenador");
        System.out.println("3. Ordenador vs Jugador");
        System.out.println("4. Ordenador vs Ordenador");
        int opc = sc.nextInt();
        switch (opc){
            case 1:jugadorVsJugador();break;
            case 2:jugadorVsOrdenador();break;
            case 3:ordenadorVsJugador();break;
            case 4:ordenadorVsOrdenador();break;
            default: System.out.println("Opcion no valida");
        }
    }
    public static void jugadorVsJugador(){
        Scanner sc = new Scanner(System.in);
        TresEnRaya tresEnRaya = new TresEnRaya();
        int turno = 0;
        while (tresEnRaya.quedanMovimientos()&&!tresEnRaya.ganaJugador1()&&!tresEnRaya.ganaJugador2()){
            tresEnRaya.dibujaTablero();
            System.out.print("¿Posicion?(1-9): ");
            int pos = sc.nextInt();
            if(turno == 0){
                while (!tresEnRaya.movimientoValido(pos)){
                    System.out.print("¿Posicion?(1-9): ");
                    pos = sc.nextInt();
                }
                try {
                    tresEnRaya.mueveJugador1(pos);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            else {
                while (!tresEnRaya.movimientoValido(pos)){
                    System.out.print("¿Posicion?(1-9): ");
                    pos = sc.nextInt();
                }
                try {
                    tresEnRaya.mueveJugador2(pos);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            turno = (turno+1)%2;
        }
        tresEnRaya.dibujaTablero();
        if(tresEnRaya.ganaJugador1()){
            System.out.println("GANA JUGADOR 1!!");
        }
        else if(tresEnRaya.ganaJugador2()){
            System.out.println("GANA JUGADOR 2!!");
        }
        else {
            System.out.println("EMPATE!!");
        }
        tresEnRaya.iniciar();
    }
    public static void jugadorVsOrdenador(){
        Scanner sc = new Scanner(System.in);
        TresEnRaya tresEnRaya = new TresEnRaya();
        int turno = 0;
        while (tresEnRaya.quedanMovimientos()&&!tresEnRaya.ganaJugador1()&&!tresEnRaya.ganaJugador2()){
            tresEnRaya.dibujaTablero();
            if(turno == 0){
                System.out.print("¿Posicion?(1-9): ");
                int pos = sc.nextInt();
                while (!tresEnRaya.movimientoValido(pos)){
                    System.out.print("¿Posicion?(1-9): ");
                    pos = sc.nextInt();
                }
                try {
                    tresEnRaya.mueveJugador1(pos);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            else {
                try {
                    tresEnRaya.mueveOrdernador2();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            turno = (turno+1)%2;
        }
        tresEnRaya.dibujaTablero();
        if(tresEnRaya.ganaJugador1()){
            System.out.println("GANA JUGADOR 1!!");
        }
        else if(tresEnRaya.ganaJugador2()){
            System.out.println("GANA LA MAQUINA!!");
        }
        else {
            System.out.println("EMPATE!!");
        }
        tresEnRaya.iniciar();
    }
    public static void ordenadorVsJugador(){
        Scanner sc = new Scanner(System.in);
        TresEnRaya tresEnRaya = new TresEnRaya();
        int turno = 0;
        while (tresEnRaya.quedanMovimientos()&&!tresEnRaya.ganaJugador1()&&!tresEnRaya.ganaJugador2()){
            tresEnRaya.dibujaTablero();
            if(turno == 0){
                try {
                    tresEnRaya.mueveOrdernador1();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            else {
                System.out.print("¿Posicion?(1-9): ");
                int pos = sc.nextInt();
                while (!tresEnRaya.movimientoValido(pos)){
                    System.out.print("¿Posicion?(1-9): ");
                    pos = sc.nextInt();
                }
                try {
                    tresEnRaya.mueveJugador2(pos);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            turno = (turno+1)%2;
        }
        tresEnRaya.dibujaTablero();
        if(tresEnRaya.ganaJugador1()){
            System.out.println("GANA LA MAQUINA!!");
        }
        else if(tresEnRaya.ganaJugador2()){
            System.out.println("GANA EL JUGADOR 2!!");
        }
        else {
            System.out.println("EMPATE!!");
        }
        tresEnRaya.iniciar();
    }
    public static void ordenadorVsOrdenador(){
        Scanner sc = new Scanner(System.in);
        TresEnRaya tresEnRaya = new TresEnRaya();
        int turno = 0;
        while (tresEnRaya.quedanMovimientos()&&!tresEnRaya.ganaJugador1()&&!tresEnRaya.ganaJugador2()){
            tresEnRaya.dibujaTablero();
            if(turno == 0){
                try {
                    tresEnRaya.mueveOrdernador1();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            else {
                try {
                    tresEnRaya.mueveOrdernador2();
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
            turno = (turno+1)%2;
        }
        tresEnRaya.dibujaTablero();
        if(tresEnRaya.ganaJugador1()){
            System.out.println("GANA LA MAQUINA 1!!");
        }
        else if(tresEnRaya.ganaJugador2()){
            System.out.println("GANA LA MAQUINA 2!!");
        }
        else {
            System.out.println("EMPATE!!");
        }
        tresEnRaya.iniciar();
    }
}
