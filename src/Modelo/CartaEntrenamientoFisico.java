
package Modelo;
//new Carta("Entrenamienti Fisico","Guardián",2,"Apoyo",1,1,0,0, false, "Talento");

import CartasInvestigador.Apoyo;


 


public abstract class CartaEntrenamientoFisico extends Apoyo {
    
    Investigador investigador;
    RolandBanks roland;
    
    public CartaEntrenamientoFisico (){
     super ("Carta de Entrenamiento fisico",false,1, 0, 1, 0, 0, 0, 0, 2, 0, false);
  }
    
    public void Accion (){
        
        roland.voluntad=roland.voluntad+1;
        roland.combate=roland.combate+1;
    
    
    }
}
