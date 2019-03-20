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
   private boolean gul;
    
   public Enemigo (int combate, int vida, int agilidad, int daño, int horror, boolean cazador, boolean gul){
      this.combate=combate;
      this.vida=vida;
      this.agilidad=agilidad;
      this.daño=daño;
      this.horror=horror;
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

    @Override
    public void moverPersonaje(ArrayList<Lugar> lugares, Personaje personaje, Lugares l) {
    }

    /**
     * @return the gul
     */
    public boolean isGul() {
        return gul;
    }

    /**
     * @param gul the gul to set
     */
    public void setGul(boolean gul) {
        this.gul = gul;
    }
}