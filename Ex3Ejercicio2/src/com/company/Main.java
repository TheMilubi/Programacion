package com.company;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int [][] array = leeSudoku("todo1.sudoku");
        escribeSudoku("sudokusan.sudoku",array);
        int [][] array2 = leeSudoku("sudokusan.sudoku");
        escribeArrayBi(array2);
    }
    public static int[][] leeSudoku(String nombre){
        int[][] array = new int[0][0];
        List<Integer> provisional = new LinkedList<>();
        boolean proValido = true;
        try{
            FileInputStream fis = new FileInputStream(nombre);
            DataInputStream dis = new DataInputStream(fis);
            if(!(dis.readUTF().equals("SUDOKU"))){
                System.out.println("ERROR: falta palabra SUDOKU");
            }
            else {
                int i = 0;
                while (dis.available()>0 && proValido){
                    int aux = dis.readInt();
                    if (aux < 0 || aux > 9){
                        proValido= false;
                    }
                    else{
                        provisional.add(aux);
                        i++;
                    }
                }
            }
            dis.close();
            fis.close();
        }catch (Exception e){
            System.out.println("Error en leeSudou: "+e.getMessage());
        }
        if (!proValido) {
            System.out.println("ERROR: valores incorrectos");

        }
        else if (provisional.size()!=81){
            System.out.println("ERROR: no hay 81 valores enteros");
        }
        else {
            array = uniABi(provisional);
        }
        return array;
    }
    public static int [][] uniABi(List<Integer> array){
        int [][] sudoku = new int[9][9];
        if(array.size()!=81){
            System.out.println("ERROR");
        }
        else {
            int contador = 0;
            for (int i = 0; i < sudoku.length; i++) {
                for (int j = 0; j < sudoku[i].length ; j++) {
                    sudoku[i][j]= array.get(contador);
                    contador++;
                }
            }
        }
        return sudoku;
    }
    public static void escribeArrayBi(int [][] array){
        int masLargo = numeroMasLargo(array);
        for (int i = 0; i < array.length; i++){
            System.out.print("|");
            for (int j = 0; j < array[i].length; j++){
                System.out.print(" ");
                repiteStr(" ",masLargo-Integer.toString(array[i][j]).length());
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void repiteStr(String s, int n){
        for(int i = 0; i < n; i++){
            System.out.print(s);
        }
    }
    public static int numeroMasLargo(int [][] array){
        int max = 0;
        String conversion, masLargo = "";
        for (int[] f:array) {
            for (int n:f) {
                conversion = "" + n;
                if (max < conversion.length()){
                    masLargo = conversion;
                    max = conversion.length();
                }
            }
        }
        return max;
    }
    public static void escribeSudoku(String nombre, int [][] sudoku){
        if(compruebaSudoku(sudoku)){
            try {
                FileOutputStream fos = new FileOutputStream(nombre);
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeUTF("SUDOKU");
                for (int i = 0; i < sudoku.length; i++) {
                    for (int j = 0; j < sudoku[i].length; j++) {
                        int aux = sudoku[i][j];
                        dos.writeInt(aux);
                    }
                }
                dos.close();
                fos.close();
            }catch (Exception e){
                System.out.println("Error en escribeSudoku: "+ e.getMessage());
            }
        }
    }
    public static boolean compruebaSudoku(int [][] sudoku){
        boolean valido = true;
        if (sudoku.length!=9 || sudoku[0].length!=9){
            System.out.println("ERROR: TAMAÑO NO VALIDO");
            valido = false;
        }else {
            for (int i = 0; i < sudoku.length; i++) {
                for (int j = 0; j < sudoku[i].length; j++) {
                    int aux = sudoku[i][j];
                    if (aux<0 || aux >9){
                        valido = false;
                    }
                }
            }
            if(!valido){
                System.out.println("ERROR: VALORES NO VALIDOS");
            }
        }
        return valido;
    }
}
