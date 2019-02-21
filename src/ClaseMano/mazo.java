
package ClaseMano;

import java.util.LinkedList;


public class mazo {
    uso_descarte_cartas u;
    LinkedList<String> carta = new LinkedList<>();
    
    public mazo() {
        for (int i = 0; i < 90; i++) {
            carta.add("carta");
            u = new uso_descarte_cartas(carta);
        }
        
    }
}
