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
            
            opcion = sc.nextInt();
            switch(opcion){
                
                case 1:System.out.println("https://es.arkhamdb.com/card/01105");break;
                case 2:System.out.println("https://es.arkhamdb.com/card/01106");break;
                case 3:System.out.println("https://es.arkhamdb.com/card/01107");break;
  
                     
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

}
