
package matricula.pkg2;

import java.util.Scanner;


public class Matricula2 {

    public static void main(String[] args) {
    Scanner lector = new  Scanner(System.in);
    Calcul calcul = new Calcul();
    int num;
    
        do{
        System.out.println("Introdueix el numero de UF 's en que estas matriculat: ");
        num = lector.nextInt();
        
        }while(num < 0);
    
    int preu = calcul.calculPreu(num);
    
        System.out.println(preu);
        
    }
    
}
