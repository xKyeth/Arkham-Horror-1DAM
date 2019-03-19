package Modelo;
import Lugar.Lugar;
import Lugar.Lugares;
import java.util.ArrayList;


/**
 *
 * @author carlos
 */
public class Enemigo extends Personaje {
   
   
   protected boolean cazador;
   protected boolean gul;

   public Enemigo(boolean cazador, boolean gul){
       super();
       this.cazador=cazador;
       this.gul=gul;
   }
   
   
   public Enemigo (int combate, int vida, int agilidad, int daño, int horror, Lugar lugar, boolean cazador, boolean gul){
      this.combate=combate;
      this.vida=vida;
      this.agilidad=agilidad;
      this.daño=daño;
      this.horror=horror;
      this.lugar=lugar; 
      this.cazador=cazador;
      this.gul=gul;
   }
    /**
     * @return the cazador
     */
    public boolean isCazador() {
        return cazador;
    }

    /**
     * @param cazador the cazador to set
     */
    public void setCazador(boolean cazador) {
        this.cazador = cazador;
    }
    
    // no puedo override el método porque está en parámetro Investigador en vez de Personaje
    // y no veo la utilidad de Lugares l
    @Override
    public void moverPersonaje(ArrayList<Lugar> lugares, Personaje personaje,Lugares l) {
       ArrayList<Lugar> lugarEnemigo=l.getLugares();
        personaje.setLugar(lugar);
    }
    
    
      public void ataque (ArrayList<Lugar> lugares, int posicion, Investigador investigador, Enemigo enemigo){
            if(enemigo.combate>investigador.combate && investigador.getLugar()==enemigo.getLugar()){
           investigador.daño=(investigador.daño) - (enemigo.getDaño());
              }
        else if(enemigo.combate<=investigador.combate && investigador.getLugar()==enemigo.getLugar()){
            enemigo.daño=(enemigo.daño) - (investigador.getDaño());     
}

   
}
}