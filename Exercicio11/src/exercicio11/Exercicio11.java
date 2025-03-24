package exercicio11;

import java.util.ArrayList;

public class Exercicio11 {

    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(10.5);
        numeros.add(20.3);
        numeros.add(30.7);
        numeros.add(40.2);
        numeros.add(50.8);
        
         System.out.println(numeros);

        double soma = 0;
        for (Double num : numeros) {
            soma += num;
        }

        System.out.println("A soma dos valores é: " + soma);
    }
}
