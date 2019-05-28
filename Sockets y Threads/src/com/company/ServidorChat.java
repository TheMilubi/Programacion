package com.company;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServidorChat {
    static List<PrintWriter> listaWriters = new LinkedList<>();
    static void lanzaServidor(){
        ExecutorService es = Executors.newCachedThreadPool();
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(9013);
        }catch (Exception e){
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
                listaWriters.add(pw);
                String usuario = sc.nextLine();
                for (int i = 0; i < listaWriters.size(); i++) {
                    PrintWriter printWriter = listaWriters.get(i);
                    if (!printWriter.equals(pw)){
                        printWriter.println("El usuario "+usuario+" se ha conectado");
                    }
                }
                String mensaje = sc.nextLine();
                while (!mensaje.equals("/salir")){
                    for (int i = 0; i < listaWriters.size(); i++) {
                        PrintWriter printWriter = listaWriters.get(i);
                        if (!printWriter.equals(pw)){
                            printWriter.println(mensaje);
                        }
                    }
                    mensaje = sc.nextLine();
                }
                listaWriters.remove(pw);
                socket.close();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }

}
