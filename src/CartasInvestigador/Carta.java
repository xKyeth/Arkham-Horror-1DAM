
package CartasInvestigador;

import Controlador.Fase;
import Modelo.Investigador;




public abstract  class Carta {
    
    
    private String nombreCarta;
    private boolean preparada;
    private int fichaPerdicion;
    
    public Carta(Fase fase,String nombreCarta, boolean preparada,int fichaPerdicion){
        this.nombreCarta = nombreCarta;
        this.preparada = preparada;
        this.fichaPerdicion = fichaPerdicion;
    }
    
    public abstract void Accion(Investigador investigador);

    
    
    public String getNombreCarta() {
        return nombreCarta;
    }

    public void setNombreCarta(String nombreCarta) {
        this.nombreCarta = nombreCarta;
    }

    public boolean isPreparada() {
        return preparada;
    }

    public void setPreparada(boolean preparada) {
        this.preparada = preparada;
    }

    public int getFichaPerdicion() {
        return fichaPerdicion;
    }

    public void setFichaPerdicion(int fichaPerdicion) {
        this.fichaPerdicion = fichaPerdicion;
    }
    
    
    
    
    
}
