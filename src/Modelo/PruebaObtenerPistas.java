package Modelo;
/*
* Autor: Juan Martin Ayala
*/
import modelohabilidad.PruebaHabilidad;
public class PruebaObtenerPistas {

    RolandBanks roland;
    PruebaHabilidad prueba;

public void investigar() {
       if (prueba.isX()==true){
            System.out.println("Descubre pista");
            if(roland.getLugar().pistas==0){
                System.out.println("No quedan pistas");
            }else {
                roland.getLugar().pistas--;
                roland.setNumeroPistas(roland.getNumeroPistas()+1);
            }
            
        }else {
            System.out.println("No descubre pista");
        }
    }
}