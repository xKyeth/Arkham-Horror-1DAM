package Modelo;

import CartasInvestigador.Apoyo;
import CartasInvestigador.CartasInvestigador;
import CartasInvestigador.Evento;
import Modelo.Personaje;
import CartasMito.Traicion;
import ClaseMano.uso_descarte_cartas;
import java.util.LinkedList;

public class VocesDisonantes extends Traicion {

    LinkedList<CartasInvestigador> cartasmano;

    public VocesDisonantes() {
        super("Voces Disonantes", false, 0);
    }
    
    
    @Override
    public void verCarta() {
         System.out.println("Nombre: "+getNombreCarta()
                 +" Informacion de la carta: Descubre 1 pista en tu Lugar. ");
    }
    

    

    @Override
    public void Accion(Investigador investigador) {
      

        for (int i = 0; i < cartasmano.size(); i++) {
            if ((cartasmano.get(i) instanceof Apoyo) || (cartasmano.get(i) instanceof Evento)) {
                cartasmano.get(i).setPreparada(false);
            }
        }

    }

    
    
    public void restablecerCartasMazo() {
        for (int i = 0; i < cartasmano.size(); i++) {
            if ((cartasmano.get(i) instanceof Apoyo) || (cartasmano.get(i) instanceof Evento)) {
                cartasmano.get(i).setPreparada(true);
            }

        }

    }

    
    
}
