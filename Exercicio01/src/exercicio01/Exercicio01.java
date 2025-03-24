package exercicio01;

import java.util.ArrayList;

import java.util.Scanner;//para o USUARIO ESCREVER N O DESENVOLVEDOR colocar as informaçoes

public class Exercicio01 {

    public static void main(String[] args) {
//        ArrayList<int> listaDeNumeros = new ArrayList<>();
        ArrayList<Integer>  listaDeNumeros = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            listaDeNumeros.add(numero);
            
        }
        
        System.out.println(listaDeNumeros);
        scanner.close();
    }

}
