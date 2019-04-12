package com.company;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    recuentoVotos("votacion1.db");
	    recuentoVotos("votacion2.db");
    }
    static void recuentoVotos(String nombreBD){
        //Conexión a BD
        String url = "jdbc:sqlite:" + nombreBD;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Conexión establecida con la BD");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        try {
            List<String> partidos = new LinkedList<>();
            List<Integer> votos = new LinkedList<>();
            List<Integer> porcentajes = new LinkedList<>();
            String sql = String.format("SELECT id, partido FROM votacion");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String partido = rs.getString(2);
                int id;
                if(!partidos.contains(partido)){
                    partidos.add(partido);
                    votos.add(1);
                }
                else {
                    id = partidos.indexOf(partido);
                    int voto = votos.get(id);
                    voto++;
                    votos.remove(id);
                    votos.add(id,voto);
                }
            }
            ordena(partidos,votos);
            calculaPorCiento(votos,porcentajes);
            imprime(partidos,votos,porcentajes);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
    static void ordena(List<String> partidos, List<Integer> votos){
        for (int i = 0; i < partidos.size()-1; i++) {
            for (int j = 1; j < partidos.size(); j++) {
                if(votos.get(j) > votos.get(j-1)){
                    int mayor = votos.get(j);
                    String partido = partidos.get(j);
                    votos.remove(j);
                    votos.add(j,votos.get(j-1));
                    votos.remove(j-1);
                    votos.add(j-1,mayor);
                    partidos.remove(j);
                    partidos.add(j,partidos.get(j-1));
                    partidos.remove(j-1);
                    partidos.add(j-1,partido);
                }
            }
        }
    }
    static void calculaPorCiento(List<Integer> votos, List<Integer> porcentajes){
        double total = 0;
        for (int voto:votos) {
            total += voto;
        }
        for (int voto:votos) {
            double porcentaje = voto/total*100.0;
            int p = (int)Math.round(porcentaje);
            porcentajes.add(p);
        }
    }
    static void imprime(List<String> partidos, List<Integer> votos, List<Integer> porcentajes){
        String nombreMasLargo = "";
        String votosMasLargo = "";
        for (String partido:partidos) {
            if(partido.length()>nombreMasLargo.length()){
                nombreMasLargo = partido;
            }
        }
        for (int voto:votos) {
            if(String.valueOf(voto).length()>votosMasLargo.length()){
                votosMasLargo = String.valueOf(voto);
            }
        }
        for (int i = 0; i < partidos.size(); i++) {
            System.out.println(partidos.get(i)+
                    multiplicaChar(nombreMasLargo.length() - partidos.get(i).length(),' ')+"   "
                    +votos.get(i)+multiplicaChar(votosMasLargo.length()-votos.get(i).toString().length(),' ')+
                    " votos"+multiplicaChar(3-porcentajes.get(i).toString().length(),' ')
                    +"   "+porcentajes.get(i)+"%");
        }

    }
    static String multiplicaChar(int n, char c){
        String charRep = "";
        for (int i = 0; i < n; i++) {
            charRep = charRep+c;
        }
        return charRep;
    }
}
