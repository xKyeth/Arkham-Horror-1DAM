/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import CartasInvestigador.Carta;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class FaseInvestigacion extends Fase {
    
    FaseEnemigos Enemigos=new FaseEnemigos();
    public  FaseInvestigacion(){};
    
    
     public   FaseEnemigos RealizarFaseInvestigacion(int opcion){
         
         
        try {

            switch (opcion) {

                case 1://Robar 1 carta

                    UsoDeCartasInvestigador.robarCarta();

                    break;

                case 2:  //Obtener un recurso
                    Roland.getRecursoRobo();
                    break;

                case 3:  //Acivar una capacidad
                   Scanner sr=new Scanner(System.in);
                    Iterator iterator=CartasEscenario.iterator();
                    System.out.println("Estas son tus cartas");
                    
                    while(iterator.hasNext()){
                    Carta c=CartasEscenario.poll();
                        System.out.println(c.getNombreCarta());
                    } 
                    
                    System.out.println("Que carta del escenario quieres activar?");
                    
                    String n=sr.next();
                    
                    while(iterator.hasNext()){
                    Carta c=CartasEscenario.poll();
                        if(n==c.getNombreCarta()){
                        c.Accion(Roland);
                        
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
                    EvitarEnemigo evitar = new EvitarEnemigo();
                    if (evitar.EvitarEnemigo(Roland.getAgilidad(), 0, 0) == true) {
                        System.out.println("Has Evitado al enemigo");

                    } else {
                        System.out.println("No has evitado al enemigo");
                    }

                    break;
                case 9:    //Combatir con un enemigo
                    pruebaCombate.enfrenta(enemigo, Roland, Apoyo, opcion);
                    
                    
                    
                    
                    break;

            }
        } catch (InputMismatchException e) {
            System.out.println("Debes insertar un número");

        }
         
         
         
         return Enemigos;
}
}
