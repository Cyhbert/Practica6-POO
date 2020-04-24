/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author bragh
 */
public class Pago {
 public String nombre;
 public String banco;
 
public Pago(String nombre, String banco){
    this.nombre = nombre;
    this.banco = banco;
}
public double pago(double monto){
    return monto;
}
}
