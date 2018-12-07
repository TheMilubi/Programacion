package com.company;

import java.util.Scanner;

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
                String s = "Aqui hay 4 espacios ";
                System.out.println(numeroEspacios(s));
            }break;
            case 2:{
                String s = "aqui hay 7 vocales ";
                System.out.println(numeroVocales(s));
            }break;
            case 3:{
                String s = "alabalat";
                System.out.println(esPalindromo(s)?"Es palindromo":"No es palindromo");
            }break;
            case 4:{
                String s = "aeiou";
                char c = 'c';
                System.out.println(contiene(s,c)?"Contiene el caracter":"No lo contiene");
            }break;
            case 5:{
                char c = 'a';
                int numero = 20;
                System.out.println(repiteCaracter(c,numero));
            }break;
            case 6:{
                String h = "hola";
                int longitud = 10;
                System.out.println(padLeft(h,longitud));
                System.out.println(padRight(h,longitud));

            }break;
            case 7:{
                String h = " h o l a ";
                System.out.println(h);
                h = quitaEspacios(h);
                System.out.println(h);
            }break;
            case 8:{
                String s = "               A ver si esto funciona             ";
                System.out.println(s);
                s = quitaEspaciosTrim(s);
                System.out.println(s);
            }break;
            case 9:{
                String s = "A ver si esto funciona";
                System.out.println(s);
                s = sustituyeCaracter(s,'o','a');
                System.out.println(s);
            }break;
            case 10:{
                String s = " A ver si esto funciona ";
                System.out.println(s);
                System.out.println(cuentaPalabras(s));
            }break;
            case 11:{
                String s = "99999";
                System.out.println(s);
                System.out.println(esNumero(s)?"Es un numero":"No es un numero");
            }break;
            case 12:{
                String s = "Mi moto alpino derrapante";
                System.out.println(s);
                System.out.println(quitaCaracter(s,'o'));
            }break;
            case 13:{
                String s = "Rubén Fermín Díaz Durán";
                System.out.println(s);
                System.out.println(quitaAcentos(s));
            }break;
            case 15:{
                String s = "CocaCola";
                System.out.println(s);
                System.out.println(invierteCadena(s));
            }break;
        }
    }
    //1. Escribe la función “numeroEspacios” a la que le pasamos una cadena y nos devuelve el
    //número de espacios que contiene esa cadena (tanto al principio y al final como
    //intercalados).
    public static int numeroEspacios(String s){
        int numEsp = 0;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == ' ') numEsp++;
        }
        return numEsp;
    }
    //2. Escribe la función “numeroVocales” a la que le pasamos una cadena y nos devuelve el
    //número de vocales que hay en la cadena.
    public static int numeroVocales(String s){
        int numVoc = 0;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u') numVoc++;
        }
        return numVoc;
    }
    //3. Escribe la función “esPalindromo” a la que le pasamos una cadena y nos dice si la cadena
    //es un palíndromo (true) o no (false). Un palíndromo es una palabra o frase que se lee
    //igual al revés que al derecho.
    public static boolean esPalindromo(String s){
        boolean palindromo = true;
        int i = 0;
        while (i < s.length()/2 && palindromo){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                palindromo = false;
            }
            i++;
        }
        return palindromo;
    }
    //4. Escribe la función “contiene” a la que le pasamos una cadena y un carácter por
    //parámetro y nos dice si el carácter aparece en la cadena o no. Es igual que la función
    //contains. Evidentemente, no podéis usar esta función para hacer la vuestra.
    public static boolean contiene(String s, char c){
        boolean contenido = false;
        int i = 0;
        while (i < s.length()/2 && !contenido){
            if(s.charAt(i)==c){
                contenido = true;
            }
            i++;
        }
        return contenido;
    }
    //5. Escribe la función “repiteCaracter” a la que le pasamos dos parámetros: un carácter y
    //un entero. La función nos devolverá una cadena que contendrá el carácter repetido
    //tantas veces como indique el entero. Ej.: repiteCaracter(‘A’, 5) = “AAAAA”.
    public static String repiteCaracter(char c, int numero){
        String s = "";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < numero;i++){
            sb.append(c);
        }
        s = sb.toString();
        return s;
    }
    //6. Escribe las funciones “padLeft” y “padRight” a las que le pasaremos una cadena y una
    // longitud final. Ambas funciones nos añadirán espacios delante (padLeft) o detrás (padRight)
    // de nuestra cadena hasta que el tamaño de nuestra cadena llega a la longitud que le hemos pasado.
    //Ejemplo: padLeft(“patata”, 10) nos añadirá 4 espacios delante de “patata” para que la longitud final
    // quede 10. El resultado sería “~~~~patata” (~ = espacio).
    //Estas funciones nos serán muy útiles para cuando queramos escribir por pantalla listados y
    // tablas de manera elegante.
    public static String padLeft(String s, int longitud){
        StringBuilder sb = new StringBuilder(s);
        sb.insert(0,repiteCaracter(' ',longitud-s.length()));
        return sb.toString();
    }
    public static String padRight(String s, int longitud){
        StringBuilder sb = new StringBuilder(s);
        sb.append(repiteCaracter(' ',longitud-s.length()));
        return sb.toString();
    }
    //7. Escribe la función “quitaEspacios” a la que le pasamos una cadena y nos devuelve la misma
    // cadena, pero con todos los espacios quitados (tanto los del principio como los del final como
    // los intermedios).
    public static String quitaEspacios(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i++ ){
            if(sb.charAt(i)==' ')sb.deleteCharAt(i);
        }
        s = sb.toString();
        return s;
    }
    //8. Escribe la función “quitaEspaciosTrim” a la que le pasamos una cadena y nos devuelve otra
    // cadena igual que la primera en la que se han eliminado los espacios que haya al principio y
    // al final. No se puede utilizar trim, obviamente.
    public static String quitaEspaciosTrim(String s){
        int firtIndex, lastIndex;
        int i = 0;
        while(s.charAt(i)==' '){
            i++;
        }
        firtIndex = i;
        int j = s.length()-1;
        while (s.charAt(j)==' '){
            j--;
        }
        lastIndex = j + 1;
        s = s.substring(firtIndex,lastIndex);
        return s;
    }
    //9. Escribe la función “sustituyeCaracter” a la que le pasamos una cadena, un carácter y otro
    // carácter y nos devuelve otra cadena igual que la primera en la que se ha sustituido el primer
    // carácter por el segundo carácter. Ojo, en las cadenas, al contrario que en los arrays, no
    // podemos modificar directamente un valor al estilo de cadena[2] = ‘A’ (los corchetes sólo sirven
    // para leer el valor, no para modificarlo).
    public static String sustituyeCaracter(String s, char aSustituir, char sustituto){
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while (i < sb.length()&& sb.charAt(i)!=aSustituir){
            i++;
        }
        sb.deleteCharAt(i);
        sb.insert(i,sustituto);
        s = sb.toString();
        return s;
    }
    //10. Escribe la función “cuentaPalabras” a la que le pasamos una cadena que contiene una frase
    // y nos devuelve el número de palabras que hay en la misma.
    public static int cuentaPalabras(String s){
        int numPalabras;
        String string = quitaEspaciosTrim(s);
        numPalabras = numeroEspacios(string) + 1;
        return numPalabras;
    }
    //11. Escribe la función “esNumero”, a la que le pasamos una cadena y nos dice si está formada
    // enteramente por números o no. Esta función es muy interesante para evitarnos errores a la hora
    // de hacer un Scanner.nextInt(). Si queremos leer un número del teclado, lo más correcto es leerlo
    // con un Scanner.next() como si fuera una cadena, después comprobar con la función esNumero si
    // está formado completamente por dígitos y después convertirlo a entero con, por ejemplo, un
    // Integer.parseInt().
    public static boolean esNumero(String s){
        boolean esNumero = true;
        int i = 0;
        while (i < s.length()&& esNumero){
            if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='2'&&s.charAt(i)!='3'&&s.charAt(i)!='4'&&s.charAt(i)!='5'&&s.charAt(i)!='6'&&s.charAt(i)!='7'&&s.charAt(i)!='8'&&s.charAt(i)!='9'){
                esNumero = false;
            }
            i++;
        }
        return esNumero;
    }
    //12. Escribe la función “quitaCaracter” a la que le pasamos una cadena y un carácter y nos devuelve
    // la cadena, pero con todas las ocurrencias de ese carácter quitadas.
    public static String quitaCaracter(String s, char c){
        String string = "";
        for (int i = 0; i < s.length();i++){
            if (s.charAt(i)!=c){
                string = string + s.charAt(i);
            }
        }
        return string;
    }
    //13. Escribe la función “quitaAcentos” a la que le pasas una cadena con caracteres acentuados y te
    // devuelve la cadena con los acentos quitados (esto se hace para algunos programas que no se enteran
    // de los acentos).
    public static String quitaAcentos(String s){
        String tildados = "ÁáÉéÍíÓóÚúÑñÜü";
        String sinTilde = "AaEeIiOoUuNnUu";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i ++){
            if (contiene(tildados,sb.charAt(i))){
                sb.deleteCharAt(i);
                sb.insert(i,sinTilde.charAt(tildados.indexOf(s.charAt(i))));
            }
        }
        return sb.toString();
    }
    //14. Escribe la función “invierteCadena” a la que le pasamos una cadena y nos la devuelve invertida
    // (de detrás para delante, vamos).
    public static String invierteCadena(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    //15. Escribe la función “vecesCaracter” a la que le pasamos una cadena y un carácter y nos dice
    // cuántas veces se repite ese carácter.

}
