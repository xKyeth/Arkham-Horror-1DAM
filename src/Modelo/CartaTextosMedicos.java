/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import modelohabilidad.PruebaHabilidad;
import CartasInvestigador.Apoyo;
import Controlador.Fase;

/**
 *
 * @author Cristian
 */
public class CartaTextosMedicos extends Apoyo{
    
    PruebaHabilidad prueba;
    RolandBanks roland;
    Fase fase;

    public CartaTextosMedicos(Fase fase,String nombreCarta,boolean preparada,int fichaPerdicion,int voluntad, int intelecto, int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro, boolean comprada){
        super(fase,"Textos Medicos",false, 0, 0, 0, 1, 0, 0, 0, 0, 2, 0, false);
    }
    
    
    @Override
    public void Accion(Investigador inv){
        
        System.out.println("Elige un investigador que esté en tu Lugar y realiza "
                + "una prueba de intelecto(2). Si tienes éxito, cúrale 1 punto de daño a "
                + "ese investigador. Si fracasas, inflígele 1 punto de daño a ese "
                + "investigador.");
        prueba.iniciarPrueba(2);
        if(prueba.isX() == true){
            inv.setDaño(inv.getDaño()+1);
        }else{
            inv.setDaño(inv.getDaño()-1);
        }
    }

    @Override
    public void verCarta() {
    
    }
    
    //MÉTODO RESTABLECER


    
}
