package com.company;
import java.util.Scanner;

//El usuario de este programa será un profesor, que introducirá las notas de sus 30
//alumnos de una en una. El algoritmo debe decirle cuántos suspensos y cuántos
//aprobados hay
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0,numAprobados = 0,numSuspensos = 0;
        double notas;
        for(;i < 30;i++){
            System.out.println("Nota del alumno " + i);
            do{
                notas = sc.nextDouble();
            }while(notas<0||notas>10);
            if (notas >= 5) numAprobados ++;
            else numSuspensos++;
        }
        System.out.println("Numero de aprobados: "+ numAprobados + "\nNumero de suspensos: " + numSuspensos);
    }
}
