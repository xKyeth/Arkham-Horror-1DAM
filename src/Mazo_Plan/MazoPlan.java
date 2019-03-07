/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mazo_Plan;

import java.util.LinkedList;

/**
 *
 * @author imanol
 */
public class MazoPlan {
    /*
                    INSTRUCCIONES DEL MAZO DEL PLAN
    
    -El mazo del plan representa el avance de los malos
    -Si se invoca una resolucion(generalmente mas siniestra)los jugadores pierden el escenario
    -Para ver como acaba la resolucion leer la seccion "No leas esto hasta el final del escenario"
    -Si se esta jugando una campaña se pasa al siguiente escenario con las consecuencias negativas
    de haber fallado la resolucion
    -El mazo avanza si hay una cantidad sufienciente de "perdicion", las cartas del plan cuestan perdicion  
    sí el plan tiene una instruccion objetivo anula el req. de perdicion o añade req. adiccionales
    -Para avanzar el mazo del plan: 
        1-retirar toda la perdicion de las cartas que haya en juego
        2-Dar la vuelta a la carta que se esta haciendo avanzar y seguir sus instrucciones
        3-Cuando se elije nueva carta de plan se descarta la que esta en juego    
    */
        //Declaracion de varibales
            
        //Lista donde se guardan las cartas del plan
        LinkedList<CartaPlan> cartasPlan = new LinkedList<>();
        

        
        //Este metodo añade las cartas del plan a las listas.
        public void añadirCartasPlan(){
            
            cartasPlan.add(new CartaPlan("¡¿Qué está pasando?!"));
            cartasPlan.add(new CartaPlan("El acceso de los gules"));
            cartasPlan.add(new CartaPlan("¡Están saliendo!"));


    }

      public LinkedList<CartaPlan> recorrerCartasPlan(){ 
         return cartasPlan; 
      }
        
            
        
    
}
