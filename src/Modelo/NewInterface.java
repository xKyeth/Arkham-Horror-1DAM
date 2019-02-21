package Modelo;
/**AUTOR ALEXANDRA**/
import java.util.ArrayList;

public interface NewInterface {

    void añadirCarta(Carta carta);

    ArrayList<Carta> getListaCartasMazo();

    String getNombre();

    void setListaMazo(ArrayList<Carta> listaCartasMazo);

    void setNombre(String nombre);

    String toString();
    
}
