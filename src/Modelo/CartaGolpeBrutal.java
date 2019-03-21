
package Modelo;
//new Carta("Golpe brutal.","Guardián",0,"Habilidad",0,0,0,0, false, "Experimentado");
// Si esta prueba de habilidad tiene éxito durante un ataque, dicho ataque inflige +1 de daño.

import CartasInvestigador.Habilidad;
import Controlador.Fase;


public abstract class CartaGolpeBrutal extends Habilidad{
    
    Investigador investigador;
    RolandBanks roland;

    public CartaGolpeBrutal(Fase fase, String nombreCarta, boolean preparada, int fichaPerdicion, int voluntad, int intelecto, int habilidad, int combate, int comodin) {
        super(fase, "Golpe Brutal",false,0, 0 , 0 , 0,1,0);
    }
    
   
   
   public void Accion (Investigador investigador){
       investigador.daño=investigador.daño+1;
       
       
   
       System.out.println("Cada golpe que propinaba a la abominación sonaba de forma enfermiza"
               + ", pero siguió atacando una y otra vez… hasta que al final, dejó de moverse.");
   
   }

    @Override
    public void verCarta() {
        System.out.print("Si esta prueba de habilidad tiene éxito durante un ataque, dicho ataque inflige +1 de daño");
    }
    
}
