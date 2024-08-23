package RascunhosETestesDosExercicios.Atividades;

import java.util.Scanner;

public class Exemplo14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.printf("Informe o tamanho do vetor: ");
        int numero = scan.nextInt();

        int n[] = new int[numero];

        for (int i = 0; i < n.length; i++) {
            System.out.printf("Informe o valor do " + (i + 1) + " numero: ");
            n[i] = scan.nextInt();
        }

        System.out.println("Numeros: ");
        for (int i = 0; i < n.length; i++) {
            System.out.printf(" " + n[i]);
        }

        System.out.println();
        System.out.println("Numeros pares: ");
        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                System.out.printf(" " + n[i]);
            }
        }
        System.out.println();
        int posicao = 0;
        for(int i = 0; i < n.length;i++){
            if (n[i] % 2 == 0) {
                posicao++;
            }

        }
        System.out.println(posicao);

    }
}


