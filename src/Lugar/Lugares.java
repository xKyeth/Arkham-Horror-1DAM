
package Lugar;
import java.util.ArrayList;

public class Lugares {
    
    public ArrayList <Lugar> lugares = new ArrayList();
    private boolean[][] conexion = new boolean[5][5];
    
    //Hay que introducir los lugares en este orden (ya que
    //la matriz de adyacencia está hecha en base a dicho orden):
    //Ático, Pasillo, Salita, Sótano, Estudio
    
    public Lugares(Lugar a, Lugar b, Lugar c, Lugar d, Lugar e){
        
        lugares.add(a);
        lugares.add(b);
        lugares.add(c);
        lugares.add(d);
        lugares.add(e);
        
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
        int x = lugares.indexOf(a);
        int y = lugares.indexOf(b);
        if(getConexion()[x][y]){
            System.out.println("Estamos aquí: "+a.getNombre()+" y nos movemos aquí: "+b.getNombre());
        }else{
            System.out.println("No puedes moverte.");
        }
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
    
}
