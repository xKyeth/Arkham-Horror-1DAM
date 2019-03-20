
package Lugar;
import java.util.ArrayList;

public class Lugares {
    
    private ArrayList <Lugar> lugares = new ArrayList();
    private boolean[][] conexion = new boolean[5][5];
    
    //Podemos introducir los lugares en el orden que queramos.
    
    public Lugares(Lugar a, Lugar b, Lugar c, Lugar d, Lugar e){
        
        for (int i=0; i<5; i++){
            lugares.add(null);            
        }
        
        lugares.remove(a.getId());
        lugares.add(a.getId(),a);
        lugares.remove(b.getId());
        lugares.add(b.getId(),b);
        lugares.remove(c.getId());
        lugares.add(c.getId(),c);
        lugares.remove(d.getId());
        lugares.add(d.getId(),d);
        lugares.remove(e.getId());
        lugares.add(e.getId(),e);
        
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                conexion[i][j]= false;
            }  
        }
        
        conexion[0][1]= true;
        conexion[1][0]= true;
        conexion[1][2]= true;
        conexion[1][3]= true;
        conexion[2][1]= true;
        conexion[3][1]= true;
    }
    
    //Este método se utiliza cuando queremos movernos de un lugar
    //a otro, puesto que según donde nos encontremos (Lugar a) podremos
    //ir o no al otro lugar (Lugar b).
    //*usamos la matriz de adyacencia ya creada*
    
    public void cambiarLugar(Lugar a, Lugar b){
        int x = getLugares().indexOf(a);
        int y = getLugares().indexOf(b);
        if(getConexion()[x][y]){
            System.out.println("Estamos aquí: "+a.getNombreCarta()+" y nos movemos aquí: "+b.getNombreCarta());
        }else{
            System.out.println("No puedes moverte.");
        }
    }
    
    public ArrayList<Lugar> getConexiones(Lugar a){
        
        ArrayList <Lugar> conexionesLugar = new ArrayList();
        int x = a.getId();
        System.out.println("Puedes moverte a: ");
        for(int i=0; i<5; i++){
            if(conexion[x][i]){
                Lugar b = lugares.get(i);
                conexionesLugar.add(b);
                System.out.println(b.getNombreCarta());
            }
        }
        return conexionesLugar;
    }
    
    /**
     * @return the conexion
     */
    public boolean[][] getConexion() {
        return conexion;
    }

    /**
     * @param conexion the conexion to set
     */
    public void setConexion(boolean[][] conexion) {
        this.conexion = conexion;
    }

    /**
     * @return the lugares
     */
    public ArrayList <Lugar> getLugares() {
        return lugares;
    }

    /**
     * @param lugares the lugares to set
     */
    public void setLugares(ArrayList <Lugar> lugares) {
        this.lugares = lugares;
    }
    
}
