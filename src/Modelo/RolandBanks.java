package Modelo;
import Lugar.Lugar;
import Lugar.Salita;
import java.util.ArrayList;


public class RolandBanks extends Investigador {

       public RolandBanks(){
        
        this.tipo="Guardián";
        this.voluntad=3;
        this.intelecto=3;
        this.combate=4;
        this.agilidad=2;
        this.vida=9;
        this.numeroPistas=0;
        this.numeroRecursos=5;
        this.horror=5;
        this.daño=1;
        this.mazo=new MazoInvestigador();
        this.lugar=new Salita();
        this.habilidadPropia="Después de que derrotes a un Enemigo: Descubre 1 pista en tu Lugar. Límite de una vez por ronda";
        
    }
    @Override
    public int efectoEstrella() {
        Lugar l=getLugar();
        System.out.println(" +1 por cada pista que haya en tu Lugar.");
        return l.getPistas();
        
       
    }

 
  
}
