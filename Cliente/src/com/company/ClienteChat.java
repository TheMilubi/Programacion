package com.company;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClienteChat {
    public static void conectar(String ip, String usuario){
        try {
            Socket socket = new Socket(ip, 9013);
            HiloRecibir hiloRecibir = new HiloRecibir(socket);
            Thread recibir = new Thread(hiloRecibir);
            recibir.start();
            System.out.println("Conectado al Servidor");
            Scanner consola = new Scanner(System.in);
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            PrintWriter pw = new PrintWriter(os,true);
            pw.println(usuario);
            Scanner servidor = new Scanner(is);
            String mensaje = consola.nextLine();
            while (!mensaje.equals("/salir")){
                pw.println(mensaje);
                mensaje = consola.nextLine();
            }
            hiloRecibir.stop();
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    static class HiloRecibir implements Runnable{
        Socket socket;
        volatile boolean salir = false;
        public HiloRecibir(Socket socket){
            this.socket = socket;
        }
        @Override
        public void run() {
            try {
                InputStream is = socket.getInputStream();
                Scanner sc = new Scanner(is);
                String mensaje = sc.nextLine();
                while (!salir){
                    System.out.println(mensaje);
                    mensaje = sc.nextLine();
                }
                socket.close();

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
        public void stop(){
            salir = true;
        }
    }
}
