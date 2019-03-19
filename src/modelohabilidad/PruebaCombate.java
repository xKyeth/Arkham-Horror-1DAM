/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;

import BolsaDelCaos.BolsaDelCaos;
import CartasInvestigador.Apoyo;
import Modelo.Enemigo;
import Modelo.RolandBanks;
import Vista.Vista;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Miguel
 */
public class PruebaCombate {
    Vista mensaje=new Vista();
    public PruebaCombate() {
    }
    
    //
    public boolean enfrenta(Enemigo enemigo ,RolandBanks investigador,ArrayList<Apoyo> apoyo,int fichaCaos){
        //Si gana el investigador el resultado es true y le resta la vida al enemigo, si es el enemigo el resultado es false y le resta vida al investigador
        boolean victoria;
        int puntosApoyo=0;
        for(Apoyo elem:apoyo){
            puntosApoyo=elem.getCombate();
        }
        
        if(investigador.getCombate()+puntosApoyo>enemigo.getCombate()+fichaCaos){
            mensaje.muestraMensaje("El investigador vence en este combate.");
            int dañoInvestigador=calculaDañoEnemigo(investigador, apoyo);
            enemigo.setVida(enemigo.getVida()-dañoInvestigador);
            mensaje.muestraMensaje("Tu golpe asesta a tu enemigo un daño de "+dañoInvestigador+" puntos de daño.");
            victoria=true;
        }else{
            mensaje.muestraMensaje("El enemigo vence este combate...");
            int dañoEnemigo=calculaDañoInvestigador(enemigo);
            investigador.setVida(investigador.getVida()-dañoEnemigo);
            investigador.setHorror(investigador.getHorror()-enemigo.getHorror());
            mensaje.muestraMensaje("El enemigo te asesta un terrible golpe y pierdes "+dañoEnemigo+" puntos de vida...");
            
            victoria=false;
        }
        
        return victoria;
    }
    
    //devuelve el daño que el monstruo le hace al investigador
    public int calculaDañoInvestigador(Enemigo enemigo ){
      return enemigo.getDaño();
      
    }
    //devuelve el daño acumulado junto con las cartas de apoyo que el investigador le hace al enemigo
    
   public int calculaDañoEnemigo(RolandBanks investigador,ArrayList<Apoyo> apoyo ){
        int puntosDaño=0;
        for(Apoyo elem:apoyo){
            puntosDaño=elem.getDaño;
        }
        puntosDaño+=investigador.getDaño();
      return puntosDaño;
    }
 
    
    
    
}
