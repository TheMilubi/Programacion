package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
	    cuatroVocales("lazarilloBien.txt");
    }
    public static void cuatroVocales(String nombre){
        try{
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("4vocales.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            String s = br.readLine();
            while (s != null){
                String [] palabras = s.split(" ");
                for (int i = 0; i < palabras.length; i++) {
                    if(cuentaVocales(palabras[i])>3){
                        bw.write(quitaCaracteresEspeciales(palabras[i]));
                        bw.newLine();
                    }
                }
                s = br.readLine();
            }
            br.close();
            fr.close();
            bw.close();
            fw.close();
        }catch (Exception e){
            System.out.println("Error en cuatroVocales: "+e.getMessage());
        }

    }
    public static int cuentaVocales(String s){
        int contador = 0;
        String vocales = "aeiouáéíóúüAEIOUÁÉÍÓÚÜ";
        for (int i = 0; i < s.length(); i++) {
            if (vocales.contains(""+s.charAt(i))){
                contador++;
            }
        }
        return contador;
    }
    public static String quitaCaracteresEspeciales(String s){
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                str = str + s.charAt(i);
            }
        }
        return str;
    }
}
