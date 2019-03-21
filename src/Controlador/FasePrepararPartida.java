/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import ClaseMano.uso_descarte_cartas;
import Escenarios.Escenario;
import Modelo.RolandBanks;
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

       
        setMazoInvestigadorFinal(getMazoInvestigador().getListaCartasMazo());
        
        Collections.shuffle(getMazoInvestigador().getListaCartasMazo());
        
        getMazoInvestigador().setListaMazo(getMazoInvestigadorFinal());

        //Robar mano inicial
        
        
        getUsoDeCartasInvestigador().robar5cartas();
        

        //Poner investigador en el Estudio
        getRoland().setLugar(getEstudio());

        //Crea mazo encuentro
        getMazoEncuentro().barajar();
    
           
        Escenario escenario=new Escenario();
        
        escenario.introEscenario();
    
    
    
    
    
    
    }
    
    
    
}
