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
    }

    @Override
    public void iniciarPruebaVoluntad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarPruebaAgilidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarPruebaCombate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarPruebaIntelecto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
