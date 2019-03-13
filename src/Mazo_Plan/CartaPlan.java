/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo_Plan;
import CartasInvestigador.Carta;
import Modelo.PruebasCombate;



/**
 *
 * @author Imanol G
 */
public abstract class CartaPlan {
    
    String titulo;
    String texto;
    String accion;
    int perdicion;
    
    
    
    
    

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return the accion
     */
    public String getAccion() {
        return accion;
    }

    /**
     * @param accion the accion to set
     */
    public void setAccion(String accion) {
        this.accion = accion;
    }

    /**
     * @return the perdicion
     */
    public int getPerdicion() {
        return perdicion;
    }

    /**
     * @param perdicion the perdicion to set
     */
    public void setPerdicion(int perdicion) {
        this.perdicion = perdicion;
    }
   
   
    
   
    
    
}
    
    

