package Atividades.Lista03;

import java.util.Scanner;

public class Atividade58 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidade;
        int maior = 0;
        double media = 0;
        int soma = 0;

        System.out.print("Informe a quantidade de números: ");
        quantidade = scan.nextInt();

        int numeros[] = new int[quantidade];


        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o " + (i + 1) + " número: ");
            numeros[i] = scan.nextInt();
        }
        System.out.println("Esses são os números: ");
        for (int n : numeros) {
            System.out.printf(" " + n);
        }
        // Exemplo de como pegar o maior, menor numeros
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println();
        System.out.println("Numero maior: " + maior);

        // Exemplo de como pegar a média de valores
        for(int i = 0; i < numeros.length;i++){
            soma = soma + numeros[i];
            media = soma / quantidade;
        }
        System.out.println("Média: " + media);

    }
}
