package exercicio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cidades da Sua Lista: ");
        cidades.add("Sapucaia do sul");
        cidades.add("São Leopoldo");
        cidades.add("Esteio");
        cidades.add("Canoas");
        cidades.add("Novo Hamburgo");

        System.out.println(cidades);
        System.out.print("Digite o nome da cidade que deseja substituir: ");
        String CidadeAntiga = scanner.nextLine();
        if (cidades.contains(CidadeAntiga)) {
            System.out.print("Digite o nome da nova cidade: ");
            String novaCidade = scanner.nextLine();
            
            // Substituindo a cidade
            int index = cidades.indexOf(CidadeAntiga);
            cidades.set(index, novaCidade);
            
            // Exibindo a lista modificada
            System.out.println("Lista atualizada: " + cidades);
        } else {
            System.out.println("Cidade não encontrada na lista.");
        }

        scanner.close();
    }

}
