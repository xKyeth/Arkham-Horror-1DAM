package Modelo;

import CartasInvestigador.Evento;
import java.util.Scanner;

/**AUTOR ALEXANDRA**/
public class CartaAlijoEmergencia extends Evento{
    
    //listaCartas.add(new Carta("Alijo de emergencia.","Neutral",0,"Evento", 0,0,0,0, false, "Suministros"));
    // Obtén 3 recursos.
    RolandBanks roland;
    int numVeces=2; //Ya que tiene 2 veces la carta en el mazo
    Scanner sc=new Scanner(System.in);
    
    public CartaAlijoEmergencia(){
        super("Alijo de Emergencia",false,0,0,0,0,0,0);
    }
    
    public void Accion(){
        System.out.println("Escribe 1 para utilizar solo 1 carta o 2 para utilizar las 2 cartas de alijo de emergencia que tienes en tu mano.");
        int respuesta=sc.nextInt();
        switch(respuesta){
            case 1: 

                roland.numeroRecursos=roland.numeroRecursos+3;
            break;
            case 2:

                roland.numeroRecursos=roland.numeroRecursos+6;

            break;
                
            default:
                System.out.println("No has escrito un número válido.");
            break;
            }
    }

    @Override
    public void verCarta() {
        System.out.println("Uno nunca está demasiado preparado. Coste 0. Obtén 3 recursos. El investigador tiene 2 cartas de este tipo.");
    }
}
