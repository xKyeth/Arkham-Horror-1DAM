/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Fase;
import Lugar.Lugar;
import Lugar.Lugares;
import Vista.Vista;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class CartaExplosionDeDInamita extends CartasInvestigador.Evento{
    Vista mensaje;
    Scanner sc;
    public CartaExplosionDeDInamita(Fase fase, String nombreCarta, boolean preparada, int fichaPerdicion, int voluntad, int intelecto, int habilidad, int combate, int comodin, int coste) {
        super(fase,"Explosion De Dinamita", true, fichaPerdicion, 1, 0, 0, 0, 0, 5);
        this.sc=new Scanner(System.in);
        this.mensaje=new Vista();
    }
    
    @Override
    public void verCarta() {
        mensaje.muestraMensaje("Explosion de dinamita "
                + " elige un lugar conectado: "
                + "Hace 3 puntos de daño a cada investigador y monstruo que se encuentre en el lugar elegido");
    }

    @Override
    public void Accion(Investigador investigador) {
        String opcion;
        Boolean correcto=false;
        Boolean correctodos=false;
        HashMap<String,Lugar> lugar=new HashMap<String,Lugar>();
        do{
                
                    mensaje.muestraMensaje("Actualmente estas en: "+investigador.getLugar());
                    mensaje.muestraMensaje("Las zonas abyacentes a ti son: "+this.getFase().getLugares().getConexiones(investigador.getLugar()));
                    mensaje.muestraMensaje("Selecciona tu zona o   una abyacente");
                opcion=sc.next().toUpperCase();

                    lugar.put("ESTUDIO", this.getFase().getEstudio());
                    lugar.put("PASILLO", this.getFase().getPasillo());
                    lugar.put("SALITA", this.getFase().getSalita());
                    lugar.put("SOTANO", this.getFase().getSotano());
                    lugar.put("ATICO", this.getFase().getAtico());
                    lugar.get(opcion);
                if(lugar.containsKey(opcion)){
                    correctodos=true;
                }else{
                    mensaje.muestraMensaje("Esta zona no existe, prueba otra");
                }
        }while(correctodos==false);
        
        for(int i=0;i<this.getFase().getEnemigos().size();i++){
            if(this.getFase().getEnemigos().get(i).getLugar()==investigador.getLugar()){
                mensaje.muestraMensaje("Usas la carga explosiva en tu sala, ¡si vas a morir te llevarás a esa escoria por delante!");
                this.getFase().getEnemigos().get(i).setVida(this.getVida()-3);
                investigador.setVida(investigador.getVida()-3);
                correcto=true;
            }else if(this.getFase().getLugares().getConexiones(investigador.getLugar()).contains(lugar)&&this.getFase().getEnemigos().get(i).getLugar()!=investigador.getLugar()){
                mensaje.muestraMensaje("Lanzas la carga explosiva en "+opcion+" un resplandor y un sonido ensordecedor llena la zona y solo alcanzas a ver el polvo que sale de la puerta.");
                this.getFase().getEnemigos().get(i).setVida(this.getVida()-3);
                correcto=true;
            }
        }
    
    }
    
    
    
}
