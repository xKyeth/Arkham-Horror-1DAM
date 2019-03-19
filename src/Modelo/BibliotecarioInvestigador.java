/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import CartasInvestigador.Apoyo;
import ClaseMano.uso_descarte_cartas;
import CartasInvestigador.CartasInvestigador;

/**
 *
 * @author JACINTO
 */
public class BibliotecarioInvestigador extends Apoyo  {
    uso_descarte_cartas mano;
    MazoInvestigador mazo;
    CartasInvestigador carta; 
    public BibliotecarioInvestigador(String nombreCarta, boolean preparada, int voluntad, int intelecto, int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro, boolean comprada) {
        super("Bibliotecario Investigador", false, 0, 0, 0, 1, 0, 1, 1, 2, 0, 0, false);
    }
    @Override
    public void Accion(Investigador investigador){
        int x=0;
        while (x<0){
            for (int i = 0; i < mazo.getListaCartasMazo().size() ; i++) {
                if ("Viejo Libro de Conocimiento".equals(carta.getNombreCarta())){
                    carta = mazo.getListaCartasMazo().get(i);
                    mano.añadirCartaAMano(carta);
                    System.out.println("Has robado: Viejo Libro de Conocimiento");
                }else{
                    if ("Textos Médicos".equals(carta.getNombreCarta())){
                    carta = mazo.getListaCartasMazo().get(i);
                    mano.añadirCartaAMano(carta);
                    System.out.println("Has robado: Textos Médicos");
                    }else{
                        System.out.println("No quedan mas tomos en tu mazo...");
                    }     
        }
                
            }
       
}
    }
    

    @Override
    public void verCarta() {
        System.out.println("Después de que el Bibliotecario investigador entre en juego: Busca en tu mazo un Apoyo Tomo y añádelo a tu mano. Baraja tu mazo."); 
    }

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

