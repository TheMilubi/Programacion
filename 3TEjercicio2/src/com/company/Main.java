package com.company;

import java.io.*;
import java.sql.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        transfiereFicheroBD("alumnos.db","alumnos.txt");
    }
    static void transfiereFicheroBD(String nombreBD, String nombreFichero){
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
            FileReader fr = new FileReader(nombreFichero);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            if(s.equals("NOMBRE,FECHA DE NACIMIENTO,CURSO")){
                int nLinea = 1;
                while(s != null){
                    System.out.println(s);
                    String[] datos = s.split(",");
                    String sqlSelect = "SELECT id FROM cursos WHERE nombre = '%s'";
                    String sqlInsert = "INSERT INTO alumnos(nombre, fechaNacimiento, idCurso) VALUES(?,?,?);";
                    if(datos.length==3){
                        if (compruebaFecha(datos[1])){
                            String[] fecha = datos[1].split("/");
                            int dia = Integer.valueOf(fecha[0]);
                            int mes = Integer.valueOf(fecha[1]);
                            int anno = Integer.valueOf(fecha[2]);
                            LocalDate d = LocalDate.of(anno,mes,dia);
                            PreparedStatement st = conn.prepareStatement(sqlInsert);
                            Statement stmt = conn.createStatement();
                            ResultSet rs = stmt.executeQuery(String.format(sqlSelect,datos[2]));
                            if(rs.next()) {
                                st.setString(1, datos[0]);
                                st.setString(2, d.toString() + " 00:00:00.000");
                                st.setInt(3, rs.getInt(1));
                                st.executeUpdate();
                                System.out.println("Base de datos actualizada");
                            }
                            else {
                                System.out.println("Curso de la linea "+nLinea+" del fichero no existe");
                            }
                        }
                        else {
                            System.out.println("Fecha no valida en la linea "+nLinea);
                        }
                    }
                    else {
                        System.out.println("Numero de datos incorrecto en la linea "+nLinea);
                    }
                    s = br.readLine();
                    nLinea++;
                }
                br.close();
                fr.close();
            }
            else {
                throw new Exception("Cabecera no válida");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static boolean compruebaFecha(String fecha){
        boolean valida = true;
        String[] f = fecha.split("/");
        valida = valida && (f.length == 3);
        if(valida) {
            int dia = Integer.valueOf(f[0]);
            int mes = Integer.valueOf(f[1]);
            int anno = Integer.valueOf(f[2]);
            try{
                LocalDate d = LocalDate.of(anno,mes,dia);
            }catch (Exception e){
                valida = false;
            }
        }
        return valida;
    }
}
