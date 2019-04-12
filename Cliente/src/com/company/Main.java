package com.company;

public class Main {

    public static void main(String[] args) {
        ClienteBonoloto cb = new ClienteBonoloto();
        Thread tcliente = new Thread(cb);
        tcliente.start();
    }
}
