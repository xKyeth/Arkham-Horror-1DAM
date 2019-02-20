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
public class TheBarrier extends Carta_Acto {
    public TheBarrier() {
        coste=3;
        add=false;
        titulo="La barrera";
        pretexto="Una brillante barrera os bloquea el paso hacia la salita. Al acercaros, un intenso calor os obliga a retroceder. Cogéis algo de tierra y la lanzáis contra la barrera, donde para vuestro horror queda totalmente incinerada. Puede que en el sótano o el ático haya algo que os sirva de ayuda.";
        accion="La barrera que bloqueaba el paso hacia la Salita se ha desvanecido. Revela la Salita.\n" +
"\n" +
"Pon en juego en la Salita la carta Lita Chantler que habías puesto aparte.\n" +
"\n" +
"Haz aparecer en el Pasillo el Sacerdote gul que habías puesto aparte.";
        objetivo="Cuando acabe la ronda, los investigadores que estén en el Pasillo pueden, como grupo, gastar la cantidad necesaria de pistas para hacer avanzar el acto.";
        texto="Usáis el barril del ático para transportar hielo y nieve del sótano y lanzarlo contra la barrera. Ésta chisporrotea y vibra al consumir el hielo, para después desvanecerse con un siseo.";
    }
    @Override
    public boolean usarCarta(int pistas, Object obj, PruebasCombate pr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
