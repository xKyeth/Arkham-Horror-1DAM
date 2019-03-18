/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas;


import CartasInvestigador.Carta;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Jose
 */

public class MazoEncuentros {

  private LinkedList<Carta> c;
  
  
    public MazoEncuentros(){
    this.c = new LinkedList();
    }
    
    
    
    public Carta cogerCarta(){
   
        
        System.out.println("cojo la primera carta");
        return getC().getFirst();
        
      
    }
 
    public Carta cogerNCartas(int x){
  
       
      
      
        try {
             if (x>3 || x <1){
    
     System.out.println("Numero inválido");
    
    }else for (int i=0; i<x; i++){
        System.out.println("cojo una carta");
        return getC().getFirst();
        
      }
      
        } catch (Exception e) {
            
            System.out.println("Introduce un número por favor");
           
            
        }
      return null;
      
      
   }
    
    public Carta buscaCarta(int x){
       
    
    
        for (int i = 0; i < getC().size(); i++) {
            getC().get(i).getNombreCarta();
          
        }
        Scanner sc=new Scanner(System.in);
          String nombre= sc.next();
          
            for (int i = 0; i < getC().size(); i++) {
            if (getC().get(i).getNombreCarta().equals(nombre)){
            return getC().get(i);
            }else System.out.println("Esa carta no existe");
         
        }
      return null;
          
          
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

