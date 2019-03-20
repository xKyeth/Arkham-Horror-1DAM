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
    

    public PruebaVoluntad(RolandBanks inv, ArrayList<CartasInvestigador.Apoyo> apoyos, BolsaDelCaos bolsa) {
        super(inv, apoyos, bolsa);
    }


    public boolean prueba(int a) {        
       boolean x = false;
       System.out.println("Voluntad del investigador: "+inv.getVoluntad());
        int n = inv.getVoluntad() + seleccionaApoyo() + seleccionaCaos();
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
        //        mostrarCartasMano();

        //Método para elegir cartas y obtener un array de cartas que luego es el que 
        //se pasa por parámetros en sumaApoyos.
        
        return sumaApoyosVoluntad(apoyos);
    }

    
    
}
