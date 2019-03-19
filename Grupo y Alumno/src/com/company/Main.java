package com.company;

public class Main {

    public static void main(String[] args) {
	    Grupo a = new Grupo();
	    Grupo b = new Grupo();
	    Grupo c = new Grupo();
	    a.leeFicheroBinario("Fichero3");
	    b.leeFicheroTexto("Fichero5");
	    c.leeFicheroCSV("Fichero7");
	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
	    a.escribeFicheroBinario("FicheroBin");
	    b.escribeFicheroTexto("FicheroTexto");
	    c.escribeFicheroCSV("FicheroCVS");
    }
}
