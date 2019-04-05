package com.company;

import java.time.LocalDate;

public class Actor {
    public int id;
    public String nombre;
    public LocalDate fechaNacimiento;

    @Override
    public String toString() {
        return String.format("%d '%s' '%s'",id,nombre,fechaNacimiento);
    }
}
