package com.company;

public class Main {

    public static void main(String[] args) {
	    String nl = "Boston Red Sox";
	    String nv = "Angeles Dodgers";
	    int [] r = {4,8,2,8,3,2,6,9,1,5};
        int [] r2 = {4,8,2,8,3,2,12,9};
	    System.out.println("Resultados 1: "+seriesMundiales(nl,nv,r));
        System.out.println("Resultados 2: "+seriesMundiales(nl,nv,r2));
    }
    public static String seriesMundiales(String nombreLocal, String nombreVisitante, int [] resultados){
        String ganador = "";
        int victoriasVis = 0, vicotriasLoc = 0;
        boolean valido = true; //Comprobar que no hay empates
        if(resultados.length%2==1){
            ganador ="Error, resultados no validos";
        }
        else {
            int i = 0;
            while (i <resultados.length && valido){
                if (resultados[i]>resultados[i+1]){
                    victoriasVis++;
                }
                else if(resultados[i]<resultados[i+1]){
                    vicotriasLoc++;
                }
                else {
                    valido = false;
                }
                i+=2;
            }
            valido = valido&&(vicotriasLoc!=victoriasVis);
            if(valido){
                ganador = (vicotriasLoc>victoriasVis)?nombreLocal:nombreVisitante;
            }
            else {
                ganador = "Error, no puede haber empates en los resuttados";
            }
        }
        return ganador;
    }
}
