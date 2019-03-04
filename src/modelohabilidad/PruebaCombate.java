/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;

import BolsaDelCaos.BolsaDelCaos;
import Modelo.RolandBanks;
import java.util.LinkedList;

/**
 *
 * @author cristian
 */
public class PruebaCombate extends PruebaHabilidad{
    
    public PruebaCombate(int n, RolandBanks inv, Apoyo apoyo, BolsaDelCaos bolsa) {
        super(n, inv, apoyo, bolsa);
    }
        /**Me falta el enemigo y el investigador, he basado 
     esta parte asumiendo que en los atributos de cada uno
     se van a añadir (es importante) los atributos:
     salud(int),valorCombate(int),modificadorDaño(int).
     Tambien es importante crear para la clase Enemigo y Investigador
     un enum para los estados VIVO y MUERTO (lo podriamos llamar estado o integridadPersonaje)
     ahora mismo tengo controlados los estados con true o false de forma
     que si hacemos lo del enum pueda modificarse facilmente
     pero la otra forma me parece mas eficiente**/
    
    Investigador investigador;
//    Enemigo enemigo;
//    LinkedList<Enemigo> pilaVictoria;
    
//    public void nuevoEnemigo(){
//        this.enemigo=new Enemigo();
//    }
    
    
//    public void enfrenta(){
//        int vidainv=inv.getVida();
//        int vidaene=inv.getVida();
//        if(inv.getDaño()>=enemigo.getDaño){
//            enemigo.getVida()=enemigo.getVida()-(1+inv.getDaño());
//        }else{
//            vidainv=vidainv-enemigo.getDaño;
//        }
//    }
//    public boolean muerteEnemigo(){
//        boolean muerto=false;
//        if(enemigo.getVida()<=0){
//            muerto=true;
//            /**if(Enemigo tiene puntos de victoria){
//                pilaVictoria.push(enemigo);
//            }**/
//        }
//        return muerto;
//    }
//    public boolean muerteInvestigador(){
//        boolean muerto=false;
//        if(inv.getVida()<=0){
//            muerto=true;
//        }
//        return muerto;
//    }

//    public LinkedList<Enemigo> getPilaVictoria() {
//        return pilaVictoria;
//    }

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
