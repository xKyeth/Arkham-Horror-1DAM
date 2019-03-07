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
public class PruebaVoluntad extends PruebaHabilidad{
    
    public PruebaVoluntad(int n, RolandBanks inv, Apoyo apoyo, BolsaDelCaos bolsa) {
        super(n, inv, apoyo, bolsa);
        iniciarPruebaVoluntad(n);
    }

   public void iniciarPruebaVoluntad(int n){
       vista.pruebaHabilidad(n);
   }

    public void procesarOrden(int a, Object datos) {
        
    }
    
}
