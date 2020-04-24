/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author bragh
 */
public class Audio extends ArchivoMultimedia{
    private String nombre;
    private String duracion;
    
    public Audio(String nombre, String duracion, String formato, String fecCrea){
     super(formato, fecCrea);
     this.nombre = nombre;
     this.duracion = duracion;
    }
    @Override
    public String reproducir(){
    return "Reproduciendo el archivo " + this.getNombre() ;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getDuracion(){
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
