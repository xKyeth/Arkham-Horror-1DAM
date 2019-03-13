/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;

import BolsaDelCaos.BolsaDelCaos;
import Modelo.Enemigo;
import Modelo.RolandBanks;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author cristian
 */
public class PruebaCombate extends PruebaHabilidad{

     Enemigo enemigo;
     LinkedList<Enemigo> pilaVictoria;
    
    public PruebaCombate(int n, RolandBanks inv, ArrayList<CartasInvestigador.Apoyo> apoyos, BolsaDelCaos bolsa) {
        super(n, inv, apoyos, bolsa);
    }
    
    public void iniciarPruebaCombate(){
        enfrenta();
        combate();
        
    }
    public void nuevoEnemigo(Enemigo ene){
        this.enemigo=ene;
    }
    
    public boolean enfrenta(){
        //Si gana el investigador el resultado es true, si es el enemigo el resultado es false
        boolean victoria=false;
        if(inv.getCombate()>=enemigo.getCombate()){
            victoria=true;
        }else{
            victoria=false;
        }
        return victoria;
    }
    public void combate(){
        if(enfrenta()){
           enemigo.setVida(enemigo.getVida()-(1+inv.getDaño()));
        }else{
            inv.setVida(inv.getVida()-enemigo.getDaño());
        }
    }
 
    

    

    @Override
    public boolean prueba(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

    
    
}
