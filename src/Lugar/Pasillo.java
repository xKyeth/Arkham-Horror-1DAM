
package Lugar;

public class Pasillo extends Lugar{
    
    public Pasillo(){
        super.nombre = "Pasillo";
        super.descripcionNR = "Pasáis por un instante de pánico y desorientación al caer sobre el suelo del pasillo. El mundo gira como si se hubiera dado la vuelta.";
        super.descripcionR = "Las paredes de la casa están salpicadas de barro, y el suelo de madera ha desaparecido, sustituido por un camino de tierra.";
        super.velo = 1;
        super.pistas = 0;
    }
    

    //Este método es de prueba para comprobar si sale todo correctamente.
    public void muestra(Pasillo p){
        super.caraNoRevelada(p);
        super.caraRevelada(p);
    }
    
}
