package Lugar;

public class Salita extends Lugar {

    public Salita() {
        super("Salita", false);
        super.descripcionNR = "No estáis seguros de qué pasaría si tratarais de cruzar el umbral de la extraña barrera, pero dado su extremo calor, estáis más que seguros de que no queréis intentarlo.";
        super.descripcionR = "";
        super.velo = 2;
        super.pistas = 0;
        super.instruccionesNR = "--La entrada a la Salita está bloqueada por una inexplicable barrera que emite un brillo oscuro. No puedes moverte a la Salita.--";
        super.instruccionesR = "-- >Desistir. \"¡Esto es demasiado para mí!\". Huyes por la puerta delantera, presa del pánico.\nMientras Lita Chantler no esté controlada por un jugador, obtiene: --Negociar. Realiza una prueba de (4). Si tienes éxito, toma el control de Lita Chantler.\"";
    }

    @Override
    public void Accion() {
    }
}
