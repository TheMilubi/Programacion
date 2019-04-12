package com.company;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ServidorBonoloto implements Runnable{
    List<Integer> numBonoloto;
    ServerSocket serverSocket = null;
    private Random r = new Random();
    public ServidorBonoloto(){
        numBonoloto = new LinkedList<>();
        for(int i = 1; i < 50; i++){
            numBonoloto.add(i);
        }
    }
    public void lanzaServidor(){
        try {
            serverSocket = new ServerSocket(9009);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        while (true){
            try {
                Socket socket = serverSocket.accept();
                System.out.println("Cliente conectado");
                OutputStream os = socket.getOutputStream();
                PrintWriter pw = new PrintWriter(os,true);
                for (int i = 0; i < 6; i++) {
                    int n = r.nextInt(numBonoloto.size());
                    System.out.println(numBonoloto.get(n));
                    pw.println(numBonoloto.get(n));
                    numBonoloto.remove(n);
                }
            }catch (Exception e){
                e.printStackTrace();
                System.out.println(e.getMessage());
                new ServidorBonoloto();
            }
        }
    }

    @Override
    public void run() {
        lanzaServidor();
    }
}
