package exercicio09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nomes (digite 'sair' para encerrar):");
        while (true) {
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            nomes.add(nome);
        }

        ArrayList<String> copiaNomes = new ArrayList<>(nomes);

        System.out.println("Lista original: " + nomes);
        System.out.println("Cópia da lista: " + copiaNomes);

        scanner.close();
    }

}
