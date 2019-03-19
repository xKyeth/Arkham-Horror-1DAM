/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ClaseMano.uso_descarte_cartas;
import CartasInvestigador.Carta;
import CartasInvestigador.CartasInvestigador;
import Escenarios.Escenario;
import Modelo.BDCarta;
import Modelo.RolandBanks;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Zero
 */
public class FasePrepararPartida extends Fase{
    
    public FasePrepararPartida(){};
    
    
    public void RealizarFasePrepararPartida(){
    
    //Elegir investigador/Por ahora NO SE IMPLEMENTA
        Roland = new RolandBanks();
        //Crear y barajar mazo Jugador

        ArrayList<CartasInvestigador> MazoInvestigadorFinal = new ArrayList();
       MazoInvestigadorFinal= MazoInvestigador.getListaCartasMazo();
        Collections.shuffle(MazoInvestigador.getListaCartasMazo());
        MazoInvestigador.setListaMazo(MazoInvestigadorFinal);

        //Robar mano inicial
        uso_descarte_cartas UDC=new uso_descarte_cartas();
        UDC.robar5cartas();
        //Preparar mazo de Plan
        //MazoPlan.añadirCartasPlan();

        //Preparar mazo de acto
        MazoActo.barajar();
        
        
        //Poner investigador en el Estudio
        Roland.setLugar(Estudio);

        //Crea mazo encuentro
        MazoEncuentro.barajar();
    
    Escenario escenario=new Escenario();
    escenario.introEscenario();
    
    
    
    
    
    
    }
    
    
    
}
