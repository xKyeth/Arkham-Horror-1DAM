package Modelo;

import java.util.ArrayList;


public abstract class  Personaje {
    protected int combate,agilidad,daño,vida,horror;
    private Object lugar;
    public abstract void moverPersonaje(ArrayList<Object> lugares,int posicion,Personaje personaje);
 
    public Personaje(){
        
    }
    
   
//       

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
    public Object getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(Object lugar) {
        this.lugar = lugar;
    }
    
    
}
