package exercicio12;

import java.util.ArrayList;
import java.util.Collections;
//Criando lista de maior e menor

public class Exercicio12 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(25);
        numeros.add(38);
        numeros.add(40);

        System.out.println(numeros);

        int maior = Collections.max(numeros);
        int menor = Collections.min(numeros);
        System.out.println("Numero maior: " + maior);
        System.out.println("Numero menor: " + menor);
    }

}
