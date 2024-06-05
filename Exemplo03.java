import java.util.ArrayList;
import java.util.Random;

public class Exemplo03 {
    public static void main (String [] args) {
        
    int SomaPares = 0;
    
        ArrayList <Integer> numeros = new ArrayList<Integer>();
        
        
        Random random = new Random();
        
        for (int i = 0; i < 5; i++) {
            int numeroAleatorio = random.nextInt();
            numeros.add(numeroAleatorio);
        }
        
        for (Integer numero : numeros) {
            System.out.println("Os números são " + numero);
         
         if(numero < 0) {
             SomaPares++;
             
         }
            
        }
         System.out.println("A soma dos números é " + SomaPares);
    }
}