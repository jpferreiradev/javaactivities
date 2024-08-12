package Atividades.Lista03;

import java.util.Scanner;

public class Atividade56 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int vetor[] = new int[50];

        System.out.println("Números: ");
        for(int i = 0; i < vetor.length;i++){
            System.out.printf(" " + (i+1));
        }
        System.out.println();

        System.out.println("Numeros pares: ");
        for (int i = 0; i < vetor.length; i++) {

            if (i % 2 == 0) {
                System.out.printf(" " + i);
            }
        }
        System.out.println();

        System.out.println("Múltiplos de 5: ");
        for(int i = 0; i < vetor.length;i++){
            if (i % 5 ==  0) {
                System.out.printf(" " + i);
            }
        }

    }
}
