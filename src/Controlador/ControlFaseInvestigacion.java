package Controlador;
/**AUTOR ALEXANDRA**/
import CartasInvestigador.Carta;
import CartasInvestigador.CartasInvestigador;
import ClaseMano.uso_descarte_cartas;
import Lugar.Lugar;
import Lugar.Lugares;
import java.util.ArrayList;
import Modelo.BD;
import Modelo.Cartas.CartasPlan.CartaPlan;
import Modelo.Enemigo;
import Modelo.Investigador;
import Modelo.MazoInvestigador;
import Modelo.RolandBanks;
import Vista.VistaFaseInvestigacion;
import java.util.Iterator;
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
    Enemigo enemigo;
    Lugares l;
    Lugar lu;
    ArrayList<Lugar>lugar=l.getLugares();
    CartaPlan plan;
    PruebaIntelecto pruebaI;
    ArrayList<CartasInvestigador> listaCartas;
    
    public ControlFaseInvestigacion(){
        bd=new BD();
        vista=new VistaFaseInvestigacion(this);
        vista.MenuPrincipal();
    }
    
//  MÉTODO NO IMPLEMENTADO 7. Jugar una carta de apoyo o evento (pagando su precio en recursos).
    
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
                    Scanner sr=new Scanner(System.in);
                    Iterator iterator=CartasEscenario.iterator();
                    System.out.println("Estas son tus cartas");
                    
                    while(iterator.hasNext()){
                    Carta c=CartasEscenario.poll();
                        System.out.println(c.getNombreCarta());
                    } 
                    
                    
                    System.out.println("Que carta del escenario quieres activar?");
                    
                    String n=sr.next();
                    
                    while(iterator.hasNext()){
                    Carta c=CartasEscenario.poll();
                        if(n==c.getNombreCarta()){
                        c.Accion(Roland);
                        
                        }
                    }
                    
                    vista.MenuPrincipal();
                    break;
                    
                case 4:
                    prueba.enfrenta(enemigo, Roland, Apoyo, plan.getPerdicionEnJuego());
                    
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
                    /*For para recorrer las cartas*/
                    /*Si la carta extiende de apoyo o evento, mostrar y preguntar si la quiere usar*/
                    /*Devolver la clase con class.forName(clase)*/
                    /*nombreCarta.getsuperclass()*/
                    for(int i=0; i<=mazo.verCartas(mazo).size(); i++){
                    
                    }
                    
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
                    prueba.enfrenta(enemigo, Roland, Apoyo, plan.getPerdicionEnJuego());
                    
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
