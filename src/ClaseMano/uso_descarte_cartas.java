
package ClaseMano;
import java.util.Scanner;
import java.util.LinkedList;
import Modelo.Carta;
import Modelo.MazoInvestigador;
import Modelo.Investigador;
public class uso_descarte_cartas {
    
    
    
    Scanner entrada = new Scanner(System.in);
    
    LinkedList<Carta> descarte = new LinkedList<>();
    LinkedList<Carta> cartasmano = new LinkedList<>();
    Carta c;
    MazoInvestigador mazo = new MazoInvestigador();
    

    public uso_descarte_cartas() {
        
    }
        //Fernando               
    public void robar5cartas() {
        int c = 0;
        while(c<5) {
            //aqui va el metodo de robar una carta
            
        }
    }
    //Fernando
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
        //Fernando
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
    LinkedList <Carta> cartasenmesa = new LinkedList();
    
        //JACINTO
    int recursos = investigador.getNumeroRecursos();
    public void ComprarCartaActividad(){
        System.out.println("Selecciona la carta que quieres comprar: ");
        int y = entrada.nextInt();
        if (cartasmano.get(y).getCoste()> investigador.getNumeroRecursos()){
            System.out.println("No se dispone de los recursos suficientes");
        }
        else{         
            recursos =  investigador.getNumeroRecursos() - cartasmano.get(y).getCoste();
           cartasmano.get(y);
           descarte.add(cartasmano.get(y)); 
        
       }
        
        
    }
    
            //JACINTO
    
   public void ComprarCartaApoyo(){
       
         System.out.println("Selecciona la carta que quieres comprar: ");
            int y = entrada.nextInt();
        if (cartasmano.get(y).getCoste()> investigador.getNumeroRecursos()){
            System.out.println("No se dispone de los recursos suficientes");
        }
        else{       
            recursos =  investigador.getNumeroRecursos() - cartasmano.get(y).getCoste();
            cartasenmesa.add(cartasmano.get(y));
            cartasmano.remove(y); 
        
        }
       
 }
}
   


  

