
package CartasInvestigador;

import Modelo.Investigador;




public abstract  class Carta {
    
    private String nombreCarta;
    private boolean preparada;
    
    public Carta(String nombreCarta, boolean preparada){
        this.nombreCarta = nombreCarta;
        this.preparada = preparada;
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
    
    
    
}
