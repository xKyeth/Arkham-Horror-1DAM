/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;

import BolsaDelCaos.BolsaDelCaos;
import Modelo.RolandBanks;
import java.util.ArrayList;
import CartasInvestigador.Apoyo;

/**
 *
 * @author cristian
 */
public class HabilidadMainPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
        RolandBanks Roland = new RolandBanks();        
        
        ArrayList<Apoyo> apoyosprueba = new ArrayList();
//        Apoyo apoyo1 = new Apoyo(0,0,0,0,0,0,0,0,0,false) {
//            
//        apoyosprueba.add(apoyo1);
        
        BolsaDelCaos bolsa = new BolsaDelCaos();
        
        PruebaHabilidad prueba = new PruebaAgilidad(5,Roland, apoyosprueba, bolsa);
        
        
        
    }
    
}
