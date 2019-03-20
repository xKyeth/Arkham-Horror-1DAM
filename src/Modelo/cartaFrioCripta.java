
package Modelo;
import java.util.Scanner;
import CartasMito.Traicion;
import modelohabilidad.PruebaVoluntad;
import Modelo.RolandBanks;
import ClaseMano.uso_descarte_cartas;
public class cartaFrioCripta extends Traicion {
    Scanner entrada = new Scanner(System.in);
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
            if(mano.getCartasmano().size()>0) {
                System.out.println("Selecciona una carta de apoyo");
                System.out.println(mano.getCartasmano());
                int c = entrada.nextInt();
                mano.decartarCarta(c);
                
            }
            else {
            roland.daño = roland.daño+2;
            }
        }
    }
    
   
    
}
