package Atividades.Lista03;

import Fundamentos.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Correção

        int quantidadeNumeros = 10;
        double media = 0;


        int[] numero = new int[quantidadeNumeros];

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.print("Informe o " + (i + 1) + " numero: ");
            numero[i] = scan.nextInt();
            media += numero[i];
        }

        media = media / quantidadeNumeros;
        // Não conhecia essa classe Arrays
        Arrays.sort(numero); // Vai organizar os arrays em ordem crescente

        System.out.println("Menor numero é: " + numero[0]);
        System.out.println("Maior numero é: " + numero[quantidadeNumeros - 1]);
        System.out.println("Média dos números é: " + media);


    }

}

/*
    - Como eu fiz:

     Scanner scan = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int valor = scan.nextInt();

        int[] numero = new int[valor];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Informe o " + (i + 1) + " numero: ");
            numero[i] = scan.nextInt();
        }

        System.out.println("Os numeros são esses:");
        for (int n : numero) {
            System.out.print(" " + n);

        }
        System.out.println();
        for (int n : numero) {
            if (n > 0) {
                System.out.println("Numero maior: " + n);

            }
            System.out.println();
        }
        for (int n : numero) {
            if (n < 0) {
                System.out.println("Numero menor" + n);

            }
        }

    }

 */
