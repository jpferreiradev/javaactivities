package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade51 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int quantidade;
        double valorNota;
        double media = 0;
        //double aprovado = 0.0;
        boolean salaAbaixo = true;


        System.out.print("Informe a quantidade de notas: ");
        quantidade = scan.nextInt();


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
        System.out.printf(String.format("Média das notas: %.2f", media));

        System.out.println();
        System.out.println();

        int cont = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > 7) {
                cont++;
            }
            if(notas[i] > 5){
               salaAbaixo = false;
            }
        }

        if(salaAbaixo == false){
            System.out.println("Numero de alunos que nota acima de 7: " + cont);
        } else{
            System.out.println("Não há nenhum aluno com nota acima de 5.");
        }


    }
}



