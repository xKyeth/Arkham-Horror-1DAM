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
boolean encontrado=false;
    
    public MovimientoCazador(ArrayList p){
        personajes=p;
    
    
    
    
    }
    
    public void Moverse(Personaje e, boolean[][] l){
    
        //Siempre que no lo encuentre va a seguir buscando
        while (encontrado=false){
        //recorre un array de personajes para ver si en algun nodo hay algun personaje
        for (int i = 0; i < personajes.size(); i++) {
           //pregunta si está aquí
             if(Integer.parseInt(Cola.peekFirst().toString())==personajes.get(i).getLugar().getId()){
                 encontrado=true;
            System.out.println("Lo has encontrado");
       
            
            
        
        }else
        
        //expando
        expandirNodo(   Integer.parseInt(Cola.getFirst().toString())   , l);
        
        //remuevo el primer item
        
        Cola.removeFirst();  
            
            }
     
        }
        
        
        
        
        
        
        
        
        
        
        
        
        }
        

    
    
    
    
    
    
    
    
    public void expandirNodo(int i, boolean[][] l){
    
        
//Recorre la matriz de adyacencia        
        for (int j = i; j < l.length; j++) {
            
           //si el punto donde está es verdad sigue 
            if (l[i][j]=true){
                
                //recorre los lugares usados, si no estuvo en ellos entonces lo mete en la cola 
                for (int k = 0; k < usados.size(); k++) {
                    if (k!=j){
                        
                        
                     Cola.addLast(l[i][j]);
            usados.add(i);
                    
                    
                    }
                    
                }
           
            
            }
            
 
            
        }
    
    
    
    
    
    }
    
    
    
    
    
    
}