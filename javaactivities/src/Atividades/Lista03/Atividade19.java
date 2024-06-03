package Atividades.Lista03;

import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a;
        int b;
        int c;

        System.out.print("Informe o tamanho de A: ");
        a = scan.nextInt();
        System.out.print("Informe o tamanho de B: ");
        b = scan.nextInt();
        System.out.print("Informe o tamanho de C: ");
        c = scan.nextInt();

        if (a == b && b == c) {
            System.out.println("Triangulo equilatero");
        } else if (a == b && a == c || b == c) {
            System.out.println("Triangulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }


    }
}
