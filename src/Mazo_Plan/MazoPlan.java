/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mazo_Plan;

import java.util.LinkedList;
import java.util.Scanner;

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
        private int opcion;
        Scanner sc = new Scanner(System.in); 
            
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

        //Este metodo segun la carta que se seleccione se dara la informacion que hace dicha carta
        public void infoCartasPlan(){
        
            
            System.out.println("¿De que carta desea informacion?");
            System.out.println("¡¿Qué está pasando?! ---> 1");
            System.out.println("El acceso de los gules ---> 2");
            System.out.println("¡Están saliendo! ---> 3");
            System.out.println("¿Depredador o presa? ---> 4");
            System.out.println("El tiempo se agota ---> 5");
            System.out.println("The Arkham Woods ---> 6");
            System.out.println("El ritual comienza ---> 7");
            System.out.println("La venganza espera ---> 8");
            
            opcion = sc.nextInt();
            switch(opcion){
                
                case 1:System.out.println("https://es.arkhamdb.com/card/01105");break;
                case 2:System.out.println("https://es.arkhamdb.com/card/01106");break;
                case 3:System.out.println("https://es.arkhamdb.com/card/01107");break;
                case 4:System.out.println("https://es.arkhamdb.com/card/01121a");break;
                case 5:System.out.println("https://es.arkhamdb.com/card/01122");break;
                case 6:System.out.println("https://es.arkhamdb.com/card/01143");break;
                case 7:System.out.println("https://es.arkhamdb.com/card/01144");break;
                case 8:System.out.println("https://es.arkhamdb.com/card/01145");break;   
                     
            }
 
        }
    
        
        public void cartaPlan1(){
            System.out.println("El investigador jefe debe decidir (elige una opción):"
                    + " \nCada investigador descarta 1 carta al azar de su mano o el"
                    + " \ninvestigador jefe recibe 2 puntos de horror.");
        }
        
        public void cartaPlan2(){
            System.out.println("Añade la pila de descartes de Encuentros al mazo de Encuentros"
                    + "\n y barájalo. Descarta cartas de la parte superior del mazo de Encuentros"
                    + "\n hasta que sea descartado un Enemigo Gul. El investigador jefe roba ese Enemigo.");
        }
        public void cartaPlan3(){
            System.out.println("— Si los investigadores están el acto 1 o 2, "
                    +"\nquedan atrapados en la casa mientras los gules les hacen pedazos. (→R3)"+
                    "\n— Si los investigadores están en el acto 3, apenas logran escapar con vida, "
                    + "\npermitiendo que los gules sean liberados. Cada investigador que no haya "
                    + "\ndesistido queda derrotado y sufre 1 trauma físico.");
        }
        public void cartaPlan4(){
            System.out.println("Aparece Cazador enmascarado,El cazador enmascarado recibe +2 de salud por investigador.\n" 
                    +"Mientras estés enfrentado a El cazador enmascarado, no puedes descubrir ni gastar pistas.");
        }
        public void cartaPlan5(){
            System.out.println("Suenan doce campanadas por toda la ciudad. Es medianoche. No hay más tiempo para investigar la ciudad;"
                    + "\n debéis actuar en base a la información que habéis conseguido de los sectarios encontrados. (→R2)");
        }
        public void cartaPlan6(){
            System.out.println("Baraja la pila de descartes de encuentros en el mazo de encuentros y descarta las cartas"
                    + "\n desde la parte superior hasta que se descarte un enemigo Monstruo."
                    + "\n Engendra a ese enemigo en el Camino Principal. Entonces, coloca 1 destino sobre ese enemigo.");
        }
        public void cartaPlan7(){
            System.out.println("En el orden del jugador, cada investigador debe probar (6). Cada investigador que falla debe"
                    + "\n buscar en su colección una debilidad de Locura básica aleatoria y agregarla a su mano.");
        }
        public void cartaPlan8(){
            System.out.println("Revelation - Replace the current Act and Agenda with The Devourer Below. This card is both the current "
                    + "\nAct and the current Agenda.Objective - If Umôrdhoth is defeated, (→R2)");
        }
        
            
        
    
}
