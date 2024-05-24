package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int a;
        int b;
        int variavelTemporaria;

        System.out.print("Informe o número A: ");
        a = scan.nextInt();
        System.out.print("Infome o número B: ");
        b = scan.nextInt();

        variavelTemporaria = a;
        a = b;
        b = variavelTemporaria;


        System.out.println(a);
        System.out.println(b);

    }
 // Foi utilizada uma variavel temporaria para armazenar o valor de A;

}


/*
 --- Como eu fiz:

 int a;
        int b;


        System.out.print("Informe o número A: ");
        a = scan.nextInt();
        System.out.print("Infome o número B: ");
        b = scan.nextInt();

        System.out.println("Letra A:" + a);
        System.out.println("Letra B:" + b);

        if (a != b) {
            a = b;
            b = a;
            System.out.println("A letra A vale: " + a);
            System.out.println("A letra B vale: " + b);
        }
 */