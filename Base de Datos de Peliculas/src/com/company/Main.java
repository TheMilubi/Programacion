package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    CineDB cine = new CineDB("cine.db");
	    //DATOS YA INSERTADOS
	    //int idActor = cine.insertaActor("Bruce Willis", LocalDate.of(1955,3,19));
	    //int idPelicula = cine.insertaPelicula("Jungla de Cristal",1988,false,7.2);
	    //cine.asociaActorPelicula(1,1,true);
        int op;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Menú:");
            System.out.println("------------------------------------");
            System.out.println("1. Insertar Actor");
            System.out.println("2. Insertar Pelicula");
            System.out.println("3. Asociar Actor-Pelicula");
            System.out.println("4. Listado de Peliculas");
            System.out.println("5. Listado de Actores");
            System.out.println("6. Datos de Actor");
            System.out.println("7. Datos de Pelicula");
            System.out.println("8. Listado de Actores(por pelicula)");
            System.out.println("9. Listado de Peliculas(por actor)");
            op = sc.nextInt();
            switch (op){
                case 1:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Nombre: ");
                    String nombre = scan.nextLine();
                    System.out.println("Fecha(dia mes año): ");
                    int dia = scan.nextInt();
                    int mes = scan.nextInt();
                    int anno = scan.nextInt();
                    LocalDate date = LocalDate.of(anno,mes,dia);
                    cine.insertaActor(nombre,date);
                }break;
                case 2:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Nombre: ");
                    String titulo = scan.nextLine();
                    System.out.println("Año de Pelicula: ");
                    int anno = scan.nextInt();
                    System.out.println("¿Tiene Óscar?(true/false)");
                    boolean tieneOscar = scan.nextBoolean();
                    System.out.println("Valoracion: ");
                    double valoracion = scan.nextDouble();
                    cine.insertaPelicula(titulo,anno,tieneOscar,valoracion);
                }break;
                case 3:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Id del actor: ");
                    int idActor = scan.nextInt();
                    System.out.println("Id de la pelicula: ");
                    int idPelicula = scan.nextInt();
                    System.out.println("¿Actor principal?(true/false): ");
                    boolean principal = scan.nextBoolean();
                    cine.asociaActorPelicula(idActor,idPelicula,principal);
                }
                case 4:{
                    System.out.println(cine.listadoPeliculas());
                }break;
                case 5:{
                    System.out.println(cine.listadoActores());
                }break;
                case 6:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Nombre del actor: ");
                    String nombre = scan.nextLine();
                    Actor a = cine.datosActor(cine.buscaActor(nombre));
                    System.out.println(a);
                }break;
                case 7:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Titulo de la película: ");
                    String titulo = scan.nextLine();
                    Pelicula p = cine.datosPelicula(cine.buscaPelicula(titulo));
                    System.out.println(p);
                }break;
                case 8:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Titulo de la película: ");
                    String titulo = scan.nextLine();
                    System.out.println(cine.listadoActoresPorPelicula(cine.buscaPelicula(titulo)));
                }break;
                case 9:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Nombre del actor: ");
                    String nombre = scan.nextLine();
                    System.out.println(cine.listadoPeliculasPorActores(cine.buscaActor(nombre)));
                }break;
                default:{
                    System.out.println("Saliendo...");
                }
            }
        }while (op > 0 && op < 10);
    }
}
