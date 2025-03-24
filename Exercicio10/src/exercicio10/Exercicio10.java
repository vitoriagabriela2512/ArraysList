
package exercicio10;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio10 {

    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
         System.out.println(numeros);
       
        Iterator<Integer> iterator = numeros.iterator();
        System.out.println("Elementos da lista:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
