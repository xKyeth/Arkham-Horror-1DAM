package CartasMito;

import CartasInvestigador.Carta;
import Controlador.Fase;
import Modelo.Investigador;


public abstract class Traicion extends Carta {

    public Traicion(Fase fase,String nombreCarta,boolean preparada,int fichaPerdicion) {
        super( fase,nombreCarta,preparada, fichaPerdicion);

    }

    public abstract void Accion(Investigador investigador);
     public abstract void verCarta();
    

}
