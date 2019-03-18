package Controlador;
/**AUTOR ALEXANDRA**/
import ClaseMano.uso_descarte_cartas;
import Lugar.Lugar;
import Lugar.Lugares;
import java.util.ArrayList;
import Modelo.BD;
import Modelo.BDCarta;
import Modelo.Investigador;
import Modelo.MazoInvestigador;
import Modelo.RolandBanks;
import Vista.VistaFaseInvestigacion;
import java.util.Scanner;
import modelohabilidad.PruebaCombate;
import modelohabilidad.PruebaIntelecto;

public class ControlFaseInvestigacion extends Fase{
    
    private BD bd;
    private VistaFaseInvestigacion vista;
    private MazoInvestigador mazo;
    private boolean salir=false;
    Investigador investigador;
    EvitarEnemigo ev;
    uso_descarte_cartas uso;
    RolandBanks roland;
    Scanner sc=new Scanner(System.in);
    FaseEnemigos Enemigos=new FaseEnemigos();
    PruebaCombate prueba;
    Lugares l;
    Lugar lu;
    ArrayList<Lugar>lugar=l.getLugares();
    PruebaIntelecto pruebaI;
    
    public ControlFaseInvestigacion(){
        bd=new BD();
        vista=new VistaFaseInvestigacion(this);
        vista.MenuPrincipal();
    }
    
//           System.out.println("3. Activar una capacidad de alguna carta.");
//           System.out.println("7. Jugar una carta de apoyo o evento (pagando su precio en recursos).");
    
    public FaseEnemigos procesaOrden(int opcion){
        
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
                    /*NO EXISTE MÉTODO*/
                    vista.MenuPrincipal();
                    break;
                    
                case 4:
                    prueba.enfrenta();
                    vista.MenuPrincipal();
                    break;
                    
                case 5:
                    pruebaI.prueba(lu.getVelo());
                    vista.MenuPrincipal();
                    break;
                    
                case 6:
                    investigador.moverPersonaje(lugar, investigador, l);
                    vista.MenuPrincipal();
                    break;
                    
                case 7:
                    /*NO EXISTE MÉTODO*/
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
                    prueba.combate();
                    vista.MenuPrincipal();
                    break;

                default:
                   System.out.println("Opción incorrecta.");
                   vista.MenuPrincipal();
                   break;
           }
        }
        return Enemigos;
    }
}
