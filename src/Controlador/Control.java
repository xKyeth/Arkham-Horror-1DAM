/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Escenarios.Escenario;
import Vista.VistaFaseInvestigacion;


/**
 *
 * @author Jose
 */
public class Control {

    boolean acabarPartida = false;
    VistaFaseInvestigacion v;

    private Boolean investigacion=false;
    Escenario escenario=new Escenario();
    public Control() {
    v = new VistaFaseInvestigacion(this);

    }

    public void ComenzarJuego() {
        

        
        FasePrepararPartida FasePrepararPartida=new FasePrepararPartida();
        
        FasePrepararPartida.RealizarFasePrepararPartida();
        
        setInvestigacion((Boolean) true);
        
        ControlFaseInvestigacion FaseInvestigacion=new ControlFaseInvestigacion();
        
        FaseEnemigos FaseEnemigos=FaseInvestigacion.procesaOrden(v.MenuPrincipal());
        
        setInvestigacion((Boolean) false);
      
        FaseMantenimiento FaseMantenimiento=FaseEnemigos.RealizaFaseEnemigos();
       
   
        
        while (true != acabarPartida) {
            
     
        
            FaseMito FaseMito=FaseMantenimiento.RealizaFaseMantenimiento();
            
            FaseInvestigacion=FaseMito.RealizaFaseMito();
            
            setInvestigacion((Boolean) true);
            FaseEnemigos=FaseInvestigacion.procesaOrden(v.MenuPrincipal());
            setInvestigacion((Boolean) false);
            
            FaseMantenimiento=FaseEnemigos.RealizaFaseEnemigos();
            
       
           
        }
        
        escenario.resultado();

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
