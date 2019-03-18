/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasPlan;

import Modelo.Cartas.MazoEncuentros;

/**
 *
 * @author Imanol
 */
public abstract class ElAccesoDeLosGules extends CartaPlan {
 
    
    
    
    CartaPlan cp;
    MazoEncuentros me;
    
    
    public ElAccesoDeLosGules(){
         
        cp.setTitulo("ElAccesoDeLosGules");
        
        cp.setTexto("El suelo cede bajo vuestros pies, y veis una vasta red de "
                + "túneles que se extiende en la oscuridad del subsuelo. Hay formas"
                + " y siluetas de extrañas criaturas que se mueven velozmente "
                + "por los corredores, tratando de encontrar la forma de subir."
                + " Es probable que no queráis estar aquí cuando lo hagan…");
        
        cp.setAccion("Una bestia salvaje con burdos rasgos humanoides,"
                + " un rostro canino y pezuñas por pies atraviesa el suelo que "
                + "tenéis delante. Bajo éste, veis vastos túneles bajo tu casa."
                + " Un aullido infernal resuena en las profundidades de las cavernas subterráneas.");
        
        
        cp.setPerdicion(7);
   
     }
    
    
     public void usarCarta(){
        if( cp.getPerdicionEnJuego() >= cp.getPerdicion()){
            
            //Juntar la pila de descartes del Mazo de encuentro con el mazo de encuentro
            me.barajar();
            
            //if(me.cogerCarta()=enemigo tipo gul){
            
            //El investigador roba dicha carta enemigo
        //}
        
        cp.setPerdicionEnJuego(cp.getPerdicionEnJuego()-7);
        
        }
     }
}
