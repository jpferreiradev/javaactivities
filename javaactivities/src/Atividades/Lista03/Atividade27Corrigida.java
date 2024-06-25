package Atividades.Lista03;

import java.util.Scanner;

public class Atividade27Corrigida {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Nome bacana para o Scanner, entrada:

        int quantidade;
        System.out.print("Digite a quantidade de números: ");
        quantidade = entrada.nextInt();

        // Esse for para pegar a quantidade de numeros
        long[] numeros = new long[quantidade]; // Porque ele usou long em vez de int?

        for (int x = 0; x < numeros.length; x++) {
            System.out.print("Digite um número: ");
            numeros[x] = entrada.nextInt();
        }


        // Usou esse for para fazer o calculo com a formulado fatorial;
        for (int x = 0; x < numeros.length; x++) {
            long resultado = 1;
            for (long y = numeros[x]; y > 0; y--) {
                resultado = y * resultado; // Formula fatorial
            }
            System.out.println("O fatorial de " + numeros[x] + " é: " + resultado);
        }

    }
}
