package com.company;

import java.time.LocalDate;

public class ActorPelicula {
    public int id;
    public String nombre;
    public LocalDate fechaNacimiento;
    public boolean principal;
    @Override
    public String toString() {
        return String.format("%d '%s' '%s' '%s'",id,nombre,fechaNacimiento,principal);
    }
}
