package Modelo;

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
        //this.lugar=new Salita();
        
        
    }
    @Override
    public int efectoEstrella() {
       // Lugar l=getLugar();
//        return l.getPistas();
        return 1;
       
    }
    public String toString(){
        return "tipo "+ this.tipo+ " voluntad "+this.voluntad + " intelecto " +this.intelecto;
                
                }         

    
  
}
