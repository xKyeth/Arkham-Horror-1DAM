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
public class QueHabeisHecho extends Carta_Acto {
    String opc1="Tampoco era un verdadero hogar. ¡Quemémoslo!";
    String opc2="¡Este \"pozo infernal\" es mi hogar! ¡Ni hablar de quemarlo! ";
    public QueHabeisHecho() {
        super("¿Qué habéis hecho?", false, 0);
        coste=0;
        add=true;
        pretexto="En la salita hay una mujer con una antorcha y un brillo de odio en los ojos. —¿Qué le habéis hecho a mi barrera? —grita con furia. Antes de que podáis contestar, un espectral alarido suena a vuestra espalda, y una criatura vestida con túnica y una máscara hecha con el cráneo de un ciervo atraviesa la pared y avanza hacia vosotros.";
        accion="Avanza el acto";
        objetivo="Si el Sacerdote gul es derrotado, haz avanzar el acto.";
        texto="Cuando la criatura de la túnica cae, la diabólica horda vuelve a meterse en el suelo, y el caos de la casa se calma. Pero la desconocida de la salita no parace aliviada.\n" +
"—Habéis roto el sello que coloqué para atrapar a los gules en el interior —dice mientras levanta la antorcha—. ¡Ahora tendremos que tomar medidas más directas y quema este pozo infernal hasta los cimientos!";
        
    }

    public String getOpc1() {
        return opc1;
    }

    public String getOpc2() {
        return opc2;
    }
    
    @Override
    public void Accion(Investigador investigador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
