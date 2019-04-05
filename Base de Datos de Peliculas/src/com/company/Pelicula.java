package com.company;

import java.util.Locale;

public class Pelicula {
    public int id;
    public String titulo;
    public int anno;
    public boolean tieneOscar;
    public double valoracion;

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH,"%d '%s' %d '%s' %.1f",id,titulo,anno,tieneOscar,valoracion);
    }
}
