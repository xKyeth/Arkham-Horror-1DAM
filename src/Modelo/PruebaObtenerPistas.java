package Modelo;
/*
* Autor: Juan Martin Ayala
*/
public class PruebaObtenerPistas {
    public boolean exito=false;
    RolandBanks roland;

public void investigar() {
        if (exito==true){
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