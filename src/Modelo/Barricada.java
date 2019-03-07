/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import CartasInvestigador.Evento;
import Lugar.Lugar;

/**
 *
 * @author imanol
 */
public abstract class Barricada extends Evento {
    
    Lugar l;
    String barricada;
    boolean puesta = false;
    
    public Barricada(){
        super(1,1,1,0,0,0);
    }
    
    public void usarCarta(String lugar){
        
        barricada = lugar;
        puesta=true;
        while(puesta=true){
            //los enemigos no pueden entrar al lugar
            if(barricada != lugar){puesta=false;}
            
        }
        
        
         
        
    }
    
    
    //Los enemigos que no sean elite no pueden entrar al lugar
    //Cuando el personaje deje el lugar la barricada desaparece
    
    
    
}
