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
            case 1: carta = new CartaHabilidad("Voluntad", 5); 
                    break;
            case 2: carta = new CartaHabilidad("Agilidad", 5); break;
            case 3: carta = new CartaHabilidad("Intelecto", 5); break;
            case 4: carta = new CartaHabilidad("Combate", 5); break;
        }
        iniciarPrueba(n);
    }   
    
    public void iniciarPrueba(int n){ 
        vista.pruebaHabilidad(n);     
    }
    
    public void procesarOrden(int a, Object datos) {
        switch(a){            
//            case 1: iniciarPruebaVoluntad();
//                    break;
            case 2: iniciarPruebaAgilidad();
                    break;
//            case 3: iniciarPruebaIntelecto();
//                    break;
//            case 4: iniciarPruebaCombate();
//                    break;          
        }
    }

    public abstract void iniciarPruebaVoluntad(); // FALTA LA VOLUNTAD EN ROLAND BANKS O EN PERSONAJE O EN INVESTIGADOR
//        int n = seleccionaApoyo(1);
//        inv.setVoluntad(inv.getVoluntad()+n);
//        inv.setVoluntad(inv.getVoluntad()-seleccionaCaos(1));
//        
//        if(inv.getVoluntad()>=carta.getDificultad()){
//            resultadoPruebaVistaExito(1);
//        }else{
//            resultadoPruebaVistaFracaso(1);
//        }


    public abstract void iniciarPruebaAgilidad();
//        int n = seleccionaApoyo(2);
//        inv.setAgilidad(inv.getAgilidad()+n);
//        inv.setAgilidad(inv.getAgilidad()-seleccionaCaos(2));
//        
//        if(inv.getAgilidad()>=carta.getDificultad()){
//            resultadoPruebaVistaExito(2);
//        }else{
//            resultadoPruebaVistaFracaso(2);
//        }
    

    public abstract void iniciarPruebaCombate();
//        // Lo hace Miguel.
//        int n = seleccionaApoyo(4);
//        inv.setCombate(inv.getCombate()+n);
//        inv.setCombate(inv.getCombate()-seleccionaCaos(4));
//        
//        if(inv.getCombate()>=carta.getDificultad()){
//            resultadoPruebaVistaExito(4);
//        }else{
//            resultadoPruebaVistaFracaso(4);
//        }

    public abstract void iniciarPruebaIntelecto(); // FALTA INTELECTO EN ROLAND BANKS, EN PERSONAJE O EN INVESTIGADOR
//        int n = seleccionaApoyo(3);
//        inv.setIntelecto(inv.getIntelecto()+n);
//        inv.setIntelecto(inv.getIntelecto()-seleccionaCaos(3));
//        
//        if(inv.getIntelecto()>=carta.getDificultad()){
//            resultadoPruebaVistaExito(3);
//        }else{
//            resultadoPruebaVistaFracaso(3);
//        }
    
    public void resultadoPruebaVistaExito(int a){
        vista.resultadoPruebaExito(a);
    }
    
    public void resultadoPruebaVistaFracaso(int a){
        vista.resultadoPruebaFracaso(a);
    }
    
    public int seleccionaApoyo(int a){
        //Selecciono apoyos que al final son números para sumar a la habilidad seleccionada
        //Puedo no seleccionar ninguno. No sumaría nada.
        //Tengo que seleccionar apoyos de la mano del jugador.
        int n = 0;
        switch(a){
            case 1: n = 6; break;
            case 2: n = 1; break;
            case 3: n = 2; break;
            case 4: n = 1; break;
        }
        return n;
        //Retorna un número que sería la suma de todos los apoyos usados de la habilidad seleccionada
    }
    
    public int seleccionaCaos(int b){
        //Usar valor de la ficha del caos si sale un número
        //Usar valor de la estrella del investigador si sale estrella
        //Usar valores de los símbolos de la ref. escenario si sale otro símbolo
        int a = 0;
        int n = bolsa.BolsaDelCaos(); // Me da un error.
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
        else if(n == 12){
                switch(b){
//                    case 1: a = inv.getVoluntad(); break;
                    case 2: a = inv.getAgilidad(); break;
//                    case 3: a = inv.getIntelecto(); break;
                    case 4: a = inv.getCombate(); break; // Con Miguel.
                }
            }//tentáculo
        else if(n == 13) a = 0;//estrella. Con Paula.
        return a;
        //Retorna ese valor obtenido
    }
    
    
    

}
    

