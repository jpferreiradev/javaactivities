package RascunhosETestesDosExercicios.Atividades;

import java.util.Scanner;

public class Exemplo7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);




        System.out.print("Informe um número: ");
        int numero = scan.nextInt();

        int vetor[] = new int[numero];

        System.out.println();

        for(int i = 0; i < vetor.length;i++){
            if (i % 5 ==  0) {
                System.out.println(" " + i);
            }

        }


    }
}


/*
 int n[] = new int[50];

        System.out.println("Numeros: ");
        for (int i = 0; i < n.length; i++) {
            System.out.printf(" " + i);

        }
        System.out.println();

        System.out.println("Numeros pares: ");
        for (int i = 0; i < n.length; i++) {

            if (i % 2 == 0) {
                System.out.printf(" " + i);
            }
        }

     if (5 % numero ==  5) {
                System.out.println("Multiplo de 5");
            } else {
                System.out.println("Não é multiplo de 5");
            }
 */