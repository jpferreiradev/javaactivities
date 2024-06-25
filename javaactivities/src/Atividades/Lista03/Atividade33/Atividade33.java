package Atividades.Lista03.Atividade33;

import java.util.Locale;
import java.util.Scanner;

public class Atividade33 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int quantidadeAlunos;
        String matricula;
        double mediaAlunos = 0;
        double nota;


        System.out.print("Informe a quantidade de matrícula: ");
        quantidadeAlunos = scan.nextInt();

        Aluno[] alunos = new Aluno[quantidadeAlunos]; // Foi criado um array do objeto aluno

        for (int i = 0;i < quantidadeAlunos;i++ ) {
            System.out.print("Informe o número da matricula do aluno: ");
            matricula = scan.next();
            System.out.print("Informe a nota do aluno: ");
            nota = scan.nextDouble();
            alunos[i] = new Aluno(matricula,nota);
            mediaAlunos += nota;

        }
        mediaAlunos = mediaAlunos / quantidadeAlunos;
        System.out.printf("A média da turma foi de: " +String.format("%.12f",mediaAlunos));

    }



}


/*
 -- Como eu fiz:

  Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numeroMatricula;
        int nota;

        System.out.print("Informe a quantidade de matrícula: ");
        numeroMatricula = scan.nextInt();
        System.out.print("Informe a quantidade de nota: ");
        nota = scan.nextInt();

        int[] matriculas = new int[numeroMatricula];
        double[] notas = new double[nota];


        for (int i = 0; i < matriculas.length; i++) {
            System.out.println("Informe a " + (i+1)+ " matricula do aluno: ");
            matriculas[i] = scan.nextInt();
        }
        for (int x = 0; x < notas.length; x++) {
            System.out.println("Informe a " + (x+1) + " nota do aluno");
            notas[x] = scan.nextDouble();
        }

        System.out.println("As matriculas: ");
        for(int m  : matriculas){
            System.out.print(" " + m);
        }

        System.out.println();

        System.out.println("As notas dos alunos: ");
        for(double n : notas){
            System.out.print(" " + n);
        }
        System.out.println();


        System.out.println("Médias das notas:");
        for(double n : notas){
            double media = n / 2;
            System.out.print(" " + media);
        }
    }

 */


