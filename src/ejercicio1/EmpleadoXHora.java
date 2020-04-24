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
public class EmpleadoXHora extends Empleado{
    private int hora;
    public EmpleadoXHora(int hora, String nombre, int edad, String dui){
        super(nombre, edad, dui);
        this.hora = hora;
    }
    @Override
     public String saludo(){
        return "Hola soy empleado de esta empresa por horas y he trabajado: "+ this.getHora();
    }
    public static String saludoStatic(){
        return "Hola soy empleado de esta empresa por horas";
    }
    public int getHora(){
        return hora;
    }
    public void setHora(int hora){
        this.hora = hora;
    }
}
