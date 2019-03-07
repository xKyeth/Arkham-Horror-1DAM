
package elegirOpcion;
import java.util.ArrayList;
import java.util.Scanner;
public class elegirOpcion {
    ArrayList opciones = new ArrayList();
    Scanner sc = new Scanner(System.in);
    public void addOpcion(int x){
        opciones.add(x);     
    }
    
    public int seleccionarOpcion(){
        System.out.println("Tus opciones elegidas son: ");
        for (int i = 0; i < opciones.size(); i++) {
            System.out.print(" "+opciones.get(i)+" ");
                  
        }
        System.out.println("Introduce la opcion que quieres realizar: ");
        int op = sc.nextInt();
        opciones.get(op);
        return op;
        
    }
    
    
    
}
