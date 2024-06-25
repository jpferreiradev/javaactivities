package Atividades.Lista03;

import java.util.Scanner;

public class Atividade34 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numeroAtual;
        int maior;
        int menor;


        System.out.print("Informe um numero negativo para sair:  ");
        numeroAtual = scan.nextInt();

        if(numeroAtual >= 0){
            maior = numeroAtual;
            menor = numeroAtual;
            while(numeroAtual >= 0){
                System.out.println("Digite outro número");
                numeroAtual = scan.nextInt();
                if(numeroAtual > maior){
                    maior = numeroAtual;
                }
                if(numeroAtual < menor && numeroAtual >= 0){
                    menor = numeroAtual;
                }
            }
            System.out.println("Maior numero: " + maior);
            System.out.println("Menor numero: " + menor);
        }
    }


}
/*
Como eu fiz:
  int quantidade;

        System.out.print("Informe a quantidade de número/numeros: ");
        quantidade = scan.nextInt();

        int[] numeros = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Informe o numero:");
            numeros[i] = scan.nextInt();
        }

        System.out.println("Os numeros são esses:");
        for (int numero : numeros) {
            System.out.print(" " + numero);

        }

 */