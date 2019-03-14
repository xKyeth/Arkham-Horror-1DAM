package Modelo;
/**AUTOR ALEXANDRA**/
public class BDCarta {
    private String nombre;
    private String clase;
    private int coste;
    private String tipo;
    private int combate;
    private int voluntad;
    private int intelecto;
    private int agilidad;
    private boolean comodín; 
    private String rasgos;
    private MazoInvestigador mazo;
    
    public BDCarta(String nombre, String clase, int coste, String tipo, int combate, int voluntad, int intelecto, int agilidad, boolean comodín, String rasgos) {
        this.nombre=nombre;
        this.clase=clase;
        this.coste=coste;
        this.tipo=tipo;
        this.combate=combate;
        this.voluntad=voluntad;
        this.intelecto=intelecto;
        this.agilidad=agilidad;
        this.comodín=comodín;
        this.rasgos=rasgos;
    }

    public BDCarta() {
        
    }
    
    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public boolean getComodín() {
        return comodín;
    }

    public void setComodín(boolean comodín) {
        this.comodín = comodín;
    }

    public String getRasgos() {
        return rasgos;
    }

    public void setRasgos(String rasgos) {
        this.rasgos = rasgos;
    }

    public MazoInvestigador getMazo() {
        return mazo;
    }

    public void setMazo(MazoInvestigador mazo) {
        this.mazo = mazo;
    }

    public String toString(){
        return "Nombre: "+this.nombre+" Clase: "+this.clase+". Coste: "+this.coste+". Tipo: "+this.tipo+". Combate: "+this.combate+". Voluntad: "+this.voluntad+". Intelecto: "+this.intelecto+". Agilidad: "+this.agilidad+". ¿Tiene comodín?:"+this.comodín+". Rasgos de la carta: "+this.rasgos;
    }

    public int getCombate() {
        return combate;
    }

    public void setCombate(int combate) {
        this.combate = combate;
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

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }
}
