package RascunhosETestesDosExercicios;

import java.util.Scanner;


public class Exemplo8 {
    public static void main(String[] args) {

        // Exemplo para a questão 57:


        Scanner scan = new Scanner(System.in);

        // Exemplo toCharArray - O método java string toCharArray() converte a string fornecida em uma sequência de caracteres

        String s = "Exemplo CharArray";
        char[] e = s.toCharArray();

        for (int i = 0; i < e.length; i++) {
            System.out.printf(" " + e[i]);
        }
        // Exemplo do contains, existe o método equals, mas aqui vai ser o contains:

        String a = "Bora porra";
        String b = "Bora porra";
        String c = "";

        System.out.println();
        // Método contains
        if(a.contains(b)){
            System.out.println("Existem letras");
        } else{
            System.out.println("Não existe");
        }

        System.out.println();
        // Método equals
        if(a.contains(b)){
            System.out.println(" Existe");
        } else{
            System.out.println("Não existe");
        }


    }
}
