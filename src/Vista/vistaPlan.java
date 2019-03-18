/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.Cartas.CartasPlan.MazoPlan;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author imanol
 */
public class vistaPlan {
    
         
public void verCartas(ArrayList <MazoPlan> c){
        for(MazoPlan x: c){
            System.out.println("Titulo: "+x.getTitulo());
            System.out.println(x.getTexto());
            System.out.println("Necesario: "+x.getPerdicion());
            System.out.println(x.getAccion());
        }       

    }
 
        
    
       

}
