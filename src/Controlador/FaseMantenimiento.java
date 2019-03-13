/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author usuario
 */
public class FaseMantenimiento extends Fase {
    FaseMito Mito=new FaseMito();
    
               public  FaseMantenimiento(){};
    
    
     public   FaseMito RealizaFaseMantenimiento(){
         
           //Prepara todas las cartas agotadas
        
        //robar una carta y obtiene un recurso
        UsoDeCartasInvestigador.robarCarta();
        Roland.setNumeroRecursos(Roland.getNumeroRecursos()+1);
        //si hay mas de 8 cartas elige y descarta 
        UsoDeCartasInvestigador.descartar8Cartas();
         
         
         
         
         
         
         
         
         
         return Mito;
}
}
