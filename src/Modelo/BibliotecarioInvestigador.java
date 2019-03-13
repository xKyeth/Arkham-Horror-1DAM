/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import CartasInvestigador.Apoyo;
import ClaseMano.uso_descarte_cartas;
import Modelo.Cartas.Mazo;
import Modelo.Carta;
/**
 *
 * @author usuario
 */
public class BibliotecarioInvestigador extends Apoyo  {
    uso_descarte_cartas mano;
    Mazo mazo;

    public BibliotecarioInvestigador(String nombreCarta, boolean preparada, int voluntad, int intelecto, int combate, int habilidad, int comodin, int vida, int cordura, int coste, int suministro, boolean comprada) {
        super("Bibliotecario Investigador", false, 0, 0, 0, 1, 0, 1, 1, 2, 0, false);
    }
    @Override
    public void Accion(Investigador investigador){
        int x=0;
        while (x<0){
            for (int i = 0; i < mazo.getC().size() ; i++) {
                if ("Viejo Libro de Conocimiento".equals(mazo.getC().get(i).getNombreCarta())){
                    Carta carta = mazo.getC().get(i);
                    mano.getCartasmano().add(e);
                    
                }
                
            }
        }
    }

    @Override
    public void verCarta() {
        throw new UnsupportedOperationException("Después de que el Bibliotecario investigador entre en juego: Busca en tu mazo un Apoyo Tomo y añádelo a tu mano. Baraja tu mazo."); 
    }

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
