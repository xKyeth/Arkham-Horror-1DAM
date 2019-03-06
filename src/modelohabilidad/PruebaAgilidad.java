/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;

import BolsaDelCaos.BolsaDelCaos;
import Modelo.RolandBanks;

/**
 *
 * @author cristian
 */
public class PruebaAgilidad extends PruebaHabilidad{
    
    private String nombre; 
    public PruebaAgilidad(int n, RolandBanks inv, Apoyo apoyo, BolsaDelCaos bolsa) {
        super(n, inv, apoyo, bolsa);
        nombre = "Agilidad";
        iniciarPruebaAgilidad(n);
    }

    public void iniciarPruebaAgilidad(int n){
        vista.pruebaHabilidad(n);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void procesarOrden(int a, Object datos) {
        
    }
    
}
