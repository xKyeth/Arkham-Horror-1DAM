package Modelo;
/**AUTOR ALEXANDRA**/
/**BD actúa como un array donde se puede ver en cualquier momento a través del
 método verCartas todas las cartas existentes en el mazo de Roland.**/

import CartasInvestigador.CartasInvestigador;
import java.util.ArrayList;

public class BD {
    private ArrayList<BDCarta> listaCartas = new ArrayList<>();
    private ArrayList<MazoInvestigador> mazoRoland = new ArrayList<>();
    // ORDEN ATRIBUTOS: COMBATE VOLUNTAD INTELECTO AGILIDAD
    
    public BD(){
    this.listaCartas=new ArrayList<>();
        listaCartas.add(new BDCarta(".38 Especial de Roland.","Neutral",3,"Apoyo",1,0,0,1, true, "Objeto. Arma. Arma de fuego"));
        listaCartas.add(new BDCarta("Primeros auxilios.","Guardián",2,"Apoyo",0,1,0,0, false, "Talento. Ciencia"));
        listaCartas.add(new BDCarta("Viejo libro de conocimiento.","Buscador",3,"Apoyo",0,1,0,0, false, "Objeto. Tomo"));
        listaCartas.add(new BDCarta("Textos médicos.","Buscador",2,"Apoyo",1,0,0,0, false, "Objeto. Tomo"));
        listaCartas.add(new BDCarta("Linterna.","Neutral",2,"Apoyo",0,0,1,0, false, "Objeto. Herramienta"));
        listaCartas.add(new BDCarta("Linterna.","Neutral",2,"Apoyo",0,0,1,0, false, "Objeto. Herramienta"));
        listaCartas.add(new BDCarta("Cuchillo.","Neutral",1,"Apoyo",1,0,0,0,false,"Objeto. Arma. Cuerpo a cuerpo."));
        listaCartas.add(new BDCarta("Cuchillo.","Neutral",1,"Apoyo",1,0,0,0,false,"Objeto. Arma. Cuerpo a cuerpo."));
        listaCartas.add(new BDCarta("Dr Milan Christopher.", "Buscador", 4, "Apoyo", 0,0,1,0, false, "Aliado. Miskatonic"));
        listaCartas.add(new BDCarta("Bibliotecario investigador.", "Buscador",3,"Apoyo",0,1,0,0, false, "Objeto. Tomo"));
        listaCartas.add(new BDCarta("Perro guardián.","Guardián", 3, "Apoyo", 1,0,0,0, false, "Aliado. Criatura"));
        listaCartas.add(new BDCarta("Machete.", "Guardián", 3, "Apoyo", 1,0,0,0, false, "Objeto. Arma. Cuerpo a cuerpo"));
        listaCartas.add(new BDCarta("Automática del 45.", "Guardián", 4, "Apoyo", 1,1,0,0, false, "Talento"));
        listaCartas.add(new BDCarta("Policía raso.", "Guardián", 4, "Apoyo", 1,0,0,1, false, "Aliado. Policía"));
        listaCartas.add(new BDCarta("Lupa.", "Buscador", 1, "Apoyo", 0,0,1,0, false, "Objeto. Herramienta"));
        listaCartas.add(new BDCarta("Hiperconsciencia.","Buscador",2,"Apoyo",0,0,1,1, false, "Talento"));
        listaCartas.add(new BDCarta("Entrenamiento físico.", "Guardián", 2, "Apoyo", 1,1,0,0, false, "Talento"));
        listaCartas.add(new BDCarta("Deducción.", "Buscador", 0, "Habilidad", 0,0,1,0, false, "Experimentado"));
        listaCartas.add(new BDCarta("Agallas.","Neutral",0,"Habilidad",0,2,0,0, false, "Innato"));
        listaCartas.add(new BDCarta("Agallas.","Neutral",0,"Habilidad",0,2,0,0, false, "Innato"));
        listaCartas.add(new BDCarta("Destreza manual.","Neutral", 0, "Habilidad", 0,0,0,2, false, "Innato"));
        listaCartas.add(new BDCarta("Destreza manual.","Neutral", 0, "Habilidad", 0,0,0,2, false, "Innato"));
        listaCartas.add(new BDCarta("Golpe brutal.", "Guardián", 0, "Habilidad", 1,0,0,0, false, "Experimentado"));
        listaCartas.add(new BDCarta("Barricada.", "Buscador", 0, "Evento", 0,1,1,1, false, "Inspiración. Táctica"));
        listaCartas.add(new BDCarta("Explosión de dinamita.", "Guardián", 5, "Evento", 0,1,0,0, false, "Táctica"));
        listaCartas.add(new BDCarta("La mente sobre la materia.", "Buscador", 1, "Evento", 1,0,0,1, false, "Inspiración"));
        listaCartas.add(new BDCarta("Siguiendo una corazonada.", "Buscador", 2, "Evento", 0,0,2,0, false, "Inspiración"));
        listaCartas.add(new BDCarta("Una prueba.","Guardián", 1, "Evento",0,0,2,0, false, "Inspiración"));
        listaCartas.add(new BDCarta("Alijo de emergencia.","Neutral",0,"Evento", 0,0,0,0, false, "Suministros"));
        listaCartas.add(new BDCarta("Alijo de emergencia.","Neutral",0,"Evento", 0,0,0,0, false, "Suministros"));
        listaCartas.add(new BDCarta("Esquivar.", "Guardián", 1, "Evento", 0,1,0,1, false, "Táctica"));

    
    this.mazoRoland=new ArrayList<>();
        mazoRoland.add(new MazoInvestigador("Mazo 1º."));
    }

    public ArrayList<BDCarta> getListaCartas() {
        return listaCartas;
    }

    public void setListaCartas(ArrayList<BDCarta> listaCartas) {
        this.listaCartas = listaCartas;
    }

    public ArrayList<MazoInvestigador> getMazoRoland() {
        return mazoRoland;
    }

    public void setMazoRoland(ArrayList<MazoInvestigador> mazoRoland) {
        this.mazoRoland = mazoRoland;
    }
        
    public ArrayList<CartasInvestigador> verCartas(MazoInvestigador mazo){
        ArrayList<CartasInvestigador> cartas=mazo.getListaCartasMazo();
        return cartas;
    }
}
