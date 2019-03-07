package Modelo;

import CartasInvestigador.Evento;
import java.util.Scanner;


public class LaMenteSobreLaMateria extends Evento {

    RolandBanks roland;
   Controlador.ControlGeneral investigar;

    public LaMenteSobreLaMateria() {
        super(0, 0, 1, 1, 0, 1);

    }
    
     @Override
    public void verCarta() {
         System.out.println("Voluntad "+getVoluntad()
                 +" Intelecto "+getIntelecto()
                 +" Habilidad "+getHabilidad()
                 +" Combate "+getCombate()
                 +" Comodin "+getComodin()
                 +" Coste "+getComodin()
                 +" Informacion de la carta: Rápido. Juega esta carta sólo durante tu turno.\n Hasta el final de la ronda, puedes usar tu intelecto\nen lugar de tu combate o de tu habilidad. ");
    }
    
    public void usarCarta(){
         if(investigar.getInvestigacion()== true){Accion(); restablecerValoresRoland();}
        else System.out.println("No es posible hacer nada. No estas en Fase de Investigacion");
     }
    
    public void restablecerValoresRoland(){
        roland.setAgilidad(2);
        roland.setCombate(4);
        roland.setIntelecto(3);
        System.out.println("Intelecto "+roland.getIntelecto()+" Combate"+roland.getCombate()+ " Agilidad "+roland.getAgilidad());
    }

    public void Accion() {

        
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Rápido. Juega esta carta sólo durante tu turno.");
        System.out.println("");
        System.out.println("Hasta el final de la ronda, puedes usar tu intelecto\nen lugar de tu combate o de tu habilidad.");
        System.out.println("1.Cambiar combate a intelecto \n2.Cambiar habilidad a intelecto \n3.Valor por defecto");
        int respuesta = sc.nextInt();

        switch (respuesta) {
            case 1:
                roland.setIntelecto(roland.getCombate());
                roland.setCombate(0);
                System.out.println("Se ha cambiado con exito");
                System.out.println("Intelecto "+roland.getIntelecto()+" Combate"+roland.getCombate()+ " Agilidad "+roland.getAgilidad());
                break;

            case 2:
                roland.setIntelecto(roland.getAgilidad());
                roland.setAgilidad(0);
                System.out.println("Se ha cambiado con exito");
                System.out.println("Intelecto "+roland.getIntelecto()+" Combate"+roland.getCombate()+ " Agilidad "+roland.getAgilidad());
                break;

            case 3:
                System.out.println("Usar valores por defecto"); 
                System.out.println("Intelecto "+roland.getIntelecto()+" Combate"+roland.getCombate()+ " Agilidad "+roland.getAgilidad());
                break;

            default:
                System.out.println("Por favor introduzca correctamente los datos");
                Accion();
                break;

        }
    }
      catch(Exception e){
          System.out.println("No se puede usar un caracter, vuelve a introducirlo bien"); 
          System.out.println(""); Accion();
      }  
    }

   
   

}
