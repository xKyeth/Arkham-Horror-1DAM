package Modelo;

import CartasInvestigador.Evento;
public class UnaPrueba extends Evento{
    
    RolandBanks roland;
    
    public UnaPrueba() {
        super("Una Prueba",false,0,0, 2, 0, 0, 0, 1);
    }
    
    
     @Override
    public void verCarta() {
         System.out.println("Nombre: "+getNombreCarta()
                 + "Preparada: " +isPreparada()
                 + "Ficha de Perdicion: " +getFichaPerdicion()
                 + "Voluntad "+getVoluntad()
                 +" Intelecto "+getIntelecto()
                 +" Habilidad "+getHabilidad()
                 +" Combate "+getCombate()
                 +" Comodin "+getComodin()
                 +" Coste "+getCoste()
                 +" Informacion de la carta:  Después de que derrotes a un Enemigo, descubre 1 pista en tu Lugar. ");
    }
    
    public void Accion(Investigador investigador){
            
//        if((muerteEnemigo==true) && (inv.getLugar().pistas!=0)){
//            inv.getLugar().pistas--;
//            inv.setNumeroPistas(inv.getNumeroPistas()+1);
//        }
//        else{
//            System.out.println("Este lugar no tiene pistas");
//        }
        
    } //fin del accion
    
    
    
}
