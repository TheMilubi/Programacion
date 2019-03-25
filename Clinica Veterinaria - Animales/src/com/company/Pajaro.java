package com.company;

import java.time.LocalDate;

enum EspeciePajaro{Canario, Periquito, Agapornis}

public class Pajaro extends Animal{
    private EspeciePajaro especie;
    private boolean cantor;
    public Pajaro(String nombre, EspeciePajaro especie, LocalDate fechaNacimiento, double peso, boolean cantor){
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.cantor = cantor;
    }

    public EspeciePajaro getEspecie() {
        return especie;
    }
    public boolean getCantor(){
        return cantor;
    }

    public String toString() {
        String s = "Ficha de Pajaro\n";
        s = s + "Nombre: " + this.nombre +"\n";
        s = s +"Especie: " + this.especie+"\n";
        s = s +"Fecha Nacimiento: " + this.fechaNacimiento+"\n";
        s = s +"Peso: "+ this.peso+"\n";
        s = s +"Cantor: " + this.cantor+"\n";
        s = s +"Comentarios: " + this.comentarios+"\n";
        return s;
    }

}
