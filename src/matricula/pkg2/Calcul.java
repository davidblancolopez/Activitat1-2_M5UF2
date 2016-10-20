
package matricula.pkg2;


public class Calcul {
    
    /*
    Este metodo realiza el calculo del precio de la matricula según el numero de
    UF's que se introduzcan.
    */
    public static int calculPreu(int num){
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
