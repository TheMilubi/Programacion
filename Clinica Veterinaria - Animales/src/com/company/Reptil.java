package com.company;

import java.time.LocalDate;

enum EspecieReptil{Tortuga, Iguana, DragonDeComodo}

public class Reptil extends Animal{
    private EspecieReptil especie;
    private boolean venenoso;
    public Reptil(String nombre, EspecieReptil especie, LocalDate fechaNacimiento, double peso, boolean venenoso){
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.venenoso = venenoso;
    }

    public EspecieReptil getEspecie() {
        return especie;
    }
    public boolean getVenenoso(){
        return venenoso;
    }

    public String toString() {
        String s = "Ficha de Reptil\n";
        s = s + "Nombre: " + this.nombre +"\n";
        s = s +"Especie: " + this.especie+"\n";
        s = s +"Fecha Nacimiento: " + this.fechaNacimiento+"\n";
        s = s +"Peso: "+ this.peso+"\n";
        s = s +"Venenoso: " + this.venenoso+"\n";
        s = s +"Comentarios: " + this.comentarios+"\n";
        return s;
    }
}
