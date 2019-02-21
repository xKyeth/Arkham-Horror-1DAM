
package Lugar;

public class Estudio extends Lugar{
    
    public Estudio(){
        super.nombre = "Estudio";
        super.descripcionNR = "Lleváis varios días estudiando los extraños sucesos que están ocurriendo en Arkham. El escritorio está cubierto de artículos de periódico, informes policiales y declaraciones de testigos.";
        super.descripcionR = "La puerta del estudio se ha desvanecido.";
        super.velo = 2;
        super.pistas = 2;
    }
    
    
    //Este método es de prueba para comprobar si sale todo correctamente.
    public void muestra(Estudio e){
        super.caraNoRevelada(e);
        super.caraRevelada(e);
    }
    
}
