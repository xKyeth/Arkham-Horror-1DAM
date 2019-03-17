/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasMitos;

import CartasInvestigador.Carta;
import Modelo.Investigador;
import Modelo.RolandBanks;
import Vista.Vista;
import modelohabilidad.PruebaAgilidad;

/**
 *
 * @author Miguel
 */
public class ManosAferradoras extends Carta{
    Vista mensaje=new Vista();
    public ManosAferradoras(String nombreCarta, boolean preparada, int fichaPerdicion) {
        super("Manos Aferradoras", preparada, fichaPerdicion);
    }
    public boolean realizaPrueba(RolandBanks investigador,PruebaAgilidad pAgilidad){
        mensaje.muestraMensaje("Unas manos putrefactas surgen del suelo y agarran y arañan tus tobillos.");
        boolean supera=false;
        if(pAgilidad.prueba(3+this.getFichaPerdicion())){
            mensaje.muestraMensaje("¡Tu agilidad te ha permitido superar este contratiempo sin recibir daños!");
            supera=true;
        }else{
            mensaje.muestraMensaje("¡MALDICIÓN! Las manos surgidas del suelo te han agarrado con fuerza,"
                    + " por suerte has conseguido zafarte pero no sin llevarte unas cuantas heridas en el proceso, ¡Pierdes 1 punto de salud!");
            investigador.setVida(investigador.getVida()-1);
            supera=false;
        }
        return supera;
    }
    

    @Override
    public void Accion(Investigador investigador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
