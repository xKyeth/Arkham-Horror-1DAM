
package Lugar;

public class Pasillo extends Lugar{
    
    public Pasillo(){
        super("Pasillo", false);
        super.descripcionNR = "Pasáis por un instante de pánico y desorientación al caer sobre el suelo del pasillo. El mundo gira como si se hubiera dado la vuelta.";
        super.descripcionR = "Las paredes de la casa están salpicadas de barro, y el suelo de madera ha desaparecido, sustituido por un camino de tierra.";
        super.velo = 1;
        super.pistas = 0;
    }

    @Override
    public void Accion() {
    }
    
}
