/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.Cartas_Acto;
import Modelo.Investigador;

/**
 *
 * @author pecorte
 */
public class Atrapados extends Carta_Acto {
    public Atrapados() {
        super("Atrapados", false, 0);
        coste=2;
        add=false;
        pretexto="Tampoco era un verdadero hogar. ¡Quemémoslo!";
        accion="Pon en juego el Pasillo, el Sótano, el Ático y la Salita que habías puesto aparte.\n" +
"\n" +
"Descarta todos los Enemigos del Estudio.\n" +
"\n" +
"Coloca a todos los investigadores en el Pasillo.\n" +
"\n" +
"Retira el Estudio de la partida.";
        objetivo=null;
        texto="Os dais cuenta de que los bordes de la alfombra recién comprada están deshilachados y manchados de barro. Al encontrarlo extraño, decidís apartar los muebles y quitar la alfombra. Para vuestra sorpresa, veis la puerta de salida del estudio. Uno de vosotros gira lentamente el picaporte, y la puerta se abre para descubrir que bajo ella se encuentra el pasillo.\n" +
"Saltáis por el umbral y caéis sobre una tierra blanda. La puerta del estudio se cierra de golpe sobre vuestras cabezas. Un olor a madera quemada llena el estrecho pasillo, mezclado con el hedor de la putrefacción y la descomposición.";
    }

    @Override
    public void Accion(Investigador investigador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
