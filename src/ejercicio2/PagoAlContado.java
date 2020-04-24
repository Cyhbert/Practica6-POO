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
public class PagoAlContado extends Pago {
    public PagoAlContado(String nombre, String banco){
        super(nombre, banco);
    }
    @Override
    public double pago(double monto){
        double sub = 0, total = 0, iva = 0.13;
        sub = monto * iva;
        total = monto + sub;
        
        return total;
    }
    public String mensaje(){
        return "Acerquese al banco a pagar la cantidad de: ";
    }
}
