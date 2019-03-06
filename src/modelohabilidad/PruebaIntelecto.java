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
public class PruebaIntelecto extends PruebaHabilidad{
    
    public PruebaIntelecto(int n, RolandBanks inv, Apoyo apoyo, BolsaDelCaos bolsa) {
        super(n, inv, apoyo, bolsa);
        iniciarPruebaIntelecto(n);
    }

    public void iniciarPruebaIntelecto(int n){
        vista.pruebaHabilidad(n);
    }

    public void procesarOrden(int a, Object datos) {

    }
    
}
