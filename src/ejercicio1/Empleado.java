/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author bragh
 */
public class Empleado {
    private String nombre;
    private int edad;
    private String dui;
    
    public Empleado(String nombre, int edad, String dui){
        this.nombre = nombre;
        this.edad = edad;
        this.dui = dui;
    }
    public String saludo(){
        return "Hola soy empleado de esta empresa";
    }
    public static String saludoStatic(){
        return "Hola soy empleado de esta empresa (metodo de clase)";
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getDui(){
        return dui;
    }
    public void setDui(String dui){
        this.dui = dui;
    }
}
