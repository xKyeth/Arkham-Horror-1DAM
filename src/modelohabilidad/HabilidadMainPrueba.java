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
import Modelo.*;
import Modelo.Enemigo;
import java.util.LinkedList;

/**
 *
 * @author cristian
 */
public class HabilidadMainPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        PROBANDO PRUEBA DE HABILIDAD
        RolandBanks Roland = new RolandBanks();        
        
        ArrayList<Apoyo> apoyosprueba = new ArrayList();

        CartaDrMilanChristopher apoyo1 = new CartaDrMilanChristopher();
        apoyosprueba.add(apoyo1);
        
        BolsaDelCaos bolsa = new BolsaDelCaos();
        
        PruebaHabilidad agilidad = new PruebaAgilidad(Roland, apoyosprueba, bolsa);
        PruebaHabilidad voluntad = new PruebaVoluntad(Roland, apoyosprueba, bolsa);
        PruebaHabilidad intelecto = new PruebaIntelecto(Roland, apoyosprueba, bolsa);
        
//        Algo manda iniciar prueba de agilidad de dificultad 2
        voluntad.iniciarPrueba(2);
        
  
        
        
        
    }
    
}
