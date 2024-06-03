package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double numeroUm;
        double numeroDois;
        int opcao;
        double multiplo;
        double numeroPar;
        double media;

        System.out.println("Informe o primeiro número: ");
        numeroUm = scan.nextDouble();
        System.out.println("Informe o segundo número: ");
        numeroDois = scan.nextDouble();

        System.out.println("--------------------");
        System.out.println("OPÇÕES:");
        System.out.println("Verificar se o numero é múltiplo: ( 1 )");
        System.out.println("Verificar se é o número par: (2)");
        System.out.println("Verificar se a média é maior ou igual a 7: (3)");
        System.out.println("Sair: (0) ");
        System.out.println("-------------------");
        System.out.println();

        do {
            System.out.println("Escolha a opção desejada:");
            opcao = scan.nextInt();
            if (opcao == 1) {

                if (numeroUm % numeroDois == 0) {
                    System.out.println("Esse número é múltiplo");
                } else {
                    System.out.println("Esse número não é múltiplo");
                }

            } else if (opcao == 2) {

                if (numeroUm % 2 == 0) {
                    System.out.println("Esse número é par");
                } else {
                    System.out.println("Esse número é impar");
                }

            } else if (opcao == 3) {
                media = (numeroUm + numeroDois) / 2;
                if (media >= 7) {
                    System.out.println("A média dos dois números é: " + media);
                } else {
                    System.out.println("A média é menor");
                }

            }
        }
        while (opcao != 0);

    }


}

