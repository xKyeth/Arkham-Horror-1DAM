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
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Miguel
 */
public class PruebaCombate {

    public PruebaCombate() {
    }
    
    //
    public boolean enfrenta(Enemigo enemigo ,RolandBanks investigador,ArrayList<Apoyo> apoyo){
        //Si gana el investigador el resultado es true, si es el enemigo el resultado es false
        boolean victoria=false;
        int puntosApoyo=0;
        for(Apoyo elem:apoyo){
            puntosApoyo=elem.getCombate();
        }
        
        if(investigador.getCombate()+puntosApoyo>enemigo.getCombate()){
            victoria=true;
        }
        return victoria;
    }
    
    
    public int calculaDañoInvestigador(Enemigo enemigo ){
      return enemigo.getDaño();
    }
   public int calculaDañoEnemigo(RolandBanks investigador,ArrayList<Apoyo> apoyo ){
        int puntosDaño=0;
        for(Apoyo elem:apoyo){
            puntosDaño=elem.getDaño;
        }
        puntosDaño+=investigador.getDaño();
      return puntosDaño;
    }
 
    
    
    
}
