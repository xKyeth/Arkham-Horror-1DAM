
package Lugar;

import Modelo.Investigador;

public class Estudio extends Lugar{
    
    public Estudio(){
        super("Estudio",false,0);
        super.descripcionNR = "Lleváis varios días estudiando los extraños sucesos que están ocurriendo en Arkham. El escritorio está cubierto de artículos de periódico, informes policiales y declaraciones de testigos.";
        super.descripcionR = "La puerta del estudio se ha desvanecido.";
        super.velo = 2;
        super.pistas = 2;
    }

    @Override
    public void Accion(Investigador investigador) {
    }

    
}
