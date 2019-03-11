/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;

import BolsaDelCaos.BolsaDelCaos;
import Modelo.RolandBanks;
import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class PruebaIntelecto extends PruebaHabilidad{
    
    public PruebaIntelecto(int n, RolandBanks inv, ArrayList<CartasInvestigador.Apoyo> apoyos, BolsaDelCaos bolsa) {
        super(n, inv, apoyos, bolsa);
        iniciarPruebaIntelecto(n);
    }
    
    public boolean iniciarPruebaIntelecto(int n){
        vista.pruebaHabilidad(n);
        boolean x = prueba(n);
        if(x == true){
            vista.resultadoPruebaExito();
        }else{
            vista.resultadoPruebaFracaso();
        }
        return x;        
    }

    public boolean prueba(int a) {
        boolean x = false;
        int n = inv.getIntelecto() + seleccionaApoyo() - bolsa.BolsaDelCaos();
        if (n < a){
            return x;
        }
        else{
            return x = true;
        }
    }
    
    public int seleccionaApoyo(){
        //Seleccionar apoyo de las cartas disponibles. Hay que implementarlo.
        return sumaApoyos(apoyos);
    }
    
}
