/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paranoia;

import CartasMito.Traicion;
import Modelo.Investigador;
import Modelo.RolandBanks;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Paranoia extends Traicion {
    
   
    public Paranoia(){
    super("Paranoia",false);
   }
      
   public void Accion(Investigador R) {
         System.out.println("¿Que ha sido ese ruido?"); 
         
    R.setNumeroRecursos(0);
    }

    /**
     * @return the preparado
     */
  

   
    
    
    
}
