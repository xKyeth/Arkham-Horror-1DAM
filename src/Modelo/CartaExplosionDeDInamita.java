/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Lugar.Lugar;
import Lugar.Lugares;
import Vista.Vista;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class CartaExplosionDeDInamita extends CartasInvestigador.Evento{
    Vista mensaje=new Vista();
    public CartaExplosionDeDInamita(int fichaPerdicion) {
        super("Explosion De Dinamita", true, fichaPerdicion, 1, 0, 0, 0, 0, 5);
    }
    public void usarCarta(RolandBanks investigador,ArrayList<Enemigo> enemigos){
       mensaje.muestraMensaje("Una poderosa explosion de dinamita detona la sala arrasando a todos a su paso.");
        for(Enemigo elem: enemigos){
            elem.setVida(elem.getVida()-3);
        }
        investigador.setVida(investigador.getVida()-3);
        
    }

    @Override
    public void verCarta() {
        mensaje.muestraMensaje("Explosion de dinamita "
                + " elige un lugar conectado: "
                + "Hace 3 puntos de daño a cada investigador y monstruo que se encuentre en el lugar elegido");
    }

    @Override
    public void Accion(Investigador investigador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
