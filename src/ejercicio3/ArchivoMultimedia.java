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
public class ArchivoMultimedia {
    private String formato;
    private String fecCrea;
    
    public ArchivoMultimedia (String formato, String fecCrea){
        this.formato = formato;
        this.fecCrea = fecCrea;
    }
    
    public String reproducir(){
        return "Reproduciendo archivo multimedia";
    }
    public String getFormato(){
        return formato;
    }
     public void setFormato(String formato) {
        this.formato = formato;
    }
     public String getFecCrea() {
        return fecCrea;
     }
     public void setFecCrea(String fecCrea) {
        this.fecCrea = fecCrea;
    }
}
