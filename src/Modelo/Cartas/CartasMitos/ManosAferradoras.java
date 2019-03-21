/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasMitos;

import CartasInvestigador.Carta;
import Controlador.Fase;
import Modelo.Investigador;
import Modelo.RolandBanks;
import Vista.Vista;
import modelohabilidad.PruebaAgilidad;

/**
 *
 * @author Miguel
 */
public class ManosAferradoras extends CartasMito.Traicion{
    Vista mensaje=new Vista();
    PruebaAgilidad prueba;
    public ManosAferradoras(Fase fase,boolean preparada, int fichaPerdicion) {
        super(fase, "Manos Aferradoras", preparada, fichaPerdicion);
        
    }
    
    @Override
    public void Accion(Investigador investigador) {
        prueba=new PruebaAgilidad(this.getFase().getRoland(), this.getFase().getApoyo(), this.getFase().getBolsaDelCaos());
        mensaje.muestraMensaje("Unas manos putrefactas surgen del suelo y agarran y arañan tus tobillos.");
        
        if(prueba.prueba(3+this.getFichaPerdicion())){
            mensaje.muestraMensaje("¡Tu agilidad te ha permitido superar este contratiempo sin recibir daños!");
            
        }else{
            mensaje.muestraMensaje("¡MALDICIÓN! Las manos surgidas del suelo te han agarrado con fuerza,"
                    + " por suerte has conseguido zafarte pero no sin llevarte unas cuantas heridas en el proceso, ¡Pierdes 1 punto de salud!");
            investigador.setVida(investigador.getVida()-1);
           
        }
        
    }

    @Override
    public void verCarta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
