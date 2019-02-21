
package BolsaDelCaos;
import java.util.Scanner;
import BolsaDelCaos.BolsaDelCaos;

public class seleccion {
    public int lvl;
    Scanner nivel = new Scanner (System.in);

    
    public void seleccion (){    
        System.out.println("Seleccione la dificultad\n 1=facil \n 2=medio \n 3=dificil \n 4=experto ");
        lvl = nivel.nextInt();
    }
        
     public void bolsaCaosS(){   
        switch (lvl){
            case 1 :
                BolsaDelCaosF dF = new BolsaDelCaosF();
                dF.BolsaDelCaosF();
                break;
            case 2 :
                BolsaDelCaos d = new BolsaDelCaos();
                d.BolsaDelCaos();
                break;
            case 3 :
                BolsaDelCaosD dB = new BolsaDelCaosD();
                dB.BolsaDelCaosD();
                break;
            case 4 :
                BolsaDelCaosE dE = new BolsaDelCaosE();
                dE.BolsaDelCaosE();
                break;    
                
            }
        }
        
    }
/*0 -- 0
-1 -- 1
-2 -- 2
-3 -- 3
-4 -- 4
-5 -- 5
-6 -- 6
+1 -- 7
calavera--9
capucha-10
piedra-11
tentaculo-12
estrella-13*/

