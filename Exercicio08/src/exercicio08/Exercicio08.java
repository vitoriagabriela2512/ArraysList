package exercicio08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seis números inteiros:");
        for (int i = 0; i < 6; i++) {
            numeros.add(scanner.nextInt());
        }

        System.out.println("Lista na ordem original: " + numeros);

        ArrayList<Integer> numerosInvertidos = new ArrayList<>(numeros);
        Collections.reverse(numerosInvertidos);
        System.out.println("Lista na ordem inversa: " + numerosInvertidos);

        scanner.close();
    }

}
