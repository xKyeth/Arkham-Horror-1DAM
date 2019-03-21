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
        boolean victoria=false;
        int puntosApoyo=0;
        for(Apoyo elem:apoyo){
            puntosApoyo=elem.getCombate();
        }
        
        if(investigador.getCombate()+puntosApoyo>enemigo.getCombate()+fichaCaos){
            victoria=true;
        }
        
        return victoria;
    }
    
    //devuelve el daño que el monstruo le hace al investigador
    public int calculaDañoInvestigador(Enemigo enemigo ){
      return enemigo.getDaño();
      
    }
    //devuelve el daño del investigador
    
   public int calculaDañoEnemigo(RolandBanks investigador){
        
      return investigador.getDaño();
    }
 
    
    
    
}