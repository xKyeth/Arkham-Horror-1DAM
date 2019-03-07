package Modelo;

import CartasInvestigador.Apoyo;
import java.util.Scanner;

/**
 *
 * @author paula
 */
public class CartaCuchillo  extends Apoyo{
    Scanner sn=new Scanner(System.in);
    boolean descarte=false;
    RolandBanks roland;

    public CartaCuchillo() {
        super(0, 0, 1, 0, 0, 0, 0, 1, 0, false);
    }
     public void verCarta(){
         System.out.println("Objeto. Arma. Cuerpo a cuerpo.\n" +
          "\n" +
          "Coste: 1.\n" +
          ": Combatir. Recibes +1  para este ataque.\n" +
          "\n" +
          "Descarta el Cuchillo: Combatir. Recibes +2  para este ataque. Este ataque inflige +1 de daño.");
     }
    
    public void Accion(){
        System.out.println("Arma cuerpo a cuerpo");
        System.out.println("Elige una opcion:");
        System.out.println("1-Combatir. Recibes +1 de combate para este ataque");
        System.out.println("2-Descartar el cuchillo. Recibes +2 de combate para este ataque. Este ataque inflige +1 de daño.");
       try{
           int opcion=sn.nextInt();
           switch (opcion){
               case 1:
                   if(descarte==false){
                        roland.setCombate(roland.getCombate()+1);
                        System.out.println("Combate actual: " +roland.getCombate());
                    }
                   
                break;
               case 2: 
                    descarte=true;
                    roland.setCombate(roland.getCombate()+2);
                    System.out.println("Combate actual: " +roland.getCombate());
                    roland.setDaño(roland.getDaño()+1);
                    System.out.println("Daño actual: " +roland.getDaño());
                    break;
                       
           }
           
       }
        
        catch(Exception e){
            System.err.println("Se ha producido un error.Introduzca una opcion valida");
    }
    }
    
}
