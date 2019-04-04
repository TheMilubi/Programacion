package com.company;

public class Pelicula {
    public int id;
    public String titulo;
    public int anno;
    public boolean tieneOscar;
    public double valoracion;

    @Override
    public String toString() {
        String s = "";
        s = s + id +" ";
        s = s + titulo +" ";
        s = s + anno +" ";
        s = s + tieneOscar +" ";
        s = s + valoracion;
        return s;
    }
}
