package com.company;

import java.time.LocalDate;

public class ActorPelicula {
    public int id;
    public String nombre;
    public LocalDate fechaNacimiento;
    public boolean principal;
    @Override
    public String toString() {
        String s = "";
        s = s + id +" ";
        s = s + nombre +" ";
        s = s + fechaNacimiento+ " ";
        s = s + principal;
        return s;
    }
}
