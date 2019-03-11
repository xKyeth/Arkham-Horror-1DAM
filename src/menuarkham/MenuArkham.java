/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuarkham;

import Controlador.ControlGeneral;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jesus Rosa Rodriguez
 */
public class MenuArkham {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
         int seguro; //Para evitar errores en el reinicio

        while (!salir) {
 
            System.out.println("1. Reanudar Partida");
            System.out.println("2. Guardar Partida");
            System.out.println("3. Reiniciar la Partida");
            System.out.println("4. Cambiar el nivel de dificultad");
            System.out.println("5. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                        
                switch (opcion) {
                    case 1:
                        System.out.println("Se ha reanudado la partida");
                        //reanudariamos la partida por donde iba antes de aparecer el menu.
                        break;
                    case 2:
                        System.out.println("La partida se ha guardado satisfactoriamente");
                        // Guardariamos el progreso de la partida en nuestra base de datos
                        // pero como no podemos simulamos hacerlo con un system.out.println
                        break;
                    case 3:
                        System.out.println("¿Estás seguro? Todo el progreso se perderá");
                           String respuesta = sn.next();
                        if ("Si".equals(respuesta)) {
                            System.out.println("Se reiniciará el juego");
                            // llamamos al inicio del juego
                            ControlGeneral inicio = new ControlGeneral();
                            inicio.Juego();
                                    
                        }else{
                            System.out.println("De acuerdo. Regresaras al menú");
                        break;
                        }
                        break;
                    case 4:
                        int opcion2; //Guardaremos la opcion del usuario
        
                            while(!salir){

                                System.out.println("1. Dificultad Facil");
                                System.out.println("2. Dificultad Media");
                                System.out.println("3. Dificultad Extrema");
                                System.out.println("4. Salir");
   
                                System.out.println("Escribe una de las opciones");
                                opcion = sn.nextInt();
                                
                                int dificultad = 0;
                                switch(opcion){
                                    case 1:
                                        System.out.println("Cambiando a dificultad Fácil");
                                        dificultad = 1;
                                        break;
                                    case 2:
                                        System.out.println("Cambiando a dificultad Media");
                                        dificultad = 2;
                                        break;
                                     case 3:
                                        System.out.println("Cambiando a dificultad Extrema");
                                        dificultad = 3;
                                        break;
                                     case 4:
                                        salir=true;
                                        break;
                                     default:
                                        System.out.println("Solo números entre 1 y 4");
                                }
                            }
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
 
    }
     }