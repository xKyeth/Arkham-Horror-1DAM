/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;
import vista_habilidad.Vista_Habilidad;
import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class Habilidad {
    
    ArrayList<Apoyo> apoyos;
    Investigador inv;
    Apoyo apoyo;
    Caos caos;
    CartaHabilidad carta;
    Vista_Habilidad vista;
//    Combate combate;
    
    public Habilidad(int n, Investigador inv, Apoyo apoyo, Caos caos){      
        this.inv=inv;
        this.apoyo=apoyo;
        this.caos=caos;
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
            case 1: iniciarPruebaVoluntad();
                    break;
            case 2: iniciarPruebaAgilidad();
                    break;
            case 3: iniciarPruebaIntelecto();
                    break;
            case 4: iniciarPruebaCombate();
                    break;          
        }
    }

    public void iniciarPruebaVoluntad() {
        int n = seleccionaApoyo(1);
        inv.setVoluntad(inv.getVoluntad()+n);
        inv.setVoluntad(inv.getVoluntad()-caos.getVoluntad());
        
        if(inv.getVoluntad()>=carta.getDificultad()){
            resultadoPruebaVistaExito(1);
        }else{
            resultadoPruebaVistaFracaso(1);
        }
    }

    private void iniciarPruebaAgilidad() {
        int n = seleccionaApoyo(2);
        inv.setAgilidad(inv.getAgilidad()+n);
        inv.setAgilidad(inv.getAgilidad()-caos.getAgilidad());
        
        if(inv.getAgilidad()>=carta.getDificultad()){
            resultadoPruebaVistaExito(2);
        }else{
            resultadoPruebaVistaFracaso(2);
        }
    }

    private void iniciarPruebaCombate() {
        // Lo hace Miguel.
        int n = seleccionaApoyo(4);
        inv.setCombate(inv.getCombate()+n);
        inv.setCombate(inv.getCombate()-caos.getCombate());
        
        if(inv.getCombate()>=carta.getDificultad()){
            resultadoPruebaVistaExito(4);
        }else{
            resultadoPruebaVistaFracaso(4);
        }
    }

    private void iniciarPruebaIntelecto() {
        int n = seleccionaApoyo(3);
        inv.setIntelecto(inv.getIntelecto()+n);
        inv.setIntelecto(inv.getIntelecto()-caos.getIntelecto());
        
        if(inv.getIntelecto()>=carta.getDificultad()){
            resultadoPruebaVistaExito(3);
        }else{
            resultadoPruebaVistaFracaso(3);
        }
    }
    
    public void resultadoPruebaVistaExito(int a){
        vista.resultadoPruebaExito(a);
    }
    
    public void resultadoPruebaVistaFracaso(int a){
        vista.resultadoPruebaFracaso(a);
    }
    
    public int seleccionaApoyo(int a){
        //Selecciono apoyos que al final son números para sumar a la habilidad seleccionada
        //Puedo no seleccionar ninguno. No sumaría nada.
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
    
    public int seleccionaCaos(){
        //Usar valor de la ficha del caos si sale un número
        //Usar valor de la estrella del investigador si sale estrella
        //Usar valores de los símbolos de la ref. escenario si sale otro símbolo
        return 0;
        //Retorna ese valor obtenido
    }
    
    
    

}
    

