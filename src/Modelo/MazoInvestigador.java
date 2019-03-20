package Modelo;
/**AUTOR ALEXANDRA**/
import CartasInvestigador.CartasInvestigador;
import java.util.ArrayList;

public class MazoInvestigador implements IMazoInvestigador {

    private String nombre;
    private ArrayList<CartasInvestigador> listaCartasInvestigador;
    //private ArrayList<BDCarta> listaCartasMazo=new ArrayList<>();
    
    @Override
    public String getNombre() {
        return nombre;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public MazoInvestigador(){
        this.listaCartasInvestigador = new ArrayList<>();
    }
    
    public MazoInvestigador(String nombreMazo) {
        this.nombre=nombreMazo;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
    @Override
    public ArrayList<CartasInvestigador> getListaCartasMazo() {
        return listaCartasInvestigador;
    }

    @Override
    public void setListaMazo(ArrayList<CartasInvestigador> listaCartasInvestigador) {
        this.listaCartasInvestigador = listaCartasInvestigador;
    }
    
    @Override
    public void añadirCarta(CartasInvestigador carta){
        getListaCartasMazo().add(carta);
    }

    public void eliminarCarta(CartasInvestigador carta){
        getListaCartasMazo().remove(0);
    }
    
    public ArrayList<CartasInvestigador> verCartas(MazoInvestigador mazo){
        ArrayList<CartasInvestigador> cartas=mazo.getListaCartasMazo();
        return cartas;
    }
}
