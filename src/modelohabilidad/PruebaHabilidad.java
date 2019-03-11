/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;
import BolsaDelCaos.BolsaDelCaos;
import vista_habilidad.Vista_Habilidad;
import java.util.ArrayList;
import Modelo.RolandBanks;
import ClaseMano.uso_descarte_cartas;
import Modelo.MazoInvestigador;
import CartasInvestigador.Apoyo;

/**
 *
 * @author cristian
 */
public abstract class PruebaHabilidad {
    
    ArrayList<Apoyo> apoyos;
    RolandBanks inv = new RolandBanks();
    Vista_Habilidad vista;
    BolsaDelCaos bolsa;
    uso_descarte_cartas mano;
    MazoInvestigador mazo;
  
    
    public PruebaHabilidad(int n, RolandBanks inv, ArrayList<Apoyo> apoyos, BolsaDelCaos bolsa){      
        this.inv=inv;
        this.apoyos=apoyos;        
        this.bolsa=bolsa;
        vista = new Vista_Habilidad(this);
        switch(n){
            case 1: PruebaHabilidad voluntad = new PruebaVoluntad(5, inv, apoyos, bolsa);
                    break;
            case 2: PruebaHabilidad agilidad = new PruebaAgilidad(5, inv, apoyos, bolsa);
                    break;
            case 3: PruebaHabilidad intelecto = new PruebaIntelecto(5, inv, apoyos, bolsa);
                    break;
//            case 4: PruebaHabilidad combate = new PruebaCombate(5, inv, apoyos, bolsa);
//                    break;
        }
    }
    
    public abstract boolean prueba(int a);
    
    public int sumaApoyos(ArrayList<Apoyo> apoyos){
        int n = 0;
        for(int i = 0;i < apoyos.size();i++){
            n = n + apoyos.get(i).getHabilidad();
        }        
        return n;
    }    
        
    public int seleccionaCaos(){ //ESTE MÉTODO SALE 2 VECES
        //Usar valor de la ficha del caos si sale un número
        //Usar valor de la estrella del investigador si sale estrella
        //Usar valores de los símbolos de la ref. escenario si sale otro símbolo
        int a = 0;
        int n = bolsa.BolsaDelCaos(); 
        if (n == 1) a = -1;
        else if(n == 2) a = -2;
        else if(n == 3) a = -3;
        else if(n == 4) a = -4;
        else if(n == 5) a = -5;
        else if(n == 6) a = -6;
        else if(n == 7) a = 1;
        else if(n == 8) a = -8;
        else if(n == 9) a = 0;//calavera
        else if(n == 10) a = 0;// capucha
        else if(n == 11) a = 0;//piedra
//        else if(n == 12){
//                switch(b){
////                    case 1: a = inv.getVoluntad(); break;
//                    case 2: a = inv.getAgilidad(); break;
////                    case 3: a = inv.getIntelecto(); break;
//                    case 4: a = inv.getCombate(); break; // Con Miguel.
//                }
//            }//tentáculo
        else if(n == 13) a = 0;//estrella. Con Paula.
        return a;
        //Retorna ese valor obtenido
    }
    
    
    

}
    

