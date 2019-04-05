package com.company;

import java.sql.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class CineDB {
    private Connection conn = null;
    public CineDB(String nombreBD){
        String url = "jdbc:sqlite:" + nombreBD;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Conexión establecida con la BD");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public int insertaPelicula(String titulo, int anno, boolean tieneOscar, double valoracion){
        int id = -1;
        try {
            String sql = "INSERT INTO peliculas(titulo, anno, tieneOscar, valoracion) VALUES(?,?,?,?);";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,titulo);
            st.setInt(2,anno);
            st.setBoolean(3,tieneOscar);
            st.setDouble(4,valoracion);
            st.executeUpdate();
            sql = "SELECT last_insert_rowid();";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) id = rs.getInt("id");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return id;
    }
    public int insertaActor(String nombre, LocalDate fechaNacimiento){
        int id = -1;
        try {
            String sql = "INSERT INTO actores(nombre, fechaNacimiento) VALUES(?,?);";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,nombre);
            st.setDate(2,Date.valueOf(fechaNacimiento));
            st.executeUpdate();
            sql = "SELECT last_insert_rowid();";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) id = rs.getInt("id");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return id;
    }
    public void asociaActorPelicula(int idActor, int idPelicula, boolean principal){
        try {
            String sql = "INSERT INTO actoresPeliculas(idActor, idPelicula, principal) VALUES(?,?,?);";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,idActor);
            st.setInt(2,idPelicula);
            st.setBoolean(3,principal);
            st.executeUpdate();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public int buscaActor(String nombre) {
        int id = -1;
        try {
            String sql = "SELECT id FROM actores WHERE nombre like ?;";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,"%"+nombre+"%");
            ResultSet rs = st.executeQuery();
            if (rs.next()) id = rs.getInt("id");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return id;
    }
    public int buscaPelicula(String titulo){
        int id = -1;
        try {
            String sql = "SELECT id FROM peliculas WHERE titulo like ?;";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1,"%"+titulo+"%");
            ResultSet rs = st.executeQuery();
            if (rs.next()) id = rs.getInt("id");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return id;
    }
    public Pelicula datosPelicula(int idPelicula){
        Pelicula pelicula = new Pelicula();
        try {
            String sql = "SELECT * FROM peliculas WHERE id = ?;";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,idPelicula);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                pelicula.id = rs.getInt("id");
                pelicula.titulo = rs.getString("titulo");
                pelicula.anno = rs.getInt("anno");
                pelicula.tieneOscar = rs.getBoolean("tieneOscar");
                pelicula.valoracion = rs.getDouble("valoracion");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return pelicula;
    }
    public Actor datosActor(int idActor){
        Actor actor = new Actor();
        try {
            String sql = "SELECT * FROM actores WHERE id = ?;";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,idActor);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                actor.id = rs.getInt("id");
                actor.nombre = rs.getString("nombre");
                actor.fechaNacimiento = rs.getDate("fechaNacimiento").toLocalDate();
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return actor;
    }
    public List<Pelicula> listadoPeliculas(){
        List<Pelicula> listadoPeliculas = new LinkedList<>();
        try {
            String sql = "SELECT * FROM peliculas;";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.id = rs.getInt("id");
                pelicula.titulo = rs.getString("titulo");
                pelicula.anno = rs.getInt("anno");
                pelicula.tieneOscar = rs.getBoolean("tieneOscar");
                pelicula.valoracion = rs.getDouble("valoracion");
                listadoPeliculas.add(pelicula);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listadoPeliculas;
    }
    public List<Actor> listadoActores(){
        List<Actor> listadoActores = new LinkedList<>();
        try {
            String sql = "SELECT * FROM actores;";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Actor actor = new Actor();
                actor.id = rs.getInt("id");
                actor.nombre = rs.getString("nombre");
                actor.fechaNacimiento = rs.getDate("fechaNacimiento").toLocalDate();
                listadoActores.add(actor);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listadoActores;
    }
    List<Pelicula> listadoPeliculasPorActores(int idActor){
        List<Pelicula> listadoPeliculas = new LinkedList<>();
        try {
            String sql = "SELECT peliculas.* FROM peliculas, actores, actoresPeliculas  WHERE actoresPeliculas.idActor = actores.id AND actoresPeliculas.idPelicula = peliculas.id AND actores.id = ?;";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,idActor);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.id = rs.getInt("id");
                pelicula.titulo = rs.getString("titulo");
                pelicula.anno = rs.getInt("anno");
                pelicula.tieneOscar = rs.getBoolean("tieneOscar");
                pelicula.valoracion = rs.getDouble("valoracion");
                listadoPeliculas.add(pelicula);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listadoPeliculas;
    }
    List<ActorPelicula> listadoActoresPorPelicula(int idPelicula){
        List<ActorPelicula> listadoActores = new LinkedList<>();
        try {
            String sql = "SELECT actores.*,principal FROM peliculas, actores, actoresPeliculas  WHERE actoresPeliculas.idActor = actores.id AND actoresPeliculas.idPelicula = peliculas.id AND peliculas.id = ?;";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,idPelicula);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                ActorPelicula actor = new ActorPelicula();
                actor.id = rs.getInt("id");
                actor.nombre = rs.getString("nombre");
                actor.fechaNacimiento = rs.getDate("fechaNacimiento").toLocalDate();
                actor.principal = rs.getBoolean("principal");
                listadoActores.add(actor);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return listadoActores;
    }
}
