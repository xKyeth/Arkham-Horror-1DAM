/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_habilidad;
import modelohabilidad.Habilidad;
//import arkhamhorror.Investigador;
//import arkhamhorror.Apoyo;
//import arkhamhorror.Caos;
import java.util.Scanner;
/**
 *
 * @author cristian
 */
public class Vista_Habilidad {
        
    Habilidad habilidad;
    
    public Vista_Habilidad(Habilidad h){
       this.habilidad=h;
    }
    
    public void pruebaHabilidad(int n){
        switch(n){
            case 1: System.out.println("Prueba de Voluntad"); 
                    break;
            case 2: System.out.println("Prueba de Agilidad");
                    break;
            case 3: System.out.println("Prueba de Intelecto");
                    break;
            case 4: System.out.println("Prueba de Combate");
                    break;
        }        
        habilidad.procesarOrden(n, null);
    }

    public void resultadoPruebaExito(int a) {        
        switch(a){
            case 1: System.out.println("Éxito en Voluntad"); break;
            case 2: System.out.println("Éxito en Agilidad"); break;
            case 3: System.out.println("Éxito en Intelecto"); break;
            case 4: System.out.println("Éxito en Combate"); break;
        }        
    }

    public void resultadoPruebaFracaso(int a) {
        switch(a){
            case 1: System.out.println("Fracaso en Voluntad"); break;
            case 2: System.out.println("Fracaso en Agilidad"); break;
            case 3: System.out.println("Fracaso en Intelecto"); break;
            case 4: System.out.println("Fracaso en Combate"); break;
        }    
    }
    
  

    
    
   
}
