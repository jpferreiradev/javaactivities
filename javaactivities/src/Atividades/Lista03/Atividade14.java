package Atividades.Lista03;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int numeroDois;
        int diferenca;


        System.out.print("Informe o primeiro número: ");
        numero = scan.nextInt();
        System.out.print("Informe o segundo número: ");
        numeroDois = scan.nextInt();

        diferenca = numero - numeroDois;
        System.out.println(diferenca);
        System.out.println();

        System.out.println("O primeiro número foi: " + numero );
        System.out.println("O segundo número foi: " + numeroDois);


        System.out.println("A diferença entre eles é: ");
        for (int i = diferenca; i > 0; i--) {
            System.out.print(" " + i);
        }


    }
}
