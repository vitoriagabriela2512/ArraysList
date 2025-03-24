package exercicio07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
 ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.println("Digite números inteiros (digite -1 para encerrar):");
        while (true) {
            int numero = scanner.nextInt();
            if (numero == -1) {
                break;
            }
            numeros.add(numero);
        }
          HashSet<Integer> numerosUnicos = new HashSet<>(numeros);
        
       
        System.out.println("Lista sem valores duplicados: " + numerosUnicos);
        
        scanner.close();
    }

}
