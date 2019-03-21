/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import modelohabilidad.PruebaCombate;

/**
 *
 * @author jose
 */
public class FaseEnemigos extends Fase{
      FaseMantenimiento Mantenimiento=new FaseMantenimiento();
      
      PruebaCombate pruebaCombate=new PruebaCombate();
       public  FaseEnemigos(){};
    
    
     public FaseMantenimiento RealizaFaseEnemigos(){
         
          //Mover a monstruos Cazador
        MovimientoCazador MovimientoCazador= new MovimientoCazador();
       
        
      MovimientoCazador.moverseMapa1(getEnemigos(), getRoland());
      
        
        
        
        //Enemigo ataca 
        
         for (int i = 0; i < getEnemigos().size(); i++) {
             if (getEnemigos().get(i).getLugar()==getRoland().getLugar()){
               pruebaCombate.enfrenta(getEnemigos().get(i),getRoland(), getApoyo(), getBolsaDelCaos().BolsaDelCaos());
             
             }
             
             
            
             
         }
       
        
         
         
         return Mantenimiento;
         
         
}
    
    
    
}
