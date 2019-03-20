/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BolsaDelCaos.BolsaDelCaos;
import ClaseMano.uso_descarte_cartas;
import Lugar.Estudio;
import Lugar.Lugar;
import Lugar.Lugares;
import Lugar.Pasillo;
import Lugar.Salita;
import Lugar.Sótano;
import Lugar.Ático;
import Mazo_Plan.MazoPlan;
import CartasInvestigador.Carta;
import Modelo.Cartas.Cartas_Acto.MazoActo;
import Modelo.Cartas.MazoEncuentros;
import Modelo.MazoInvestigador;
import Modelo.RolandBanks;
import java.util.ArrayList;
import Escenarios.Escenario;
import java.util.LinkedList;
import modelohabilidad.*;
import Modelo.Enemigo;
/**
 *
 * @author usuario
 */
public class Fase {
    
    RolandBanks Roland;

    Lugar Estudio = new Estudio();
    Lugar Pasillo = new Pasillo();
    Lugar Salita = new Salita();
    Lugar Sotano = new Sótano();
    Lugar Atico = new Ático();
    Lugares lugares = new Lugares(Estudio, Pasillo, Salita, Sotano, Atico);
    BolsaDelCaos BolsaDelCaos = new BolsaDelCaos();
    MazoActo MazoActo = new MazoActo();
   // MazoPlan MazoPlan = new MazoPlan();
    MazoEncuentros MazoEncuentro = new MazoEncuentros();
    MazoInvestigador MazoInvestigador = new MazoInvestigador();
    uso_descarte_cartas UsoDeCartasInvestigador=new uso_descarte_cartas();
  ArrayList<CartasInvestigador.Apoyo> Apoyo=new ArrayList();
    LinkedList<Carta> CartasEscenario=new LinkedList();
    
    PruebaCombate pruebaCombate=new PruebaCombate();
    
    
}
