package Atividades.Lista04;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int tamanho;
        System.out.print("Informe o tamanho do array: ");
        tamanho = scan.nextInt();

        int valores[] = new int[tamanho];

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Informe o " + (i + 1) + " valor:");
            valores[i] = scan.nextInt();
        }


        System.out.println("Ordem crescente: ");
        for(int i = 0; i < valores.length;i++){
            System.out.println(i+1);
        }

        System.out.println();
        System.out.println("Valores em ordem decresente: ");
        for(int i = valores.length; i > 0;i--){
            System.out.println(i);
        }
    }
}

/*
   for (int v : valores) {
            System.out.printf(" " + v);
        }
 */