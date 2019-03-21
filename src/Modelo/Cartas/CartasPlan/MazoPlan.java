/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasPlan;
import java.util.ArrayList;


/**
 *
 * @author Imanol
 */
public  class MazoPlan extends CartaPlan {
    
    ArrayList<MazoPlan> mazoPlan = new ArrayList<>();
    
    
    public MazoPlan(String nombre){
        
    }
    
    
    public void CartasPlan(){
       
       mazoPlan.add(new MazoPlan("QueEstaPasando") {});
       mazoPlan.add(new MazoPlan("El asceso de los gules") {});
       mazoPlan.add(new MazoPlan("¡Están saliendo!") {}); 
       
   }
    
    
}
