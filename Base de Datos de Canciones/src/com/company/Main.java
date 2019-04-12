package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //AJUSTAR VALORES DE LA BASE DE DATOS
        MusicaDB musicaDB = new MusicaDB("192.168.60.130","musica","usuario","usuario");
        ClasificaMP3 mp3 = new ClasificaMP3(musicaDB);
        int op;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menú:");
            System.out.println("------------------------------------");
            System.out.println("1. Nueva Cancion");
            System.out.println("2. Busca canciones");
            System.out.println("3. Busca canciones recursivamente");
            System.out.println("4. Genera lista de reproduccion");
            System.out.println("5. Genera lista de reproduccion aleatoria");
            System.out.println("6. Genera lista de reproduccion por artista");
            System.out.println("7. Genera lista de reproduccion por estilo");
            System.out.println("8. Genera lista de reproduccion por estrellas");
            System.out.println("9. Genera lista de reproduccion por año");
            op = sc.nextInt();
            switch (op) {
                case 1:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Ruta de la cancion: ");
                    String ruta = scan.nextLine();
                    mp3.nuevaCancion(ruta);
                }break;
                case 2:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Ruta del directorio de musica: ");
                    String ruta = scan.nextLine();
                    mp3.buscaCanciones(ruta);
                }break;
                case 3:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Ruta del directorio de musica: ");
                    String ruta = scan.nextLine();
                    mp3.buscaCancionesRecursivo(ruta);
                }break;
                case 4:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Ruta y nombre del fichero: ");
                    String ruta = scan.nextLine();
                    mp3.generaListaReproduccion(ruta);
                }break;
                case 5:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Ruta y nombre del fichero: ");
                    String ruta = scan.nextLine();
                    mp3.generaListaReproduccionAleatoria(ruta);
                }break;
                case 6:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Ruta y nombre del fichero: ");
                    String ruta = scan.nextLine();
                    System.out.println("Artista: ");
                    String artista = scan.nextLine();
                    System.out.println("Aleatorio: ");
                    boolean aleatorio = scan.nextBoolean();
                    mp3.generaListaReproduccionArtista(ruta,artista,aleatorio);
                }break;
                case 7:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Ruta y nombre del fichero: ");
                    String ruta = scan.nextLine();
                    System.out.println("Estilo: ");
                    String estilo = scan.nextLine();
                    System.out.println("Aleatorio: ");
                    boolean aleatorio = scan.nextBoolean();
                    mp3.generaListaReproduccionEstilo(ruta,estilo,aleatorio);
                }break;
                case 8:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Ruta y nombre del fichero: ");
                    String ruta = scan.nextLine();
                    System.out.println("Estrelas(min y max): ");
                    int min = scan.nextInt();
                    int max = scan.nextInt();
                    System.out.println("Aleatorio: ");
                    boolean aleatorio = scan.nextBoolean();
                    mp3.generaListaReproduccionEstrellas(ruta,min,max,aleatorio);
                }break;
                case 9:{
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Ruta y nombre del fichero: ");
                    String ruta = scan.nextLine();
                    System.out.println("Años(min y max): ");
                    int min = scan.nextInt();
                    int max = scan.nextInt();
                    System.out.println("Aleatorio: ");
                    boolean aleatorio = scan.nextBoolean();
                    mp3.generaListaReproduccionAnno(ruta,min,max,aleatorio);
                }break;
                default: System.out.println("SALIENDO...    ");
            }
        }while (op > 0 && op < 10);
    }
}
