/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Cristian
 */
public class CartaViejoLibroDeConocimiento extends Carta{
    
    RolandBanks roland;
    private int voluntad;
    private int coste;
    private String nombre;

    
    public CartaViejoLibroDeConocimiento(){
        voluntad = 1;
        coste = 3;
        nombre = "Viejo Libro De Conocimiento";
    }
    
    public void accion(){
        System.out.println("Agota el Viejo libro de conocimiento: Elige un investigador "
                + "que esté en tu Lugar. Ese investigador busca 1 carta entre las 3 primeras "
                + "cartas de su mazo, la roba, devuelve las cartas restantes a su mazo y lo baraja.");
        
    }
}
