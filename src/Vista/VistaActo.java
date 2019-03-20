/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Cartas.Cartas_Acto.Carta_Acto;
import java.util.ArrayList;

/**
 *
 * @author pecorte
 */
public class VistaActo {
    public void verCartas(ArrayList <Carta_Acto> c){
        for(Carta_Acto x: c){
            System.out.println("Indice :"+ c.indexOf(x));
            System.out.println("Titulo: "+x.getNombreCarta());
            System.out.println(x.getPretexto());
            System.out.println("Necesario: "+x.getObjetivo());
            System.out.println(x.getAccion());
            System.out.println(x.getTexto());
        }
    }
}
