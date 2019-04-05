package com.company;


import java.sql.*;
import java.util.*;

public class MusicaDB {
    private Connection conn = null;
    public MusicaDB (String ip, String bd, String usuario, String passwd ){
        String url = "jdbc:mysql://" + ip + ":3306/"+bd+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        try {
            conn = DriverManager.getConnection(url, usuario, passwd);
            System.out.println("Conexión establecida con la BD");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public int insertaCancion(String ruta, String titulo, int idArtista, int idEstilo, int anno, int estrellas){
        String sql = String.format("INSERT INTO canciones(ruta,titulo,idArtista,idEstilo,anno,estrellas) VALUES('%s','%s',%d,%d,%d,%d);",ruta,titulo,idArtista,idEstilo,anno,estrellas );
        int id = -1;
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            ResultSet rs = st.executeQuery("SELECT LAST_INSERT_ID();");
            if (rs.next()) id = rs.getInt(1);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return id;
    }
    public int insertaArtista(String nombre){
        String sql = String.format("INSERT INTO artistas(nombre) VALUES('%s');", nombre);
        int id = -1;
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            ResultSet rs = st.executeQuery("SELECT LAST_INSERT_ID();");
            if(rs.next()) id = rs.getInt(1);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return id;
    }
    public int insertaEstilo(String nombre){
        String sql = String.format("INSERT INTO estilos(nombre) VALUES('%s');", nombre);
        int id = -1;
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            ResultSet rs = st.executeQuery("SELECT LAST_INSERT_ID();");
            if(rs.next()) id = rs.getInt(1);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return id;
    }
    public int buscaArtista(String nombre){
        String sql = String.format("SELECT id FROM artistas WHERE nombre LIKE '%s';", "%"+nombre+"%");
        int id = -1;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) id = rs.getInt(1);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return id;
    }
    public int buscaEstilo(String nombre){
        String sql = String.format("SELECT id FROM estilos WHERE nombre LIKE '%s';", "%"+nombre+"%");
        int id = -1;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) id = rs.getInt(1);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return id;
    }
    public boolean existeFichero(String ruta){
        String sql = String.format("SELECT id FROM canciones WHERE ruta LIKE '%s';", ruta);
        int id = -1;
        boolean existe;
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) id = rs.getInt(1);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        existe = id != -1;
        return existe;
    }
    public List<Cancion> listadoCanciones(){
        List<Cancion> listadoCanciones = new LinkedList<>();
        String sql = "SELECT * FROM canciones;";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Cancion cancion = new Cancion();
                cancion.id = rs.getInt(1);
                cancion.ruta = rs.getString(2);
                cancion.titulo = rs.getString(3);
                cancion.idArtista = rs.getInt(4);
                cancion.idEstilo = rs.getInt(5);
                cancion.anno = rs.getInt(6);
                cancion.estrellas = rs.getInt(7);
                listadoCanciones.add(cancion);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listadoCanciones;
    }
    public List<Cancion> listadoCancionesPorArtista(int idArtista) {
        List<Cancion> listadoCanciones = new LinkedList<>();
        String sql = String.format("SELECT * FROM canciones WHERE idArtista LIKE %d;",idArtista);
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Cancion cancion = new Cancion();
                cancion.id = rs.getInt(1);
                cancion.ruta = rs.getString(2);
                cancion.titulo = rs.getString(3);
                cancion.idArtista = rs.getInt(4);
                cancion.idEstilo = rs.getInt(5);
                cancion.anno = rs.getInt(6);
                cancion.estrellas = rs.getInt(7);
                listadoCanciones.add(cancion);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listadoCanciones;
    }
    public List<Cancion> listadoCancionesPorEstilo(int idEstilo){
        List<Cancion> listadoCanciones = new LinkedList<>();
        String sql = String.format("SELECT * FROM canciones WHERE idEstilo LIKE %d;",idEstilo);
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Cancion cancion = new Cancion();
                cancion.id = rs.getInt(1);
                cancion.ruta = rs.getString(2);
                cancion.titulo = rs.getString(3);
                cancion.idArtista = rs.getInt(4);
                cancion.idEstilo = rs.getInt(5);
                cancion.anno = rs.getInt(6);
                cancion.estrellas = rs.getInt(7);
                listadoCanciones.add(cancion);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listadoCanciones;
    }
    public List<Cancion> listadoCancionesPorAnno(int annoInicio, int annoFinal){
        List<Cancion> listadoCanciones = new LinkedList<>();
        String sql = String.format("SELECT * FROM canciones WHERE anno BETWEEN %d AND %d;",annoInicio,annoFinal);
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Cancion cancion = new Cancion();
                cancion.id = rs.getInt(1);
                cancion.ruta = rs.getString(2);
                cancion.titulo = rs.getString(3);
                cancion.idArtista = rs.getInt(4);
                cancion.idEstilo = rs.getInt(5);
                cancion.anno = rs.getInt(6);
                cancion.estrellas = rs.getInt(7);
                listadoCanciones.add(cancion);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listadoCanciones;
    }
    public List<Cancion> listadoCancionesPorEstrellas(int minimo, int maximo){
        List<Cancion> listadoCanciones = new LinkedList<>();
        String sql = String.format("SELECT * FROM canciones WHERE estrellas BETWEEN %d AND %d;",minimo,maximo);
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Cancion cancion = new Cancion();
                cancion.id = rs.getInt(1);
                cancion.ruta = rs.getString(2);
                cancion.titulo = rs.getString(3);
                cancion.idArtista = rs.getInt(4);
                cancion.idEstilo = rs.getInt(5);
                cancion.anno = rs.getInt(6);
                cancion.estrellas = rs.getInt(7);
                listadoCanciones.add(cancion);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listadoCanciones;
    }
    public String artista(int id){
        String nombre = "";
        try {
            String sql = String.format("SELECT nombre FROM artistas WHERE id = %d;", id);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) nombre = rs.getString(1);
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return nombre;
    }
    public String estilo(int id){
        String nombre = "";
        try {
            String sql = String.format("SELECT nombre FROM estilos WHERE id = %d;", id);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) nombre = rs.getString(1);
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return nombre;
    }
    public void delete(String nombreTabla){
        String sql = String.format("DELETE FROM %s",nombreTabla);
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            System.out.println("Borrado con éxito!");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
