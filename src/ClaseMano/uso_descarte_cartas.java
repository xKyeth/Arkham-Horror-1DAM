
package ClaseMano;
import java.util.Scanner;
import java.util.LinkedList;
public class uso_descarte_cartas {
    
    
    
    Scanner entrada = new Scanner(System.in);
    LinkedList<String> baraja;
    LinkedList<String> descarte = new LinkedList<>();
    Carta c;
    

    public uso_descarte_cartas(LinkedList b) {
        baraja=b;
    }
                                                                                                        
    
    public void usoyDescarte() {
        System.out.println("Cuantas cartas quieres utilizar");
        int n = entrada.nextInt();
        int contador = 0;
        while(contador<n) {
            //utiliza la ultima carta de la lista carta
            descarte.peekLast();
            //mete la ultima carta utilizada en la lista descarte
            descarte.add(baraja.peekLast());
            //elimina la carta utilizada de la baraja
            baraja.removeLast();
            contador++;
        }
    }
        
    public void descartar8Cartas() {
        //Se eliminan 8 cartas del linkedList baraja y se añaden al linkedList 
        //descarte
        for (int i = 0; i <8; i++) {
            descarte.add(baraja.peekLast());
            baraja.removeLast();
        }
    }
     
    //metodo de prueba para mostrar el linkedlist de descarte
    public void mostrarDescartes() {
        for (int i = 0; i < descarte.size(); i++) {
            System.out.println(descarte.get(i));
        }
        
    }
    
    
    
}
