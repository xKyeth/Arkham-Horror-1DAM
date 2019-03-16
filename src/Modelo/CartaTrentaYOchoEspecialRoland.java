/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import CartasInvestigador.CartasInvestigador;
import Lugar.Lugar;
import Modelo.RolandBanks;
/**
 *
 * @author miguel
 */
public class CartaTrentaYOchoEspecialRoland extends CartasInvestigador{
        RolandBanks inv;
        Enemigo ene;
        Exception exception;
      private  int usos;
    public CartaTrentaYOchoEspecialRoland(int fichaPerdicion,int suministro) {
        
        super(".38 Especial De Roland", true, fichaPerdicion, 0, 0, 1, 1, 1, 0, 0, 3, suministro, true);
    }

    public void usaCarta(Enemigo e){
       try{
          
        if(usos>0){
            if(inv.getLugar().getPistas()>0){
                e.setVida(e.getVida()-(inv.getDaño()+3));
            }else{
                e.setVida(e.getVida()-(inv.getDaño()+1));
            }
            usos--;
       }else{
           throw exception= new Exception("No te quedan balas");
           
       }
       }catch(Exception ex){
           ex= new Exception("El enemigo no está en tu mismo lugar");
       }
    }

    @Override
    public void verCarta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

