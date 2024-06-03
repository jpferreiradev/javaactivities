package Atividades.Lista03;

import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int[] valores = new int[3];
        int maiorValor;
        int menorValor;
        int cont = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Informe o " + (i + 1) + " valor: ");
            valores[i] = scan.nextInt();
            while (valores[i] < 0) {
                System.out.println("Valor digitado não é válido, digite novamente");
                valores[i] = scan.nextInt();
            }
        }


        System.out.println("Os valores são esses: ");
        for (int valor : valores) {
            cont = valor + cont; // Soma de todos os valores
            System.out.println(" " + valor);

        }
        System.out.println("Soma de todos os valores: " + cont);


    }
}


