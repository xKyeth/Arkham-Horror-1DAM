/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;

import BolsaDelCaos.BolsaDelCaos;
import Modelo.RolandBanks;

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
        
        Apoyo apoyo1 = new Apoyo(5,0,1,0);
        
        BolsaDelCaos bolsa = new BolsaDelCaos();
//        Caos caos1 = new Caos(1,0,2,0);
        
        Habilidad prueba = new Habilidad(2, Roland, apoyo1, bolsa);
        
//        Habilidad prueba = new Habilidad(Roland, apoyo1, caos1);
//        System.out.println(Roland.getAgilidad());
//        System.out.println(Roland.getCombate());
//        System.out.println(Roland.getIntelecto());
//        System.out.println(Roland.getVoluntad());
//        System.out.println();
//        prueba.iniciarPrueba();
        
        
    }
    
}
