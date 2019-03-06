/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista_habilidad;
import modelohabilidad.PruebaHabilidad;
//import arkhamhorror.Investigador;
//import arkhamhorror.Apoyo;
//import arkhamhorror.Caos;
import java.util.Scanner;
import modelohabilidad.PruebaVoluntad;
/**
 *
 * @author cristian
 */
public class Vista_Habilidad {
        
    PruebaHabilidad habilidad;
    
    public Vista_Habilidad(PruebaHabilidad h){
       this.habilidad=h;
    }
    
    
    
    
    
    public void pruebaHabilidad(int n){
        
        System.out.println("Se inicia la prueba de habilidad de dificultad "+n);    
        habilidad.procesarOrden(n, null);
    }
//
//    public void resultadoPruebaExito(int a) {        
//        switch(a){
//            case 1: System.out.println("Éxito en Voluntad"); break;
//            case 2: System.out.println("Éxito en Agilidad"); break;
//            case 3: System.out.println("Éxito en Intelecto"); break;
//            case 4: System.out.println("Éxito en Combate"); break;
//        }        
//    }
//
//    public void resultadoPruebaFracaso(int a) {
//        switch(a){
//            case 1: System.out.println("Fracaso en Voluntad"); break;
//            case 2: System.out.println("Fracaso en Agilidad"); break;
//            case 3: System.out.println("Fracaso en Intelecto"); break;
//            case 4: System.out.println("Fracaso en Combate"); break;
//        }    
//    }
    
  

    
    
   
}
