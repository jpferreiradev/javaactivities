package Atividades.Lista03;

import java.util.Scanner;

public class Atividade52 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int inicio = 0;
        int tamanhoPosicao = 100;
        int cont1 = 0;
        int cont3 = 0;
        int cont4 = 0;

        int vetor[] = new int[tamanhoPosicao];
        do {
            System.out.print("Informe o numero ou digite -1 para sair: ");
            vetor[inicio] = scan.nextInt();
            if (vetor[inicio] == 1) {
                cont1++;
            }
            if (vetor[inicio] == 3) {
                cont3++;
            }
            if (vetor[inicio] == 4) {
                cont4++;
            }
            inicio++;
        } while(vetor[inicio - 1] != -1 && inicio < tamanhoPosicao);

        System.out.println("Quantidades:");
        System.out.println("Numero 1:" + cont1);
        System.out.println("Numero 3:" + cont3);
        System.out.println("Numero 4:" + cont4);



    }


}