package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    List<String> ciudades = new LinkedList<>();
	    List<Double> temps = new LinkedList<>();
	    ciudades.add("Jerez");
        ciudades.add("Tarifa");
        ciudades.add("Barbate");
        temps.add(18.9);
        temps.add(14.1);
        temps.add(18.6);
        System.out.println(ciudades);
        System.out.println(temps);
        haceCalor(ciudades,temps);
        System.out.println(ciudades);
        System.out.println(temps);
    }
    public static void haceCalor(List<String> localidades, List<Double> temperaturas){
        double mediaTemp = 0;
        if (localidades.size()!=temperaturas.size()){
            System.out.println("ERROR: las listas no se corresponden (FALTAN VALORES EN UNA)");
        }
        else {
            for (Double temperatura : temperaturas) {
                mediaTemp += temperatura;
            }
            mediaTemp = mediaTemp/ temperaturas.size();
            for (int i = 0; i <temperaturas.size() ; i++) {
                if (temperaturas.get(i)<mediaTemp){
                    temperaturas.remove(i);
                    localidades.remove(i);
                    i--;
                }
            }
        }
    }
}
