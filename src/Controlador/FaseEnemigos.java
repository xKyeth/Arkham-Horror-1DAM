/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Personaje;
import modelohabilidad.PruebaCombate;

/**
 *
 * @author usuario
 */
public class FaseEnemigos extends Fase{
      FaseMantenimiento Mantenimiento=new FaseMantenimiento();
       public  FaseEnemigos(){};
    
    
     public   FaseMantenimiento RealizaFaseEnemigos(){
         
          //Mover a monstruos Cazador
        MovimientoCazador MovimientoCazador= new MovimientoCazador();
       
        
      
       MovimientoCazador.moverseMapa1(x);
        
        
        
        //Enemigo ataca 
        
         PruebaCombate PC=new PruebaCombate();
         PC.iniciarPruebaCombate(0);
        
         
         
         
         
         
         
         return Mantenimiento;
}
    
    
    
}
