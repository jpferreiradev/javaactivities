package Atividades.Lista03;

import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Correção
        int numero;
        int numeroQuadrado; // Essa variavel?
        int resultado = 0;

        do {
            System.out.print("Informe um número maior que 0 e menor que 10: ");
            numero = scan.nextInt();
        } while (numero <= 0 || numero >= 10);

        for (int i = numero; i < 40+ numero; i++) {
            if (i % 2 == 1) {
                resultado += i * i;
            }
        }
        System.out.println(" Resultado: " + resultado);
    }

}


/*
    Como eu fiz:

      System.out.print("Informe um número: ");
        int numero = scan.nextInt();

        int[] numeros = new int[numero];

        System.out.println("Esses são os números: ");
        for(int i = 1; i < numeros.length;i++){
            System.out.print(" " + i);
        }
        for(int i = 0; i < numeros.length;i++){

        }
 */