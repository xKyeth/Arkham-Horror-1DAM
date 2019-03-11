/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import CartasInvestigador.Apoyo;

/**
 *
 * @author Cristian
 */
public class CartaViejoLibroDeConocimiento extends Apoyo{
    
    RolandBanks roland;

    
    public CartaViejoLibroDeConocimiento(){
        super(1, 0, 0, 0, 0, 0, 0, 3, 0, false);
    }
    
    @Override
    public void Accion(){
        System.out.println("Agota el Viejo libro de conocimiento: Elige un investigador "
                + "que esté en tu Lugar. Ese investigador busca 1 carta entre las 3 primeras "
                + "cartas de su mazo, la roba, devuelve las cartas restantes a su mazo y lo baraja.");
        
    }

    @Override
    public void verCarta() {
    
    }
    
    //MÉTODO RESTABLECER
}
