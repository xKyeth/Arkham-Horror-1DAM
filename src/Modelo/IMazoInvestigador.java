package Modelo;
/**AUTOR ALEXANDRA**/
import java.util.ArrayList;

public interface IMazoInvestigador {

    void añadirCarta(BDCarta carta);

    ArrayList<BDCarta> getListaCartasMazo();

    String getNombre();

    void setListaMazo(ArrayList<BDCarta> listaCartasMazo);

    void setNombre(String nombre);

    String toString();
    
}
