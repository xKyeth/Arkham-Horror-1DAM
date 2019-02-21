/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Jose
 */
public class ControlGeneral {
    boolean acabarPartida=false;
    public ControlGeneral(){
    
    
    }
    
    public void Juego(){
    
    
        
       prepararPartida();
       
       faseInvestigacion();
        
        faseEnemigos();
       
        faseMantenimiento();
       
        
       while(true!=acabarPartida){
       
       faseMitos();
        
       faseInvestigacion();
        
        faseEnemigos();
       
        faseMantenimiento();
    }
       
       
        
        
    
    }
    
    
    
    public void prepararPartida(){
        
        
        
        
    
    //Elegir investigador/Por ahora NO SE IMPLEMENTA
    
    //Crear y barajar mazo Jugador
    
    //Formar reserva de ficha(?
    
    //Formar bolsa del caos
    
    //Coger Recursos iniciales(?
    
    //Robar mano inicial
    
    //Buscar las cartas de Escenario de "El encuento"
    
    //Preparar mazo de Plan
    
    //Preparar mazo de acto
    
    //Colocar la carta de referencia
    
    //poner estudio en juego
    
    //pon aparte todos os demas lugares fuera de juego(??
    
    //Poner investigador en el Estudio
    
    //poner aparte las cartas gul y chantler
    
    //Crea mazo encuentro
    
    }
    
    
    
    public void faseMitos(){
    
        
        //Colocar 1 ficha de perdicion sirve el plan en curso
        
        //Compara la cantidad de piezas de 
    
    
    }
    
    public void faseInvestigacion(){
    
        
        //Vamos a una vista para elegir las 3 distintas opciones y en ella escogen una de estas 3
        
    //Robar 1 carta
    
    //Obtener un recurso
    
    //Acivar una capacidad
    
    //Enfrentarse a un enemigo
    
    //Investigar
    
    //Moverse
    
    //Jugar una carta de apoyo o Evento de su mano
    
    //intentar evitar a un enemigo
    
    //Combatir con un enemigo
    
    }
    
    public void faseEnemigos(){
    
    //Mover a monstruos Cazador
    
    
    //Enemigo ataca 
    
    
    
    }
    
    public void faseMantenimiento(){
    
    //Poner boca arriba carta pequeña
    
    //Prepara todas las cartas agotadas
        
    //robar un carta y obtiene un recurso
    
    //si hay mas de 8 cartas elige y descarta 
    
    }
}
