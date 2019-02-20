/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.Cartas_Acto;

import Modelo.PruebasCombate;

/**
 *
 * @author alumno
 */
public class Ritual extends Carta_Acto {
    public Ritual() {
        coste=0;
        add=true;
        titulo="Disrupting the Ritual";
        pretexto="The site of the cult's ritual is inside a large cavern in a dark corner of the woods. In the center of the chamber is a candlelit circle marked by rocks and arcane runes.";
        accion="Spend 1 clue: Test  (3) or  (3). If you succeed, place 1 clue on this Act.";
        objetivo="If there are 2 clues per investigator on this Act, advance.";
        texto="You brave the unnatural chill and weave through arcane symbols, crossing the threshold of the circle. You smother the markings on the ground, covering them with dirt, breaking apart the carefully constructed pattern of smooth rocks. A shrill noise pierces your ears as the air grows suddenly warmer, and the world distorts around you, settling into normality.";
    }
    @Override
    public boolean usarCarta(int pistas, Object obj, PruebasCombate pr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
