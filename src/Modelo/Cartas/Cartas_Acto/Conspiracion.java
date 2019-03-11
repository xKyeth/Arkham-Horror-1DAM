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
public class Conspiracion extends Carta_Acto {

    public Conspiracion() {
        coste=0;
        add=true;
        titulo="Descubriendo la conspiración";
        pretexto="Tenéis una noche para encontrar a los miembros de esta secta y descubrir su plan. Cuantos más miembros de la secta podáis encontrar e interrogar antes de la medianoche, mejor.";
        accion="Los investigadores, como grupo, gastan 2 pistas por investigador: Roba la primera carta del mazo de Sectarios.";
        objetivo="Encuentra tantos Enemigos Sectario únicos como puedas y añádelos a la zona de victoria. Si hay 6 Enemigos Sectario únicos en la zona de victoria, haz avanzar el acto. Nota: No están los 6 en el mazo de Sectarios.";
        texto="Habéis tenido éxito en descubrir la identidad de todos los miembros de alto rango de la secta en Arkham. El hombre que os ha perseguido por toda la ciudad estaba realmente entregado a sus creencias, así como Herman, el enterrador del cementerio. Otros parecían haber sido coaccionados para que ayudasen a la secta. A Ruth, la técnica funeraria, le habían dicho que matarían a su familia si no proveía a los gules de cadáveres frescos. Por suerte, lograsteis ayudarla a escapar del hospital a salvo. A Peter, el profesor, fue necesario convencerlo de que su implicación con la secta haría más mal que bien. La obsesión de Victoria por los artefactos de ocultismo la había hecho caer de lleno en las redes de la secta. Cuando os enfrentasteis a Drew en el manicomio, os atacó, pero curiosamente lo hizo porque pensaba que erais parte de la secta. Cuanto más os adentráis en esta conspiración, más patente queda que ha arruinado muchas vidas.";
    }
   
    @Override
    public boolean usarCarta(int pistas, Object obj, PruebasCombate pr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
