
package matricula.pkg2;


public class Calcul {
    
    
    public int calculPreu(int num){
        int numerouf = num;
        int preu = 0;
           
        if (numerouf < 12) {
            preu = (numerouf * 30);
        }else if (numerouf >= 12){
            preu = 380;
        }
        
        return preu;
    }
}
