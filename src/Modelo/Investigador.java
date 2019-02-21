package Modelo;

import java.util.ArrayList;

public abstract class Investigador extends Personaje{
    
    protected String tipo;
    protected  int voluntad,intelecto,comodin,acciones,numeroPistas,numeroRecursos;
    protected  String habilidadPropia;
    protected  MazoInvestigador mazo;

    abstract int  efectoEstrella();
    
     public void moverPersonaje(ArrayList<Object> lugares, int posicion, Personaje personaje) {
       Object lugar=lugares.get(posicion);
       personaje.setLugar(lugar);
    }
    

  public Investigador(){
      
  }
}