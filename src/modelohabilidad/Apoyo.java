/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;

import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class Apoyo {
    
    ArrayList<Apoyo> apoyos;
    
    private int voluntad;
    private int intelecto;
    private int combate;
    private int agilidad;
    
    public Apoyo(int voluntad, int agilidad, int intelecto, int combate){
        this.voluntad=voluntad;
        this.intelecto=intelecto;
        this.combate=combate;
        this.agilidad=agilidad;
    }

    /**
     * @return the voluntad
     */
    public int getVoluntad() {
        return voluntad;
    }

    /**
     * @param voluntad the voluntad to set
     */
    public void setVoluntad(int voluntad) {
        this.voluntad = voluntad;
    }

    /**
     * @return the intelecto
     */
    public int getIntelecto() {
        return intelecto;
    }

    /**
     * @param intelecto the intelecto to set
     */
    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
    }

    /**
     * @return the combate
     */
    public int getCombate() {
        return combate;
    }

    /**
     * @param combate the combate to set
     */
    public void setCombate(int combate) {
        this.combate = combate;
    }

    /**
     * @return the agilidad
     */
    public int getAgilidad() {
        return agilidad;
    }

    /**
     * @param agilidad the agilidad to set
     */
    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

  
    
}
