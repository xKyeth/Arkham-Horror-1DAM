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
public class ControlGeneral {

    boolean acabarPartida = false;
    VistaFaseInvestigacion v;
    int Ronda=1;
    private Boolean investigacion=false;
    Escenario escenario=new Escenario();
    public ControlGeneral() {
        v = new VistaFaseInvestigacion(this);

    }

    public void ComenzarJuego() {
        System.out.println(Ronda);
        
        FasePrepararPartida FasePrepararPartida=new FasePrepararPartida();
        
        setInvestigacion((Boolean) true);
        
        ControlFaseInvestigacion FaseInvestigacion=new ControlFaseInvestigacion();
        FaseEnemigos FaseEnemigos=FaseInvestigacion.procesaOrden(v.MenuPrincipal());
        
        setInvestigacion((Boolean) false);
      
        FaseMantenimiento FaseMantenimiento=FaseEnemigos.RealizaFaseEnemigos();
       
        Ronda++;
        
        while (true != acabarPartida) {
        System.out.println(Ronda);
        
            FaseMito FaseMito=FaseMantenimiento.RealizaFaseMantenimiento();
            
            FaseInvestigacion=FaseMito.RealizaFaseMito();
            
            setInvestigacion((Boolean) true);
            FaseEnemigos=FaseInvestigacion.procesaOrden(v.MenuPrincipal());
            setInvestigacion((Boolean) false);
            
            FaseMantenimiento=FaseEnemigos.RealizaFaseEnemigos();
           Ronda++;
           
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
