
package Modelo;

import CartasMito.Traicion;


public class CartaEncubrimiento extends Traicion {

    
    
    public CartaEncubrimiento(String nombreCarta,boolean preparada,int fichaPerdicion) {
        super("Encubrimiento",false, fichaPerdicion);

    }
    

  

    @Override
    public void Accion(Investigador investigador) {
        System.out.println("Revelación - Pon encubrimiento en juego en tu zona de amenaza"
                + "con 3 pistas encima.");
        System.out.println("Cuando fueses a descubrir 1 o más pistas en tu Lugar :"
                + "en vez de eso , descarta esa misma cantidad de pistas de Encubrimiento.");
    }
    
}
