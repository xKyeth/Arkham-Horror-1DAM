/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mazo_Plan;
import Modelo.RolandBanks;
import java.util.Scanner;
import ClaseMano.uso_descarte_cartas;
import java.util.Random;

/**
 *
 * @author Imanol
 */
public abstract class QueEstaPasando extends CartaPlan {
    private int opcion;
    private int aleatorio;
    Scanner sc = new Scanner(System.in);
    RolandBanks rb = new RolandBanks();
    uso_descarte_cartas des = new uso_descarte_cartas();
    Random r = new Random();
    CartaPlan cp;
    public QueEstaPasando(){
         
        cp.setTitulo("QueEstaPasando");
        
        cp.setTexto("La noche está muy avanzada. Estáis metidos en tu estudio, investigando "
                + "las sangrientas desapariciones que han estado teniendo lugar en la "
                + "región. Tras varias horas de investigación, oís un extraño cántico"
                + " proveniente de la salita que hay al final del pasillo. Al mismo "
                + "tiempo, se oye un movimiento de tierra, como si algo estuviera cavando bajo el suelo");
        
        cp.setAccion("Tu casa sigue cambiando ante tus ojos. Las paredes se descomponen,"
                + " y el suelo de muchas habitaciones se ha convertido en tierra. "
                + "Es casi como si os hubieran transportado a un lugar totalmente"
                + " distinto, aunque aquí y allí reconocéis elementos de tu antigua casa.");
        
        
        cp.setPerdicion(3);
   
     }
     
     public void usarCarta(){
         
         //Si la perdicion que hay es mayor o igual al valor de la carta, se usara         
         //Hace falta la perdicion que hay en juego para compararla con la carta
         if( cp.getPerdicionEnJuego() >= cp.getPerdicion()){
         System.out.println("Elija opcion");
         System.out.println("Cada investigador descarta una carta aleatoriamente");
         System.out.println("El investigador jefe recibe 2 puntos de horror");
         opcion = sc.nextInt();
         switch(opcion){
             
             case 1:
                 aleatorio = r.nextInt(des.numeroCartasMano())+1;
                 des.decartarCarta(aleatorio);break;
             case 2:rb.setHorror(rb.getHorror()+2);break;
             
             
             
         }
         
         
         
        }
         
         
     }
    
    
    
    
    
}
