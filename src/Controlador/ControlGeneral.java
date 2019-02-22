/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
  import *;
import Modelo.RolandBanks;
import Vista.Vista;
import java.util.InputMismatchException;
/**
 *
 * @author Jose
 */
public class ControlGeneral {
    boolean acabarPartida=false; 
    Vista v;
     RolandBanks Roland;
    public ControlGeneral(){
    v=new Vista(this);
    
    }
    
    public void Juego(){
    

    
        
       prepararPartida();
       
        v.MenuPrincipal();
        
        faseEnemigos();
       
        faseMantenimiento();
       
        
       while(true!=acabarPartida){
       
       faseMitos();
        
        v.MenuPrincipal();
        
        faseEnemigos();
       
        faseMantenimiento();
    }
       
       
        
        
    
    }
    
    
    
    public void prepararPartida(){
        
        
        
        
    
    //Elegir investigador/Por ahora NO SE IMPLEMENTA
   Roland=new RolandBanks();
    //Crear y barajar mazo Jugador
    
    //Formar reserva de ficha(?
    
    //Formar bolsa del caos
    
    //Coger Recursos iniciales(?
    
    //Robar mano inicial
    
    //Buscar las cartas de Escenario de "El encuento"
    
    //Preparar mazo de Plan
    
    //Preparar mazo de acto
    
    //Colocar la carta de referencia
    
    //poner estudio en juego
    
    //pon aparte todos os demas lugares fuera de juego(??
    
    //Poner investigador en el Estudio
    
    //poner aparte las cartas gul y chantler
    
    //Crea mazo encuentro
    
    }
    
    
    
    public void faseMitos(){
    
        
        //Colocar 1 ficha de perdicion sirve el plan en curso
        
        //Compara la cantidad de piezas de 
    
    
    }
    
    public void faseInvestigacion(int opcion){
    
        
        try {

             
                        
                switch (opcion) {
                     
                
                    case 1://Robar 1 carta
                    
                        break;
                        
                       
                    case 2:  //Obtener un recurso
                  
                        break;
                        
                        
                        
                    case 3:  //Acivar una capacidad
                      
                         break;
                                              
                    case 4: //Enfrentarse a un enemigo

                        
                        break;
                        
                      
                    case 5: //Investigar 
                       
                    break;
                    
                     case 6: //Moverse
                       
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
        
    //robar un carta y obtiene un recurso
    
    //si hay mas de 8 cartas elige y descarta 
    
    }
}
