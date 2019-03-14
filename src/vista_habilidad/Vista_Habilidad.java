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
        habilidad.prueba(n);
    }

    public void resultadoPruebaExito() {        
        System.out.println("Prueba superada con éxito.");
    }
//
    public void resultadoPruebaFracaso() {
        System.out.println("No has superado la prueba.");
    }
    
  

    
    
   
}
