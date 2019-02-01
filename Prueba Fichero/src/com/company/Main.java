package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try{
            //FILE Y BUFFERED: READER Y WRITER
            //Escribe
            FileWriter fw = new FileWriter("prueba.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("patata\n");
            bw.write("tomate");
            bw.close();
            fw.close();
            //Lee
            FileReader fr = new FileReader("prueba.txt");
            BufferedReader br = new BufferedReader(fr);
            String s;
            s = br.readLine();
            while ( s != null){
                System.out.println(s);
                s = br.readLine();
            }
            br.close();
            fr.close();

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        try{
            //FILE STREAM: READER Y WRITER
            //Escribe
            FileOutputStream fos = new FileOutputStream("prueba.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeInt(3);
            dos.writeInt(4);
            dos.close();
            fos.close();
            //Lee
            FileInputStream fis = new FileInputStream("prueba.txt");
            DataInputStream dis = new DataInputStream(fis);
            int s;
            while ( dis.available()>0){
                s = dis.readInt();
                System.out.println(s);
            }
            fis.close();
            dis.close();

        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
