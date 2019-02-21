/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.util.Scanner;
/**
 *
 * @author imanol
 */
public class vistaPlan {
    
     //Este metodo segun la carta que se seleccione se dara la informacion que hace dicha carta
         
       Scanner sc = new Scanner(System.in);
       private int opcion;

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
    
        //Metodos para usar las cartas(lo que hace es mostrar por pantalla que hace dicha carta)
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
