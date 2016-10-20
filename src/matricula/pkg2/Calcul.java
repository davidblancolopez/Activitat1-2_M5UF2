
package matricula.pkg2;

import java.util.Scanner;


public class Calcul {
    Scanner lector = new Scanner(System.in);
    public int calculPreu(){
        int numerouf, preu = 0;
        
        do{
        System.out.println("Introdueix el numero de UF's en que estas matriculat: ");
        numerouf = lector.nextInt();
        
        }while(numerouf < 0);
        
        if (numerouf < 12) {
            preu = (numerouf * 30);
        }else if (numerouf >= 12){
            preu = 380;
        }
        
        return preu;
    }
}
