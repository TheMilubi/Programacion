package com.company;


public class Carta {
    private int numero;//1 a 10
    private int palo;// 0 = oros, 1 = copas, 2 = espadas, 3 = bastos
    public Carta(int numero, int palo) throws Exception {
        if(numero<1||numero>10||palo<0||palo>3){
            throw new Exception("Error, valores no validos");
        }
        else{
            this.numero = numero;
            this.palo = palo;
        }
    }
    public Carta(int id) throws Exception {
        if(id<1||id>40){
            throw new Exception("Error, valores no validos");
        }
        else{
            this.numero = (id-1)%10+1;
            this.palo = (id-1)/10;
        }
    }
    public int getNumero(){return this.numero;}
    public int getPalo(){return this.palo;}
    public String nombreNumero(){
        String nombre = "";
        switch (this.numero){
            case 1: nombre = "as";break;
            case 2: nombre = "dos";break;
            case 3: nombre = "tres";break;
            case 4: nombre = "cuatro";break;
            case 5: nombre = "cinco";break;
            case 6: nombre = "seis";break;
            case 7: nombre = "siete";break;
            case 8: nombre = "zota";break;
            case 9: nombre = "caballo";break;
            case 10: nombre = "rey";break;
        }
        return nombre;
    }
    public String nombrePalo(){
        String nombre = "";
        switch (this.palo){
            case 0: nombre = "oros";break;
            case 1: nombre = "copas";break;
            case 2: nombre = "espadas";break;
            case 3: nombre = "bastos";break;
        }
        return nombre;
    }
    public String nombreCarta(){
        String nombre = nombreNumero() + " de " + nombrePalo();
        return nombre;
    }
    public int valorTute(){
        int valor;
        switch (this.numero){
            case 1: valor = 11;break;
            case 3: valor = 10;break;
            case 8: valor = 2;break;
            case 9: valor = 3;break;
            case 10: valor = 4;break;
            default: valor = 0;
        }
        return valor;
    }

    public int valorMus(){
        int valor;
        switch (this.numero){
            case 1: case 2: valor = 1;break;
            case 3: case 8: case 9: case 10: valor = 10;break;
            default: valor = this.numero;
        }
        return valor;
    }

    public double valor7ymedia(){
        double valor;
        switch (this.numero){
            case 8: case 9: case 10: valor = 0.5;break;
            default: valor = this.numero;
        }
        return valor;
    }
}
