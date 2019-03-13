package CartasMito;

import CartasInvestigador.Carta;

public abstract class Traicion extends Carta {

    public Traicion(String nombreCarta,boolean preparada) {
        super(nombreCarta,preparada);

    }

    public abstract void Accion();
    
    

}
