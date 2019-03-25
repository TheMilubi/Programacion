package com.company;

import java.time.LocalDate;

enum RazaGato {Comun, Siames, Persa, Angora, ScottishFold}

public class Gato extends Animal {
    private RazaGato raza;
    private String microchip;
    public Gato(String nombre, RazaGato raza, LocalDate fechaNacimiento, double peso, String microchip){
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.microchip = microchip;
    }

    public RazaGato getRaza() {
        return raza;
    }

    public String getMicrochip() {
        return microchip;
    }
    public String toString() {
        String s = "Ficha de Gato\n";
        s = s + "Nombre: " + this.nombre +"\n";
        s = s +"Raza: " + this.raza+"\n";
        s = s +"Fecha Nacimiento: " + this.fechaNacimiento+"\n";
        s = s +"Peso: "+ this.peso+"\n";
        s = s +"Microchip: " + this.microchip+"\n";
        s = s +"Comentarios: " + this.comentarios+"\n";
        return s;
    }
}
