package Modelo;
/**AUTOR ALEXANDRA**/
import java.util.ArrayList;

public class MazoInvestigador implements IMazoInvestigador {

    private String nombre;
    private ArrayList<BDCarta> listaCartasMazo=new ArrayList<>();
    
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
    public ArrayList<BDCarta> getListaCartasMazo() {
        return listaCartasMazo;
    }

    @Override
    public void setListaMazo(ArrayList<BDCarta> listaCartasMazo) {
        this.listaCartasMazo = listaCartasMazo;
    }
    
    @Override
    public void añadirCarta(BDCarta carta){
        getListaCartasMazo().add(carta);
    }
    
    
    public void eliminarCarta(BDCarta carta){
        
        getListaCartasMazo().remove(0);
    }
}
