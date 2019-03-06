/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Investigador;
import Modelo.Personaje;
import java.util.ArrayList;

import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class MovimientoCazador {
    LinkedList Cola=new LinkedList();
    ArrayList usados=new ArrayList();
ArrayList<Investigador> personajes= new ArrayList();    
    
    public MovimientoCazador(ArrayList p){
        personajes=p;
    
    
    
    
    }
    
    public void Moverse(Personaje e, int[][] l){
    
        
            ExpandirNodo(e.getLugar().getId(), l)
       
        
        for (int i = 0; i < personajes.size(); i++) {
            
            if (Cola.peekFirst()==personajes.get(i).getLugar().getId()){
            //poner lugar del monstruo
            
            }else
                 ExpandirNodo(Cola.getFirst(), l)
                
               
            
            }
     
        
        
        
        
        
        
        
        
        
        
        }
        

    
    
    
    
    
    
    
    
    public void expandirNodo(int i, int[][] l){
    
        for (int j = i; j < l.length; j++) {
            if (l[i][j]==1){
            Cola.addLast(l[i][j]);
            usados.add(i);
            
            }
            
 
            
        }
    
    
    
    
    
    }
    
    
    
    
    
    
}
