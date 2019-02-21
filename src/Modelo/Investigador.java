package Modelo;

public abstract class Investigador {
    
    protected String tipo;
    protected  int voluntad;
    protected  int intelecto; 
    protected int combate;
    protected int agilidad;
    protected  int comodin;
    protected int vida;
    protected int horror;
    protected  int usos;
   // protected  Lugar lugar;
    protected  int numeroPistas;
    protected int numeroRecursos;
    protected  String habilidadPropia;
    protected  MazoInvestigador mazo;

    abstract int  efectoEstrella();

    
  public Investigador(){
        //this.lugar=new Salita();
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the voluntad
     */
    public int getVoluntad() {
        return voluntad;
    }

    /**
     * @param voluntad the voluntad to set
     */
    public void setVoluntad(int voluntad) {
        this.voluntad = voluntad;
    }

    /**
     * @return the intelecto
     */
    public int getIntelecto() {
        return intelecto;
    }

    /**
     * @param intelecto the intelecto to set
     */
    public void setIntelecto(int intelecto) {
        this.intelecto = intelecto;
    }

    /**
     * @return the combate
     */
    public int getCombate() {
        return combate;
    }

    /**
     * @param combate the combate to set
     */
    public void setCombate(int combate) {
        this.combate = combate;
    }

    /**
     * @return the agilidad
     */
    public int getAgilidad() {
        return agilidad;
    }

    /**
     * @param agilidad the agilidad to set
     */
    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    /**
     * @return the comodin
     */
    public int getComodin() {
        return comodin;
    }

    /**
     * @param comodin the comodin to set
     */
    public void setComodin(int comodin) {
        this.comodin = comodin;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the horror
     */
    public int getHorror() {
        return horror;
    }

    /**
     * @param horror the horror to set
     */
    public void setHorror(int horror) {
        this.horror = horror;
    }

    /**
     * @return the usos
     */
    public int getUsos() {
        return usos;
    }

    /**
     * @param usos the usos to set
     */
    public void setUsos(int usos) {
        this.usos = usos;
    }

    /**
     * @return the lugar
     */
//    public Lugar getLugar() {
//        return lugar;
//    }

    /**
     * @param lugar the lugar to set
     */
//    public void setLugar(Lugar lugar) {
//        this.lugar = lugar;
//    }

    /**
     * @return the numeroPistas
     */
    public int getNumeroPistas() {
        return numeroPistas;
    }

    /**
     * @param numeroPistas the numeroPistas to set
     */
    public void setNumeroPistas(int numeroPistas) {
        this.numeroPistas = numeroPistas;
    }

    /**
     * @return the numeroRecursos
     */
    public int getNumeroRecursos() {
        return numeroRecursos;
    }

    /**
     * @param numeroRecursos the numeroRecursos to set
     */
    public void setNumeroRecursos(int numeroRecursos) {
        this.numeroRecursos = numeroRecursos;
    }

    /**
     * @return the habilidadPropia
     */
    public String getHabilidadPropia() {
        return habilidadPropia;
    }

    /**
     * @param habilidadPropia the habilidadPropia to set
     */
    public void setHabilidadPropia(String habilidadPropia) {
        this.habilidadPropia = habilidadPropia;
    }

    /**
     * @return the mazo
     */
    public MazoInvestigador getMazo() {
        return mazo;
    }

    /**
     * @param mazo the mazo to set
     */
    public void setMazo(MazoInvestigador mazo) {
        this.mazo = mazo;
    }


 
    
}
