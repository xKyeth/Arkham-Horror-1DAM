/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;

import BolsaDelCaos.BolsaDelCaos;
import Modelo.Carta;
import Modelo.RolandBanks;
import java.util.ArrayList;

/**
 *
 * @author cristian
 */
public class PruebaAgilidad extends PruebaHabilidad{
    
    
    public PruebaAgilidad(RolandBanks inv, ArrayList<CartasInvestigador.Apoyo> apoyos, BolsaDelCaos bolsa) {
        super(inv, apoyos, bolsa);        
    }    

    public boolean prueba(int a) {
        boolean x = false;
        int n = inv.getAgilidad() + seleccionaApoyo() + seleccionaCaos();
        if (n < a){
            return x;
        }
        else{
            return x = true;
        }
    }
    
    public int seleccionaApoyo(){
        //Seleccionar apoyo de las cartas disponibles. Hay que implementarlo.
        //Tengo que mostrar las cartas de la mano y seleccionar las que quiero usar.
        //Luego tengo que descartarlas.
        //Finalmente sumamos el número de apoyos a la habilidad del investigador.
//        mostrarCartasMano();
        
        //Método para elegir cartas y obtener un array de cartas que luego es el que 
        //se pasa por parámetros en sumaApoyos.
        
        return sumaApoyos(apoyos);
    }
    
    public ArrayList<Carta> mostrarCartasMano(){
        return mazo.getListaCartasMazo();
    }
    
    
}
