import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exemplo03 {
    public static void main (String [] args) {
        
      Scanner ler = new Scanner(System.in);
      
      int a;
    
    ArrayList<String> Carros = new ArrayList<>();
    
    Carros.add("Mercedes");
    Carros.add("BMW");
    Carros.add("Bugatti");
    Carros.add("Civic");
    Carros.add("McLaren");
    Carros.add("Lamborghini");
    Carros.add("Camaro");
    Carros.add("Porshe");
    Carros.add("Tesla");
    Carros.add("Fusca");
   
    System.out.println("Lista dos carros mais vendidos do ano em nossa loja: ");
    
    for(String c : Carros){
    System.out.println(c);
    }
    System.out.println("Escolha um carro para ver do número zero ao nove");
    a = ler.nextInt();
    
    System.out.println(Carros.get(a));
    
    }
}
    
  
    
    
        
        
        
     