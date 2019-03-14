package Modelo;
/*
* Autor: Juan Martin Ayala
*/
import CartasMito.Traicion;

public class EnvueltoEnNiebla extends Traicion{

    RolandBanks roland;
    int contador=0;
    
    public EnvueltoEnNiebla() {
        super("EnvueltoEnNiebla", false, 0);
    }
    
    @Override
    public void Accion(Investigador investigador) {
        if(contador==0){
            roland.getLugar().setVelo(roland.getLugar().getVelo()+2);
            contador++;
        }else{
            System.out.println("Ya se ha aplicado el aumento del velo");
        }
    }
    
//    public void Obligado(){
//        if(roland.getLugar().investigado=true){
//            roland.getLugar().setVelo(roland.getLugar().getVelo()-2);
//            descartar(this);
//        }
//    }
    
    
public void verCarta(){
    System.out.println("Tipo de carta: Habilidad");
    System.out.println("Revelación: Vincula esta carta a tu Lugar. Límite de 1 por Lugar");
    System.out.println("El Lugar vinculado recibe +2 a velo.");
    System.out.println("Obligado - Después de que el Lugar vinculado sea investigado con éxito: Descarta Envuelto en niebla.");
}


}
