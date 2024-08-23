package RascunhosETestesDosExercicios.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Informe a quantidade de notas: ");
        int quantidade = scan.nextInt();

        double notas[] = new double[quantidade];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a " + (i + 1) + " nota:");
            notas[i] = scan.nextDouble();
        }

        System.out.println("Notas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf(" " + notas[i]);
        }

        double media;
        double somaNotas = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNotas = somaNotas + notas[i];
        }

        System.out.println();
        System.out.println("Soma das notas: " + somaNotas);
        media = somaNotas / quantidade;
        System.out.printf("Média: " + String.format("%.1f", media));
    }


}
