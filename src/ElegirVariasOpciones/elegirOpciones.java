
package ElegirVariasOpciones;


import java.util.ArrayList;
import java.util.Scanner;
public class elegirOpciones {
    
    Scanner entrada = new Scanner (System.in);
    ArrayList<Integer> opciones = new ArrayList<>();
    
    public elegirOpciones() {
        
    }
    
    public void eligeVariasOpciones() {
                
                System.out.println("Cuantas opciones quieres elegir");
                int x = entrada.nextInt();
                int contador = 0;
                while(contador<x) {
                    System.out.println("Introduce la opción");
                    int o = entrada.nextInt();
                    opciones.add(o);
                }
                
            }
    
    public void retornarUltimaOpcion() {
        opciones.get(opciones.size());
        
    }
            
    
    
        }
         
    
    

