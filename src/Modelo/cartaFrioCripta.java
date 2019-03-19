
package Modelo;

import CartasMito.Traicion;
import modelohabilidad.PruebaVoluntad;
import Modelo.RolandBanks;
import ClaseMano.uso_descarte_cartas;
public class cartaFrioCripta extends Traicion {
    uso_descarte_cartas mano;
    RolandBanks roland;
    PruebaVoluntad voluntad;
    public cartaFrioCripta() {
        super("Frio de la cripta",false, 0);
    }

    @Override
    public void Accion(Investigador investigador) {
        voluntad.prueba(4);
        if(voluntad.prueba(4)) {
            //si gana la prueba termina la carta
            
        }
        else{
            //como no hay una lista de cartas de apoyo, se suma automaticamente
            //2 de d de daño
           
            roland.daño = roland.daño+2;
        }
    }
    
   
    
}
