/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Modelo.Cartas.Mazo;
import modelohabilidad.PruebaHabilidad;
/**
 *
 * @author imanol
 */
public class DestrezaManual {
    
    PruebaHabilidad ph;
    Mazo m;
    public void DestrezaManual(){
        ph.procesarOrden(0, this);
        //Si la prueba tiene exito se roba una carta
        //if(prueba tiene exito)
        m.cogerCarta();
    }
    
}
