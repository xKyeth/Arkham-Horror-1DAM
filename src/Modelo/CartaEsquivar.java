/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import CartasInvestigador.Evento;

/**
 *
 * @author usuario
 */
public class CartaEsquivar extends Evento{

    public CartaEsquivar(String nombreCarta, boolean preparada, int fichaPerdicion, int voluntad, int intelecto, int habilidad, int combate, int comodin, int coste) {
        super(nombreCarta, preparada, fichaPerdicion, voluntad, intelecto, habilidad, combate, comodin, coste);
    }

    @Override
    public void verCarta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Accion(Investigador investigador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
   

  
    
    
}
