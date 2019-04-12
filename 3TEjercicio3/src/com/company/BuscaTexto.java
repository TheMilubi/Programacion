package com.company;

import java.io.BufferedReader;
import java.io.FileReader;

public class BuscaTexto {
    private String texto;
    private int puntero;
    public BuscaTexto(){
        texto = "";
        puntero = 0;
    }
    public BuscaTexto(String texto){
        this.texto = texto;
        puntero = 0;
    }
    public void cargaFichero(String rutaFichero){
        try {
            FileReader fr = new FileReader(rutaFichero);
            BufferedReader bf = new BufferedReader(fr);
            String s = bf.readLine();
            while (s != null){
                this.texto = this.texto + s + "\n";
                s = bf.readLine();
            }
            bf.close();
            fr.close();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void busca(String cadena){
        int i = this.texto.indexOf(cadena);
        this.puntero = (i >= 0) ? i : 0;
    }

    public void buscaSiguitente(String cadena){
        int i = this.texto.indexOf(cadena,(puntero>0)?puntero+1:0);
        puntero = (i >= 0) ? i : 0;
    }

    public String extraeCadena(String delimitador1, String delimitador2){
        String s = "";
        int index1,index2;
        int punteroInicial = this.puntero;
        buscaSiguitente(delimitador1);
        index1 = this.puntero;
        buscaSiguitente(delimitador2);
        index2 = this.puntero;
        s = this.texto.substring(index1+delimitador1.length(),index2);
        this.puntero = punteroInicial;
        return s;
    }
    public String getTexto() {
        return texto;
    }

    public int getPuntero() {
        return puntero;
    }

    public void setPuntero(int puntero) {
        this.puntero = puntero;
    }
}
