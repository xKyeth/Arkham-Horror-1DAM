
package Modelo;


import CartasInvestigador.Apoyo;

public class CartaPerroGuardian extends Apoyo {
    
    Enemigo e;
    int v = 3;
    
    public CartaPerroGuardian() {
    super("PerroGuardian", false, 0, 0, 0, 0, 0, 3, 1, 3, 0, false);
        
    }

    @Override
    public void verCarta() {
        System.out.println("Estos caninos entrenados son fieramente leales y unos compañeros perfectos.");
         System.out.println("Investigador\n" +
                            "Apoyo. \n" +
                            "Coste: 3.\n" +
                            " Cuando un ataque enemigo inflija daño al Perro guardián:"
                 + "          Inflige 1 punto de daño al Enemigo atacante.\n");
        
    }
    
    public void Accion(Investigador investigador) {
        
        if(this.vida<v) {
            e.daño=e.getDaño()+1;
            v--;
        }
        
            
        
        
        
    }
    
}
