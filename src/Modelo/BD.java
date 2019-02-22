package Modelo;
/**AUTOR ALEXANDRA**/
import java.util.ArrayList;

public class BD {
    private ArrayList<Carta> listaCartas = new ArrayList<Carta>();
    private ArrayList<MazoInvestigador> mazoRoland = new ArrayList<MazoInvestigador>();
    // COMBATE VOLUNTAD INTELECTO AGILIDAD
    
    public BD(){
    this.listaCartas=new ArrayList<>();
        listaCartas.add(new Carta(".38 Especial de Roland.","Neutral",3,"Apoyo",1,0,0,1, true, "Objeto. Arma. Arma de fuego"));
        listaCartas.add(new Carta("Primeros auxilios.","Guardián",2,"Apoyo",0,1,0,0, false, "Talento. Ciencia"));
        listaCartas.add(new Carta("Viejo libro de conocimiento.","Buscador",3,"Apoyo",0,1,0,0, false, "Objeto. Tomo"));
        listaCartas.add(new Carta("Textos médicos.","Buscador",2,"Apoyo",1,0,0,0, false, "Objeto. Tomo"));
        listaCartas.add(new Carta("Linterna.","Neutral",2,"Apoyo",0,0,1,0, false, "Objeto. Herramienta"));
        listaCartas.add(new Carta("Linterna.","Neutral",2,"Apoyo",0,0,1,0, false, "Objeto. Herramienta"));
        listaCartas.add(new Carta("Cuchillo.","Neutral",1,"Apoyo",1,0,0,0,false,"Objeto. Arma. Cuerpo a cuerpo."));
        listaCartas.add(new Carta("Cuchillo.","Neutral",1,"Apoyo",1,0,0,0,false,"Objeto. Arma. Cuerpo a cuerpo."));
        listaCartas.add(new Carta("Dr Milan Christopher.", "Buscador", 4, "Apoyo", 0,0,1,0, false, "Aliado. Miskatonic"));
        listaCartas.add(new Carta("Bibliotecario investigador.", "Buscador",3,"Apoyo",0,1,0,0, false, "Objeto. Tomo"));
        listaCartas.add(new Carta("Perro guardián.","Guardián", 3, "Apoyo", 1,0,0,0, false, "Aliado. Criatura"));
        listaCartas.add(new Carta("Machete.", "Guardián", 3, "Apoyo", 1,0,0,0, false, "Objeto. Arma. Cuerpo a cuerpo"));
        listaCartas.add(new Carta("Automática del 45.", "Guardián", 4, "Apoyo", 1,1,0,0, false, "Talento"));
        listaCartas.add(new Carta("Policía raso.", "Guardián", 4, "Apoyo", 1,0,0,1, false, "Aliado. Policía"));
        listaCartas.add(new Carta("Lupa.", "Buscador", 1, "Apoyo", 0,0,1,0, false, "Objeto. Herramienta"));
        listaCartas.add(new Carta("Hiperconsciencia.","Buscador",2,"Apoyo",0,0,1,1, false, "Talento"));
        listaCartas.add(new Carta("Entrenamiento físico.", "Guardián", 2, "Apoyo", 1,1,0,0, false, "Talento"));
        listaCartas.add(new Carta("Deducción.", "Buscador", 0, "Habilidad", 0,0,1,0, false, "Experimentado"));
        listaCartas.add(new Carta("Agallas.","Neutral",0,"Habilidad",0,2,0,0, false, "Innato"));
        listaCartas.add(new Carta("Agallas.","Neutral",0,"Habilidad",0,2,0,0, false, "Innato"));
        listaCartas.add(new Carta("Destreza manual.","Neutral", 0, "Habilidad", 0,0,0,2, false, "Innato"));
        listaCartas.add(new Carta("Destreza manual.","Neutral", 0, "Habilidad", 0,0,0,2, false, "Innato"));
        listaCartas.add(new Carta("Golpe brutal.", "Guardián", 0, "Habilidad", 1,0,0,0, false, "Experimentado"));
        listaCartas.add(new Carta("Barricada.", "Buscador", 0, "Evento", 0,1,1,1, false, "Inspiración. Táctica"));
        listaCartas.add(new Carta("Explosión de dinamita.", "Guardián", 5, "Evento", 0,1,0,0, false, "Táctica"));
        listaCartas.add(new Carta("La mente sobre la materia.", "Buscador", 1, "Evento", 1,0,0,1, false, "Inspiración"));
        listaCartas.add(new Carta("Siguiendo una corazonada.", "Buscador", 2, "Evento", 0,0,2,0, false, "Inspiración"));
        listaCartas.add(new Carta("Una prueba.","Guardián", 1, "Evento",0,0,2,0, false, "Inspiración"));
        listaCartas.add(new Carta("Alijo de emergencia.","Neutral",0,"Evento", 0,0,0,0, false, "Suministros"));
        listaCartas.add(new Carta("Alijo de emergencia.","Neutral",0,"Evento", 0,0,0,0, false, "Suministros"));
        listaCartas.add(new Carta("Esquivar.", "Guardián", 1, "Evento", 0,1,0,1, false, "Táctica"));

    
    this.mazoRoland=new ArrayList<>();
        mazoRoland.add(new MazoInvestigador("Mazo 1º."));
    }

    public ArrayList<Carta> getListaCartas() {
        return listaCartas;
    }

    public void setListaCartas(ArrayList<Carta> listaCartas) {
        this.listaCartas = listaCartas;
    }

    public ArrayList<MazoInvestigador> getMazoRoland() {
        return mazoRoland;
    }

    public void setMazoRoland(ArrayList<MazoInvestigador> mazoRoland) {
        this.mazoRoland = mazoRoland;
    }
        
    public ArrayList<Carta> verCartas(MazoInvestigador mazo){
        ArrayList<Carta> carta=mazo.getListaCartasMazo();
        return carta;
    }
}
