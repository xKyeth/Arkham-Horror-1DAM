/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasMitos;

/**
 *
 * @author pecorte
 */
public class ParalizadoPorElMiedo {
    String nombre="Paralizado por el miedo";
    String accion="La primera vez que realices una de las siguientes acciones (moverte, combatir o evitar) cada ronda, te cuesta 1 acción adicional.\n" +
                    "\n" +
                    "Obligado - Al final de tu turno: Realiza una prueba de  (3). Si tienes éxito, descarta Paralizado por el miedo.";
    boolean activo=false;

    public ParalizadoPorElMiedo() {
        
    }
    
    public void activarCarta(){
        this.activo=true;
    }
    
    public void usarCarta(){
        
    }

    public boolean isActivo() {
        return activo;
    }
    
}
