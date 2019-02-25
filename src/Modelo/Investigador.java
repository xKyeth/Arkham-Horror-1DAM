package Modelo;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Investigador extends Personaje{
    
    protected String tipo;
    protected  int voluntad,intelecto,comodin,acciones,numeroPistas;
    protected  String habilidadPropia;
    protected  MazoInvestigador mazo;
    protected int numeroRecursos=5;

    abstract int  efectoEstrella();
    
     public void moverPersonaje(ArrayList<Object> lugares, int posicion, Personaje personaje) {
       Object lugar=lugares.get(posicion);
       personaje.setLugar(lugar);
    }
     
     public void getRecursoFase() {
         
         numeroRecursos=numeroRecursos+1;
         System.out.println("Tienes "+numeroRecursos+" recursos");
     }
     
     public void getRecursoRobo() {
         
         numeroRecursos=numeroRecursos+1;
         System.out.println("Tienes "+numeroRecursos+" recursos");
     }
     
     public void getRecursoEfecto() {
         
         System.out.println("¿Cuántos recursos tienes que obtener?");
         Scanner sq=new Scanner(System.in);
         int numero=sq.nextInt();
         int contador=0;
         while (contador<numero){
             
             numeroRecursos=numeroRecursos+1;
             contador++;
         }
         
         System.out.println("Tienes "+numeroRecursos+" recursos");
     }
     
     
    

  public Investigador(){
      
  }
}