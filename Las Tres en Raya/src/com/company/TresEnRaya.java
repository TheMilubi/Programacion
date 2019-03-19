package com.company;

import java.util.Random;

public class TresEnRaya {
    private int[] tablero;//0: vacio; 1: jugador 1; 2: jugador 2
    public TresEnRaya(){
        tablero = new int[9];
    }
    public void mueveJugador1(int pos) throws Exception{//pos 1 a 9
        if(movimientoValido(pos)){
            tablero[pos-1]=1;
        }else {
            throw new Exception("Movimiento no valido");
        }
    }
    public void mueveJugador2(int pos) throws Exception{//pos 1 a 9
        if(movimientoValido(pos)){
            tablero[pos-1]=2;
        }else {
            throw new Exception("Movimiento no valido");
        }
    }
    public void mueveOrdernador1()throws Exception{
        Random r = new Random();
        int pos = r.nextInt(9)+1;
        while (!movimientoValido(pos)){
            pos = r.nextInt(9)+1;
        }
        this.mueveJugador1(pos);
    }
    public void mueveOrdernador2()throws Exception{
        Random r = new Random();
        int pos = r.nextInt(9)+1;
        while (!movimientoValido(pos)){
            pos = r.nextInt(9)+1;
        }
        this.mueveJugador2(pos);
    }
    public boolean movimientoValido(int pos){
        boolean valido;
        valido = pos >=1 && pos <=9;
        if (valido) {
            valido = tablero[pos-1]==0;
        }
        return valido;
    }
    public void iniciar(){
        tablero = new int[9];
    }
    public boolean quedanMovimientos(){
        boolean quedanM = false;
        int i = 0;
        while (!quedanM&&i<9){
            quedanM = tablero[i]==0;
            i++;
        }
        return quedanM;
    }
    public boolean ganaJugador1(){
        boolean ganaJ1 = false;
        ganaJ1 = tablero[0]==1&&tablero[0]==tablero[1]&&tablero[1]==tablero[2];
        ganaJ1 = ganaJ1 || tablero[3]==1&&tablero[3]==tablero[4]&&tablero[4]==tablero[5];
        ganaJ1 = ganaJ1 || tablero[6]==1&&tablero[6]==tablero[7]&&tablero[7]==tablero[8];
        ganaJ1 = ganaJ1 || tablero[0]==1&&tablero[0]==tablero[3]&&tablero[3]==tablero[6];
        ganaJ1 = ganaJ1 || tablero[1]==1&&tablero[1]==tablero[4]&&tablero[4]==tablero[7];
        ganaJ1 = ganaJ1 || tablero[2]==1&&tablero[2]==tablero[5]&&tablero[5]==tablero[8];
        ganaJ1 = ganaJ1 || tablero[0]==1&&tablero[0]==tablero[4]&&tablero[4]==tablero[8];
        return ganaJ1;
    }
    public boolean ganaJugador2(){
        boolean ganaJ2 = false;
        ganaJ2 = tablero[0]==2&&tablero[0]==tablero[1]&&tablero[1]==tablero[2];
        ganaJ2 = ganaJ2 || tablero[3]==2&&tablero[3]==tablero[4]&&tablero[4]==tablero[5];
        ganaJ2 = ganaJ2 || tablero[6]==2&&tablero[6]==tablero[7]&&tablero[7]==tablero[8];
        ganaJ2 = ganaJ2 || tablero[0]==2&&tablero[0]==tablero[3]&&tablero[3]==tablero[6];
        ganaJ2 = ganaJ2 || tablero[1]==2&&tablero[1]==tablero[4]&&tablero[4]==tablero[7];
        ganaJ2 = ganaJ2 || tablero[2]==2&&tablero[2]==tablero[5]&&tablero[5]==tablero[8];
        ganaJ2 = ganaJ2 || tablero[0]==2&&tablero[0]==tablero[4]&&tablero[4]==tablero[8];
        return ganaJ2;
    }
    public void dibujaTablero(){
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i]==0){
                System.out.print("   ");
            }
            else if (tablero[i]==1){
                System.out.print(" X ");
            }
            else if(tablero[i]==2){
                System.out.print(" O ");
            }
            if (!(i == 2||i==5||i==8)){
                System.out.print("|");
            }
            if (i == 2||i==5){
                System.out.println();
                System.out.println("-----------");
            }
        }
        System.out.println();
    }

}
