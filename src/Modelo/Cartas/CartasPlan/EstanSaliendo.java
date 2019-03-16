/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasPlan;

import Modelo.Cartas.Cartas_Acto.Carta_Acto;

/**
 *
 * @author Imanol
 */
public abstract class EstanSaliendo extends CartaPlan {
    
    Carta_Acto ca;
    CartaPlan cp;
    
    
    //Preguntar en clase como saber en que acto te encuentras, preguntar 
    //sobre el enemigo goul, como saber cuantos enemigos goul hay, saber que sitio
    //es el pasillo o la salita y como saber cuandop termina la ronda.
    
    
    public void pasivaCarta(){
        
        //Al final de la fase enemigos los GUL se mueven 1 lugar hacia el investigador
        //Al final de cada ronda se suma 1 ficha de perdicion por cada GUL que haya en el pasillo o salita
        
        
    }
    
    
    public void usarCarta(){
        
        
        
        if(ca.getTitulo()=="Atrapados" || ca.getTitulo()=="La barrera"){
            
            //GameOver
            
            
        }else{
            
            //+1 Trauma fisico
            
        }
        
        
    }
    
    
}
