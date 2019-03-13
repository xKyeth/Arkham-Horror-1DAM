package Modelo;

/*
* Autor: Juan Martin Ayala
*/
import CartasInvestigador.Apoyo;
import java.util.Scanner;

public class CartaHiperconsciencia extends Apoyo {



    public CartaHiperconsciencia() {
        super("Hiperconsciencia",false,0 ,0 , 1, 0, 1, 0, 0, 0, 2, 0, false);
    }
    
    public void restablecerValoresRoland(Investigador investigador){
        investigador.setAgilidad(2);
        investigador.setCombate(4);
        investigador.setIntelecto(3);
        System.out.println("Valores restablecidos.");
    }  
    
    public void Accion(Investigador investigador) {
        Investigador inv=investigador;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Elige una opcion");
            System.out.println("1) +1 de intelecto");
            System.out.println("2) +1 de agilidad");
            int respuesta = sc.nextInt();

            switch (respuesta) {
                case 1:
                    System.out.println("Obtienes +1 de intelecto");
                    inv.setIntelecto(inv.getIntelecto() + 1);
                    break;
                case 2:
                    System.out.println("Obtienes +1 de agilidad");
                    inv.setAgilidad(inv.getAgilidad() + 1);
                    break;
                default:
                    System.out.println("No se ha introducido una opcion valida");
                    Accion(inv);
                    break;

            }
        } catch (Exception e) {
            System.out.println("No se puede usar un caracter, vuelve a introducirlo bien"); 
            Accion(inv);
        }

    }

    @Override
    public void verCarta() {
        System.out.println("Tipo de carta: Apoyo");
        System.out.println("Coste: 2");
        System.out.println("Iconos: Intelecto 1, Agilidad 1");
        System.out.println("Gasta 1 recurso: Recibes +1 intelecto para esta prueba de habilidad.");
        System.out.println("Gasta 1 recurso: Recibes +1 agilidad para esta prueba de habilidad.");
    }
}
