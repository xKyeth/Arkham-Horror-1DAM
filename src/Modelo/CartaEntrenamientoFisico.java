
package Modelo;
//new Carta("Entrenamienti Fisico","Guardián",2,"Apoyo",1,1,0,0, false, "Talento");

import CartasInvestigador.Apoyo;
import Controlador.Fase;


 


public abstract class CartaEntrenamientoFisico extends Apoyo {
    
    Investigador investigador;
    RolandBanks roland;

    public CartaEntrenamientoFisico(Fase fase, String nombreCarta, boolean preparada, int fichaPerdicion, int voluntad, int intelecto, int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro, boolean comprada) {
        super(fase,"Carta de Entrenamiento fisico",false , 0,1, 0, 1, 0,0 , 0, 0, 2, 0, false);
    }
    
    
    
    @Override
    public void Accion (Investigador inv){
        
        inv.voluntad=inv.voluntad+1;
        inv.combate=inv.combate+1;
    
    
    }
}
