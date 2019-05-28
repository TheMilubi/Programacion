package com.company;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClienteMayusculas {
    static void conectaCliente(String ip){
        try {
            Socket socket = new Socket(ip, 9010);
            System.out.println("Conectado al Servidor");
            Scanner consola = new Scanner(System.in);
            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            PrintWriter pw = new PrintWriter(os,true);
            Scanner servidor = new Scanner(is);
            String s = consola.nextLine();
            while (!s.equals("")){
                pw.println(s);
                s = servidor.nextLine();
                System.out.println(s);
                s = consola.nextLine();
            }
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
