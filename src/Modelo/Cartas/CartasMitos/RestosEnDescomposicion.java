/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Cartas.CartasMitos;

import CartasMito.Traicion;
import Modelo.Investigador;
import Modelo.RolandBanks;

/**
 *
 * @author usuario
 */
public class RestosEnDescomposicion extends Traicion{
    
    RolandBanks roland;

    public RestosEnDescomposicion(String nombreCarta, boolean preparada, int fichaPerdicion) {
        super("Restos en descomposición", false, 0);
    }
    
  

    @Override
    public void Accion(Investigador investigador) {
        
        int x=roland.getIntelecto();
        while (x<3){
            
            int y=roland.getHorror()+1;
            
            roland.setHorror(y);
            
            x++;
        }
    }
}
