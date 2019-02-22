/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paranoia;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Paranoia {
    ArrayList<Object> r;
    public Paranoia(){
    
   }
    
    public ArrayList<Object> Paranoia(ArrayList<Object> recurso){
        
    this.r=recurso;
    r.removeAll(r);
    return r;
    }
    
    
    
}
