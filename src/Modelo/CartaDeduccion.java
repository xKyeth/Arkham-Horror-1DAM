package Modelo;

/*
* Autor: Juan Martin Ayala
*/
import CartasInvestigador.Habilidad;
        
public class CartaDeduccion extends Habilidad{
    
    
    
    public CartaDeduccion(){
        super("Deduccion",false,0 ,0, 1, 0, 0, 0);  
    }
    
    @Override
    public void verCarta(){
        System.out.println("Tipo de carta: Habilidad");
        System.out.println("Iconos: Intelecto 1");
        System.out.println("Si esta prueba de habilidad tiene éxito al investigar un Lugar, descubre 1 pista adicional en ese Lugar");
        System.out.println("Sabía que había visto antes este símbolo. ¡Debo advertir a los demás antes de que sea demasiado tarde");
    }
    
    
    public void Accion(Investigador investigador){
        //if (pruebaHabilidad.exito==true){
            
            if(investigador.getLugar().pistas==0){
                System.out.println("No quedan pistas");
            }else {
                System.out.println("Obtienes pista extra");
                investigador.getLugar().pistas--;
                investigador.setNumeroPistas(investigador.getNumeroPistas()+1);
            }
        //}
    }     
    
}
