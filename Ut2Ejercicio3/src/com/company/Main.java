package com.company;

public class Main {

    public static void main(String[] args) {
	    String s = "Hola, ¿Qué tal? Soy amigo de Poti-Poti";
	    System.out.println(limpiaCadena(s));
    }
    public static String limpiaCadena(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length(); i ++){
            if(!(Character.isLetter(sb.charAt(i)))){
                if(sb.charAt(i-1)==' '||sb.charAt(i+1)==' '){
                    sb.deleteCharAt(i);
                    i--;
                }
                else {
                    sb.deleteCharAt(i);
                    sb.insert(i,' ');
                }
            }
        }
        return sb.toString();
    }
}
