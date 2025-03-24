package exercicio06;

import java.util.ArrayList;
import java.util.Scanner;
//Os comentarios é para eu olhar dps e lembrar pra que serve
public class Exercicio06 {

    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
         // Solicitando palavras ao usuario
        System.out.println("Digite palavras (digite 'sair' para encerrar):");
        while (true) {
            String palavra = scanner.nextLine();
            if (palavra.equalsIgnoreCase("sair")) {
                break;
            }
              System.out.println("Lista de palavras: " + palavras);
            palavras.add(palavra);
        }
      // Solicitando uma palavra para contar quantas vezes aparece na lista
        System.out.print("Digite a palavra que deseja contar: ");
        String palavraBuscar = scanner.nextLine();
        
        // Contando a ocorrencia da palavra
        int contador = 0;
        for (String p : palavras) {
            if (p.equalsIgnoreCase(palavraBuscar)) {
                contador++;
            }
        }
        
        // Exibindo o resultado
        System.out.println("A palavra '" + palavraBuscar + "' aparece " + contador + " vezes na lista.");
        
        scanner.close();
    
    }

}
