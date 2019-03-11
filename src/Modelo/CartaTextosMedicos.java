/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import modelohabilidad.PruebaHabilidad;
import CartasInvestigador.Apoyo;

/**
 *
 * @author Cristian
 */
public class CartaTextosMedicos extends Apoyo{
    
    PruebaHabilidad prueba;
    RolandBanks roland;

    public CartaTextosMedicos(){
        super(0, 0, 1, 0, 0, 0, 0, 2, 0, false);
    }
    
    @Override
    public void Accion(){
        
        System.out.println("Elige un investigador que esté en tu Lugar y realiza "
                + "una prueba de intelecto(2). Si tienes éxito, cúrale 1 punto de daño a "
                + "ese investigador. Si fracasas, inflígele 1 punto de daño a ese "
                + "investigador.");
        if(prueba.prueba(prueba.getDificultad())== true){
            roland.setDaño(roland.getDaño()+1);
        }else{
            roland.setDaño(roland.getDaño()-1);
        }
    }

    @Override
    public void verCarta() {
    
    }
    
    //MÉTODO RESTABLECER

    
}
