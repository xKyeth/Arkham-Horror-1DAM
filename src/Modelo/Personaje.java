package Modelo;
import Lugar.Lugar;
import Lugar.Lugares;
import java.util.ArrayList;


public abstract class  Personaje {
    protected int combate,agilidad,daño,vida,horror;
    protected Lugar lugar;
   
    public abstract void moverPersonaje(ArrayList<Lugar> lugares, Investigador investigador,Lugares l);
 
    public Personaje(){
        
    }
       

    /**
     * @return the combate
     */
    public int getCombate() {
        return combate;
    }

    /**
     * @param combate the combate to set
     */
    public void setCombate(int combate) {
        this.combate = combate;
    }

    /**
     * @return the agilidad
     */
    public int getAgilidad() {
        return agilidad;
    }

    /**
     * @param agilidad the agilidad to set
     */
    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    /**
     * @return the daño
     */
    public int getDaño() {
        return daño;
    }

    /**
     * @param daño the daño to set
     */
    public void setDaño(int daño) {
        this.daño = daño;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the horror
     */
    public int getHorror() {
        return horror;
    }

    /**
     * @param horror the horror to set
     */
    public void setHorror(int horror) {
        this.horror = horror;
    }

    /**
     * @return the lugar
     */
    public Lugar getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
    
    
}
