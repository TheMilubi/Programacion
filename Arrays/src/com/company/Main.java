package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Menu");
        System.out.println("************");
        System.out.print("Escribe el numero del ejercicio [1-40]: ");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1: {
                int [] a = {1, 2, 3, 4, 5};
                escribeArray5(a);
            }
            break;
            case 2: {
                int [] a = {1, 2, 3, 4, 5, 6, 7, 8};
                escribeArray(a);
            }
            break;
            case 3: {
                int [] a = new int[5];
                leeArray5(a);
                escribeArray5(a);
            }
            break;
            case 4: {
                int [] a = new int[9];
                leeArray(a);
                escribeArray(a);
            }
            break;
            case 5: {
                int [] a = new int[5];
                ponCeros5(a);
                escribeArray(a);
            }
            break;
            case 6: {
                int [] a = new int[10];
                ponCero(a);
                escribeArray(a);
            }
            break;
            case 7: {
                int [] a = new int[5];
                leeArray5(a);
                escribeArray(a);
                System.out.println(sumaArray5(a));
            }
            break;
            case 8: {
                int [] a = new int[10];
                leeArray(a);
                escribeArray(a);
                System.out.println(sumaArray(a));
            }
            break;
            case 9: {
                int [] a = new int[5];
                leeArray(a);
                escribeArray(a);
                System.out.println(mediaArray5(a));
            }
            break;
            case 10: {
                int [] a = new int[10];
                leeArray(a);
                escribeArray(a);
                System.out.println(mediaArray(a));
            }
            break;
            case 11: {
                int [] a = new int[10];
                rellenaEnOrden(a);
                escribeArray(a);
            }
            break;
            case 12: {
                int [] a = new int[10];
                rellenaEnOrdenDesc(a);
                escribeArray(a);
            }
            break;
            case 13: {
                int [] a = new int[10];
                rellenaAleatorio(a);
                escribeArray(a);
            }
            break;
            case 14: {
                int [] a = new int[10];
                int [] b = new int[10];
                rellenaAleatorio(a);
                rellenaEnOrden(b);
                escribeArray(a);
                escribeArray(b);
                System.out.println("a esta "+(estaOrdenado(a)?"ordenado":"desordenado"));
                System.out.println("b esta "+(estaOrdenado(b)?"ordenado":"desordenado"));
            }
            break;
            case 15: {
                int [] a = new int[10];
                rellenaAleatorio(a);
                escribeArray(a);
                System.out.println("Numero de impares: "+numeroImpares(a));
            }
            break;
            case 16: {
                int [] a = new int[10];
                rellenaAleatorio(a);
                escribeArray(a);
                System.out.println("Numero minimo: "+minArray(a));
            }
            break;
            case 17: {
                int [] a = new int[10];
                rellenaAleatorio(a);
                escribeArray(a);
                System.out.println("Numero maximo: "+maxArray(a));
            }
            break;
            case 18: {
                int [] a = new int[10];
                rellenaAleatorio(a);
                escribeArray(a);
                System.out.println("Numero de aprobados: "+numeroAprobados(a));
            }
            break;
            case 19: {
                int [] a = new int[10];
                rellenaAleatorio(a);
                escribeArray(a);
                System.out.println("Numeros por encima del limite: "+porEncimaDe(a,7));
            }
            break;
            case 20: {
                int [] a = new int[10];
                leeArray(a);
                escribeArray(a);
                System.out.println("Numeros de ceros: "+cuantosCeros(a));
            }
            break;
            case 21: {
                int [] a = new int[10];
                int [] b = new int[10];
                rellenaAleatorio(a);
                escribeArray(a);
                copiaArray(a,b);
                escribeArray(a);
                escribeArray(b);
            }
            break;
            case 22: {
                int [] a = new int[10];
                int [] b = new int[10];
                rellenaAleatorio(a);
                escribeArray(a);
                copiaArrayInvertido(a,b);
                escribeArray(a);
                escribeArray(b);
            }
            break;
            case 23: {
                int [] a = new int[10];
                int [] b = new int[10];
                rellenaAleatorio(a);
                rellenaAleatorio(b);
                escribeArray(a);
                escribeArray(b);
                sumaArrays(a,b,a);
                escribeArray(a);
            }
            break;
            case 24: {
                int [] a = new int[10];
                int [] b = new int[10];
                int [] c = new int[10];
                rellenaAleatorio(a);
                rellenaAleatorio(b);
                escribeArray(a);
                escribeArray(b);
                restaArrays(a,b,c);
                escribeArray(c);
                multiplicaArrays(a,b,c);
                escribeArray(c);
                divideArrays(a,b,c);
                escribeArray(c);

            }
            break;
            case 25: {
                int [] a = new int[10];
                rellenaAleatorio(a);
                escribeArray(a);
                invierteArray(a);
                escribeArray(a);
            }
            case 26: {
                int [] a = new int[10];
                int [] b = new int[10];
                int [] c = new int[10];
                rellenaAleatorio(a);
                rellenaAleatorio(c);
                copiaArray(a,b);
                escribeArray(a);
                escribeArray(b);
                escribeArray(c);
                System.out.println("'a' es "+(comparaArrays(a,b)?"igual a 'b'":"distinta a 'b'"));
                System.out.println("'a' es "+(comparaArrays(a,c)?"igual a 'c'":"distinta a 'c'"));
            }
            break;
            case 27: {
                int [] a = new int[10];
                boolean [] b = new boolean[10];
                rellenaAleatorio(a);
                escribeArray(a);
                ponNotasArray(a,b);
                for(int i = 0; i < b.length; i++){
                    System.out.println("El alumno num "+(i+1)+((b[i])?" esta aprobado":" esta suspenso"));
                }
            }
            break;
            case 28: {
                int [] a = new int[5];
                int [] b = new int[5];
                int [] c = new int[10];
                rellenaAleatorio(a);
                rellenaAleatorio(b);
                escribeArray(a);
                escribeArray(b);
                concatenaArrays55(a,b,c);
                escribeArray(c);
            }
            break;
            case 29: {
                int [] a = new int[10];
                int [] b = new int[10];
                int [] c = new int[20];
                rellenaAleatorio(a);
                rellenaAleatorio(b);
                escribeArray(a);
                escribeArray(b);
                concatenaArrays(a,b,c);
                escribeArray(c);
            }
            break;
            case 30: {
                int [] a = new int[10];
                int busca = 5;
                rellenaAleatorio(a);
                escribeArray(a);
                System.out.println(contiene(a,busca)?"Numero hayado":"Numero no encontrado");
            }
            break;
            case 31: {
                int [] a = new int[10];
                int [] b = new int[5];
                rellenaAleatorio(a);
                rellenaAleatorio(b);
                escribeArray(a);
                escribeArray(b);
                int [] c = concatenaArraysPro(a,b);
                escribeArray(c);
            }
            break;
            case 32: {
                int [] a = new int[10];
                rellenaAleatorio(a);
                escribeArray(a);
                int [] b = copiarArrayPro(a);
                escribeArray(b);
            }
            break;
            case 33: {
                int [] a = new int[10];
                rellenaEnOrden(a);
                escribeArray(a);
                int [] b = insertaEnArray(a,26,2);
                escribeArray(b);
            }
            break;
            case 34: {
                int [] a = new int[10];
                rellenaEnOrden(a);
                escribeArray(a);
                int [] b = borraDeArray(a,1);
                escribeArray(b);
            }
            break;
            case 35: {
                int [] a = new int[10];
                rellenaEnOrden(a);
                escribeArray(a);
                int [] b = elimina1ElementoArray(a,10);
                escribeArray(b);
            }
            break;
            case 36: {
                int [] a = new int[10];
                rellenaAleatorio(a);
                escribeArray(a);
                int [] b = eliminaElementoArray(a,5);
                escribeArray(b);
            }
            break;
            case 37: {
                int [] a = new int[10];
                rellenaEnOrden(a);
                escribeArray(a);
                int [] b = new int[10];
                rellenaEnOrden(b);
                escribeArray(b);
                int [] c = insertaArrayEnArray(a,b,4);
                escribeArray(c);
            }
            break;
            case 38: {
                int [] a = new int[10];
                rellenaEnOrden(a);
                escribeArray(a);
                int [] c = subArray(a,1,4);
                escribeArray(c);
            }
            break;
            case 39: {
                int [] a = new int[10];
                rellenaEnOrden(a);
                escribeArray(a);
                int [] c = recortaArray(a,1,4);
                escribeArray(c);
            }
            break;
            case 40: {
                int [] a = new int[10];
                rellenaAleatorio(a);
                escribeArray(a);
                ordenaBurbuja(a);
                escribeArray(a);
            }
            break;
            case 41: {
                int [] a = new int[9];
                rellenaAleatorio(a);
                escribeArray(a);
                intercambiaParImpar(a);
                escribeArray(a);
            }
            break;
        }
    }
    //  1. Escribe una función “escribeArray5” a la que le pasamos un array de tipo entero de
    //  cinco elementos y lo escribe por pantalla de la siguiente forma: [23, 43, 1, -3, 6]
    public static void escribeArray5(int[] a){
        if(a.length!=5){
            System.out.println("El numero de elementos distinto a 5");
        }
        else{
            System.out.print("[");
            for(int i = 0; i < 5; i++){
                System.out.print(a[i]);
                System.out.print((i<4)?", ":"]");
            }
        }
        System.out.println();
    }
    //  2. Escribe una función “escribeArray” a la que le pasamos un array de enteros del tamaño
    //  que sea y lo escribe por pantalla de la misma forma. Tendremos que usar la función
    //  “length” para saber el tamaño del array desde dentro de la función.
    public static void escribeArray(int[] a){
        System.out.print("[");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
            System.out.print((i<a.length-1)?", ":"]");
        }
        System.out.println();
    }
    //  3. Escribe una función “leeArray5” que lea un array de enteros de 5 elementos. Habrá
    //  que pasarle el array ya definido y él lo rellenará pidiéndole los valores al usuario por
    //  consola.
    public static void leeArray5(int[] a){
        if(a.length!=5){
            System.out.println("El numero de elementos es distinto a 5");
        }
        else{
            System.out.print("Escribe los 5 enteros: ");
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i < 5; i++){
                a[i] = sc.nextInt();
            }
        }
    }
    //  4. Escribe una función “leeArray” que lea un array de enteros de cualquier tamaño. El
    //  array lo crearemos fuera de la función y dentro de la función usaremos la función
    //  “length” para saber cuál es el tamaño y cuántos datos debemos leer.
    public static void leeArray(int[] a){
            Scanner sc = new Scanner(System.in);
            for(int i = 0; i < a.length; i++){
                System.out.print("Escribe la posicion "+(i+1)+": ");
                a[i] = sc.nextInt();
            }
    }
    //  5. Escribe una función “ponCeros5” que modifique el contenido de un array de enteros
    //  de cinco elementos y ponga en todas las posiciones un 0.
    public static void ponCeros5(int[] a){
        if(a.length!=5){
            System.out.println("El numero de elementos es distinto a 5");
        }
        else {
            for (int i = 0; i < 5; i++){
                a[i]=0;
            }
        }
    }
    //  6. Escribe una función “ponCero” que haga lo mismo para un array de enteros de
    //  cualquier tamaño.
    public static void ponCero(int[] a){
        for (int i = 0; i < a.length; i++){
                a[i]=0;
        }
    }
    //7. Escribe una función “sumaArray5” que sume todas las posiciones de un array de
    //enteros de cinco elementos y nos devuelva el resultado.
    public static int sumaArray5(int[] a){
        int suma = 0;
        if(a.length!=5){
            System.out.println("El numero de elementos es distinto a 5");
            suma = -1;
        }
        else {
            for (int i = 0; i < 5; i++){
                suma = suma + a[i];
            }
        }
        return suma;
    }
    //8. Escriba una función “sumaArray” que haga lo mismo para un array de enteros de
    //cualquier tamaño.
    public static int sumaArray(int[] a){
        int suma = 0;

        for (int i = 0; i < a.length; i++){
            suma = suma + a[i];
        }

        return suma;
    }
    //9. Escribe una función “mediaArray5” que nos calcule el valor medio de los elementos de
    //un array de enteros de tamaño 5.
    public static double mediaArray5(int[] a){
        double media;
        if(a.length<5||a.length>5){
            System.out.println("El numero de elementos es distinto a 5");
            media = -1;
        }
        else {
        media = sumaArray5(a)/5.0;
        }
        return media;

    }
    //10. Escribe una función “mediaArray” que haga lo mismo para un array de enteros de
    //cualquier tamaño.
    public static double mediaArray(int[] a){
        double media = sumaArray(a)/((double)a.length);
        return media;
    }
    //11. Escribe una función “rellenaEnOrden” que nos rellena un array de enteros con los
    //números desde el 1 en adelante (1, 2, 3, 4... hasta el tamaño del array).
    public static void rellenaEnOrden(int[] a){
        for(int i = 0; i < a.length;i++){
            a[i] = i + 1;
        }
    }
    //12. Escribe una función “rellenaEnOrdenDesc” que nos rellena un array con los valores
    //siguientes: tamaño del array, tamaño del array-1, etc., 3, 2, 1.
    public static void rellenaEnOrdenDesc(int[] a){
        for(int i = 0; i < a.length;i++){
            a[i] = a.length - i ;
        }
    }
    //13. Escribe una función “rellenaAleatorio” a la que le pasamos un array de enteros y nos lo
    //rellena de valores aleatorios entre 1 y 10.
    public static void rellenaAleatorio(int[] a){
        Random r = new Random();
        for(int i = 0; i < a.length;i++){
            a[i] = r.nextInt(10)+1;
        }
    }
    //14. Escribe una función “estaOrdenado” a la que le pasas un array de enteros y te
    //devuelve un booleano que será verdadero si los elementos del array se encuentran en
    //orden ascendente.
    public static boolean estaOrdenado(int[] a){
        int i = 1;
        boolean ordenado = a[i-1]<a[i];
        while (i < a.length&&ordenado){
            ordenado = a[i-1]<a[i];
            i++;
        }
        return ordenado;
    }
    //15. Escribe una función “numeroImpares” a la que le pasas un array de enteros y te
    //devuelve un entero que corresponde a la cantidad de números impares que tenemos
    //en el array.
    public static int numeroImpares(int [] a){
        int impares = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]%2==1) impares++;
        }
        return impares;
    }
    //16. Escribe una función “minArray” a la que le pasas un array y te devuelve el valor más
    //pequeño de los contenidos en dicho array.
    public static int minArray(int [] a){
        int minimo = a[0];
        for (int i = 1; i < a.length;i++){
            if (minimo>a[i]) minimo = a[i];
        }
        return minimo;
    }
    //17. Escribe una función “maxArray” que te devuelve el más grande.
    public static int maxArray(int [] a){
        int maximo = a[0];
        for (int i = 1; i < a.length;i++){
            if (maximo<a[i]) maximo = a[i];
        }
        return maximo;
    }
    //18. Escribe una función “numeroAprobados” a la que se le pasa un array de enteros y,
    //suponiendo que son notas, nos devuelve el número de aprobados (valores entre 5 y 10).
    public static int numeroAprobados(int[] a){
        int numAprobados = 0;
        for(int i = 0; i < a.length; i++){
            if (a[i]>=5) numAprobados++;
        }
        return numAprobados;
    }
    //19. Escribe una función “porEncimaDe” a la que le pasamos un valor “limite” y nos
    //devuelve cuántos elementos del array son iguales o mayores que ese límite. Por
    //ejemplo, le pasamos el valor 10 y nos dice cuántos elementos son 10 o más.
    public static int porEncimaDe(int [] a, int limite){
        int numEncimaLimite = 0;
        for(int i = 0; i < a.length; i++){
            if (a[i]>=limite) numEncimaLimite++;
        }
        return numEncimaLimite;
    }
    //20. Escribe una función “cuantosCeros” a la que le pasamos un array y nos devuelve un
    //entero que nos dice cuántos elementos tienen el valor 0.
    public static int cuantosCeros(int [] a){
        int numCeros = 0;
        for(int i = 0; i < a.length; i++){
            if (a[i]==0) numCeros++;
        }
        return numCeros;
    }
    //21. Escribe una función “copiaArray” a la que le pasas dos arrays por parámetro (array1 y
    //array2, por ejemplo) del mismo tamaño (se debería comprobar dentro de la función).
    //La función copiara el contenido del primer array al segundo array.
    public static void copiaArray(int [] origen, int[] destino){
        if(origen.length!=destino.length){
            System.out.println("Arrays con longitudes distintas, compia no valida");
        }
        else {
            for(int i = 0; i < origen.length; i++){
                destino[i] = origen[i];
            }
        }
    }
    //22. Escribe una función “copiaArrayInvertido” a la que le pasas dos arrays por parámetro y
    //te copia el contenido del primer array al segundo array pero en orden inverso (Ej.: si el
    //primero es [5,6,7,8,9], en el segundo se copiará [9,8,7,6,5]).
    public static void copiaArrayInvertido(int [] origen, int[] destino){
        if(origen.length!=destino.length){
            System.out.println("Arrays con longitudes distintas, compia no valida");
        }
        else {
            for(int i = 0; i < origen.length; i++){
                destino[i] = origen[origen.length-(i+1)];
            }
        }
    }
    //23. Escribe una función “sumaArrays” a la que le pasamos tres arrays. Los dos primeros
    //contendrán los datos que hay que sumar y en el tercero guardaremos el resultado (Ej.:
    //[1,2,3] + [8, 6, 8] = [9, 8, 11]).
    public static void sumaArrays(int [] a, int [] b, int [] resultado){
        if(a.length!=b.length||a.length!=resultado.length){
            System.out.println("Arrays con longitudes distintas, suma no valida");
        }
        else {
            for(int i = 0; i < resultado.length; i++){
                resultado[i] = a[i] + b[i];
            }
        }
    }
    //24. Escribe también las funciones “restaArrays”, “multiplicaArrays” y “divideArrays”.
    public static void restaArrays(int [] a, int [] b, int [] resultado){
        if(a.length!=b.length||a.length!=resultado.length){
            System.out.println("Arrays con longitudes distintas, suma no valida");
        }
        else {
            for(int i = 0; i < resultado.length; i++){
                resultado[i] = a[i] - b[i];
            }
        }
    }
    public static void multiplicaArrays(int [] a, int [] b, int [] resultado){
        if(a.length!=b.length||a.length!=resultado.length){
            System.out.println("Arrays con longitudes distintas, suma no valida");
        }
        else {
            for(int i = 0; i < resultado.length; i++){
                resultado[i] = a[i] * b[i];
            }
        }
    }
    public static void divideArrays(int [] a, int [] b, int [] resultado){
        if(a.length!=b.length||a.length!=resultado.length){
            System.out.println("Arrays con longitudes distintas, suma no valida");
        }
        else {
            for(int i = 0; i < resultado.length; i++){
                resultado[i] = a[i] / b[i];
            }
        }
    }
    //25. Escribe una función “invierteArray” a la que le pasamos un array de enteros y modifica
    //su contenido invirtiendo la posición de sus elementos (Ej.: [1,2,3] -> [3,2,1]).
    public static void invierteArray(int [] a){
        int [] copia = new int[a.length];
        copiaArray(a,copia);
        copiaArrayInvertido(copia,a);
    }
    //26. Escribe una función “comparaArrays” a la que le pasamos dos arrays y nos devuelve un
    //boolean que será verdadero si los dos arrays tienen el mismo tamaño y contienen los
    //mismos datos.
    public static boolean comparaArrays(int [] a, int[] b){
        boolean igual = false;
        if(a.length!=b.length){
            System.out.println("Arrays no del mismo tamaño");
        }
        else {
            int i = 1;
            igual = a[i]==b[i];
            while (i < a.length&&igual){
                igual = a[i]==b[i];
                i++;
            }
        }
        return igual;
    }
    //27. Escribe una función “ponNotasArray” a la que le pasamos dos arrays del mismo
    //tamaño. El primero será un array de reales (double) y contendrá las notas de los
    //alumnos. El segundo será un array de booleanos en el que deberemos escribir en cada
    //posición “true” si la nota es mayor o igual que 5 (aprobado) y “false” en caso contrario.
    public static void ponNotasArray(int [] nota, boolean [] aprobado){
        if(nota.length!=aprobado.length){
            System.out.println("Arrays no del mismo tamaño");
        }
        else {
            for (int i = 0; i < nota.length; i++){
                aprobado[i] = (nota[i]>=5);
            }
        }
    }
    //28. Escribe una función “concatenaArrays55” a la que le pasamos tres arrays de enteros.
    //Los dos primeros tendrán un tamaño de 5 y contendrán los datos que hay que copiar.
    //El tercero tendrá un tamaño de 10 y en él copiaremos los datos del primer array y
    //después los datos del segundo (Ej.: [4,5,6,7,8] & [1,1,2,2,3] = [4,5,6,7,8,1,1,2,2,3]).
    public static void concatenaArrays55(int [] a, int [] b, int[] concatenado){
        if(a.length!=5||b.length!=5||concatenado.length!=10){
            System.out.println("Tamaños no validos");
        }
        else {
            for (int i = 0; i < 5; i++){
                concatenado[i] = a[i];
            }
            for (int i = 0; i < 5; i++){
                concatenado[i + 5] = b[i];
            }

        }
    }
    //29. Escribe una función “concatenaArrays” a la que pasamos tres arrays con la condición
    //de que el tamaño del tercero sea igual a la suma del tamaño de los dos primeros. Hará
    //lo mismo que la función anterior.
    public static void concatenaArrays(int [] a, int [] b, int[] concatenado){
        if(concatenado.length!=(a.length+b.length)){
            System.out.println("Tamaños no validos");

        }
        else {
            for (int i = 0; i < a.length; i++){
                concatenado[i] = a[i];
            }
            for (int i = 0; i < b.length; i++){
                concatenado[i + a.length] = b[i];
            }

        }
    }
    //30. Escribe una función “contiene” a la que le pasamos un array y un valor entero. La
    //función nos devolverá “true” si el array contiene el número y “false” si no lo contiene.
    public static boolean contiene(int [] a, int numBuscado){
        boolean contenido = false;
        int i = 0;
        while(i < a.length&&!contenido){
            contenido = numBuscado == a[i];
            i++;
        }
        return contenido;
    }
    //31. Escribe una función “concatenaArraysPro” a la que le pasas dos arrays de enteros y te
    //devuelve un array cuyo tamaño es la suma del tamaño de ambos y que contiene todos
    //los elementos del primero y a continuación los del segundo. Esta función devolverá un
    //array de enteros (int[]) el cuál se creará dentro de la propia función.
    //Ej. de uso: int[] a = {1,2,3};
    //int[] b = {4,5,6,7,2};
    //int[] c;
    //c = concatenaArraysPro(a, b);
    public static int[] concatenaArraysPro(int[] a,int[] b){
        int [] concatenado = new int[a.length+b.length];
        concatenaArrays(a,b,concatenado);
        return concatenado;
    }
    //32. Escribe una función “copiaArrayPro” a la que le pasas un array y te devuelve un array
    //del mismo tamaño y con los mismos datos.
    //Ej. de uso: int[] a = {1,2,3};
    //int[] b;
    //b = copiaArrayPro(a);
    public static int[] copiarArrayPro(int [] a){
        int[] copia = new int[a.length];
        copiaArray(a,copia);
        return copia;
    }
    //33. Escribe una función “insertaEnArray” a la que le pasas tres parámetros: un array de
    //enteros, un valor entero y una posición. La función insertará el valor en la posición
    //indicada, desplazando el resto de valores para hacerle hueco. La función nos devolverá
    //un array con el resultado. Ej.: Si tenemos el array [1,2,3,4,5] y queremos insertar el
    //valor “26” en la posición “2”, el resultado será: [1,2,26,3,4,5].
    public static int[] insertaEnArray(int [] a, int valor, int posicion){
        int[] nuevoArray = new int[a.length + 1];
        if(posicion<0||posicion>a.length){
            System.out.println("Posicion fuera de limites");
        }
        else {
            for (int i = 0, j = 0; i < a.length; i++, j++) {
                if (i == posicion) j++;
                nuevoArray[j] = a[i];
            }
            nuevoArray[posicion] = valor;

        }
        return nuevoArray;
    }
    //34. Escribe una función “borraDeArray” a la que le pasas dos parámetros: un array de
    //enteros y una posición. La función eliminará el elemento colocado en la posición
    //indicada. La función nos devolverá un array con el resultado. Ej.: Si tenemos el array
    //[5,7,2,8,1] y queremos eliminar la posición 1, el resultado será: [5,2,8,1].
    public static int[] borraDeArray(int [] a, int posicion){
        int[] nuevoArray = new int[a.length - 1];
        if(posicion<0||posicion>a.length){
            System.out.println("Posicion fuera de limites");
        }
        else {
            for (int i = 0, j = 0; i < nuevoArray.length; i++, j++) {
                if (j == posicion) j++;
                nuevoArray[i] = a[j];
            }
        }
        return nuevoArray;
    }
    //35. Escribe una función “elimina1ElementoArray” a la que le pasas dos parámetros: un
    //array de enteros y un valor entero. La función eliminará del array el valor entero
    //independientemente de la posición en la que se encuentre. Si el valor se repite, se
    //eliminará sólo la primera vez que aparece el valor. La función nos devolverá un array
    //con el resultado.
    public static int[] elimina1ElementoArray(int [] a, int valor){
        int [] nuevoArray = new int[a.length-1];
        for(int i = 0, j = 0,c = 0; i < nuevoArray.length;i++,j++){
            if(a[j]==valor&&c==0){
                j++;
                c++;
            }
            nuevoArray[i] = a[j];
        }
        return nuevoArray;
    }
    //36. Escribe una función “eliminaElementosArray” a la que le pasas dos parámetros: un
    //array de enteros y un valor entero. La función eliminará del array el valor entero
    //independientemente de la posición en la que se encuentre. Si el valor se repite, se
    //eliminarán todas las veces que se repite. La función nos devolverá un array con el
    //resultado.
    public static int[] eliminaElementoArray(int [] a, int valor){
        int numValor = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]==valor)numValor++;
        }
        int [] nuevoArray = new int[a.length-numValor];
        for(int i = 0, j = 0; i < nuevoArray.length;i++,j++){
            if(a[j]==valor){
                j++;
            }
            nuevoArray[i] = a[j];
        }
        return nuevoArray;
    }
    //37. Escribe una función “insertaArrayEnArray” a la que le pasas tres parámetros: un array
    //de enteros, una posición de ese array, y otro array de enteros. La función insertará en
    //el primer array, a partir de la posición indicada, todo el contenido del segundo array.
    //La función nos devolverá un array con el resultado. Ej.: [6, 2, 1, 3], posición: 2, insertar:
    //[12, 13], resultado = [6, 2, 12, 13, 1, 3].
    public static int[] insertaArrayEnArray(int [] a, int[] b, int posicion){
        int [] nuevoArray = new int[a.length+b.length];
        for(int i = 0, j = 0; i < a.length;i++,j++){
            if(i==posicion){
                for(int k = 0; k <b.length;k++,j++){
                    nuevoArray[j] = b[k];
                }
            }
            nuevoArray[j] = a[i];
        }
        return nuevoArray;
    }
    //38. Escribe una función “subArray” a la que le pasas un array y dos posiciones. La función
    //te devuelve otro array que contiene los datos comprendidos entre ambas posiciones
    //(incluidas ambas dos). Ej.: [3, 6, 2, 8, 9], posiciones, 1 y 3, resultado = [6, 2, 8].
    public static int[] subArray(int [] a, int ini, int fin){
        int [] nuevoArray = new int[fin-ini+1];
        for(int i = ini; i <= fin;i++){
            nuevoArray[i-ini] = a[i];
        }
        return nuevoArray;
    }
    //39. Escribe una función “recortaArray” a la que le pasas un array y dos posiciones. La
    //función te devuelve otro array que contiene los todos los datos menos los
    //comprendidos entre ambas posiciones (incluidas ambas dos). Ej.: [3, 6, 2, 8, 9],
    //posiciones, 1 y 3, resultado = [3, 9].
    public static int[] recortaArray(int [] a, int ini, int fin){
        int[] nuevoArray = new int[a.length - (fin - ini + 1)];
        if(ini < 0||fin > a.length-1){
            System.out.println("Fuera de limites");
        }else {

            for (int i = 0, j = 0; i < nuevoArray.length; i++, j++) {
                if (j == ini) j = fin + 1;
                nuevoArray[i] = a[j];
            }
        }
        return nuevoArray;
    }
    //40. Escribe la función “ordenaBurbuja” a la que le pasaremos un array de enteros y lo
    //ordenará mediante la ordenación de la burbuja. La ordenación de la burbuja funciona
    //de la siguiente forma:
        //• Si el array tiene N elementos, se realizarán N-1 pasadas (por ejemplo, para un
        //array de 5 elementos tendremos que realizar 4 pasadas para que quede
        //ordenado).
        //• En cada pasada, iremos recorriendo el array de principio a fin comprobando los
        //números por parejas (por ejemplo: el primer y segundo número, el segundo y el
        //tercero, etc.).
        //• Si la pareja de números está en orden (o sea, el primero es menor que el segundo)
        //la dejamos como está y si está desordenada, los intercambiamos.
        //Ejemplo:
        //Si el array original es [3, 9, 4, 6, 8, 1], la pasada sería así:
        //[3, 9, 4, 6, 8, 1] -> [3, 4, 9, 6, 8, 1] -> [3, 4, 6, 9, 8, 1] -> [3, 4, 6, 8, 9, 1] -> [3, 4, 6, 8, 1, 9]
        //Podéis comprobar que el array no se ordena con una sola pasada, pero poco a poco va
        //quedando más ordenado.
    public static void ordenaBurbuja(int [] a){
        for(int i = 1; i < a.length;i++){
            for (int j = 0; j < a.length-1; j++) {
                if (a[j] > a[j + 1]) {
                    int aux = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = aux;

                }
            }
        }
    }
    //41. Escribe la función intercambiaParImpar. A esta función le pasaremos un array de
    //enteros por parámetro y en ese mismo array intercambiará los elementos de las
    //posiciones pares por los elementos de las posiciones impares: el elemento de la posición
    //0 se intercambiará con el de la posición 1, el de la posición 2 con el de la posición 3, etc.
    //El array tendrá que tener un número par de elementos (2, 4, 6, etc.). De no ser así, la
    //función mostrará un mensaje de error y dejará el array como estaba.
    //Ej.: Si le pasamos [1, 2, 3, 4, 5, 6], el array quedará: [2, 1, 4, 3, 6, 5]
    //Si le pasamos [1, 2, 1, 2, 1, 2], el array quedará: [2, 1, 2, 1, 2, 1]
    //Si le pasamos [7, 1, 4, 6, 9, 5], el array quedará: [1, 7, 6, 4, 5, 9]
    public static void intercambiaParImpar(int [] a){
        for(int i = 0; i < a.length-1; i+=2){
            int aux = a[i];
            a[i] = a[i+1];
            a[i+1] = aux;
        }
    }
    //2. Escribe la función compruebaTarjeta. A esta función le pasaremos un array de enteros
    //con los 16 números de una tarjeta de crédito. La función nos devolverá un boolean que
    //será true si el número de tarjeta es correcto y false si no lo es. Para averiguar si un
    //número de tarjeta de crédito es correcto utilizaremos el siguiente algoritmo:
        //1. Multiplicar por dos los valores que estén en las posiciones pares del array (0, 2, …).
        //2. Si algún valor es mayor que 10, restarle 9 a ese valor.
        //3. Sumar todos los valores. Si el resultado es múltiplo de 10, la tarjeta es buena.
        //Ejemplos de tarjetas válidas: 5565 8666 4522 7307, 4929 9968 6150 1756
        //Nota: No os carguéis el array inicial. Si el array no tiene 16 elementos, devolver false
        //directamente.
    public static boolean compruebaTarjeta(){
        boolean valida;
        return valida;
    }
}
