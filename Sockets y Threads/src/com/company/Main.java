package com.company;

public class Main {

    public static void main(String[] args) {
        ServidorBonoloto sb = new ServidorBonoloto();
        System.out.println(sb.numBonoloto);
	    Thread tservidor = new Thread(sb);
	    tservidor.start();
    }
}
