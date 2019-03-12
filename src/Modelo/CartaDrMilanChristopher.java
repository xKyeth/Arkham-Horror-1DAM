/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import CartasInvestigador.Apoyo;

/**
 *
 * @author cristian
 */
public class CartaDrMilanChristopher extends Apoyo{
    
    RolandBanks roland;

    public CartaDrMilanChristopher() {
        super("Dr Milan Christopher",false,0, 1, 0, 0, 0, 1, 2, 4, 0, false);
    }

    
    @Override
    public void Accion() {
        System.out.println("Después de que investigues con éxito: Obtén 1 recurso.");
        //Hacer si investigar tiene éxito.
//        roland.setNumeroRecursos(roland.getNumeroRecursos()+1);
    }
    
    
    @Override
    public void verCarta() {

    }
    
}
