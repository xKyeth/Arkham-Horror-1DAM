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

/**
 *
 * @author cristian
 */
public abstract class PruebaHabilidad {
    
    ArrayList<Apoyo> apoyos;
    RolandBanks inv = new RolandBanks();
    Apoyo apoyo;
    CartaHabilidad carta;
    Vista_Habilidad vista;
    BolsaDelCaos bolsa;
    
    public PruebaHabilidad(int n, RolandBanks inv, Apoyo apoyo, BolsaDelCaos bolsa){      
        this.inv=inv;
        this.apoyo=apoyo;
        this.bolsa=bolsa;
        vista = new Vista_Habilidad(this);
        switch(n){
            case 1: PruebaHabilidad voluntad = new PruebaVoluntad(5, inv, apoyo, bolsa);
//                    carta = new CartaHabilidad("Voluntad", 5); MI PRUEBA INICIAL
                    break;
            case 2: PruebaHabilidad agilidad = new PruebaAgilidad(5, inv, apoyo, bolsa);
//                    carta = new CartaHabilidad("Agilidad", 5); 
                    break;
            case 3: PruebaHabilidad intelecto = new PruebaIntelecto(5, inv, apoyo, bolsa);
//                    carta = new CartaHabilidad("Intelecto", 5); 
                    break;
            case 4: PruebaHabilidad combate = new PruebaCombate(5, inv, apoyo, bolsa);
//                    carta = new CartaHabilidad("Combate", 5); 
                    break;
        }
    }   
    
    
//    
    public abstract void procesarOrden(int a, Object datos);     
        
    
//    
////    public void iniciarPruebaAgilidad(){
////        
////    }
//    
//    public void resultadoPruebaVistaExito(int a){
//        vista.resultadoPruebaExito(a);
//    }
//    
//    public void resultadoPruebaVistaFracaso(int a){
//        vista.resultadoPruebaFracaso(a);
//    }
//    
//    public int seleccionaApoyo(int a){
//        //Selecciono apoyos que al final son números para sumar a la habilidad seleccionada
//        //Puedo no seleccionar ninguno. No sumaría nada.
//        //Tengo que seleccionar apoyos de la mano del jugador.
//        int n = 0;
//        switch(a){
//            case 1: n = 6; break;
//            case 2: n = 1; break;
//            case 3: n = 2; break;
//            case 4: n = 1; break;
//        }
//        return n;
//        //Retorna un número que sería la suma de todos los apoyos usados de la habilidad seleccionada
//    }
//    
//    public int seleccionaCaos(int b){
//        //Usar valor de la ficha del caos si sale un número
//        //Usar valor de la estrella del investigador si sale estrella
//        //Usar valores de los símbolos de la ref. escenario si sale otro símbolo
//        int a = 0;
//        int n = bolsa.BolsaDelCaos(); // Me da un error.
//        if (n == 1) a = -1;
//        else if(n == 2) a = -2;
//        else if(n == 3) a = -3;
//        else if(n == 4) a = -4;
//        else if(n == 5) a = -5;
//        else if(n == 6) a = -6;
//        else if(n == 7) a = 1;
//        else if(n == 8) a = -8;
//        else if(n == 9) a = 0;//calavera
//        else if(n == 10) a = 0;// capucha
//        else if(n == 11) a = 0;//piedra
//        else if(n == 12){
//                switch(b){
////                    case 1: a = inv.getVoluntad(); break;
//                    case 2: a = inv.getAgilidad(); break;
////                    case 3: a = inv.getIntelecto(); break;
//                    case 4: a = inv.getCombate(); break; // Con Miguel.
//                }
//            }//tentáculo
//        else if(n == 13) a = 0;//estrella. Con Paula.
//        return a;
//        //Retorna ese valor obtenido
//    }
    
    
    

}
    

