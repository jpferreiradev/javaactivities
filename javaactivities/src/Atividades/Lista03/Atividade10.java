package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numeroUm;
        int numeroDois;


        System.out.print("Informe o primeiro número: ");
        numeroUm = scan.nextInt();
        System.out.print("Informe o segundo número: ");
        numeroDois = scan.nextInt();

        if (numeroUm == numeroDois) {
            System.out.println("O número um é igual ao dois");
        } else if (numeroUm != numeroDois) {
            System.out.println("O número um é diferente do número dois");
        }

        System.out.println();

        if (numeroUm > numeroDois) {
            System.out.println("O número um maior que número dois");
        } else {
            System.out.println("O numero dois é maior que número um");
        }

        System.out.println();

        if (numeroUm < numeroDois) {
            System.out.println("O número um menor que número dois");
        } else {
            System.out.println("O numero dois é menor que número um");
        }

        System.out.println();

        if (numeroUm >= numeroDois) {
            System.out.println("O número um é maior ou igual ao número dois");
        } else {
            System.out.println("O numero dois é maior ou igual ao número um");
        }
        System.out.println();

        if (numeroUm <= numeroDois) {
            System.out.println("O número um é menor ou igual ao número dois");
        } else {
            System.out.println("O numero dois é menor ou igual ao número um");
        }


    }
}

    /*
System.out.println("Informe o primeiro número");
        numeroUm = scan.nextInt();
        System.out.println("Informe o segundo número: ");
        numeroDois = scan.nextInt();

        int[] valores = new int[1];

        for (int i = 0; i < 1; i++) {
            System.out.print("Informe o valor de dois números inteiros: ");
            valores[i] = scan.nextInt();
        }

 */