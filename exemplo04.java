import java.util.ArrayList;
import java.util.Random;

public class Exemplo03 {
    public static void main (String [] args) {
    
    ArrayList<String> frutas = new ArrayList<>();
    
    frutas.add("Banana");
    frutas.add("Maça");
    frutas.add("Melão");
    frutas.add("Açai");
    frutas.add("Mexerica");
    frutas.add("Acerola");
    frutas.add("Melancia");
    frutas.add("Kiwi");
    frutas.add("Figo");
    frutas.add("Abacate");
    
    for(String f : frutas){
    System.out.println("A lista de frutas é: " + f);
    }
    
    frutas.remove("Banana");
    frutas.remove("Maça");
    frutas.remove("Melão");
    frutas.remove("Açai");
    frutas.remove("Mexerica");
    
    for(String f : frutas){
        System.out.println("A nova lista de frutas após exclusão é: " + f);
    }
    }
}

    
    
    
    
        
        
        
     