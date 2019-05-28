package com.company;

public class Main {

    public static void main(String[] args) {
        //Cliente Bonoloto
        /*
        ClienteBonoloto cb = new ClienteBonoloto();
        Thread tcliente = new Thread(cb);
        tcliente.start();
        */
        //Cliente Mayusculas
        /*
        ClienteMayusculas.conectaCliente("127.0.0.1");
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
        //Cliente Chat
        ClienteChat.conectar("127.0.0.1","Ruben");
    }
}
