package Atividades.Lista03;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        double[] notas = new double[4];


        for (int i = 0; i < 4; i++) {
            System.out.println("Digite as 4 notas - Nota " + (i + 1) + ":");
            notas[i] = scan.nextDouble();

        }

        System.out.println("As notas são:");

        double cont = 0;
        double media = 0;
        double notaRecuperacao;
        double mediaRecuperacao = 0;

        for (Double nota : notas) {
            System.out.println(nota);
            cont = cont + nota;
            media = cont / 4;


        }

        System.out.println("Média: " + String.format("%.2f", media));

        if (media >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (media < 7) {
            System.out.println("Aluno em recuperação por ter a média abaixo de 7, insira a nota da prova de recuperação: ");
            notaRecuperacao = scan.nextDouble();
            mediaRecuperacao = media + notaRecuperacao;
            System.out.println("Nova média:" + String.format("%.2f", mediaRecuperacao));

        }
        if (mediaRecuperacao >= 7) {
            System.out.println("Parabéns você foi aprovado na recuperação!");
        }




    }
}

/*
    double[] valores = new double[4];

            for(int i=0; i< valores i++){
            System.out.println("Informe a "+ (i+1) + " nota: ");
            valores[i] = scan.nextDouble();

        }

     Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<Double>(4);

        //double valorNota;

        System.out.println("Informe as notas:");

        //valorNota = scan.nextDouble();
        notas.add(scan.nextDouble());
        System.out.println(notas);
 */