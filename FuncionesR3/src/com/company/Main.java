package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(diasEntreFechas(1,1,1981,26,10,2018));
        System.out.println(diasTranscurridos1980(26,10,2018));
        System.out.println(diaSemanaFecha(26,10,2018));
        System.out.println(horaASegundos(10,10,50));
        escribeHoraBonita(10,10,50);
        escribeSegundosBonito(36650);
        System.out.println(segundosTranscurridos(1,0,0,10,10,50));
        System.out.println(segundosTranscurridos1980(26,10,2018,0,0,0));

    }
    public static int diasMes(int mes){
        int dias;
        if (mes < 0 || mes >12) {
            dias = -1;
            System.out.println("Mes invalido");
        }
        else if (mes == 1||mes == 3||mes == 5||mes == 7||mes == 8||mes == 10||mes==12) dias=31;
        else if(mes==2) dias = 28;
        else dias = 30;
        return dias;
    }
    public static int diasMes(int mes,int anno){
        int dias;
        if (mes < 0 || mes >12) {
            dias = -1;
            System.out.println("Mes no valido");
        }
        else if (mes == 1||mes == 3||mes == 5||mes == 7||mes == 8||mes == 10||mes==12) dias=31;
        else if(mes==2){
            dias = bisiesto(anno)? 29 : 28;
        }
        else dias = 30;
        return dias;
    }
    public static int diasAnno(int anno){
        int dias = (bisiesto(anno)?366:365);
        return dias;
    }
    public static int diasTranscurridos(int dia, int mes, int anno){
        int dias = 0;
        if (dia < 0 || dia > diasMes(mes, anno)){
            System.out.println("Dia no valido");
            dias = -1;
        }
        else {
            for(int i = 1; i < mes; i++){
                dias = dias + diasMes(i,anno);
            }
            dias = dias + dia - 1;
        }

        return dias;
    }
    public static int diasTranscurridos1980(int dia, int mes, int anno){
        int dias = 0;
        if (anno < 1980){
            System.out.println("Año no valido");
            dias = -1;
        }
        else{
            for (int i = 1980; i < anno; i++){
                dias += diasTranscurridos(31, 12,i);
                dias ++;
            }
            dias += diasTranscurridos(dia, mes, anno);
        }
        return dias;
    }
    public static int diasEntreFechas(int dia, int mes, int anno,int dia2, int mes2, int anno2){
        int dias = 0;
        if (anno>anno2){
            System.out.println("Introduce la fecha anterior primero y la posterior despues");
            dias = -1;
        }
        else {
            dias += (diasTranscurridos1980(dia2,mes2,anno2)- diasTranscurridos1980(dia,mes,anno));
        }
        return dias;
    }
    public static int diaSemanaFecha(int dia, int mes, int anno){
        int diaSemana; //entre 1 y 7
        diaSemana = 2;
        diaSemana = (diaSemana - 1 + diasTranscurridos1980(dia,mes,anno))%7 + 1;
        return diaSemana;
    }
    public static int horaASegundos (int horas, int minutos, int segundos){
        int s = 0;
        s = horas * 3600 + minutos * 60 + segundos;
        return s;
    }
    public static void escribeHoraBonita (int horas, int mintuos, int segundos){
        if (mintuos<0||mintuos>59||segundos<0||segundos>59){
            System.out.println("Hora introducida no valida");
        }
        else{
            System.out.println(horas+":"+mintuos+":"+segundos);
        }
    }
    public static void escribeSegundosBonito (int segundos){
        int h, m, s, contadorSeg = segundos;
        h = contadorSeg / 3600;
        contadorSeg = contadorSeg % 3600;
        m = contadorSeg / 60;
        contadorSeg = contadorSeg % 60;
        s = contadorSeg;
        escribeHoraBonita(h,m,s);
    }
    public static int segundosTranscurridos (int h1, int min1, int seg1, int h2, int min2, int seg2){
        int segundos = 0;
        segundos = horaASegundos(h2,min2,seg2)-horaASegundos(h1,min1,seg1);
        return segundos;
    }
    public static int segundosTranscurridos1980 (int dia, int mes, int anno, int h, int min, int seg){
        int dias = 0, segundos = 0;
        dias = diasTranscurridos1980(dia,mes,anno);
        segundos = dias * 24 * 3600 + horaASegundos(h,min,seg);
        return segundos;
    }
    static boolean bisiesto(int x){
        boolean bisiesto = ((x % 4 == 0)&&(x % 100 != 0)||(x % 400 == 0));
        return bisiesto;
    }
}
