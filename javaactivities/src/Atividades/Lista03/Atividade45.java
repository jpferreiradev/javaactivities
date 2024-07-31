package Atividades.Lista03;

import java.util.Scanner;

public class Atividade45 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.print("Informe a quantidade de números: ");
        numero = scan.nextInt();

        int[] vet = new int[numero];

        System.out.println(vet.length);
        System.out.println();

        System.out.println("Ordem dos números: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(1 + i);
        }
        System.out.println();

        System.out.println("Ordem inversa dos números: ");


        for (int i = vet.length; i > 0;i-- ) {
            System.out.println(i);
        }

    }
}
