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
 * @author Zero
 */

public class Mazo {
  LinkedList<Object> c;
    public Mazo(){
   Object a=new Object();
        
        c.add(a);
        c.add(a);
        c.add(a);
        c.add(a);
        c.add(a);
        c.add(a);
        c.add(a);
        c.add(a);
        c.add(a);
        c.add(a);
        c.add(a);
        c.add(a);
        c.add(a);
        c.add(a);
        
    }
    
    
    
    public Object cogerCarta(LinkedList c){
    c=this.c;
        
        System.out.println("cojo la primera cartas");
        return c.getFirst();
        
      
    }
 
    public Object cogerNCartas(int x,LinkedList c){
    c=this.c;
        if (x>3 || x <1){
    
     System.out.println("Numero inválido");
    
    }else for (int i=0; i<x; i++){
        System.out.println("barajo 1 vez");
        return c.getFirst();
        
      }
      return null;
      
   }
    
    public Object buscaCarta(int x, LinkedList c){
        c=this.c;
    System.out.println("busco carta por numero concreto");
    return c.get(x);
    }
    
    public void introducirCartaAleatoria(Object card, LinkedList c){
    c=this.c;
    
    c.addLast(card);
    Collections.shuffle(c);
   System.out.println("he introducido una carta");
    
    }
    
  public void barajar(LinkedList c){
  c=this.c;
   Collections.shuffle(c);
   System.out.println("barajo");
  
  }
    
    
    public boolean mazoVacio(LinkedList c){
        c=this.c;
    if (c.isEmpty()){
        System.out.println("mazo vacio");
    return true;
    
    
    }
    System.out.println("mazo con cartas");
    return false;
    
    }
    
    
    
    
}
