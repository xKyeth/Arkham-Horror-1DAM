/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.Cartas_Acto;
import Modelo.Cartas.Carta;
import Modelo.PruebasCombate;

/**
 *
 * @author pecorte
 */
public abstract class Carta_Acto extends Carta {
    int coste;
    boolean add;
    String titulo;
    String pretexto;
    String accion;
    String objetivo;
    String texto;    
    
    public String getTitulo() {
        return titulo;
    }

    public String getPretexto() {
        return pretexto;
    }

    public String getAccion() {
        return accion;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public String getTexto() {
        return texto;
    }
    
    abstract public boolean usarCarta(int pistas, Object obj, PruebasCombate pr);
}
