/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import CartasInvestigador.Carta;
import Modelo.Enemigo;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class FaseInvestigacion extends Fase {
    
    FaseEnemigos Enemigos=new FaseEnemigos();
    public  FaseInvestigacion(){};
    
    
     public   FaseEnemigos RealizarFaseInvestigacion(int opcion){
         
         
        try {

            switch (opcion) {

                case 1://Robar 1 carta

                    getUsoDeCartasInvestigador().robarCarta();
                    System.out.println("La carta que has rovado es:");
                    getUsoDeCartasInvestigador().getCartasmano().peek().verCarta();
                    break;

                case 2:  //Obtener un recurso
                    getRoland().getRecursoRobo();
                    System.out.println("Obtuviste un recurso");
                    System.out.println(getRoland().getNumeroRecursos());
                    
                    break;

                case 3:  //Acivar una capacidad
                   
                    Iterator iterator=getCartasEscenario().iterator();
                    System.out.println("Estas son tus cartas");
                    
                    while(iterator.hasNext()){
                    Carta c=getCartasEscenario().poll();
                        System.out.println(c.getNombreCarta());
                    } 
                    
                    System.out.println("Que carta del escenario quieres activar?");
                    
                    String n=getSr().next();
                    
                    while(iterator.hasNext()){
                    Carta c=getCartasEscenario().poll();
                        if(n==c.getNombreCarta()){
                        c.Accion(getRoland());
                        
                        }
                    }
                    
                        
                    
                    
                    
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
                    
                    //primero va a mostrar los nombres de todos los enemigos del array
                    
                    
                    for (int i = 0; i < getEnemigos().size(); i++) {
                      if (getEnemigos().get(i).getLugar()==getRoland().getLugar()){
                      
                          
                          //Da error porque no existe El nombre de los Enemigos
                    //     System.out.println(getEnemigos().get(i).getNombre);
                      
                      }
                  
                    }
                    
                    
                    //te pedirá que escribas el nombre de alguno de los enemigos de los que acabas de ver
                    
                    System.out.println("Elige el enemigo con el que quieras luchar");
                    String NombreEnemigo = getSr().next();
                  
                     for (int i = 0; i < getEnemigos().size(); i++) {
                         
                         
                    //  if (getEnemigos().get(i).getNombre==NombreEnemigo){
                      
                          
                          //Realiza el algoritmo de Evitar al Enemigo y te dice si lo evitaste con Éxito o no
                        if (getEvitar().EvitarEnemigo(getRoland().getAgilidad(), getEnemigos().get(i).getAgilidad() ) == true) {
                        System.out.println("Has Evitado al enemigo");

                    } else {
                        System.out.println("No has evitado al enemigo");
                    }
                      
                         
                         
                      }
                   // }
                    
                    
                    
                    
                    
                 

                    break;
                case 9:    //Combatir con un enemigo
                    
                    //Te devuelve los Enemigos con los que puedes luchar en este turno
                    
                     for (int i = 0; i < getEnemigos().size(); i++) {
                      if (getEnemigos().get(i).getLugar()==getRoland().getLugar()){
                      
                          
                          //Da error porque no existe El nombre de los Enemigos
                      //   System.out.println(getEnemigos().get(i).getNombre);
                      
                      }
                  
                    }
                    
                      //te pedirá que escribas el nombre de alguno de los enemigos de los que acabas de ver
                     
                     
                    System.out.println("Elige el enemigo con el que quieras luchar");
                    String NombreEnemigoLucha = getSr().next();
                  
                     for (int i = 0; i < getEnemigos().size(); i++) {
                   //   if (getEnemigos().get(i).getNombre==NombreEnemigoLucha){
                       
                          
                          //Realiza la prueba de combate con el enemigo que se ha pedido por teclado
                     getPruebaCombate().enfrenta(getEnemigos().get(i), getRoland(), getApoyo(), getBolsaDelCaos().BolsaDelCaos());
                      
                      }
                //    }
                    
                   
                    
                    
                    
                    
                    break;

            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");

        }
         
         
         
         return Enemigos;
}
}
