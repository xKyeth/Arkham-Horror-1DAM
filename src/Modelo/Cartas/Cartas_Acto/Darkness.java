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
public class Darkness extends Carta_Acto {
    public Darkness() {
        coste=0;
        add=true;
        titulo="Into the Darkness";
        pretexto="The remaining cultists have followed you into the woods to try to stop you, and now they block the path to your objective. They stand ominously beneath the overhanging trees, silent sentinels in the night. You must defeat them or sneak past if you are to gain access to the site of their ritual.";
        accion="Shuffle the encounter discard pile into the encounter deck. Discard cards from the top of the encounter deck until 1 enemy is discarded (2 enemies instead if there are 3 or more players in the game). Spawn each discarded enemy at the Ritual Site.";
        objetivo=" If an investigator enters the Ritual Site, advance.";
        texto="When you enter the cave, the air grows cold, and your nostrils are assaulted by the pungent smell of blood and rot.";
    }

    @Override
    public boolean usarCarta(int pistas, Object obj, PruebasCombate pr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
