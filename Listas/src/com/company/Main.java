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
                List<Integer> l = new LinkedList<>();
                System.out.println("Introduce valores naturales en la lista: ");
                leeLista(l);
                System.out.println(l);
            }break;
            case 2:{
                List<Integer> l = new LinkedList<>();
                System.out.println("Introduce valores naturales en la lista: ");
                leeListaN(l,5);
                System.out.println(l);
            }break;
            case 3:{
                List<Integer> l = new LinkedList<>();
                l.add(5);
                l.add(5);
                l.add(5);
                l.add(5);
                l.add(5);
                escribeLista(l);
            }break;
            case 4:{
                List<Integer> l = new LinkedList<>();
                l.add(-5);
                l.add(5);
                l.add(-5);
                l.add(5);
                l.add(-5);
                escribeLista(l);
                eliminaNegativos(l);
                escribeLista(l);
            }break;
            case 5:{
                List<Integer> l = new LinkedList<>();
                List<Integer> n = new LinkedList<>();
                List<Integer> p = new LinkedList<>();
                l.add(-1);
                l.add(2);
                l.add(-5);
                l.add(1);
                l.add(2);
                l.add(-5);
                l.add(-2);
                l.add(2);
                l.add(2);
                l.add(-5);
                l.add(-5);
                escribeLista(l);
                clasificaNumeros(l,p,n);
                escribeLista(p);
                escribeLista(n);
            }break;
            case 6:{
                List<Integer> l = new LinkedList<>();
                l.add(-1);
                l.add(2);
                l.add(-5);
                l.add(1);
                l.add(2);
                l.add(-5);
                l.add(-2);
                l.add(2);
                l.add(2);
                l.add(-5);
                l.add(-5);
                escribeLista(l);
                eliminaRepetidos(l);
                escribeLista(l);
            }break;
            case 7:{
                List<Integer> l = new LinkedList<>();
                l.add(-1);
                l.add(2);
                l.add(-77);
                l.add(11);
                l.add(8);
                l.add(-3);
                l.add(-9);
                l.add(2);
                l.add(4);
                l.add(-4);
                l.add(-5);
                escribeLista(l);
                ordenaListaSeleccion(l);
                escribeLista(l);
            }break;
            case 8:{
                List<Integer> l = new LinkedList<>();
                l.add(-1);
                l.add(2);
                l.add(-77);
                l.add(11);
                l.add(8);
                l.add(-3);
                l.add(-9);
                l.add(2);
                l.add(4);
                l.add(-4);
                l.add(-5);
                escribeLista(l);
                ordenaListaInsercion(l);
                escribeLista(l);
            }break;
            case 9:{
                List<String> nombres = new LinkedList<>();
                // Agregamos los nombres.
                nombres.add("Aries");
                nombres.add("Tauro");
                nombres.add("Geminis");
                nombres.add("Cancer");
                nombres.add("Leo");
                nombres.add("Virgo");
                nombres.add("Libra");
                nombres.add("Escorpio");
                nombres.add("Sagitario");
                nombres.add("Capricornio");
                nombres.add("Acuario");
                nombres.add("Piscis");

                System.out.println(nombres);
                ordenaListaPalabras(nombres);
                System.out.println(nombres);
            }break;
            case 10:{
                List<String> nombres = new LinkedList<>();
                // Agregamos los nombres.
                nombres.add("Aries");
                nombres.add("Tauro");
                nombres.add("Geminis");
                nombres.add("Cancer");
                nombres.add("Leo");
                nombres.add("Virgo");
                nombres.add("Libra");
                nombres.add("Escorpio");
                nombres.add("Sagitario");
                nombres.add("Capricornio");
                nombres.add("Acuario");
                nombres.add("Piscis");

                System.out.println(nombres);
                ordenaListaPalabras2(nombres);
                System.out.println(nombres);
            }break;
            case 11:{
                Integer[] a = {1,2,3,4,5};
                Integer[] b = {1,2,3,4,5};
                Integer[] c = insertaArrayEnArrayPro(a,b,2);
                System.out.println(Arrays.toString(c));
            }break;
            case 13:{
                Integer[] a = {1,2,3,2,1,1,4,3,4,5};
                Integer[] r = eliminaRepetidos(a);
                System.out.println(Arrays.toString(r));
            }break;
        }

    }
    //1. Escribe la función leeLista que va leyendo enteros desde el teclado y los va metiendo en una lista.
    // La función ira leyendo valores hasta que escribamos un -1. La lista la pasamos por parámetro.
    //Ejemplo de uso:
    //List<Integer> l = new ArrayList<>();
    //leeLista(l);
    public static void leeLista(List<Integer> li){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>=0){
            li.add(n);
            n = sc.nextInt();
        }
    }
    //2. Escribe la función leeListaN que lee desde el teclado el número de enteros que le digamos.
    // Para ello, le pasaremos dos parámetros: la lista y un entero.
    //Ejemplo de uso:
    //List<Integer> l = new ArrayList<>();
    //leeListaN(l, 10);
    public static void leeListaN(List<Integer> li, int n){
        Scanner sc = new Scanner(System.in);
        int num;
        for(int i = 0; i < n; i++){
            num = sc.nextInt();
            li.add(num);
        }
    }
    //3. Escribe la función escribeLista a la que le pasas una lista y te escribe su contenido por pantalla.
    // Para diferenciarla de los arrays, usaremos angulos para delimitarla.
    //Ej.: <5, 6, 8, 19>
    public static void escribeLista(List<Integer> li){
        System.out.print('<');
        int i = 0;
        for(int num:li){
            System.out.print(num);
            i++;
            if(i<li.size()){
                System.out.print(", ");
            }
        }
        System.out.print('>');
    }
    //4. Escribe la función eliminaNegativos que elimine todos los números negativos de una lista de enteros.
    public static void eliminaNegativos(List<Integer> li){
        for (int i = 0; i < li.size();i++){
            if(li.get(i)<0){
                li.remove(i);
                i--;
            }
        }
    }
    //5. Escribe la función clasificaNumeros a la que le pasamos tres listas. La primera contiene un montón
    // de números positivos y negativos. Habrá que copiar los positivos en la primera lista y los negativos
    // en la segunda lista, y después ordenar las dos listas.
    public static void clasificaNumeros(List<Integer> li,List<Integer> positivos,List<Integer> negativos){
        for (int i = 0; i < li.size();i++){
            if(li.get(i)<0){
                negativos.add(li.get(i));
            }
            else {
                positivos.add(li.get(i));
            }
        }
        negativos.sort(Integer::compareTo);
        positivos.sort(Integer::compareTo);
    }
    //6. Escribe la función eliminaRepetidos a la que le pasas una lista y te elimina los elementos repetidos,
    // dejando sólo uno de cada (ej.: <1,2,3,1> = <1,2,3>). La forma más fácil es ir copiando de una lista a
    // otra sólo los elementos que no estén ya introducidos (p.ej., usando contains).
    public static void eliminaRepetidos(List<Integer> list){
        List<Integer> vistos = new LinkedList<>();
        for(int i = 0; i < list.size(); i++){
            if(vistos.contains(list.get(i))){
                list.remove(i);
                i--;
            }
            else {
                vistos.add(list.get(i));
            }
        }
    }
    //7. Escribe la función ordenaListaSeleccion a la que le pasas una lista de enteros desordenada y te la ordena
    // mediante el algoritmo de selección.
    //La ordenación por selección funciona de la siguiente forma:
    //- Buscamos el elemento más pequeño de nuestra lista.
    //- Lo metemos en otra lista resultado.
    //- Lo eliminamos de nuestra lista.
    //- Repetimos hasta que nuestra lista se quede vacía y todos los elementos hayan pasado a la lista resultado en
    // orden.
    public static void ordenaListaSeleccion(List<Integer> list){
        List<Integer> ordenado = new LinkedList<>();
        int size = list.size();
        for(int j = 0; j < size; j ++){
            int menor = list.get(0);
            int indice = 0;
            for(int i = 0; i < list.size();i++){
                if(list.get(i)<menor){
                    menor = list.get(i);
                    indice = i;
                }

            }
            ordenado.add(list.get(indice));
            list.remove(indice);
        }
        list.clear();
        list.addAll(ordenado);
    }
    //8. Escribe la función ordenaListaInsercion a la que le pasas una lista de enteros desordenada y te la ordena mediante el algoritmo de inserción.
    //La ordenación por inserción funciona de la siguiente forma:
    //- Cogemos cada elemento en orden de nuestra lista.
    //- A la hora de meterlo en la lista resultado lo metemos de manera que la lista resultado se quede ordenada. Para ello, vamos pasando por la lista resultado hasta que encontremos un valor mayor e insertamos nuestro número delante.
    //- Repetimos hasta que nuestra lista se quede vacía y todos los elementos hayan pasado a la lista resultado en orden.
    public static void ordenaListaInsercion(List<Integer> list){
        List<Integer> ordenado = new LinkedList<>();
        ordenado.add(list.get(0));
        list.remove(0);
        for(int j = 0; j < list.size(); j ++){
            int actual = list.get(0);
            int i = 0;
            while(i<ordenado.size()&&actual>ordenado.get(i)){
                i++;
            }
            ordenado.add(i,actual);
            list.remove(0);
            j--;
        }
        list.clear();
        list.addAll(ordenado);
    }
    //9. Escribe la función ordenaListaPalabras a la que le pasas una lista de cadenas que contiene palabras
    // y te las ordena alfabéticamente.
    public static void ordenaListaPalabras(List<String> list){
        List<String> ordenado = new LinkedList<>();
        ordenado.add(list.get(0));
        list.remove(0);
        for(int j = 0; j < list.size(); j ++){
            String actual = list.get(0);
            int i = 0;
            while(i<ordenado.size()&&actual.compareToIgnoreCase(ordenado.get(i))>0){
                i++;
            }
            ordenado.add(i,actual);
            list.remove(0);
            j--;
        }
        list.clear();
        list.addAll(ordenado);
    }
    //10. Escribe la función ordenaListaPalabras2 a la que le pasas una lista de cadenas que contiene palabras
    // y te las ordena por tamaño (la más pequeña el principio).
    public static void ordenaListaPalabras2 (List<String> list){
        List<String> ordenado = new LinkedList<>();
        ordenado.add(list.get(0));
        list.remove(0);
        for(int j = 0; j < list.size(); j ++){
            String actual = list.get(0);
            int i = 0;
            while(i<ordenado.size()&&actual.length()>ordenado.get(i).length()){
                i++;
            }
            ordenado.add(i,actual);
            list.remove(0);
            j--;
        }
        list.clear();
        list.addAll(ordenado);
    }
    //11. Escribe la función insertaArrayEnArrayPro a la que le pasamos tres parámetros: un array de enteros,
    // una posición en ese array y otro array de enteros. La función insertará en el primer array, a partir
    // de la posición indicada, odo el contenido del segundo array, y nos devolverá otro array con el
    //  resultado. Para ello, usaremos una lista como paso intermedio: copiamos el array a la lista, realizamos
    //  la inserción en la lista y luego convertiremos la lista en un array y lo devolveremos.
    public static Integer[] insertaArrayEnArrayPro(Integer[] primero, Integer[] segundo, int pos){
        List<Integer> resultado = new LinkedList<>();
        resultado.addAll( Arrays.asList(primero));
        resultado.addAll(pos,Arrays.asList(segundo));
        return resultado.toArray(Integer[]::new);
    }
    //12. Escribe la función sorteoBonoloto que nos da los 6 números que van a tocar en el próximo sorteo.
    // Para ello, meteremos en una lista los 49 números, elegiremos una posición al azar, guardaremos el
    // número en otra lista y lo eliminaremos de la primera (para que no pueda volver a salir). Al terminar
    // de sortear los 6 números, devolveremos una lista que contenga el resultado.
    /*public static List<Integer> sorteoBonoloto(){

    }*/
    //13. Escribe la función eliminaRepetidos a la que le pasamos un array (en el que puede que aparezcan
    // elementos repetidos) y nos devuelve otro array en el que no hay repetidos. Podemos usar listas para
    // que sea más sencillo.
    public static Integer[] eliminaRepetidos(Integer[] array){
        List<Integer> lista = Arrays.asList(array);
        eliminaRepetidos(lista);
        return lista.toArray(Integer[]::new);
    }
}