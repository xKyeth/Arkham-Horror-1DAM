/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import CartasInvestigador.Apoyo;
/**
 *
 * @author usuario
 */
public class CartaPoliciaRaso extends Apoyo {
    //Enemigo enemigo;
    Investigador investigador;
    

    public CartaPoliciaRaso(int voluntad, int intelecto, int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro, boolean comprada) {
        super(0, 0, 1, 0, 0, 2, 2, 4, 0, false);
    }

    public void Accion(){
        int x ;
        x = investigador.getCombate() +1;
        investigador.setCombate(x);
        
    }
    
    public void Habilidad(){
        //Si hay un enemigo en el lugar, se le inflige un punto de daño y se descarta
        //if (investigador.getLugar()== //enemigo.getLugar()){
            //enemigo.setSalud(enemigo.getSalud()- 1);
        //}
    //else{
    /*
        System.out.println(" No había ningún enemigo cerca...");
    */
        
    //}
}
}

