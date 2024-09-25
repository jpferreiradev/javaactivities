package Atividades.Lista04;

import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.print("Informe o valor de A: ");
        a = scan.nextInt();
        System.out.print("Informe o valor de B: ");
        b = scan.nextInt();

        System.out.println("Valor de A: " + a);
        System.out.println("Valor de B: " + b);

        a = b;
        b = a;

        System.out.println("Novo valor de A: " + a);
        System.out.println("Novo valor de B: " + b);

    }
}
