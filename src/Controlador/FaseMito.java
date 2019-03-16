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
    int PerdicionTotal;
           public  FaseMito(){};
    
    
     public ControlFaseInvestigacion RealizaFaseMito(){
         
         
            //Colocar 1 ficha de perdicion sobre el plan en curso
        MazoPlan.setPlanEnCurso(MazoPlan.getPlanEnCurso()+1);
        
        //Compara umbral de perdicion
         for (int i = 0; i < CartasEscenario.size(); i++) {
             PerdicionTotal= PerdicionTotal+CartasEscenario.get(i).getFichaPerdicion();
             
         }
       
        
         if (MazoPlan.getUmbralPerdicionAvance()<PerdicionTotal) {
             
         } else {
             MazoPlan.avanzarPlan();
             
             
         }
        
       

        //robar una carta encuentro

        MazoEncuentro.cogerCarta();
         
         
         
         
         return Investigacion;
}
    
    
    
    
    
    
    
}
