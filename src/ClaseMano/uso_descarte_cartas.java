
package ClaseMano;
import java.util.Scanner;
import java.util.LinkedList;
import Modelo.Carta;
import Modelo.MazoInvestigador;
public class uso_descarte_cartas {
    
    
    
    Scanner entrada = new Scanner(System.in);
    
    LinkedList<Carta> descarte = new LinkedList<>();
    LinkedList<Carta> cartasmano = new LinkedList<>();
    Carta c;
    MazoInvestigador mazo = new MazoInvestigador();
    

    public uso_descarte_cartas() {
        
    }
                       
    public void robar5cartas() {
        int c = 0;
        while(c<5) {
            
            
        }
    }
    
    public void usoyDescarte() {
        System.out.println("Cuantas cartas quieres utilizar");
        int n = entrada.nextInt();
        int contador = 0;
        while(contador<n) {
            //utiliza la ultima carta de la lista carta, la mete en la lista de descartes
            //y la borra
            System.out.println("Que carta quieres utilizar?");
            int x = entrada.nextInt();
            descarte.add(mazo.getListaCartasMazo().get(x));
            mazo.getListaCartasMazo().get(x);
            
            
            contador++;
        }
    }
        
    public void descartar8Cartas() {
        //Se eliminan 8 cartas del linkedList baraja y se añaden al linkedList 
        //descarte
        
        int y = mazo.getListaCartasMazo().size();
        int contador = 0;
        while (contador<8) {
            mazo.getListaCartasMazo().remove(y);
            descarte.add(mazo.getListaCartasMazo().get(y));
            y = y-1;
            contador++;
        }
        
    }
     
    //metodo de prueba para mostrar el linkedlist de descarte
    public void mostrarDescartes() {
        for (int i = 0; i < descarte.size(); i++) {
            System.out.println(descarte.get(i));
        }
        
    }
    
    Investigador investigador;
    LinkedList <String> cartasapoyo = new LinkedList();
    LinkedList <String> cartasactividad = new LinkedList();
    LinkedList <String> cartasenmesa = new LinkedList();

    public void ComprarCartaActividad(){
        //investigador.RecursosInvestigador =  investigador.RecursosInvestigador - cartasactividad.get(0).coste;
        //Esto funciona cuando esté implementado el coste de las cartas
        cartasactividad.getLast();
        //descarte.add(cartasactividad.getLast());
    }
   public void ComprarCartaApoyo(){
       
      // investigador.RecursosInvestigador = investigador.RecursosInvestigador - cartasapoyo.get(0).coste;
       //Esto funciona cuando esté implementado el coste de las cartas
       cartasenmesa.add(cartasapoyo.getLast());
       cartasapoyo.removeLast();
       
   }
}

    

