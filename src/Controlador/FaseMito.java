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
public class FaseMito extends Fase{
    ControlFaseInvestigacion Investigacion=new ControlFaseInvestigacion();
           public  FaseMito(){};
    
    
     public ControlFaseInvestigacion RealizaFaseMito(){
         
         
            //Colocar 1 ficha de perdicion sirve el plan en curso
        
        
        //Compara umbral de perdicion
        

        //robar una carta encuentro

        UsoDeCartasInvestigador.robarCarta();
         
         
         
         
         return Investigacion;
}
    
    
    
    
    
    
    
}
