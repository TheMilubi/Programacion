package com.company;

import java.util.concurrent.ExecutorService;

public class Main {

    public static void main(String[] args) {
        //Servidor Bonoloto
        /*
        ServidorBonoloto sb = new ServidorBonoloto();
        System.out.println(sb.numBonoloto);
	    Thread tservidor = new Thread(sb);
	    tservidor.start();
	    */
        //Servidor Mayusculas
        /*
        ServidorMayusculas.lanzaServidor();
        */
        //Chat Directo
        /*new Thread(new Runnable() {
            @Override
            public void run() {
                ChatDirecto.escuchar();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ChatDirecto.conectar("127.0.0.1");
            }
        }).start();*/
        //Servidor Chat
        new Thread(new Runnable() {
            @Override
            public void run() {
                ServidorChat.lanzaServidor();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ClienteChat.conectar("127.0.0.1","Juan");
            }
        }).start();


    }
}
