/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paranoia;

import CartasMito.Traicion;
import Modelo.Investigador;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Paranoia extends Traicion {
    ArrayList<Object> r;
    private boolean preparado=true;
    public Paranoia(){
    super("Paranoia",isPreparado());
   }
       @Override
   public void Accion(Investigador Roland) {
         System.out.println("¿Que ha sido ese ruido?"); 
         
    Roland.setNumeroRecursos(0);
    }

    /**
     * @return the preparado
     */
    public boolean isPreparado() {
        return preparado;
    }

    /**
     * @param preparado the preparado to set
     */
    public void setPreparado(boolean preparado) {
        this.preparado = preparado;
    }

   
    
    
    
}
