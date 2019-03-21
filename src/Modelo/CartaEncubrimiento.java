
package Modelo;

import CartasMito.Traicion;
import Controlador.Fase;


public class CartaEncubrimiento extends Traicion {

    public CartaEncubrimiento(Fase fase, String nombreCarta, boolean preparada, int fichaPerdicion) {
        super(fase,"Encubrimiento",false, fichaPerdicion);
    }

    
    
    
    

  

    @Override
    public void Accion(Investigador investigador) {
        System.out.println("Revelación - Pon encubrimiento en juego en tu zona de amenaza"
                + "con 3 pistas encima.");
        System.out.println("Cuando fueses a descubrir 1 o más pistas en tu Lugar :"
                + "en vez de eso , descarta esa misma cantidad de pistas de Encubrimiento.");
    }

    @Override
    public void verCarta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
