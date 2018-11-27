package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Juego del número secreto. El ordenador elegirá un número al azar entre 1 y 100. El
    // usuario irá introduciendo números por teclado, y el ordenador le irá dando pistas: "mi
    //número es mayor" o "mi número es menor", hasta que el usuario acierte. Entonces el
    //ordenador le felicitará y le comunicará el número de intentos que necesitó para acertar
    //el número secreto.
        Scanner sc = new Scanner(System.in);
        int intentos, numSecreto, numUsuario;
        intentos = 1;
        numSecreto = (int) (Math.random() * 100);
        numUsuario = -1;
        System.out.println("¿En qué número estoy pensando?");
        numUsuario = sc.nextInt();
        while (numUsuario != numSecreto){
            System.out.println((numUsuario > numSecreto)?"Mi número es menor":"Mi número es mayor");
            System.out.println("¿En qué número estoy pensando?");
            numUsuario = sc.nextInt();
            intentos++;
        }
        System.out.println("Has adivinado mi número\nTe ha llevado "+intentos+" intentos");
    }
}
