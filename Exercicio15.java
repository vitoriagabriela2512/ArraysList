
package exercicio15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
       ArrayList <Aluno> alunos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
         System.out.println("Digite o número de alunos:");
        int numAlunos = scanner.nextInt();
        scanner.nextLine();
          for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); 
            
            alunos.add(new Aluno(nome, nota));
        }
        
        System.out.println("Lista de alunos:");
        double somaNotas = 0;
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
            somaNotas += aluno.getNota();
        }
        
        double media = somaNotas / alunos.size();
        System.out.println("Média das notas: " + media);
        
        scanner.close();
    }
    
}
