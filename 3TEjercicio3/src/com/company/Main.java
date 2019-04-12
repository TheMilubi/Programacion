package com.company;

public class Main {

    public static void main(String[] args) {
	    BuscaTexto bt = new BuscaTexto();
	    bt.cargaFichero("ejemplo.txt");
	    bt.busca("tabindex");
	    System.out.println(bt.getPuntero());
		System.out.println(bt.extraeCadena(">","<"));
		bt.buscaSiguitente("<\"");
		bt.buscaSiguitente("\"");
		System.out.println(bt.getPuntero());
		System.out.println(bt.extraeCadena("\"","\""));
    }
}
