package com.company;


import java.io.InputStream;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class ClienteBonoloto implements Runnable {
    private List<Integer> boleto;
    public ClienteBonoloto(){
        boleto = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        for (int i = 0; i < 6; i++){
            System.out.println("Dime un numero entre el 1 y el 49:");
            num = sc.nextInt();
            while (num < 1  || num > 49 || boleto.contains(num)){
                System.out.println("No valido");
                num = sc.nextInt();
            }
            boleto.add(num);
        }
        boleto.sort(Integer::compareTo);
    }
    public int conectaCliente(){
        List<Integer> boletoGanador = new LinkedList<>();
        int contadorAciertos = 0;
        try {
            Socket s = new Socket("127.0.0.1", 9009);
            System.out.println("Conectado al Servidor");
            InputStream is = s.getInputStream();
            Scanner sc = new Scanner(is);
            for (int i = 0; i < 6; i++) {
                String string = sc.nextLine();
                int n = Integer.valueOf(string);
                //System.out.println(n);
                boletoGanador.add(n);
            }
            System.out.println(boletoGanador);
            //boleto.sort(Integer::compareTo);
            boletoGanador.sort(Integer::compareTo);
            for (int i = 0; i < boletoGanador.size(); i++) {
                if(boleto.get(i).equals(boletoGanador.get(i))){
                    contadorAciertos++;
                }
            }
            s.close();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            conectaCliente();
        }
        System.out.println(contadorAciertos);
        return contadorAciertos;
    }
    @Override
    public void run() {
        conectaCliente();
    }
}
