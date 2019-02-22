/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;


import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author Jose
 */

public class Mazo {

  private LinkedList<Carta> c;
  
  
    public Mazo(){
    this.c = new LinkedList();
    }
    
    
    
    public Carta cogerCarta(){
   
        
        System.out.println("cojo la primera cartas");
        return getC().getFirst();
        
      
    }
 
    public Carta cogerNCartas(int x){
  
        if (x>3 || x <1){
    
     System.out.println("Numero inválido");
    
    }else for (int i=0; i<x; i++){
        System.out.println("cojo una carta");
        return getC().getFirst();
        
      }
      return null;
      
   }
    
    public Carta buscaCarta(int x){
       
    System.out.println("busco carta por numero concreto");
    return getC().get(x);
    }
    
    public void introducirCartaAleatoria(Carta card){
  
    
        getC().addLast(card);
    Collections.shuffle(getC());
   System.out.println("he introducido una carta");
    
    }
    
  public void barajar(){

   Collections.shuffle(getC());
   System.out.println("barajo");
  
  }
    
    
    public boolean mazoVacio(){
       
    if (getC().isEmpty()){
        System.out.println("mazo vacio");
    return true;
    
    
    }
    System.out.println("mazo con cartas");
    return false;
    
    }
    
    
    /**
     * @return the c
     */
    public LinkedList<Carta> getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(LinkedList<Carta> c) {
        this.c = c;
    }
    
    
    
    
}

