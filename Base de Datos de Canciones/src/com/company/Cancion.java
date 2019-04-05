package com.company;

public class Cancion {
    public int id;
    public String ruta;
    public String titulo;
    public int idArtista;
    public int idEstilo;
    public int anno;
    public int estrellas;

    @Override
    public String toString() {
        return String.format("%d '%s' '%s' %d %d %d %d",id,ruta,titulo,idArtista,idEstilo,anno,estrellas);
    }
}
