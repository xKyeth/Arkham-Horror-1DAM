/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;

/**
 *
 * @author cristian
 */
public class CartaHabilidad {
    
    private String tipo;
    private int dificultad;
    
    public CartaHabilidad(String tipo, int dificultad){
        this.tipo = tipo;
        this.dificultad = dificultad;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the dificultad
     */
    public int getDificultad() {
        return dificultad;
    }

    /**
     * @param dificultad the dificultad to set
     */
    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    
    
    
}
