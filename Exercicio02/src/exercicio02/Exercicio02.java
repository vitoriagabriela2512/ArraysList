
package exercicio02;

import java.util.ArrayList;


public class Exercicio02 {

    public static void main(String[] args) {
        ArrayList<String> Nomes = new ArrayList<>();

      
        Nomes.add("Ana");
        Nomes.add("Carlos");
        Nomes.add("Bruna");
        Nomes.add("Daniel");
        Nomes.add("Eduardo");

        // Acessando elementos pelo índice e imprimindo
        for (int i = 0; i < Nomes.size(); i++) {
            System.out.println("Nomes da lista" + i + ": " + Nomes.get(i));
        }
        // Removendo um elemento
        Nomes.remove("Bruna");
        // Iterando usando foreach e imprimindo
        System.out.println("Você removeu um nome da lista:");
        for (String fruta : Nomes) {
            System.out.println(fruta);
        }
        
    
    }
    
}
