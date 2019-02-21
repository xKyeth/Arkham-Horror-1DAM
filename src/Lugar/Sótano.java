
package Lugar;

public class Sótano extends Lugar{
    
    public Sótano(){
        super.nombre = "Sótano";
        super.descripcionNR = "Las escaleras que bajan al sótano están resbaladizas y brillan con una fina capa de hielo…";
        super.descripcionR = "El sótano parece haber quedado sustituido por una red subterránea de helados túneles y cavernas. El frío os hiela hasta el tuétano.";
        super.velo = 4;
        super.pistas = 2;
        super.obligado = "**Después de que entres en el Sótano: Recibe 1 punto de daño.**";
    }
    
    
    //Este método es de prueba para comprobar si sale todo correctamente.
    public void muestra(Sótano so){
        super.caraNoRevelada(so);
        super.caraRevelada(so);
    }
    
}
