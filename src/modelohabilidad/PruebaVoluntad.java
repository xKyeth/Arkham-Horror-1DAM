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
public class PruebaVoluntad extends PruebaHabilidad{
    

    public PruebaVoluntad(int i, RolandBanks inv, ArrayList<CartasInvestigador.Apoyo> apoyos, BolsaDelCaos bolsa) {
        super(i, inv, apoyos, bolsa);
        iniciarPruebaVoluntad(i);
    }

   public boolean iniciarPruebaVoluntad(int n){
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
        int n = inv.getVoluntad() + seleccionaApoyo() - bolsa.BolsaDelCaos();
        if (n < a){
            return x;
        }
        else{
            x = true;
            return x;
        }
    }
    
    
    public int seleccionaApoyo(){
        //Seleccionar apoyo de las cartas disponibles. Hay que implementarlo.
        return sumaApoyos(apoyos);
    }

    
    
}
