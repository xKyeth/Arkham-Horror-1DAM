package Modelo;
/**AUTOR ALEXANDRA**/
import java.util.ArrayList;

public class MazoInvestigador implements IMazoInvestigador {

    private String nombre;
    private ArrayList<Carta> listaCartasMazo=new ArrayList<>();
    
    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public MazoInvestigador(){
        this.listaCartasMazo = new ArrayList<>();
    }
    
    public MazoInvestigador(String nombreMazo) {
        this.nombre=nombreMazo;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
    @Override
    public ArrayList<Carta> getListaCartasMazo() {
        return listaCartasMazo;
    }

    @Override
    public void setListaMazo(ArrayList<Carta> listaCartasMazo) {
        this.listaCartasMazo = listaCartasMazo;
    }
    
    @Override
    public void añadirCarta(Carta carta){
        getListaCartasMazo().add(carta);
    }
}
