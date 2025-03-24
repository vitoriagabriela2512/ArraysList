package exercicio03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Exercicio03 {

    public static void main(String[] args) {
        ArrayList<Integer> Numeros = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            Numeros.add(random.nextInt(100) + 1);
        }

        System.out.println("Números ordenados:");
        for (int num : Numeros) {
            System.out.println(num);
        }
        Collections.sort(Numeros);
    }
}
