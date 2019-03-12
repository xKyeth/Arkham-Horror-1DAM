/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import CartasInvestigador.Apoyo;

/**
 *
 * @author pecorte
 */
public class CartaSiguiendoUnaCorazonda extends Apoyo {
    
    public CartaSiguiendoUnaCorazonda() {
        super("Siguiendo una Corazonada",false,0, 2, 0, 0, 0, 0, 0, 2, 0, false);
    }
    
    public void usarCarta(Investigador inv){
        inv.setNumeroPistas(inv.getNumeroPistas()+1);
    }

    @Override
    public void verCarta() {
        System.out.println("Rápido. Juega esta carta sólo durante tu turno.\n" +
                            "\n" +
                            "Descubre 1 pista en tu Lugar.");
    }

    @Override
    public void Accion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
