package Modelo;

import java.util.Scanner;

/**AUTOR ALEXANDRA**/
public class CartaAlijoEmergencia {
    //listaCartas.add(new Carta("Alijo de emergencia.","Neutral",0,"Evento", 0,0,0,0, false, "Suministros"));
    // Obtén 3 recursos.
    Investigador investigador;
    RolandBanks roland;
    int numVeces=2; //Ya que tiene 2 veces la carta en el mazo
    Scanner sc=new Scanner(System.in);
    
    public CartaAlijoEmergencia(){
        
    }
    
    public void Accion(){
        System.out.println("Escribe 1 para utilizar solo 1 carta o 2 para utilizar las 2 cartas de alijo de emergencia que tienes en tu mano.");
        int respuesta=sc.nextInt();
        switch(respuesta){
            case 1: 
                investigador.setNumeroRecursos(investigador.getNumeroRecursos() + 3);
            break;
            case 2:
                investigador.setNumeroRecursos(investigador.getNumeroRecursos() + 6);
            break;
                
            default:
                System.out.println("No has escrito un número válido.");
            break;
            }
    }
}
