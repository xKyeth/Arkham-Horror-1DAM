package Modelo;

import CartasInvestigador.Evento;
public class UnaPrueba extends Evento{
    
    RolandBanks roland;
    
    public UnaPrueba() {
        super("Una Prueba",false,0, 2, 0, 0, 0, 1);
    }
    
    
    public void verCarta() {
         System.out.println("Voluntad "+getVoluntad()
                 +" Intelecto "+getIntelecto()
                 +" Habilidad "+getHabilidad()
                 +" Combate "+getCombate()
                 +" Comodin "+getComodin()
                 +" Coste "+getComodin()
                 +" Informacion de la carta: Rápido. Después de que derrotes a un Enemigo.\n Descubre 1 pista en tu Lugar. ");
    }
    
    public void Accion(){
        System.out.println("Después de que derrotes a un Enemigo, descubre 1 pista en tu Lugar.");
        
        if((muerteEnemigo==true) && (roland.getLugar().pistas!=0)){
            roland.getLugar().pistas--;
            roland.setNumeroPistas(roland.getNumeroPistas()+1);
        }
        else{
            System.out.println("Este lugar no tiene pistas");
        }
    }
    
}
