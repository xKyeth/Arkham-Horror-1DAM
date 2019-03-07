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
        super(0, 2, 0, 0, 0, 0, 0, 2, 0, false);
    }
    
    public void usarCarta(Investigador inv){
        inv.setNumeroPistas(inv.getNumeroPistas()+1);
    }
    
}
