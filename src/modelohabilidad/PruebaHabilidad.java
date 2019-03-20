/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelohabilidad;
import BolsaDelCaos.BolsaDelCaos;
import vista_habilidad.Vista_Habilidad;
import java.util.ArrayList;
import Modelo.RolandBanks;
import ClaseMano.uso_descarte_cartas;
import CartasInvestigador.Apoyo;
import CartasInvestigador.CartasInvestigador;
import java.util.LinkedList;

/**
 *
 * @author cristian
 */
public abstract class PruebaHabilidad {
    
    ArrayList<Apoyo> apoyos;
    RolandBanks inv;
    Vista_Habilidad vista;
    BolsaDelCaos bolsa;
    uso_descarte_cartas mano;
    protected int dificultad;
    private boolean x;

    
    public PruebaHabilidad(RolandBanks inv, ArrayList<Apoyo> apoyos, BolsaDelCaos bolsa){      
        this.inv=inv;
        this.apoyos=apoyos;        
        this.bolsa=bolsa;
        vista = new Vista_Habilidad(this);
    }
    
    //Método para iniciar la prueba. Devuelve true 
    public boolean iniciarPrueba(int dificultad){
        vista.pruebaHabilidad(dificultad);
        x = prueba(dificultad);
        if(x == true){
            vista.resultadoPruebaExito();
        }else{
            vista.resultadoPruebaFracaso();
        }
        System.out.println(x);
        return x;
    }

    //Método abstracto para hacer la prueba.
    public abstract boolean prueba(int a);
    
    //Devuelve el valor de apoyos de Agilidad
    public int sumaApoyosAgilidad(ArrayList<Apoyo> apoyos){ // Sólo suma agilidad.
        int n = 0;
        for(int i = 0;i < apoyos.size();i++){
            n = n + apoyos.get(i).getHabilidad() + apoyos.get(i).getComodin();
        }        
        return n;
    }
    
    //Devuelve el valor de apoyos de voluntad.
    public int sumaApoyosVoluntad(ArrayList<Apoyo> apoyos){
        int n = 0;
        for(int i = 0;i < apoyos.size();i++){
            n = n + apoyos.get(i).getVoluntad() + apoyos.get(i).getComodin();
        }
        return n;
    }
    
    //Devuelve el valor de apoyos de intelecto.
    public int sumaApoyosIntelecto(ArrayList<Apoyo> apoyos){
        int n = 0;
        for(int i = 0;i < apoyos.size();i++){
            n = n + apoyos.get(i).getIntelecto() + apoyos.get(i).getComodin();
        }
        return n;
    }
        
    //Método que selecciona la ficha de Caos y devuelve el valor de la ficha.
    public int seleccionaCaos(){ //ESTE MÉTODO SALE 2 VECES
        //Usar valor de la ficha del caos si sale un número
        //Usar valor de la estrella del investigador si sale estrella
        //Usar valores de los símbolos de la ref. escenario si sale otro símbolo
        int a = 0;
        int n = bolsa.BolsaDelCaos(); 
        if (n == 1) a = -1;
        else if(n == 2) a = -2;
        else if(n == 3) a = -3;
        else if(n == 4) a = -4;
        else if(n == 5) a = -5;
        else if(n == 6) a = -6;
        else if(n == 7) a = 1;
        else if(n == 8) a = -8;
        else if(n == 9) a = 0;//efecto calavera
        else if(n == 10) a = 0;//efecto capucha
        else if(n == 11) a = 0;//efecto piedra
        else if(n == 12) a = 100;//efecto tentáculo. Prueba perdida. 
        else if(n == 13) a = inv.efectoEstrella();
        return a;
        //Retorna ese valor obtenido
    }
    
    //Mostrar las cartas de la mano
    public LinkedList<CartasInvestigador> mostrarCartasMano(){//        
        return mano.getCartasmano();
    }

    //Métodos set y get de dificultad
    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
    
    //Métodos set y get del booleano
    public boolean isX() {
        return x;
    }

    public void setX(boolean x) {
        this.x = x;
    }
    

}
    

