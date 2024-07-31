package Atividades.Lista03;

import java.util.Scanner;

public class Atividade46 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int tamanho;

        System.out.print("Informe a quantidade de números: ");
         tamanho = scan.nextInt();


        int[]x = new int[tamanho];
        int[]y = new int[tamanho];

        for(int i = 0; i < tamanho;i++){
            System.out.println("Informe o "+ (i+1) + " número de x: ");
            x[i] = scan.nextInt();
        }
        for(int i = 0; i < tamanho;i++){
            System.out.println("Informe o "+ (i+1) + " número de y: ");
            y[i] = scan.nextInt();
        }

        System.out.println("A multiplicação dos vetores: ");
        for(int w = 0; w < tamanho;w++){
            System.out.println(x[w] + "*" + y[w]+ " = " + (x[w] * y[w]));
        }



    }
}

// Como eu fiz:
/*

        int numeroUm;
        int numeroDois;
        int numero;
        System.out.print("Informe a quantidade de números: ");
        numero = scan.nextInt();
        int[] vet = new int[numero];

        System.out.print("Informe o número x: ");
        numeroUm = scan.nextInt();
        System.out.print("Informe o número y: ");
        numeroDois = scan.nextInt();
        int[] x = new int[numeroUm];
        int[] y = new int[numeroDois];

        for(int i = 0;i < vet.length;i++){
            System.out.print(" " + i);
        }


 */