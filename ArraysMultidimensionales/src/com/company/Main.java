package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Menu");
        System.out.println("************");
        System.out.print("Escribe el numero del ejercicio [1-20]: ");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:{
                int [][] array = {{2,1,-11},{333,22,19},{-45,34,19}};
                escribeArray3x3(array);
            }break;
            case 2:{
                int [][] array = new int[3][3];
                rellena3x3(array);
                escribeArray3x3(array);
            }break;
            case 3:{
                int [][] array = new int[3][3];
                rellenaAleatorio3x3(array);
                escribeArray3x3(array);
            }break;
            case 4:{
                int [][] array = new int[3][3];
                rellena3x3(array);
                escribeArray3x3(array);
                System.out.println(sumaArray3x3(array));

            }break;
            case 5:{
                int [][] array = {{2,1,-11},{333,22,19},{-45,34,19},{-65,51,28}};
                escribeArrayBi(array);
            }break;
            case 6:{
                int [][] array = new int[5][6];
                rellenaAleatorioBi(array);
                escribeArrayBi(array);
            }break;
            case 7:{
                int [][] array = new int[5][6];
                rellenaEnOrdenBi(array);
                escribeArrayBi(array);
            }break;
            case 8:{
                int [][] array = new int[5][6];
                rellenaEnOrdenBi(array);
                escribeArrayBi(array);
                System.out.println(sumaArrayBi(array));
            }break;
            case 9:{
                int [][] array1 = new int[4][4];
                int [][] array2 = new int[4][4];
                int [][] array3 = new int[4][4];
                rellenaEnOrdenBi(array1);
                rellenaEnOrdenBi(array2);
                rellenaEnOrdenBi(array3);
                escribeArrayBi(suma2ArrayBi(array1,array2,array3));
            }break;
            case 10:{
                int [][] array = new int[5][6];
                int [][] vacio = new int[5][6];
                rellenaEnOrdenBi(array);
                copiaArrayBi(array,vacio);
                escribeArrayBi(vacio);
            }break;
            case 11:{
                int [][] array = new int[5][6];
                rellenaEnOrdenBi(array);
                int [][] copia = copiaArrayBi(array);
                escribeArrayBi(copia);
            }break;
            case 12:{
                int [][] array = new int[8][8];
                rellenaArrayAjedrez(array);
                escribeArrayBi(array);
            }break;
            case 13:{
                int [][] array = new int[5][5];
                rellenaDiagonal(array);
                escribeArrayBi(array);
            }break;
            case 14:{
                int [][] array = new int[5][5];
                rellenaX(array);
                escribeArrayBi(array);
            }break;
            case 15:{
                int [][] array = new int[6][4];
                rellenaCuadros(array);
                escribeArrayBi(array);
            }break;
            case 16:{
                int [][] array = new int[5][5];
                rellenaEnOrdenBi(array);
                escribeArrayBi(array);
                invierteBi(array);
                escribeArrayBi(array);
            }break;
            case 17:{
                int [][] array = new int[5][5];
                rellenaDiagonal(array);
                escribeArrayBi(array);
                System.out.println("Determinante: " + calculaDeterminanteBi(array));

            }break;
            case 18:{
                int[][] array = {{4, 5, 16,9}, {14, 11, 2,7}, {1,8,13, 12},{15,10,3,6}};
                escribeArrayBi(array);
                System.out.println(cuadradoMagico(array)?"Es magico":"Es un muggle");
            }break;
            case 19:{
                int[][] array = {
                        {6,7,2,1,9,5,3,4,8},
                        {5,3,4,6,7,8,9,1,2},
                        {1,9,8,3,4,2,5,6,7},
                        {8,5,9,7,6,1,4,2,3},
                        {4,2,6,8,5,3,7,9,1},
                        {7,1,3,9,2,4,8,5,6},
                        {9,6,1,5,3,7,2,8,4},
                        {2,8,7,4,1,9,6,3,5},
                        {3,4,5,2,8,6,1,7,9}
                };
                System.out.println(compruebaSudoku(array)?"Sudoku resuelto":"Eres un manta");
            }break;
        }
    }

    //1. Escribe la función escribeArray3x3 a la que le pasas un array bidimensional de tamaño 3x3
    // y te lo imprime por pantalla (que quede bonito).
    public static void escribeArray3x3(int [][] array){
        if(array.length!=3||array[0].length!=3){
            System.out.println("Introduce un array 3x3");
        }
        else {
            int masLargo = numeroMasLargo(array);
            for (int i = 0; i < 3; i++){
                System.out.print("|");
                for (int j = 0; j < 3; j++){
                    System.out.print(" ");
                    repiteStr(" ",masLargo-Integer.toString(array[i][j]).length());
                    System.out.print(array[i][j]);
                    System.out.print(" ");
                }
                System.out.print("|");
                System.out.println();
            }
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
    //2. Escribe la función rellena3x3 a la que le pasas un array bidimensional de 3x3 y te lo rellena
    // con los números del 1 al 9.
    public static void rellena3x3(int [][] array){
        if(array.length!=3||array[0].length!=3){
            System.out.println("Introduce un array 3x3");
        }
        else {
            int cont = 0;
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    cont ++;
                    array[i][j] = cont;

                }
            }
        }

    }
    //3. Escribe la función RellenaAleatorio3x3 a la que le pasas un array bidimensional de tamaño
    // 3x3 y te lo rellena con números aleatorios.
    public static void rellenaAleatorio3x3(int [][] array){
        if(array.length!=3||array[0].length!=3){
            System.out.println("Introduce un array 3x3");
        }
        else {
            Random r = new Random();
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    array[i][j] = r.nextInt(100);
                }
            }
        }
    }
    //4. Escribe la función sumaArray3x3 a la que le pasas un array de 3x3 y te suma todos los números.
    // Te devuelve un entero con el resultado.
    public static int sumaArray3x3(int [][] array){
        int suma = 0;
        if(array.length!=3||array[0].length!=3){
            suma = 0;
            System.out.println("Introduce un array 3x3");
        }
        else {
            suma = 0;
            for (int i = 0; i < 3; i++){
                for (int j = 0; j < 3; j++){
                    suma += array[i][j] ;
                }
            }
        }
        return suma;
    }
    //5. Escribe la función escribeArrayBi a la que le pasas un array bidimensional de cualquier tamaño
    // y te lo imprime por pantalla.
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
    //6. Escribe la función rellenaAleatorioBi a la que le pasas un array bidimensional de cualquier tamaño
    // y te lo rellena con números aleatorios.
    public static void rellenaAleatorioBi(int [][] array){
        Random r = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                    array[i][j] = r.nextInt(100);

            }
        }
    }
    //7. Escribe la función rellenaEnordenBi a la que le pasas un array bidimensional de cualquier tamaño y
    // te lo rellena con los números a partir del 1 en orden.
    public static void rellenaEnOrdenBi(int [][] array){
        int cont = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                cont++;
                array[i][j] = cont;
            }
        }
    }
    //8. Escribe la función sumaArrayBi a la que le pasas un array bidimensional y te suma todos los números.
    // Te devuelve un entero con el resultado.
    public static int sumaArrayBi(int [][] array){
        int suma = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                suma += array[i][j] ;
            }
        }
        return suma;
    }
    //9. Escribe la función suma2ArraysBi que hace lo mismo, pero con tres arrays bidimensionales de cualquier
    // tamaño (siempre y cuando todos tengan las mismas dimensiones).
    public static int[][] suma2ArrayBi(int [][] array1,int [][] array2,int [][] array3){
        int [][] array = new int[0][0];
        if(!((array1.length==array2.length&&array2.length==array3.length)
                &&(array1[0].length==array2[0].length&&array2[0].length==array3[0].length))){
            System.out.println("Error: Arrays con distintas dimensiones");
        }
        else {
            array = new int[array1.length][array1[0].length];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array1[i][j]+array2[i][j]+array3[i][j];
                }
            }
        }
        return array;
    }
    //10. Escribe la función copiaArrayBi a la que le pasas dos arrays, uno con datos y otro vacío, y te
    // copia el contenido del primero al segundo.
    public static void  copiaArrayBi(int[][] lleno,int [][] vacio){
        if(vacio.length!=lleno.length||vacio[0].length!=lleno[0].length){
            System.out.println("Error: ambos arrays deben tener el mismo tamaño");
        }
        else {
            for (int i = 0; i < lleno.length; i++) {
                for (int j = 0; j < lleno[i].length; j++) {
                    vacio[i][j] = lleno[i][j];
                }

            }
        }
    }
    //11. Escribe la función copiaArrayBiPro a la que le pasas un array y te devuelve otro del mismo
    // tamaño y con los mismos datos.
    public static int[][]  copiaArrayBi(int[][] lleno){
        int [][] copia = new int[lleno.length][lleno[0].length];
        for (int i = 0; i < lleno.length; i++) {
            for (int j = 0; j < lleno[i].length; j++) {
                copia[i][j] = lleno[i][j];
            }
        }
        return copia;
    }
    //12. Escribe la función rellenaArrayAjedrez que te rellena un array de 8x8 con la forma de un
    // tablero de ajedrez, usando el valor 1 para las casillas blancas y 0 para las negras.
    public static void rellenaArrayAjedrez(int[][]tablero){
        if(tablero.length!=8||tablero[0].length!=8){
            System.out.println("Error: tablero no valido (tablero: 8x8)");
        }
        else {
            for (int i = 0; i < tablero.length ; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    tablero[i][j]=((i+j)%2==0)?0:1;
                }
            }
        }
    }
    //13. Escribe la función rellenaDiagonal que te rellena un array cuadrado con el número ‘1’ en
    // la diagonal principal, el número ‘2’ en el triángulo que queda por encima y el ‘3’ en el
    // triángulo que queda por debajo.
    public static void rellenaDiagonal(int [][] array){
        if(array.length!=array[0].length){
            System.out.println("Error: matriz rectangular");
        }
        else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length ; j++) {
                    if(i==j){
                        array[i][j]= 1;
                    }
                    else if(i>j){
                        array[i][j]= 3;
                    }
                    else {
                        array[i][j] = 2;
                    }
                }
            }
        }
    }
    //14. Escribe la función rellenaX que te rellena un array cuadrado con el número ‘1’ en las
    // dos diagonales y el ‘2’ en el resto.
    public static void rellenaX(int [][] array){
        if(array.length!=array[0].length){
            System.out.println("Error: matriz rectangular");
        }
        else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length ; j++) {
                    if(i==j||i+j+1==array.length){
                        array[i][j]= 1;
                    }
                    else {
                        array[i][j] = 2;
                    }
                }
            }
        }
    }
    //15. Escribe la función rellenaCuadros que te rellena un array cuadrado de lado par
    // (o sea, 2x2, 4x4, 6x6, etc.) en cuatro cuadros. El cuadro superior izquierdo lo
    // rellena con ‘1’, el superior derecho, con ‘2’, el inferior izquierdo con ‘3’ y el
    // inferior derecho con ‘4’.
    public static void rellenaCuadros(int [][] array){
        if(array.length%2==1||array[0].length%2==1){
            System.out.println("Error: numero de filas y columnas deben ser pares");
        }
        else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length ; j++) {
                    if(i<array.length/2){
                        array[i][j]= (j<array.length/2)?1:2;
                    }
                    else {
                        array[i][j]= (j<array.length/2)?3:4;
                    }
                }
            }
        }
    }
    //16. Escribe la función invierteBi a la que le pasas un array bidimensional cuadrado (es decir,
    // igual de alto que de ancho) y te lo invierte.
    public static void invierteBi(int [][] array){
        int [][] aux = new int[array.length][array[0].length];
        if(array.length!=array[0].length){
            System.out.println("Error: matriz rectangular");
        }
        else {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length ; j++) {
                    aux[j][i]= array[i][j];

                }
            }
        }
        copiaArrayBi(aux,array);
    }
    //17. Escribe la función calculaDeterminante que te calcule el valor de un determinante de
    // 3x3 y te lo devuelva. Si no sabéis cómo se calcula un determinante de 3x3, lo buscáis en
    // el internete.
    public static int calculaDeterminante(int [][] array) {
        int suma = 0,multiplica = 1;
        if (array.length > 3 || array[0].length >3 || array.length!= array[0].length) {
            System.out.println("Error: matriz debe ser 3x3 o 2x2");
        } else {
            for (int i = 0,j = 0; j < array.length; j ++) {
                for (int k = 0; k < array.length; k++) {
                    multiplica *= array[(i+k)%3][(j+k)%3];
                }
                suma+=multiplica;
                multiplica=1;
            }
            for (int i = 0,j = 0; j < array.length; j ++) {
                for (int k = 0; k < array.length; k++) {
                    multiplica *= array[(i+k)%array.length][(j-k+array.length)% array.length];
                }
                suma-=multiplica;
                multiplica=1;
            }

        }
        return suma;
    }
    public static int calculaDeterminanteBi(int [][] array){
        int determinate = 0,m = 1;
        if (array.length!= array[0].length) {
            System.out.println("Error: matriz no es cuadrada");
        } else {
            if(array.length>3){
                for (int i = 0; i < array.length; i++) {
                    determinate += m*array[i][0]*calculaDeterminanteBi(matrizAdjunta(array,i,0));
                    m=m*-1;
                }
            }
            else {
                determinate=calculaDeterminante(array);
            }
        }
        return determinate;
    }
    public static int[][] matrizAdjunta(int [][]matriz, int fila, int columna){
        int [][] adjunta = new int[matriz.length-1][matriz[0].length-1];
        for (int i = 0, f = 0; i < matriz.length; i++) {
            if (i!= fila){
                for (int j = 0, c = 0; j < matriz[0].length ; j++) {
                    if(j!=columna){
                        adjunta[f][c]= matriz[i][j];
                        c++;
                    }
                }
                f++;
            }
        }
        return adjunta;
    }
    //18. Escribe la función cuadradoMagico a la que le pasas un array de 3x3 y te dice si
    // es un cuadrado mágico o no. Un cuadrado mágico es un array bidimensional cuadrado en
    // el cual la suma de cada una de las filas y de cada una de las columnas y de las dos
    // diagonales principales es igual.
    public static boolean cuadradoMagico(int [][] matriz){
        boolean esMagico = false;
        if(matriz.length!=matriz[0].length){
            System.out.println("Error: CUADRADO!!");
        }else {
            int sumaDiagonal = diagonal(matriz);
            esMagico = sumaDiagonal == diagonalInv(matriz);
            int cont = 0;
            while (esMagico && cont < matriz.length) {
                esMagico = sumaDiagonal == sumaFila(matriz, cont) && sumaDiagonal == sumaColumna(matriz, cont);
                cont++;
            }
        }
        return esMagico;

    }
    public static int sumaColumna(int [][]matriz,int c){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma+= matriz[i][c];
        }
        return suma;
    }
    public static int sumaFila(int [][]matriz,int f){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma+= matriz[f][i];
        }
        return suma;
    }
    public static int diagonal(int [][]matriz){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            int j = i;
            suma+= matriz[i][j];
        }
        return suma;
    }
    public static int diagonalInv(int [][]matriz){
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            int j = matriz.length-1-i;
            suma+= matriz[i][j];
        }
        return suma;
    }
    //19. Escribe la función compruebaSudoku a la que le pasas un array de 9x9 enteros y te dice
    // si el array contiene un sudoku correcto (devuelve un Boolean que será true si es correcto).
    // Un sudoku será correcto si en cada fila, en cada columna y en cada submatriz de 3x3
    // aparecen todos los números del 1 al 9 y una sola vez cada uno.
    //Se recomienda crear la función compruebaArray19 al que le pasas un array de 9 enteros y te
    // dice si en él se encuentran todos los números del 1 al 9 una sola vez.
    //Con esta función, sólo tendréis que pasar cada fila, columna y submatriz a un array de 9
    // enteros y pasárselo a esta función para comprobar si está bien.
    public static boolean compruebaSudoku(int [][] matriz){
        boolean sudoku = false;
        if (matriz.length!=9||matriz[0].length!=9){
            System.out.println("El sudoku debe ser una matriz de 9x9");
        }
        else {
            sudoku=true;
            int cont = 0;
            while (sudoku&&cont<9){
                sudoku=comprueba19(submatriz3x3(matriz,cont))&&comprueba19(fila(matriz,cont))
                        &&comprueba19(columna(matriz,cont));
                cont++;
            }
        }
        return sudoku;
    }
    public static List<Integer> submatriz3x3(int[][]matriz,int subm){
        List<Integer> submatriz= new LinkedList<>();
        for(int i = 0,cont= 0; i<3;i++){
            for (int j = 0; j<3; j++){
                submatriz.add(matriz[((subm%3*3)+i)][((subm/3*3)+j)]);
            }
        }
        return submatriz;
    }
    public static List<Integer> fila(int[][]matriz,int f){
        List<Integer> fila= new LinkedList<>();
        for (int i = 0; i < matriz[0].length; i++) {
            fila.add(matriz[f][i]);
        }
        return fila;
    }
    public static List<Integer> columna(int[][]matriz,int c){
        List<Integer> columna= new LinkedList<>();
        for (int i = 0; i < matriz[0].length; i++) {
            columna.add(matriz[i][c]);
        }
        return columna;
    }
    public static boolean comprueba19(List<Integer> lista){
        boolean comprobado = true;
        lista.sort(Integer::compareTo);
        for (int i = 0; i < lista.size()-1; i++) {
            comprobado= comprobado&&(lista.get(i+1)==lista.get(i)+1);
        }
        return comprobado;
    }

}
