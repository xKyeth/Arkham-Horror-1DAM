package Modelo;

import CartasInvestigador.Evento;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LaMenteSobreLaMateria extends Evento {

    Controlador.ControlGeneral investigar;

    public LaMenteSobreLaMateria() {
        super("La Mente Sobre La Materia", false, 0, 0, 0, 1, 1, 0, 1);

    }

    @Override
    public void verCarta() {
        System.out.println("Nombre: " + getNombreCarta()
                + "Preparada: " + isPreparada()
                + "Ficha de Perdicion: " + getFichaPerdicion()
                + "Voluntad " + getVoluntad()
                + " Intelecto " + getIntelecto()
                + " Habilidad " + getHabilidad()
                + " Combate " + getCombate()
                + " Comodin " + getComodin()
                + " Coste " + getCoste()
                + " Informacion de la carta: Rápido. Juega esta carta sólo durante tu turno.\n Hasta el final de la ronda, puedes usar tu intelecto\nen lugar de tu combate o de tu habilidad. ");
    }

    public void Accion(Investigador investigador) {
        Investigador inv = investigador;

        if (investigar.getInvestigacion() == true) {
            setPreparada(true);
            usarCarta(inv);
        } else {
            System.out.println("No es posible hacer nada. No estas en Fase de Investigacion");
        }

    }//fin del accion

    public void usarCarta(Investigador investigador) {

        if (isPreparada() == true) {
            Investigador inv = investigador;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Rápido. Juega esta carta sólo durante tu turno.");
                System.out.println("");
                System.out.println("Hasta el final de la ronda, puedes usar tu intelecto\nen lugar de tu combate o de tu habilidad.");
                System.out.println("1.Cambiar combate a intelecto \n2.Cambiar habilidad a intelecto \n3.Valor por defecto");
                int respuesta = sc.nextInt();

                switch (respuesta) {
                    case 1:
                        inv.setIntelecto(inv.getCombate());
                        inv.setCombate(0);
                        System.out.println("Se ha cambiado con exito");
                        System.out.println("Intelecto " + inv.getIntelecto() + " Combate" + inv.getCombate() + " Agilidad " + inv.getAgilidad());
                        break;

                    case 2:
                        inv.setIntelecto(inv.getAgilidad());
                        inv.setAgilidad(0);
                        System.out.println("Se ha cambiado con exito");
                        System.out.println("Intelecto " + inv.getIntelecto() + " Combate" + inv.getCombate() + " Agilidad " + inv.getAgilidad());
                        break;

                    case 3:
                        System.out.println("Usar valores por defecto");
                        System.out.println("Intelecto " + inv.getIntelecto() + " Combate" + inv.getCombate() + " Agilidad " + inv.getAgilidad());
                        break;

                    default:
                        System.out.println("Por favor introduzca correctamente los datos");
                        Accion(inv);
                        break;

                }//fin switch
            } //fin try
            catch (InputMismatchException e) {
                System.out.println("No se puede usar un caracter, vuelve a introducirlo bien");
                System.out.println("");
                Accion(inv);
            }

        } //fin del if
        else {
            System.out.println("La carta no esta preparada para usarse");
        }

    } //fin metodo usarCarta
    
    public void restablecerValoresRoland(Investigador investigador) {
        investigador.setAgilidad(2);
        investigador.setCombate(4);
        investigador.setIntelecto(3);
        System.out.println("Intelecto " + investigador.getIntelecto() + " Combate" + investigador.getCombate() + " Agilidad " + investigador.getAgilidad());
    }

   
}
