package Modelo;

import CartasInvestigador.Apoyo;

/**
 *
 * @author paula
 */
public class CartaLupa extends Apoyo{
    RolandBanks roland;
    public CartaLupa() {
        super(0, 0, 1, 0, 0, 0, 0, 1, 0, false);
        
    }
    
     public void verCarta(){
         System.out.println("Una lente orientada a un mundo invisible puede revelar cosas que desearías que no hubiera revelado.");
         System.out.println("Buscador\n" +
                            "Apoyo. \n" +
                            "Coste: 1.\n" +
                            "Recibes +1 de intelecto al investigar.\n");

     }
    
    @Override
     public void Accion() {
         //Mientras se esté realizando la acción de investigar 
        roland.setIntelecto(roland.getIntelecto()+1);
    }
    
}