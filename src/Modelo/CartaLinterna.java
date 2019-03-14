package Modelo;

import CartasInvestigador.Apoyo;
import Lugar.Lugar;
/*@author carlos*/
public class CartaLinterna extends Apoyo{
    //new Carta("Linterna.","Neutral",4," Apoyo. Hand(1) ",0,0,1,0, false, "Objeto. Herramienta.");
    // Usos (3 usos/suministros. Si se queda sin suministros, descarta la carta.
    // Gasta 1 suministro (uso o munición): Investigar. Tu Lugar recibe -2 de velo para esta investigación.
    private int suministros=3;
    RolandBanks investigador;
    
    Lugar lugar; //(se cogerá de la clase Lugar el atributo velo)
        
    /* Implementar el atributo apoyo.Hand? Por ej. int hand=0,1 ó 2. 0=no es objeto de mano.
    1=Ocupa una mano. 2=ocupa las dos manos. Esto para en el tablero controlar el número de objetos
    que el investigador puede tener en su mano.
    */
        
    public CartaLinterna(){
        super("Linterna",false, 0, 0, 1, 0, 0, 0, 0, 0, 2, 3, false);        
    }
    
    @Override
    public void Accion(Investigador investigador){
      this.investigador.setNumeroRecursos(this.investigador.getNumeroRecursos() - 4);

        // Prueba de habilidad para intelecto.
        if(suministros>0){
            lugar.setVelo(lugar.getVelo()-2);
           /* investigador lugar.velo=-2 */
            suministros--;
            }            
        }
   
    @Override
    public void verCarta() {
        System.out.println("Usos (3 suministros).  Si se queda sin suministros, descarta la carta. \n" +
        "\n" + " Gasta 1 suministro: Investigar. Tu Lugar recibe -2 de velo para esta investigación.");
    }
}

