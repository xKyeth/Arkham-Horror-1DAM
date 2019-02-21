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
        LinkedList<CartaPlan1> cartasPlan1 = new LinkedList<>();
        LinkedList<CartaPlan2> cartasPlan2 = new LinkedList<>();
        LinkedList<CartaPlan3> cartasPlan3 = new LinkedList<>();
        LinkedList<CartaPlan4> cartasPlan4 = new LinkedList<>();
        LinkedList<CartaPlan5> cartasPlan5 = new LinkedList<>();
        LinkedList<CartaPlan6> cartasPlan6 = new LinkedList<>();
        LinkedList<CartaPlan7> cartasPlan7 = new LinkedList<>();
        LinkedList<CartaPlan8> cartasPlan8 = new LinkedList<>();
        
        //Este metodo añade las cartas del plan a las listas.
        public void añadirCartasPlan(){
            
            cartasPlan1.add(new CartaPlan1("¡¿Qué está pasando?!"));
            cartasPlan2.add(new CartaPlan2("El acceso de los gules"));
            cartasPlan3.add(new CartaPlan3("¡Están saliendo!"));
            cartasPlan4.add(new CartaPlan4("¿Depredador o presa?"));
            cartasPlan5.add(new CartaPlan5("El tiempo se agota"));
            cartasPlan6.add(new CartaPlan6("The Arkham Woods"));
            cartasPlan7.add(new CartaPlan7("El ritual comienza"));
            cartasPlan8.add(new CartaPlan8("La venganza espera"));

    }

       
        
            
        
    
}
