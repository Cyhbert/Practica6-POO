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
public class EmpleadoXComision extends Empleado{
    private double cantiVent;
    public EmpleadoXComision(double cantiVent, String nombre, int edad, String dui){
        super(nombre, edad, dui);
        this.cantiVent = cantiVent;
    }
    @Override
     public String saludo(){
        return "Hola soy empleado de esta empresa por comision y la cantidad de ventas que realice son: "+ this.getCantiVent();
    }
    public static String saludoStatic(){
        return "Hola soy empleado de esta empresa por comision";
    }
    public double getCantiVent(){
        return cantiVent;
    }
    public void setCantiVent(double cantiVent){
        this.cantiVent = cantiVent;
    }
}
