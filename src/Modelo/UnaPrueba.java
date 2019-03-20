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
                 +" Informacion de la carta: Rápido. Juega esta carta sólo durante tu turno.\n Hasta el final de la ronda, puedes usar tu intelecto\nen lugar de tu combate o de tu habilidad. ");
    }
    
    public void Accion(Investigador investigador){
       
        Investigador inv = investigador;
        
        System.out.println("Después de que derrotes a un Enemigo, descubre 1 pista en tu Lugar.");
        
        if((muerteEnemigo==true) && (inv.getLugar().pistas!=0)){
            inv.getLugar().pistas--;
            inv.setNumeroPistas(inv.getNumeroPistas()+1);
        }
        else{
            System.out.println("Este lugar no tiene pistas");
        }
        
    } //fin del accion
    
    
    
}
