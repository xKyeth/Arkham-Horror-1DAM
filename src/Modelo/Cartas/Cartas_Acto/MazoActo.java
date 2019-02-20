/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.Cartas_Acto;
import java.util.ArrayList;
/**
 *
 * @author pecorte
 */
public class MazoActo {
    ArrayList <Carta_Acto> mazo = new ArrayList();
    ArrayList <Carta_Acto> cartasused = new ArrayList();

    public MazoActo() {
        Carta_Acto c;
        mazo.add(c=new Conspiracy());
        mazo.add(c=new Darkness());
        mazo.add(c=new Ritual());
        mazo.add(c=new TheBarrier());
        mazo.add(c=new Trail());
        mazo.add(c=new Trapped());
        mazo.add(c=new WHYDone());
    }
    
}
