/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import CartasInvestigador.Apoyo;
import Vista.Vista;
import java.util.ArrayList;
import modelohabilidad.PruebaCombate;
/**
 *
 * @author miguel
 */
public class CartaTrentaYOchoEspecialRoland extends Apoyo{
        RolandBanks inv;
        Enemigo ene;
        Exception exception;
      private  int usos;
        Vista mensaje=new Vista();
        PruebaCombate prueba=new PruebaCombate();
// public Apoyo(String nombreCarta,boolean preparada,
//      int fichaPerdicion,int voluntad, int intelecto, int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro,
//      boolean comprada
    public CartaTrentaYOchoEspecialRoland() {
        super(".38 Especial De Roland", true, 0, 0, 0, 1, 1, 1, 0, 0, 3, 0, false);
        usos=4;
    }
    public void ampliaCombate(RolandBanks investigador){
        if(investigador.getLugar().getPistas()>0){
            mensaje.muestraMensaje("Gracias a tu experiencia de campo consigues un bonus al combate, +3 a combate");
            this.setCombate(3);
        }
    }
 
    public void usaCarta(Enemigo enemigo){
        
      
        if(usos<=0){
            mensaje.muestraMensaje("¡MALDICIÓN! No te quedan balas...");
           
       }else{
            mensaje.muestraMensaje("Usas tu fiel revolver del 38 y le asestas un terrible disparo a esa criatura.");
            enemigo.setVida(enemigo.getVida()-1);
            usos--;
        }
     
    }

    public int getUsos() {
        return usos;
    }

    public void setUsos(int usos) {
        this.usos = usos;
    }

    @Override
    public void verCarta() {
        mensaje.muestraMensaje("Gasta 1 munición: "
                + "Combatir. Recibe +1  para este ataque, o bien recibe +3  "
                + "si hay 1 o más pistas en tu Lugar. Este ataque inflige +1 de daño.");
    }

    @Override
    public void Accion(Investigador investigador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

