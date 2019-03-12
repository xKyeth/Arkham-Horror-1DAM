/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.VistaFaseInvestigacion;


/**
 *
 * @author Jose
 */
public class ControlGeneral {

    boolean acabarPartida = false;
    VistaFaseInvestigacion v;
   


    private Boolean investigacion=false;

    public ControlGeneral() {
        v = new VistaFaseInvestigacion(this);

    }

    public void ComenzarJuego() {

        FasePrepararPartida FasePrepararPartida=new FasePrepararPartida();
        
        setInvestigacion((Boolean) true);
        FaseInvestigacion FaseInvestigacion=new FaseInvestigacion();
        FaseEnemigos FaseEnemigos=FaseInvestigacion.RealizarFaseInvestigacion(v.MenuPrincipal());
        setInvestigacion((Boolean) false);
      
        FaseMantenimiento FaseMantenimiento=FaseEnemigos.RealizaFaseEnemigos();
        
        while (true != acabarPartida) {

            FaseMito FaseMito=FaseMantenimiento.RealizaFaseMantenimiento();
            
            FaseInvestigacion=FaseMito.RealizaFaseMito();
            
             setInvestigacion((Boolean) true);
            FaseEnemigos=FaseInvestigacion.RealizarFaseInvestigacion(v.MenuPrincipal());
            setInvestigacion((Boolean) false);
            
            FaseMantenimiento=FaseEnemigos.RealizaFaseEnemigos();
           
        }

    }

   

 


    /**
     * @return the investigacion
     */
    public Boolean getInvestigacion() {
        return investigacion;
    }

    /**
     * @param investigacion the investigacion to set
     */
    public void setInvestigacion(Boolean investigacion) {
        this.investigacion = investigacion;
    }
}
