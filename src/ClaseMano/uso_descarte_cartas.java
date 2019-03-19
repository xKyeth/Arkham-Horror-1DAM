
package ClaseMano;
import java.util.Scanner;
import java.util.LinkedList;
import CartasInvestigador.CartasInvestigador;
import Modelo.MazoInvestigador;
import Modelo.Investigador;
public class uso_descarte_cartas {
    
    
    
    Scanner entrada = new Scanner(System.in);
    
    private LinkedList<CartasInvestigador> descarte = new LinkedList<>();
    private LinkedList<CartasInvestigador> cartasmano = new LinkedList<>();
    CartasInvestigador c;
    MazoInvestigador mazo = new MazoInvestigador();
    

    public uso_descarte_cartas() {
        
    }
    
    public int numeroCartasMano() {
        return getCartasmano().size();
        
    }
    
    public void decartarCarta(int x) {
        getDescarte().add(getCartasmano().get(x));
        
    }
    
    public void robarCarta() {
        
        getCartasmano().addLast(c);
        mazo.eliminarCarta(c);
    }
        //Fernando               
    public void robar5cartas() {
        int c = 0;
        while(c<5) {
            this.robarCarta();
            c++;
        }
    }
    //Fernando
    public void usoyDescarte() {
        System.out.println("Cuantas cartas quieres utilizar");
        int n = entrada.nextInt();
        int contador = 0;
        while(contador<n) {
            //utiliza la ultima carta de la lista carta,
            //y la borra
            int y = mazo.getListaCartasMazo().size();
            for (int i = 0; i < mazo.getListaCartasMazo().size(); i++) {
                System.out.println(mazo.getListaCartasMazo().get(y));
                y--;
            }
            System.out.println("Que carta quieres utilizar?");
            int x = entrada.nextInt();
            
            getCartasmano().add(mazo.getListaCartasMazo().get(x));
            
            mazo.getListaCartasMazo().get(x);
            contador++;
        }
    }
        //Fernando
    public void descartar8Cartas() {
        //Se eliminan 8 cartas del linkedList baraja y se añaden al linkedList 
        //descarte
        
        if(cartasmano.size()>8) {
            while(cartasmano.size()>8) {
                for (int i = 0; i < cartasmano.size(); i++) {
                    System.out.println(cartasmano.get(i));
                }
                System.out.println("Que carta quieres descartar?");
                int y = entrada.nextInt();
                descarte.add(cartasmano.get(y));
                cartasmano.remove(y);
            }
        }
        else {
            System.out.println("Hay menos de 8 cartas en la mano");
        }
        
        
    }
     
    //metodo de prueba para mostrar el linkedlist de descarte
    public void mostrarDescartes() {
        for (int i = 0; i < getDescarte().size(); i++) {
            System.out.println(getDescarte().get(i));
        }
        
    }
    
    Investigador investigador;
    private LinkedList <CartasInvestigador> cartasenmesa = new LinkedList();
    
        //JACINTO
    int recursos = investigador.getNumeroRecursos();
    public void ComprarCartaActividad(){
        System.out.println("Selecciona la carta que quieres comprar: ");
        int y = entrada.nextInt();
        if (getCartasmano().get(y).getCoste()> investigador.getNumeroRecursos()){
            System.out.println("No se dispone de los recursos suficientes");
        }
        else{         
            recursos =  investigador.getNumeroRecursos() - getCartasmano().get(y).getCoste();
            getCartasmano().get(y);
            getDescarte().add(getCartasmano().get(y)); 
        
       }
        
        
    }
    
            //JACINTO
    
   public void ComprarCartaApoyo(){
       
         System.out.println("Selecciona la carta que quieres comprar: ");
            int y = entrada.nextInt();
        if (getCartasmano().get(y).getCoste()> investigador.getNumeroRecursos()){
            System.out.println("No se dispone de los recursos suficientes");
        }
        else{       
            recursos =  investigador.getNumeroRecursos() - getCartasmano().get(y).getCoste();
            getCartasenmesa().add(getCartasmano().get(y));
            getCartasmano().remove(y); 
        
        }
       
 }
    public void añadirCartaAMano(CartasInvestigador carta){
        cartasmano.add(carta);
    }

    /**
     * @return the descarte
     */
    public LinkedList<CartasInvestigador> getDescarte() {
        return descarte;
    }

    /**
     * @param descarte the descarte to set
     */
    public void setDescarte(LinkedList<CartasInvestigador> descarte) {
        this.descarte = descarte;
    }

    /**
     * @return the cartasmano
     */
    public LinkedList<CartasInvestigador> getCartasmano() {
        return cartasmano;
    }

    /**
     * @param cartasmano the cartasmano to set
     */
    public void setCartasmano(LinkedList<CartasInvestigador> cartasmano) {
        this.cartasmano = cartasmano;
    }

    /**
     * @return the cartasenmesa
     */
    public LinkedList <CartasInvestigador> getCartasenmesa() {
        return cartasenmesa;
    }

    /**
     * @param cartasenmesa the cartasenmesa to set
     */
    public void setCartasenmesa(LinkedList <CartasInvestigador> cartasenmesa) {
        this.cartasenmesa = cartasenmesa;
    }
   
      
    
}
   
