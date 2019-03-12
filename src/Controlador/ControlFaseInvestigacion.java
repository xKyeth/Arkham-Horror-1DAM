package Controlador;
/**AUTOR ALEXANDRA**/
import ClaseMano.uso_descarte_cartas;
import Lugar.Lugar;
import java.util.ArrayList;
import Modelo.BD;
import Modelo.Carta;
import Modelo.Investigador;
import Modelo.MazoInvestigador;
import Modelo.RolandBanks;
import Vista.VistaFaseInvestigacion;
import java.util.Scanner;

public class ControlFaseInvestigacion {
    
    private BD bd;
    private VistaFaseInvestigacion vista;
    private MazoInvestigador mazo;
    private boolean salir=false;
    Investigador investigador;
    EvitarEnemigo ev;
    uso_descarte_cartas uso;
    RolandBanks roland;
    Scanner sc=new Scanner(System.in);
    
    public ControlFaseInvestigacion(){
        bd=new BD();
        vista=new VistaFaseInvestigacion(this);
        vista.MenuPrincipal();
    }
    
//           System.out.println("3. Activar una capacidad de alguna carta.");
//           System.out.println("4. Enfrentarse a un enemigo que esté en el lugar.");
//           System.out.println("5. Investigar el lugar.");
//           System.out.println("7. Jugar una carta de apoyo o evento (pagando su precio en recursos).");
//           System.out.println("9. Combatir a un enemigo. Si un enemigo no toma la iniciativa contra el enemigo. Este le atacará en lo que se llama un ataque de oportunidad.");
    
    public void procesaOrden(int opcion){
        
        while(!salir){
            
            switch(opcion){
                case 1:
                    uso.robarCarta();
                    vista.MenuPrincipal();
                    break;
                    
                case 2:
                    investigador.getRecursoFase();
                    vista.MenuPrincipal();
                    break;
                    
                case 3:
                    // Activar carta
                    vista.MenuPrincipal();
                    break;
                    
                case 4:
                    // Enfrentar 
                    vista.MenuPrincipal();
                    break;
                    
                case 5:
                    // No existe método para investigar un lugar
                    vista.MenuPrincipal();
                    break;
                    
                case 6:
                    System.out.println("Escribe el lugar a moverte:");
                    String lugar=sc.nextLine();
                    investigador.moverPersonaje(lugar, opcion, roland);
                    vista.MenuPrincipal();
                    break;
                    
                case 7:
                    // Jugar una carta de apoyo o evento
                    vista.MenuPrincipal();
                    break;
                    
                case 8:
                    System.out.println("Escribe la discrepción:");
                    int discre=sc.nextInt();
                    System.out.println("Escribe la bonificación:");
                    int boni=sc.nextInt();
                    System.out.println("Escribe la percepción:");
                    int perc=sc.nextInt();
                    ev.EvitarEnemigo(discre, boni, perc);
                    vista.MenuPrincipal();
                    break;
                    
                case 9:
                    // Combatir
                    vista.MenuPrincipal();
                    break;

                default:
                   System.out.println("Opción incorrecta.");
                   vista.MenuPrincipal();
                   break;
           }
        }
    }
}
