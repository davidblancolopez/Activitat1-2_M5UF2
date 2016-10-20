
package matricula.pkg2;

import java.util.Scanner;


public class Matricula2 {


    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numerouf;
        
        do{
        System.out.println("Introdueix el numero de UF's en que estas matriculat: ");
        numerouf = lector.nextInt();
        
        }while(numerouf < 0);
        
        if (numerouf < 12) {
            System.out.println("El preu total és de: " + (numerouf * 30));
        }else if (numerouf >= 12){
            System.out.println("El preu total és de: 380,00 €");
        }
        
    }
    
}
