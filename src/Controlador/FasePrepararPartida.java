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
 * @author jose
 */
public class FasePrepararPartida extends Fase{
    
    public FasePrepararPartida(){};
    
    
    public void RealizarFasePrepararPartida(){
    
    //Elegir investigador/Por ahora NO SE IMPLEMENTA
        setRoland(new RolandBanks());
        //Crear y barajar mazo Jugador

       
        MazoInvestigadorFinal= getMazoInvestigador().getListaCartasMazo();
        Collections.shuffle(getMazoInvestigador().getListaCartasMazo());
        getMazoInvestigador().setListaMazo(MazoInvestigadorFinal);

        //Robar mano inicial
        uso_descarte_cartas UDC=new uso_descarte_cartas();
        UDC.robar5cartas();
        //Preparar mazo de Plan
        //MazoPlan.añadirCartasPlan();

        //Preparar mazo de acto
       // getMazoActo().barajar();
        
        
        //Poner investigador en el Estudio
        getRoland().setLugar(getEstudio());

        //Crea mazo encuentro
        getMazoEncuentro().barajar();
    
    Escenario escenario=new Escenario();
    escenario.introEscenario();
    
    
    
    
    
    
    }
    
    
    
}
