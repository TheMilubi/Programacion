package com.company;

import java.time.LocalDate;

public abstract class Animal {
    protected String nombre, comentarios = "";
    protected double peso;
    protected LocalDate fechaNacimiento;

    public double getPeso() {
        return peso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getComentarios() {
        return comentarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public abstract String toString();

}
