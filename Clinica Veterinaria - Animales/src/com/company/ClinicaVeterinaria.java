package com.company;

import java.util.*;

public class ClinicaVeterinaria {
    private List<Animal> listaAnimales;
    public ClinicaVeterinaria(){
        listaAnimales = new LinkedList<>();
    }
    public void insertaAnimal(Animal a){
        listaAnimales.add(a);
    }
    public Animal buscaAnimal(String nombre){
        Animal animal = null;
        if(listaAnimales.size() == 0){
            System.out.println("Lista vacia");
        }
        else {
            Animal a;
            int i = 0;
            do {
                a = listaAnimales.get(i);
                i++;
            } while (i < listaAnimales.size() && !a.getNombre().equals(nombre));
            if (a.getNombre().equals(nombre)){
                animal = a;
            }
        }
        return animal;
    }
    public void modificaComentarioAnimal(String nombre,String comentario){
        Animal a = buscaAnimal(nombre);
        if (a != null) {
            a.setComentarios(comentario);
        }else {
            System.out.println("No hay tal animal en la lista");
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (Animal a: listaAnimales){
            s = s + a.toString() + "\n\n";
        }
        return s;
    }
}
