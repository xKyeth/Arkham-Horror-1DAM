/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import CartasInvestigador.Habilidad;
import Modelo.Cartas.MazoEncuentros;
import modelohabilidad.PruebaHabilidad;
/**
 *
 * @author imanol
 */
public abstract class DestrezaManual extends Habilidad {
    
    PruebaHabilidad ph;
    MazoEncuentros m;

    
    
    public DestrezaManual(){
        super("Destreza Manual",false,0, 0, 2, 0, 0);
    }
    
    
    public void usarCarta(){
        ph.prueba(vida);
        //if(prueba tiene exito);
        m.cogerCarta();
    }
    
}
