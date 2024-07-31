package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade51 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int quantidade;
        double valorNota;
        double media = 0;
        int aprovado;
        int reprovado;

        System.out.print("Informe a quantidade de notas: ");
        quantidade = scan.nextInt();

        //int alunos[] = new int[quantidade];
        double notas[] = new double[quantidade];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a " + (i + 1) + " nota do aluno: ");
            notas[i] = scan.nextDouble();
        }
        System.out.println("As notas são essas: ");
        for (double n : notas) {
            System.out.print(" " + n);
        }

        System.out.println();
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
            media = soma / quantidade;
        }
        System.out.printf(String.format("Média: %.2f",media));
    }
}

