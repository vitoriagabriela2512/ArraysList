package exercicio04;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lista de Compras: ");
        produtos.add("Arroz");
        produtos.add("Massa");
        produtos.add("Galinha");
        produtos.add("Bolacha");
        produtos.add("Feijão");
        
        System.out.println(produtos);

        System.out.println("Buscar produto: ");
        String produtoBusca = scanner.nextLine();
        if (produtos.contains(produtoBusca)) {
            System.out.println("O produto " + produtoBusca + " está na lista.");
        } else {
            System.out.println("O produto " + produtoBusca + " não foi encontrado na lista.");
        }
    }
}


