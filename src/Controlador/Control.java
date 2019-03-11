package Controlador;
/**AUTOR ALEXANDRA**/
import java.util.ArrayList;
import Modelo.BD;
import Modelo.Carta;
import Modelo.Investigador;
import Modelo.MazoInvestigador;
import Vista.Vista;

public class Control {
    
    private BD bd;
    private Vista vista;
    private MazoInvestigador mazo;
    private boolean salir=false;
    Investigador investigador;
    
    public Control(){
        bd=new BD();
        vista=new Vista(this);
        vista.MenuPrincipal();
    }
    
    public void procesaOrden(int opcion){
        
        while(!salir){
            
            switch(opcion){
                case 1:
                    
                    vista.MenuPrincipal();
                    break;
                    
                case 2:
                    investigador.getRecursoFase();
                    vista.MenuPrincipal();
                    break;
                    
                case 3:
                    
                    vista.MenuPrincipal();
                    break;
                    
                case 4:
                    
                    vista.MenuPrincipal();
                    break;
                    
                case 5:
                    
                    vista.MenuPrincipal();
                    break;
                    
                case 6:
                    
                    vista.MenuPrincipal();
                    break;
                    
                case 7:
                    
                    vista.MenuPrincipal();
                    break;
                    
                case 8:
                    
                    vista.MenuPrincipal();
                    break;
                    
                case 9:
                    
                    vista.MenuPrincipal();
                    break;

                default:
                   System.out.println("Opción incorrecta.");
                   vista.MenuPrincipal();
                   break;
           }
        }
    }
}
