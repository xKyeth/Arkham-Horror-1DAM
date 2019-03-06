/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import modelohabilidad.PruebaHabilidad;

/**
 *
 * @author Cristian
 */
public class CartaTextosMedicos {
    
    private int combate;
    private int coste;
    private String nombre;
    RolandBanks roland;

    public CartaTextosMedicos(){
        combate = 1;
        coste = 2;
        nombre = "Textos Médicos";
    }
    
    public void accion(){
        
        System.out.println("Elige un investigador que esté en tu Lugar y realiza "
                + "una prueba de intelecto(2). Si tienes éxito, cúrale 1 punto de daño a "
                + "ese investigador. Si fracasas, inflígele 1 punto de daño a ese "
                + "investigador.");
//        if(pruebaHabilidad == true){
//            roland.setDaño(roland.getDaño()+1);
//        }else{
//            roland.setDaño(roland.getDaño()-1);
//        }
    }
}
