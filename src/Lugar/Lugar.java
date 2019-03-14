
package Lugar;
import CartasInvestigador.Carta;

public abstract class Lugar extends Carta{
    
    public int pistas;
    public int velo;
    public String descripcionNR;
    public String descripcionR;
    public String obligado;
    public String instruccionesNR;
    public String instruccionesR;
    private int id;

    public Lugar(String nombreCarta, boolean preparada, int fichaPerdicion) {
        super(nombreCarta, preparada, fichaPerdicion);
    }
    
    
    //cuando se saca un lugar del mazo por primera vez y se coloca
    //en el escenario, se muestra la cara no revelada.
    
    public void caraNoRevelada(Lugar l){
        System.out.println("Nos encontramos en: "+getNombreCarta()+" ▓\n(El lugar no está revelado)");
        System.out.println("Descripción:\n"+getDescripcionNR());
        if(getInstruccionesNR() != null){
            System.out.println("Instrucciones:\n"+getInstruccionesNR());
        }
    }
    
    //cuando un personaje ya se situa en dicho lugar, se muestra
    //la cara revelada.
    
    public void caraRevelada(Lugar l){
        System.out.println("Nos encontramos en: "+getNombreCarta()+" ░\n(El lugar está revelado)");
        System.out.println("Descripción:\n"+getDescripcionR());
        if(getInstruccionesR() != null){
            System.out.println("Instrucciones:\n"+getInstruccionesR());
        }
        if(getObligado() != null){
            System.out.println("Obligado:\n"+getObligado());
        }
        System.out.println("El número de velo es: "+getVelo());
        System.out.println("El número de pistas es: "+getPistas());
    }
    
    //este método es sólo para comprobar que todo está bien
    
    public void muestra(Lugar l){
        caraNoRevelada(l);
        caraRevelada(l);
    }

    
    //SETS AND GETS
    
    public int getPistas() {
        return pistas;
    }

    public void setPistas(int pistas) {
        this.pistas = pistas;
    }

    public int getVelo() {
        return velo;
    }

    public void setVelo(int velo) {
        this.velo = velo;
    }

    public String getDescripcionNR() {
        return descripcionNR;
    }

    public void setDescripcionNR(String descripcionNR) {
        this.descripcionNR = descripcionNR;
    }

    public String getDescripcionR() {
        return descripcionR;
    }

    public void setDescripcionR(String descripcionR) {
        this.descripcionR = descripcionR;
    }

    public String getObligado() {
        return obligado;
    }

    public void setObligado(String obligado) {
        this.obligado = obligado;
    }

    public String getInstruccionesNR() {
        return instruccionesNR;
    }

    public void setInstruccionesNR(String instruccionesNR) {
        this.instruccionesNR = instruccionesNR;
    }

    public String getInstruccionesR() {
        return instruccionesR;
    }

    public void setInstruccionesR(String instruccionesR) {
        this.instruccionesR = instruccionesR;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 
}
