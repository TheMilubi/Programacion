package com.company;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ServidorMayusculas{

    static void lanzaServidor(){
        ExecutorService es = Executors.newCachedThreadPool();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9010);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        while (true){
            try {
                Socket socket = serverSocket.accept();
                System.out.println("Cliente conectado");
                es.execute(new HiloServidor(socket));

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    static class HiloServidor implements Runnable{
        Socket socket;
        public HiloServidor(Socket socket){
            this.socket = socket;
        }
        @Override
        public void run() {
            try {
                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                Scanner sc = new Scanner(is);
                PrintWriter pw = new PrintWriter(os, true);
                String mensaje = sc.nextLine();
                while (!mensaje.equals("")){
                    mensaje = mensaje.toUpperCase();
                    pw.println(mensaje);
                    mensaje = sc.nextLine();
                }
                socket.close();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }

}
