package com.company;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChatDirecto {
    public static void escuchar(){
        ExecutorService es = Executors.newCachedThreadPool();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9011);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        while (true){
            try {
                Socket socket = serverSocket.accept();
                System.out.println("Cliente conectado");
                es.execute(new HiloRecibir(socket));

            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void conectar(String ip){
        try {
            Thread.sleep(1000);
            Socket socket = new Socket(ip, 9012);
            System.out.println("Conectado al Servidor");
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os,true);
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            while (!s.equals("")){
                pw.println(s);
                s = sc.nextLine();
            }
            socket.close();

        }catch (Exception e){
            conectar(ip);
        }

    }
    static class HiloRecibir implements Runnable{
        Socket socket;
        public HiloRecibir(Socket socket){
            this.socket = socket;
        }
        @Override
        public void run() {
            try {
                InputStream is = socket.getInputStream();
                Scanner sc = new Scanner(is);
                String mensaje = sc.nextLine();
                while (!mensaje.equals("")){
                    System.out.println(mensaje);
                    mensaje = sc.nextLine();
                }
                socket.close();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }

}
