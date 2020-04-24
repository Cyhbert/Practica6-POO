/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;
/**
 *
 * @author bragh
 */
public class PagoConTarjeta extends Pago{
    private String Ntarjeta;
    private double MontoTarjeta = 2500;
    
    public PagoConTarjeta(String Ntarjeta, String nombre, String banco){
        super(nombre, banco);
        this.Ntarjeta = Ntarjeta;
    }
    @Override
    public double pago(double monto){
        double sub = 0, total = 0, iva = 0.13;
        sub = monto * iva;
        total = monto + sub;
        this.MontoTarjeta = MontoTarjeta - monto;
        if (this.MontoTarjeta <= 0){
            JOptionPane.showMessageDialog(null, "No posee saldo en su tarjeta");
        }
        return total;
    }
    public String mensaje(){
        return "Acerquese al banco a pagar la cantidad de: ";
    }
    public String getNtarjeta(){
        return Ntarjeta;
    }
    public void setNtarjeta(String Ntarjeta){
        this.Ntarjeta = Ntarjeta;
    }
}
