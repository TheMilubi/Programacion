package com.company;

public class Main {

    public static void main(String[] args) {
        trapecioAsteriscos(2,8);
        System.out.println();
        trapecioAsteriscos(5,15);
        System.out.println();
        trapecioAsteriscos(22,44);
        System.out.println();
        arbolNavidad(5);
        System.out.println();
        arbolNavidad(17);
        System.out.println();
        arbolNavidad(101);
        System.out.println();
    }
    public static void trapecioAsteriscos(int a, int b){
        int espacios = 0;
        if((a %2== 0 && b %2== 1 )||(a %2== 1 && b %2== 0 )){
            System.out.println("Ambos numeros deben ser pares o impares");
        }
        else if(a<0 || b<0){
            System.out.println("Ambos numeros deben ser naturales");
        }
        else if(a>b){
            System.out.println("Los parametros no corresponden (primero la base pequeña, segundo la grande)");
        }
        else{
            espacios= (b-a)/2;
            for(int i = a;i <= b;i+=2 ){
                repiteCaracter(espacios,' ');
                repiteCaracter(i,'*');
                System.out.println();
                espacios--;
            }
        }

    }
    public static void arbolNavidad(int anchoMaximo){
        if(anchoMaximo<5){
            System.out.println("Ancho debe ser como minimo 5");
        }
        else if(anchoMaximo%2==0){
            System.out.println("Dime un ancho impar");
        }
        else {
            //Sí, se que es una movida lo que he hecho para calcular el ancho del tronco segun el tamaño maximo
            int valorMenor = ((anchoMaximo/2)%2==0)?anchoMaximo/2+1:anchoMaximo/2;
            int anchoTronco = (anchoMaximo/4%2==0)?anchoMaximo/4+1:anchoMaximo/4;
            int espacioTronco = (anchoMaximo-anchoTronco)/2;
            trapecioAsteriscos(1,anchoMaximo);
            trapecioAsteriscos(valorMenor,anchoMaximo);
            trapecioAsteriscos(valorMenor,anchoMaximo);
            for(int i = 0; i < valorMenor; i++){
                repiteCaracter(espacioTronco,' ');
                repiteCaracter(anchoTronco,'*');
                System.out.println();
            }

        }
    }
    public static void repiteCaracter(int numero, char caracter){
        for(int i = 0; i < numero; i++){
            System.out.print(caracter);
        }
    }
}
