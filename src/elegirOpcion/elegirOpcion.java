
package elegirOpcion;
import java.util.ArrayList;
import java.util.Scanner;
public class elegirOpcion {
    ArrayList <Integer> opciones = new ArrayList();
    Scanner sc = new Scanner(System.in);
    //Añades el número de la opción que se ha elegido al ArrayList de opciones.
    //Ejemplo:
    // System.out.println("1. Opcion 1");
    // System.out.println("2. Opcion 2");
    //int y = scanner.nextInt();
    //switch (y){
    //  case 1: otrometodocualquiera();
        //      addOpcion(1);break;
    //  case 2: otrometodocualquiera2();
        //      addOpcion(2);break}
    
    public void addOpcion(int x){
        opciones.add(x);     
    }
    
    public int seleccionarOpcion(){
        //Primero muestra todas las opciones que has elegido.
        System.out.println("Tus opciones elegidas son: ");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.print(" "+opciones.get(i)+" ");
                  
        }
        //Luego se selecciona la opcion que se desea realizar (Por ejemplo si
        // al leer el ArrayList pone las opciones (3 5) si introduces el numero
        //2 sacará la opción 5)
        System.out.println("Introduce la opcion que quieres realizar: ");
        int op = sc.nextInt();
        int i = opciones.get(op);
        return i;
        
    }
    
    
    
}
