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
public class Vias extends Carta_Acto {
    public Vias() {
        coste=3;
        add=false;
        titulo="Investigating the Trail";
        pretexto="The evidence you've gathered has led you to the woods south of Arkham, where you believe a ritual to summon a being called \"Umôrdhoth\" is about to take place. Steeling your resolve, you set forth deeper into the woods, hoping to find the site of this ritual.";
        accion="Put the set-aside Ritual Site into play if it is not already in play.\n" +
"\n" +
"Search the collection for each enemy recorded in your Campaign Log under \"Cultists who got away,\" and spawn those enemies at the Main Path.";
        objetivo=null;
        texto="Scattered throughout the forest you've seen glyphs and arcane sigils in various places — etched into the bark of trees, carved upon the faces of stones, and dripped in blood upon the ground. Though you cannot decipher these glyphs, you notice that most of them tend to face south. Following these signs leads you by twists and turns towards a cave in the darkest and coldest part of the forest.\n" +
"As you advance, shadowy figures emerge from the trees, blocking the only path to the cave.";
    }
    @Override
    public boolean usarCarta(int pistas, Object obj, PruebasCombate pr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
