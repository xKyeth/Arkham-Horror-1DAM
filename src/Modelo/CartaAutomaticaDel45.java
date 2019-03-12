package Modelo;

import CartasInvestigador.Apoyo;
import java.util.Scanner;

/** @author carlos */
public class CartaAutomaticaDel45 extends Apoyo{
    //new Carta("Automatica Del 45.","Guardián",4,"Apoyo. Hand(1)",0 (1 si se usa),0,0,1, false, "Objeto. Arma. Arma de fuego.");
    // Usos (4 suministros (municiones más específico). Si se queda sin suministros, descarta la carta.
    // Gasta 1 suministro (uso o munición): Combatir. Recibe +1 de combate para este ataque. Este ataque inflige +1 de daño.
    private int suministros=4;
    RolandBanks roland;
    Enemigo enemigo;
    /* Implementar el atributo apoyo.Hand? Por ej. int hand=0,1 ó 2. 0=no es objeto de mano.
    1=Ocupa una mano. 2=ocupa las dos manos. Esto para en el tablero controlar el número de objetos
    que el investigador puede tener en su mano.
    */
    
    Scanner sc = new Scanner(System.in);
    
    public CartaAutomaticaDel45(){
      super(1, 0, 0, 0, 0, 0, 0, 4, 4, false);        
    }
    
    @Override
    public void Accion(){
      roland.setNumeroRecursos(roland.getNumeroRecursos() - 4);
        // Prueba de habilidad para combatir al enemigo. 
        if(suministros>0){
            roland.combate=+1; /* roland.vida porque solo vamos a jugar 
                    con un investigador, Roland. Si jugáramos con dos sería investigador.vida */
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
