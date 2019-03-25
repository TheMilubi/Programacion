package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Perro p = new Perro("Toby",RazaPerro.Dalmata, LocalDate.now(),1.5,"5555A");
        Gato g = new Gato("Misifú",RazaGato.Persa, LocalDate.now(),1,"4444A");
        Pajaro pj = new Pajaro("Piolín",EspeciePajaro.Canario, LocalDate.now(),0.5,true);
        Reptil r = new Reptil("Dragoon",EspecieReptil.Iguana, LocalDate.now(),0.3,false);
        ClinicaVeterinaria cv = new ClinicaVeterinaria();
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("Menu:");
            System.out.println("---------------------------");
            System.out.println("1. Añadir");
            System.out.println("2. Buscar");
            System.out.println("3. Modificar comentario");
            System.out.println("4. Mostrar Lista");
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    //Me da pereza hacer otro menu para que el usuario añada animales
                    cv.insertaAnimal(p);
                    cv.insertaAnimal(g);
                    cv.insertaAnimal(pj);
                    cv.insertaAnimal(r);
                    System.out.println("Animales añadidos con éxito!");
                }
                break;
                case 2: {
                    System.out.println("Nombre del animal: ");
                    String nombre = sc.next();
                    Animal a = cv.buscaAnimal(nombre);
                    System.out.println(a);
                }
                break;
                case 3: {
                    Scanner s = new Scanner(System.in);
                    System.out.println("Nombre del animal: ");
                    String nombre = s.nextLine();
                    System.out.println("Comentario: ");
                    String comentario = s.nextLine();
                    cv.modificaComentarioAnimal(nombre, comentario);
                    Animal a = cv.buscaAnimal(nombre);
                    System.out.println(a);
                }
                break;
                case 4: {
                    System.out.println(cv);
                }
                break;
                default:
                    System.out.println("Saliendo...");
            }
        }while (op > 0 && op < 5);
    }
}
