package Modelo.Cartas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CartasMito.Traicion;
import Controlador.Fase;
import Modelo.Investigador;
import Modelo.RolandBanks;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class Paranoia extends Traicion {
    
   
    public Paranoia(Fase fase){
    super(fase, "Paranoia",false,0);
   }
      
    @Override
   public void Accion(Investigador R) {
         System.out.println("¿Que ha sido ese ruido?"); 
         
    R.setNumeroRecursos(0);
    }


    @Override
    public void verCarta() {
        System.out.println("Pierdes todos tus recursos");
    }

    /**
     * @return the preparado
     */
  

   
    
    
    
}
