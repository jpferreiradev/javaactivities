package Atividades.Lista03;

import java.util.Scanner;

public class Atividade49 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int posicao;


        System.out.print("Informe quantas posições vai ter o array: ");
        posicao = scan.nextInt();

        int[] v1 = new int[posicao];
        int[] v2 = new int[posicao];

        System.out.println("V1: ");
        for(int i = 0; i < v1.length;i++){
            System.out.println("Informe o valor dos numero "+ (1+i) +" de v1: ");
            v1[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("A partir daqui é V2: ");

        int igual = 0;
        for(int i = 0; i < v2.length;i++){
            System.out.println("Informe o valor dos numero "+ (1+i) +" de v2: ");
            v2[i] = scan.nextInt();
        }

        for(int j = 0; j < posicao;j++){
            if(v1[j] == v2[j]){
                igual++;
            }
        }
        System.out.println();
        System.out.println("Posições iguais: " + igual);


    }
}
