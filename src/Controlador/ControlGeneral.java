/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
  import *;
import BolsaDelCaos.BolsaDelCaos;
import Lugar.*;
import Mazo_Plan.MazoPlan;
import Modelo.Carta;
import Modelo.Cartas.Cartas_Acto.MazoActo;
import Modelo.Cartas.Mazo;
import Modelo.MazoInvestigador;
import Modelo.RolandBanks;
import Vista.Vista;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
/**
 *
 * @author Jose
 */
public class ControlGeneral {
    boolean acabarPartida=false; 
    Vista v;
     RolandBanks Roland;
     
    Lugar Estudio=new Estudio();
    Lugar Pasillo=new Pasillo();
    Lugar Salita=new Salita();
    Lugar Sotano=new Sótano();
    Lugar Atico=new Ático();
     Lugares lugares=new Lugares(Estudio, Pasillo, Salita, Sotano, Atico);
     BolsaDelCaos BDC=new BolsaDelCaos();
     MazoActo MA= new MazoActo();
     MazoPlan MP = new MazoPlan();
     Mazo ME= new Mazo();
     MazoInvestigador MI= new MazoInvestigador();
     
     
     
    public ControlGeneral(){
    v=new Vista(this);
    
    }
    
    public void Juego(){
    

    
        
       prepararPartida();
       
       faseInvestigacion(v.MenuPrincipal());
        
        faseEnemigos();
       
        faseMantenimiento();
       
        
       while(true!=acabarPartida){
       
       faseMitos();
        
       faseEnemigos();
       
        faseMantenimiento();
       faseInvestigacion(v.MenuPrincipal());
    }
       
       
        
        
    
    }
    
    
    
    public void prepararPartida(){
        
        
        
        
    
    //Elegir investigador/Por ahora NO SE IMPLEMENTA
   Roland=new RolandBanks();
    //Crear y barajar mazo Jugador
    
ArrayList<Carta> MIF =new ArrayList();
   MIF=MI.getListaCartasMazo();
   Collections.shuffle(MI.getListaCartasMazo());
   MI.setListaMazo(MIF);

    

    
    //Robar mano inicial
    
   
 
    
    
    //Preparar mazo de Plan
    
   MP.añadirCartasPlan();
    
    //Preparar mazo de acto
    MA.barajar();
    
    
    //Colocar la carta de referencia
    
    
    

    
    //Poner investigador en el Estudio
    
    Roland.setLugar(Estudio);
    
    
    
   
    
    //Crea mazo encuentro
    
    ME.barajar();
   
    
    }
    
    
    
    public void faseMitos(){
    
        
        //Colocar 1 ficha de perdicion sirve el plan en curso
        
        
        
        //Compara la cantidad de piezas de 
    
    
    }
    
    public void faseInvestigacion(int opcion){
    
        
        try {

             
                        
                switch (opcion) {
                     
                
                    case 1://Robar 1 carta
                        
                        
                        
                       MI.añadirCarta(carta);
                    
                        break;
                        
                       
                    case 2:  //Obtener un recurso
                  Roland.getRecursoRobo();
                        break;
                        
                        
                        
                    case 3:  //Acivar una capacidad
                      
                        
                        
                        
                         break;
                                              
                    case 4: //Enfrentarse a un enemigo

                        
                        break;
                        
                      
                    case 5: //Investigar 
                       
                    break;
                    
                     case 6: //Moverse
                         
                         //ME FALTA UN METODO PARA SABER DONDE MOVERNOS
                         
                         
                         
                         lugares.cambiarLugar(Roland.getLugar(),DONDE MOVERSE);
                       
                    break;
                      
                     case 7:  //Jugar una carta de apoyo o Evento de su mano
                       
                         
                         
                    break;
                     case 8://intentar evitar a un enemigo
                             EvitarEnemigo evitar=new EvitarEnemigo();
                             if (evitar.EvitarEnemigo(Roland.getAgilidad(), 0, 0)==true){
                             System.out.println("Has Evitado al enemigo");
    
    
    
                            }else System.out.println("No has evitado al enemigo");
                       
                    break;
                     case 9:    //Combatir con un enemigo
                       
                    break;
                    
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
             
    
    
    
   
    
  
    
    
    
    
    
   
    

    
    
    
    

    
    
    }}
    
    public void faseEnemigos(){
    
    //Mover a monstruos Cazador
   
    
    
    //Enemigo ataca 
    
    
    
    }
    
    public void faseMantenimiento(){
    
    //Poner boca arriba carta pequeña
    
    //Prepara todas las cartas agotadas
        
    //robar una carta y obtiene un recurso
    
    
    
    
    //si hay mas de 8 cartas elige y descarta 
    
    
    
    }
}
