package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Baraja {
    private List<Carta> listaCartas;
    public Baraja(){
        this.listaCartas = new LinkedList<>();
    }
    public Baraja(int tipobaraja) throws Exception{
        switch (tipobaraja){
            case 1:
                listaCartas = new LinkedList<>();
                for (int i = 1; i < 41; i++) {
                    listaCartas.add(new Carta(i));
                }
                break;
            case 2:
                listaCartas = new LinkedList<>();
                for (int i = 1; i < 41; i++) {
                    listaCartas.add(new Carta(i));
                }
                for (int i = 1; i < 41; i++) {
                    listaCartas.add(new Carta(i));
                }
                break;
            default: throw new Exception("Error, tipo de baraja no valido");
        }
    }
    public Baraja(int tipobaraja, boolean barajar) throws Exception{
        switch (tipobaraja){
            case 1:
                listaCartas = new LinkedList<>();
                for (int i = 1; i < 41; i++) {
                    listaCartas.add(new Carta(i));
                }
                break;
            case 2:
                listaCartas = new LinkedList<>();
                for (int i = 1; i < 41; i++) {
                    listaCartas.add(new Carta(i));
                }
                for (int i = 1; i < 41; i++) {
                    listaCartas.add(new Carta(i));
                }
                break;
            default: throw new Exception("Error, tipo de baraja no valido");
        }
        if (barajar){
            this.barajar();
        }
    }
    public void barajar(){
        List<Carta> listaBarajada = new LinkedList<>();
        int veces = listaCartas.size();
        Random r = new Random();
        for (int i = 0; i < veces; i++) {
            int x = r.nextInt(listaCartas.size());
            listaBarajada.add(listaCartas.get(x));
            listaCartas.remove(x);
        }
        this.listaCartas.addAll(listaBarajada);
    }
    public void cortar(int numeroCartas) throws Exception{
        if(numeroCartas<listaCartas.size()){
            for (int i = 0; i < numeroCartas ; i++) {
                Carta c = listaCartas.get(0);
                listaCartas.add(c);
            }
        }
        else throw new Exception("No puedes cortar mas cartas de las que tiene la baraja");
    }
    public Carta robar(){
        Carta robada = null;
        if(!vacia()){
            robada = listaCartas.get(0);
            listaCartas.remove(0);
        }
        return robada;
    }
    public void insertaCartaFinal(int idCarta) throws Exception{
        this.listaCartas.add(new Carta(idCarta));
    }
    public void insertaCartaInicio(int idCarta) throws Exception{
        this.listaCartas.add(0,new Carta(idCarta));
    }
    public void insertaCartaFinal(Carta c) throws Exception{
        this.listaCartas.add(c);
    }
    public void insertaCartaInicio(Carta c) throws Exception{
        this.listaCartas.add(0,c);
    }
    public int numeroCartas(){return listaCartas.size();}
    public boolean vacia(){
        boolean vacia;
        vacia = (listaCartas.size()==0);
        return vacia;
    }
    //List<Carta> getBaraja(){return this.listaCartas;}
}
