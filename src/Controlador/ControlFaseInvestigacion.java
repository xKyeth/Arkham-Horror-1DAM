package Controlador;
/**AUTOR ALEXANDRA**/
import CartasInvestigador.Apoyo;
import CartasInvestigador.Carta;
import CartasInvestigador.CartasInvestigador;
import CartasInvestigador.Evento;
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
    Evento evento;
    Apoyo apoyo;
    
    public ControlFaseInvestigacion(){
        bd=new BD();
      
    }
    
//  MÉTODO NO IMPLEMENTADO 7. Jugar una carta de apoyo o evento (pagando su precio en recursos).
    
    public FaseEnemigos procesaOrden(int opcion){
        
        while(!salir){
            
            switch(opcion){
                case 1:
                    getUsoDeCartasInvestigador().robarCarta();
                    System.out.println("La carta que has robado es:");
                    getUsoDeCartasInvestigador().getCartasmano().peek().verCarta();
                     vista.MenuPrincipal();
                    break;
                    
                case 2:
                    getRoland().getRecursoRobo();
                    System.out.println("Obtuviste un recurso");
                    System.out.println(getRoland().getNumeroRecursos());
                    vista.MenuPrincipal();
                    break;
                    
                case 3:
                    Scanner sr=new Scanner(System.in);
                    Iterator iterator=getCartasEscenario().iterator();
                    System.out.println("Estas son tus cartas");
                    
                    while(iterator.hasNext()){
                    Carta c=getCartasEscenario().poll();
                        System.out.println(c.getNombreCarta());
                    } 
                    
                    
                    System.out.println("¿Que carta del escenario quieres activar?");
                    
                    String n=sr.next();
                    
                    while(iterator.hasNext()){
                    Carta c=getCartasEscenario().poll();
                        if(n==c.getNombreCarta()){
                        c.Accion(getRoland());
                        
                        }
                    }
                    
                    vista.MenuPrincipal();
                    break;
                    
                case 4:
                    prueba.enfrenta(enemigo, getRoland(), getApoyo(), plan.getPerdicionEnJuego());
                    
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
                    /*instanceOf*/
                    
                    vista.MenuPrincipal();
                    break;
                    
                case 8:
                   
                    
                    //primero va a mostrar los nombres de todos los enemigos del array
                    
                    
                    for (int i = 0; i < getEnemigos().size(); i++) {
                      if (getEnemigos().get(i).getLugar()==getRoland().getLugar()){
                      
                          
                          //Da error porque no existe El nombre de los Enemigos
                        // System.out.println(getEnemigos().get(i).getNombre);
                      
                      }
                  
                    }
                    
                    
                    //te pedirá que escribas el nombre de alguno de los enemigos de los que acabas de ver
                    
                    System.out.println("Elige el enemigo con el que quieras luchar");
                    String NombreEnemigo = getSr().next();
                  
                     for (int i = 0; i < getEnemigos().size(); i++) {
                         
                         
                  //    if (getEnemigos().get(i).getNombre==NombreEnemigo){
                      
                          
                          //Realiza el algoritmo de Evitar al Enemigo y te dice si lo evitaste con Éxito o no
                        if (getEvitar().EvitarEnemigo(getRoland().getAgilidad(), getEnemigos().get(i).getAgilidad() ) == true) {
                        System.out.println("Has Evitado al enemigo");

                    } else {
                        System.out.println("No has evitado al enemigo");
                    }
                      
                         
                         
                      }
                 //   }
                    
                    
                    
                    
                    
                      vista.MenuPrincipal();
                    break;
                    
                case 9:
                    
                    
                    //Te devuelve los Enemigos con los que puedes luchar en este turno
                    
                     for (int i = 0; i < getEnemigos().size(); i++) {
                      if (getEnemigos().get(i).getLugar()==getRoland().getLugar()){
                      
                          
                          //Da error porque no existe El nombre de los Enemigos
                 //        System.out.println(getEnemigos().get(i).getNombre);
                      
                      }
                  
                    }
                    
                      //te pedirá que escribas el nombre de alguno de los enemigos de los que acabas de ver
                     
                     
                    System.out.println("Elige el enemigo con el que quieras luchar");
                    String NombreEnemigoLucha = getSr().next();
                  
                     for (int i = 0; i < getEnemigos().size(); i++) {
                  //    if (getEnemigos().get(i).getNombre==NombreEnemigoLucha){
                       
                          
                          //Realiza la prueba de combate con el enemigo que se ha pedido por teclado
                     getPruebaCombate().enfrenta(getEnemigos().get(i), getRoland(), getApoyo(), getBolsaDelCaos().BolsaDelCaos());
                      
                      }
                 //}
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
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
