package com.company;


import java.sql.*;

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
        String sql = String.format("INSERT INTO canciones(ruta,titulo,idArtista,idEstilo,anno,estrellas) VALUES('%s','%s',%d,%d,%d,%d)",ruta,titulo,idArtista,idEstilo,anno,estrellas );
        int id = -1;
        try {
            Statement st = conn.createStatement();
            st.executeUpdate(sql);
            ResultSet rs = st.executeQuery("SELECT LAST_INSERT_ID();");
            id = rs.getInt(1);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return id;
    }
}
