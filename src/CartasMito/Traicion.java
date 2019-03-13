package CartasMito;

import CartasInvestigador.Carta;
import Modelo.Investigador;


public abstract class Traicion extends Carta {

    public Traicion(String nombreCarta,boolean preparada,int fichaPerdicion) {
        super(nombreCarta,preparada, fichaPerdicion);

    }

    public abstract void Accion(Investigador investigador);
    
    

}
