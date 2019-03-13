/*  Primer escenario de la partida
 *  -X. X es la cantidad de Enemigos Gul que hay en tu Lugar.
 *  -1. Si fracasas, recibe 1 punto de horror.
 *  -2. Si hay un enemigo Gul en tu Lugar, recibe 1 punto de daño.
 *  El escenario hace que avance plan y que avance mito
 *  Reunir las cartas : Ratas, Gules, Miedo Impactante, Antiguos males, Frío Helador
 *  Poner en juego el lugar Estudio.
 *  Apartar las cartas Sacerdote Gul y Lita Chantler.
 *  Barajar el resto de las cartas de Encuentro.
 */
package Escenarios;

import Mazo_Plan.MazoPlan;
import Modelo.Cartas.*;
import Modelo.RolandBanks;
import Vista.vistaPlan;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Jesus Rosa
 */
public class Escenario {
            
            vistaPlan vp;
            MazoEncuentros m;
    public void introEscenario(){
     System.out.println("Tus compañeros y tú habéis estado investigando los extraños sucesos que "
             + "\n están teniendo lugar en vuestra ciudad natal de Arkham, en Massachussets. Durante "
             + "\n las últimas semanas, varios habitantes de la ciudad han desaparecido misteriosamente."
             + "\n Y hace poco aparecieron sus cadáveres en el bosque, medio devorados y salvajemente mutilados."
             + "\n La  policía y los periódicos han dicho que ha sido obra de animales, pero creéis que hay algo"
             + "\n más en marcha. Os habéis reunido en casa del investigador jefe para deliberar sobre estos "
             + "\n misteriosos acontecimientos.");
     
     
     
    }
    
    // Poner en juego el lugar Estudio
    
        public void PonerJuego(){
        // hacer un for en el que cojera todo un linked list de x cartas y las mostrara por SOUT
       
        
        switch(1) {
            case 1:
              vp.cartaPlan1();
              break;
            case 2:
              vp.cartaPlan2();
              break;
            case 3:
              vp.cartaPlan3();
              break;
            case 4:
              vp.cartaPlan4();
              break;
            case 5:
              vp.cartaPlan5();
              break;
            case 6:
              vp.cartaPlan6();
              break;
            case 7:
              vp.cartaPlan7();
              break;
            case 8:
              vp.cartaPlan8();
              break;
            default:
               //code block
          }
       
        
        }
    // Barajar el resto de las cartas de Encuentro.
    
        public void barajarCartas(){
            m.barajar();
            System.out.println("El Mazo ha sido barajado");
        }
            
    
    // El escenario hace que avance plan y que avance mito
    
        //Hacer un for para recorrer un arraylist de forma aleatoria, y los datos que
        // saquemos de el lo añadiriamos a otro arraylist el cual comparariamos con el primero
        // para saber que datos ya hemos sacado y cuales no (mediante un if) si se repiten
        // sacariamos otro dato mediante un random,.
    
    // Reunir las cartas : Ratas, Gules, Miedo Impactante, Antiguos males, Frío Helador
    
        
    
    // Apartar las cartas Sacerdote Gul y Lita Chantler.
    
        
    
    // Si hay un enemigo Gul en tu Lugar, recibe 1 punto de daño.
    
        
    
    // Si fracasas, recibe 1 punto de horror.
        public void resultado(){
        int victoria=1;
        if (victoria==1){
            System.out.println("Enhorabuena has completado el eccenario satisfactoriamente");
                }else{
            System.out.println("Lo siento, has fracasado. Se sumará un punto de horror");
            RolandBanks personaje = new RolandBanks();
        }
}
}
