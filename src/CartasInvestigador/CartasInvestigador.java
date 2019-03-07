package CartasInvestigador;

public class CartasInvestigador extends Carta{

    protected int voluntad;
    protected int intelecto;
    protected int combate;
    protected int habilidad;
    protected int comodin;
    protected int vida;
    protected int cordura;
    protected int coste;
    protected int suministro;
    protected boolean comprada;

    public CartasInvestigador(int voluntad, int intelecto,int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro, boolean comprada) {
        this.voluntad = voluntad;
        this.intelecto = intelecto;
        this.combate = combate;
        this.habilidad = habilidad;
        this.comodin = comodin;
        this.vida = vida;
        this.cordura = cordura;
        this.coste = coste;
        this.suministro = suministro;
        this.comprada = comprada;
    } //APOYO

    public CartasInvestigador(int voluntad, int intelecto, int habilidad, int combate, int comodin, int coste) {
        this.voluntad = voluntad;
        this.intelecto = intelecto;
        this.combate = combate;
        this.habilidad = habilidad;
        this.comodin = comodin;
        this.coste = coste;
    } //EVENTO

    public CartasInvestigador(int voluntad, int intelecto, int habilidad, int combate, int comodin) {
        this.voluntad = voluntad;
        this.intelecto = intelecto;
        this.combate = combate;
        this.habilidad = habilidad;
        this.comodin = comodin;
    } //HABILIDAD
    
    
    @Override
    public void Accion() {
        
    }
    

    public int getVoluntad() {
        return voluntad;
    }

    public void setVoluntad(int voluntad) {
        this.voluntad = voluntad;
    }

    public int getIntelecto() {
        return intelecto;
    }

    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
    }

    public int getCombate() {
        return combate;
    }

    public void setCombate(int combate) {
        this.combate = combate;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }

    public int getComodin() {
        return comodin;
    }

    public void setComodin(int comodin) {
        this.comodin = comodin;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCordura() {
        return cordura;
    }

    public void setCordura(int cordura) {
        this.cordura = cordura;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int getSuministro() {
        return suministro;
    }

    public void setSuministro(int suministro) {
        this.suministro = suministro;
    }

    public boolean isComprada() {
        return comprada;
    }

    public void setComprada(boolean comprada) {
        this.comprada = comprada;
    }

    

}
