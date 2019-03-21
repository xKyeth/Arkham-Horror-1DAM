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
import CartasInvestigador.*;
import Modelo.Cartas.Cartas_Acto.MazoActo;
import Modelo.Cartas.MazoEncuentros;
import Modelo.MazoInvestigador;
import Modelo.RolandBanks;
import java.util.ArrayList;
import java.util.LinkedList;
import modelohabilidad.*;
import Modelo.Enemigo;
import java.util.Scanner;
/**
 *
 * @author jose
 */
public class Fase {
    
    private RolandBanks Roland;

    private Lugar Estudio = new Estudio();
    private Lugar Pasillo = new Pasillo();
    private Lugar Salita = new Salita();
    private Lugar Sotano = new Sótano();
    private Lugar Atico = new Ático();
    private Lugares lugares = new Lugares(Estudio, Pasillo, Salita, Sotano, Atico);
    private BolsaDelCaos BolsaDelCaos = new BolsaDelCaos();
    private MazoActo MazoActo = new MazoActo();
    private MazoPlan MazoPlan = new MazoPlan("Mazo");
    private MazoEncuentros MazoEncuentro = new MazoEncuentros(Roland);
    private MazoInvestigador MazoInvestigador = new MazoInvestigador();
    private uso_descarte_cartas UsoDeCartasInvestigador=new uso_descarte_cartas();
    private ArrayList<Apoyo> Apoyo=new ArrayList();
    private LinkedList<Carta> CartasEscenario=new LinkedList();
    private ArrayList<Enemigo> enemigos=new ArrayList<Enemigo>();
    private PruebaCombate pruebaCombate=new PruebaCombate();
    private Scanner sr=new Scanner(System.in);
    private EvitarEnemigo evitar = new EvitarEnemigo();
    private ArrayList<CartasInvestigador> MazoInvestigadorFinal = new ArrayList();
    private MovimientoCazador MovimientoCazador= new MovimientoCazador();

    /**
     * @return the Roland
     */
    public RolandBanks getRoland() {
        return Roland;
    }

    /**
     * @param Roland the Roland to set
     */
    public void setRoland(RolandBanks Roland) {
        this.Roland = Roland;
    }

    /**
     * @return the Estudio
     */
    public Lugar getEstudio() {
        return Estudio;
    }

    /**
     * @param Estudio the Estudio to set
     */
    public void setEstudio(Lugar Estudio) {
        this.Estudio = Estudio;
    }

    /**
     * @return the Pasillo
     */
    public Lugar getPasillo() {
        return Pasillo;
    }

    /**
     * @param Pasillo the Pasillo to set
     */
    public void setPasillo(Lugar Pasillo) {
        this.Pasillo = Pasillo;
    }

    /**
     * @return the Salita
     */
    public Lugar getSalita() {
        return Salita;
    }

    /**
     * @param Salita the Salita to set
     */
    public void setSalita(Lugar Salita) {
        this.Salita = Salita;
    }

    /**
     * @return the Sotano
     */
    public Lugar getSotano() {
        return Sotano;
    }

    /**
     * @param Sotano the Sotano to set
     */
    public void setSotano(Lugar Sotano) {
        this.Sotano = Sotano;
    }

    /**
     * @return the Atico
     */
    public Lugar getAtico() {
        return Atico;
    }

    /**
     * @param Atico the Atico to set
     */
    public void setAtico(Lugar Atico) {
        this.Atico = Atico;
    }

    /**
     * @return the lugares
     */
    public Lugares getLugares() {
        return lugares;
    }

    /**
     * @param lugares the lugares to set
     */
    public void setLugares(Lugares lugares) {
        this.lugares = lugares;
    }

    /**
     * @return the BolsaDelCaos
     */
    public BolsaDelCaos getBolsaDelCaos() {
        return BolsaDelCaos;
    }

    /**
     * @param BolsaDelCaos the BolsaDelCaos to set
     */
    public void setBolsaDelCaos(BolsaDelCaos BolsaDelCaos) {
        this.BolsaDelCaos = BolsaDelCaos;
    }

    /**
     * @return the MazoActo
     */
    public MazoActo getMazoActo() {
        return MazoActo;
    }

    /**
     * @param MazoActo the MazoActo to set
     */
    public void setMazoActo(MazoActo MazoActo) {
        this.MazoActo = MazoActo;
    }

    /**
     * @return the MazoEncuentro
     */
    public MazoEncuentros getMazoEncuentro() {
        return MazoEncuentro;
    }

    /**
     * @param MazoEncuentro the MazoEncuentro to set
     */
    public void setMazoEncuentro(MazoEncuentros MazoEncuentro) {
        this.MazoEncuentro = MazoEncuentro;
    }

    /**
     * @return the MazoInvestigador
     */
    public MazoInvestigador getMazoInvestigador() {
        return MazoInvestigador;
    }

    /**
     * @param MazoInvestigador the MazoInvestigador to set
     */
    public void setMazoInvestigador(MazoInvestigador MazoInvestigador) {
        this.MazoInvestigador = MazoInvestigador;
    }

    /**
     * @return the UsoDeCartasInvestigador
     */
    public uso_descarte_cartas getUsoDeCartasInvestigador() {
        return UsoDeCartasInvestigador;
    }

    /**
     * @param UsoDeCartasInvestigador the UsoDeCartasInvestigador to set
     */
    public void setUsoDeCartasInvestigador(uso_descarte_cartas UsoDeCartasInvestigador) {
        this.UsoDeCartasInvestigador = UsoDeCartasInvestigador;
    }

    /**
     * @return the Apoyo
     */
    public ArrayList<Apoyo> getApoyo() {
        return Apoyo;
    }

    /**
     * @param Apoyo the Apoyo to set
     */
    public void setApoyo(ArrayList<Apoyo> Apoyo) {
        this.Apoyo = Apoyo;
    }

    /**
     * @return the CartasEscenario
     */
    public LinkedList<Carta> getCartasEscenario() {
        return CartasEscenario;
    }

    /**
     * @param CartasEscenario the CartasEscenario to set
     */
    public void setCartasEscenario(LinkedList<Carta> CartasEscenario) {
        this.CartasEscenario = CartasEscenario;
    }

    /**
     * @return the enemigos
     */
    public ArrayList<Enemigo> getEnemigos() {
        return enemigos;
    }

    /**
     * @param enemigos the enemigos to set
     */
    public void setEnemigos(ArrayList<Enemigo> enemigos) {
        this.enemigos = enemigos;
    }

    /**
     * @return the pruebaCombate
     */
    public PruebaCombate getPruebaCombate() {
        return pruebaCombate;
    }

    /**
     * @param prueboCmbate the pruebaCombate to set
     */
    public void setPruebaCombate(PruebaCombate prueboCmbate) {
        this.pruebaCombate = prueboCmbate;
    }

    /**
     * @return the sr
     */
    public Scanner getSr() {
        return sr;
    }

    /**
     * @param sr the sr to set
     */
    public void setSr(Scanner sr) {
        this.sr = sr;
    }

    /**
     * @return the MazoPlan
     */
    public MazoPlan getMazoPlan() {
        return MazoPlan;
    }

    /**
     * @param MazoPlan the MazoPlan to set
     */
    public void setMazoPlan(MazoPlan MazoPlan) {
        this.MazoPlan = MazoPlan;
    }

    /**
     * @return the evitar
     */
    public EvitarEnemigo getEvitar() {
        return evitar;
    }

    /**
     * @param evitar the evitar to set
     */
    public void setEvitar(EvitarEnemigo evitar) {
        this.evitar = evitar;
    }

    /**
     * @return the MazoInvestigadorFinal
     */
    public ArrayList<CartasInvestigador> getMazoInvestigadorFinal() {
        return MazoInvestigadorFinal;
    }

    /**
     * @param MazoInvestigadorFinal the MazoInvestigadorFinal to set
     */
    public void setMazoInvestigadorFinal(ArrayList<CartasInvestigador> MazoInvestigadorFinal) {
        this.MazoInvestigadorFinal = MazoInvestigadorFinal;
    }

    /**
     * @return the MovimientoCazador
     */
    public MovimientoCazador getMovimientoCazador() {
        return MovimientoCazador;
    }

    /**
     * @param MovimientoCazador the MovimientoCazador to set
     */
    public void setMovimientoCazador(MovimientoCazador MovimientoCazador) {
        this.MovimientoCazador = MovimientoCazador;
    }
    
}
