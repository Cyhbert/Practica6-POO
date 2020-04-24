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
public class EmpleadoAsalariado extends Empleado {
    private double salario;
    public EmpleadoAsalariado(double salario, String nombre, int edad, String dui){
        super(nombre, edad, dui);
        this.salario = salario;
    }
    @Override
     public String saludo(){
        return "Hola soy empleado asalariado y mi sueldo es de: "+ this.getSalario();
    }
    public static String saludoStatic(){
        return "Hola soy empleado asalariado de esta empresa" ;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
}
