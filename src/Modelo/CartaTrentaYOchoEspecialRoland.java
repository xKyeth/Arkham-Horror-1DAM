/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Lugar.Lugar;
import Modelo.RolandBanks;
/**
 *
 * @author miguel
 */
public class CartaTrentaYOchoEspecialRoland extends Carta{
        RolandBanks inv;
        Enemigo ene;
      private  int usos;
    public CartaTrentaYOchoEspecialRoland() {
      super("38 Especial de Roland", "Neutral", 3, "Arma", 1, 0, 0, 1, false, "Arma de fuego");
      usos=4;
    }
    public void usaCarta(){
       
        if(inv.getLugar().getPistas()>0){
            ene.setVida(ene.getVida()-(inv.getDaño()+3));
        }else{
            ene.setVida(ene.getVida()-(inv.getDaño()+1));
        }
        usos--;
    }
    
}
