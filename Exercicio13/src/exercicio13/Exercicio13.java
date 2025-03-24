package exercicio13;

import java.util.ArrayList;
//Exibir tds os valores
public class Exercicio13 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(20);
        numeros.add(14);
        numeros.add(28);
        numeros.add(50);
        numeros.add(40);
        
        System.out.println(numeros);
        
          ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(60);
        numeros2.add(70);
        numeros2.add(80);
        numeros2.add(90);
        numeros2.add(100);
        
        System.out.println(numeros2);
        
        ArrayList<Integer> numerosExibidos = new ArrayList <Integer>(numeros);
        numerosExibidos.addAll(numeros2);
        
        System.out.println("Valores: "+ numerosExibidos);
    }

}
