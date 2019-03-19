package com.company;

public class Alumno {
    private String nombre;
    private int edad;
    private double calificacion;
    public Alumno(String nombre, int edad, double calificacion) throws Exception{
        if(nombre.equals("")||edad>100||edad<17||calificacion<0||calificacion>10){
            throw new Exception("Valores no validos");
        }else {
            this.nombre = nombre;
            this.edad = edad;
            this.calificacion = calificacion;
        }
    }
    public void setNombre(String nombre) throws Exception{
        if(nombre.equals("")){
            throw new Exception("Nombre no valido");
        }else {
            this.nombre = nombre;
        }
    }
    public void setEdad(int edad) throws Exception{
        if(edad<17||edad>100){
            throw new Exception("Nombre no valido");
        }else {
            this.edad = edad;
        }
    }
    public void setCalificacion(double calificacion) throws Exception{
        if(calificacion<0||calificacion>10){
            throw new Exception("Nombre no valido");
        }else {
            this.calificacion = calificacion;
        }
    }
    public String getNombre(){return nombre;}
    public int getEdad(){return edad;}
    public double getCalificacion(){return calificacion;}
    public String toString(){
        return nombre+";"+edad+";"+calificacion;
    }
}
