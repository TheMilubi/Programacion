package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(compruebaEmail("ruben@example.com")?"Valido":"Invalido");
    }
    public static boolean compruebaEmail(String email){
        boolean valida;
        valida = !email.startsWith("@")&&!email.endsWith("@")&&numeroCaracter(email,'@')==1;
        valida = valida && !email.startsWith("-")&&!email.endsWith("-")&&!email.contains("--");
        valida = valida && !email.startsWith(".")&&!email.endsWith(".")&&!email.contains("..");
        if (valida){
            String s = email.replaceAll("@","a");
            s = s.replaceAll("-", "a");
            s = s.replaceAll(".", "a");
            valida = minusMayusDigit(s);
        }
        return valida;
    }
    private static int numeroCaracter(String s, char c){
        int numC = 0;
        for(int i = 0; i < s.length();i++){
            if(s.charAt(i) == c) numC++;
        }
        return numC;
    }
    private static boolean minusMayusDigit(String s){
        boolean valido = true;
        int i = 0;
        while (i < s.length()&&valido){
            valido = Character.isDigit(s.charAt(i))||(s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122);
            i++;
        }
        return valido;
    }
}
