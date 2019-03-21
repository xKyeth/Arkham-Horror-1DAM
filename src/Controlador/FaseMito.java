/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import CartasInvestigador.Carta;

/**
 *
 * @author jose
 */
public class FaseMito extends Fase{
    ControlFaseInvestigacion Investigacion=new ControlFaseInvestigacion();
    int PerdicionTotal;
           public  FaseMito(){};
    
    
     public ControlFaseInvestigacion RealizaFaseMito(){
         
         
            //Colocar 1 ficha de perdicion sobre el plan en curso
        getMazoPlan().setPlanEnCurso(getMazoPlan().getPlanEnCurso()+1);
        
        //Compara umbral de perdicion
         for (int i = 0; i < getCartasEscenario().size(); i++) {
             PerdicionTotal= PerdicionTotal+getCartasEscenario().get(i).getFichaPerdicion();
             
         }
       
        //Esperando a que alguien haga el mazo plan con sus atributos....
         if (getMazoPlan().getUmbralPerdicionAvance()<PerdicionTotal) {
             
         } else {
             getMazoPlan().avanzarPlan();
             
             
         }
        
       

        //robar una carta encuentro
        Carta Enemigo1=getMazoEncuentro().cogerCarta();
        Enemigo1.Accion(getRoland());
         
        
        
        //Si la carta es de tipo Enemigo entonces realiza lo de abajo, esto es para distinguir si es traicion o no, ya que en el mazo de encuentros hay de ambos tipo
         if(Enemigo1=Enemigo1.getIsEnemigo==true){
         
             
             //Necesito que la carta enemigo ademas me devuelva un Enemigo con un Metodo para poderlo meter en el array de Enemigos que he creado
         getEnemigos().add(Enemigo1.getEnemigo);
         
         }
         
         
         return Investigacion;
}
    
    
    
    
    
    
    
}
