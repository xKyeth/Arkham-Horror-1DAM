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
 * @author jose
 */
public class FaseEnemigos extends Fase{
      FaseMantenimiento Mantenimiento=new FaseMantenimiento();
      
      PruebaCombate pruebaCombate=new PruebaCombate(Roland, Apoyo, BolsaDelCaos);
       public  FaseEnemigos(){};
    
    
     public FaseMantenimiento RealizaFaseEnemigos(){
         
          //Mover a monstruos Cazador
        MovimientoCazador MovimientoCazador= new MovimientoCazador();
       
        
      MovimientoCazador.moverseMapa1("arrayEnemgios ");
      
        
        
        
        //Enemigo ataca 
        
         for (int i = 0; i < "arrayEnemigos.size"; i++) {
             if (arrayenemigo.get(i).getLugar=Roland.getLugar()){
               pruebaCombate.combate("array de enemigos".get(i));
             
             }
             
             
            
             
         }
       
        
         
         
         return Mantenimiento;
         
         
}
    
    
    
}
