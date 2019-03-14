package Modelo;

import CartasInvestigador.Apoyo;
import java.util.Scanner;

/** @author carlos */
public class CartaAutomaticaDel45 extends Apoyo{
    //new Carta("Automatica Del 45. "Guardián",4,"Apoyo. Hand(1). Objeto. Arma. Arma de fuego.");
    // Usos (4 suministros (municiones más específico). Si se queda sin suministros, descarta la carta.
    // Gasta 1 suministro (uso o munición): Combatir. Recibe +1 de combate para este ataque. Este ataque inflige +1 de daño.
    private int suministros=4;
    Investigador investigador;
    Enemigo enemigo;
    /* Implementar el atributo apoyo.Hand? Por ej. int hand=0,1 ó 2. 0=no es objeto de mano.
    1=Ocupa una mano. 2=ocupa las dos manos. Esto para en el tablero controlar el número de objetos
    que el investigador puede tener en su mano.
    */
    
    Scanner sc = new Scanner(System.in);
    
    public CartaAutomaticaDel45(){
      super("Automatica de 45",false,0, 0, 0, 0, 1, 0, 0, 0, 4, 4, false);        
    }
    
    @Override
    public void Accion(Investigador investigador){
      this.investigador.setNumeroRecursos(this.investigador.getNumeroRecursos() - 4);
        // Prueba de habilidad para combatir al enemigo. 
        if(suministros>0){
            this.investigador.combate=+1;
            suministros--;
            enemigo.vida--; //Inflige +1 daño (-1 de vida) al enemigo.
            }            
        }   

    @Override
    public void verCarta() {
        System.out.println("Usos (4 suministros).  Si se queda sin suministros, descarta la carta. \n" +
        "\n" + " Gasta 1 suministro: Combatir. Recibe +1 de combate para este ataque. Este ataque inflige +1 de daño.");
    }
}
