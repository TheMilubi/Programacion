package com.company;

public class Fraccion {
    private int numerador, denominador;
    public Fraccion(int n, int d) throws Exception{
        if (d == 0){
            throw new Exception("No se puede dividir por cero");
        }
        else {
            numerador = n;
            denominador = d;
        }
    }
    public Fraccion(int numero){
        numerador = numero;
        denominador = 1;
    }
    public Fraccion(double d){
        double num = d;
        int den = 1;
        while (num != (int)num){
            num = num * 10;
            den = den * 10;
        }
        numerador = (int) num;
        denominador = den;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) throws Exception {
        if (denominador != 0) {
            this.denominador = denominador;
        }
        else{
            throw new Exception("No se puede dividir por 0");
        }
    }
    private static int mcm(int numerador, int denominador){
        int mcm = numerador*denominador;
        int i = Math.max(numerador,denominador);
        while(i <= numerador* denominador && mcm == 0 ){
            if (i % numerador == 0 && i % denominador == 0){
                mcm = i;
            }
            i++;
        }
        return mcm;
    }
    private static int mcd(int numerador, int denominador){
        int mcd = 1;
        int i = Math.min(numerador,denominador);
        while(i > 0 && mcd == 1 ){
            if (numerador % i == 0 && denominador % i == 0){
                mcd = i;
            }
            i--;
        }
        return mcd;
    }
    public void simplificar(){
        int mcd = mcd(Math.abs(numerador),Math.abs(denominador));
        numerador = numerador / mcd;
        denominador = denominador / mcd;
    }

    @Override
    public String toString() {
        return numerador+"/"+denominador;
    }
    public Fraccion negate (){
        Fraccion f = null;
        try {
            f = new Fraccion(-numerador,denominador);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return f;
    }
    public Fraccion add(Fraccion fraccion){
        Fraccion f = null;
        try{
            int n,d;
            if (fraccion.denominador != denominador) {
                n = fraccion.numerador * denominador + numerador * fraccion.denominador;
                d = fraccion.denominador * denominador;
            }else {
                n = fraccion.numerador + numerador;
                d = denominador;
            }
            f = new Fraccion(n,d);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return f;
    }
    public Fraccion substract(Fraccion fraccion){
        Fraccion f = null;
        try{
            int n,d;
            if (fraccion.denominador != denominador) {
                n = fraccion.numerador * denominador - numerador * fraccion.denominador;
                d = fraccion.denominador * denominador;
            }else {
                n = fraccion.numerador - numerador;
                d = denominador;
            }
            f = new Fraccion(n,d);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return f;
    }
    public Fraccion multiply(Fraccion fraccion){
        Fraccion f = null;
        try{
            int n,d;
            n = fraccion.numerador * numerador;
            d = denominador * fraccion.denominador;
            f = new Fraccion(n,d);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return f;
    }
    public Fraccion divide(Fraccion fraccion){
        Fraccion f = null;
        try{
            double n,d;
            n = numerador / (double) fraccion.numerador;
            d = denominador /(double) fraccion.denominador;
            f = new Fraccion(n/d);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return f;
    }

    public boolean equals(Fraccion f) {
        boolean igual = false;
        double f1, f2;
        f1 = numerador/(double) denominador;
        f2 = f.numerador/(double) f.denominador;
        igual = f1 == f2;
        return igual;
    }
    int compareTo(Fraccion f){
        int igual;
        double f1, f2;
        f1 = numerador/(double) denominador;
        f2 = f.numerador/(double) f.denominador;
        if(f1 == f2){
            igual = 0;
        }
        else if(f1 < f2){
            igual = -1;
        }
        else {
            igual = 1;
        }
        return igual;
    }
}
