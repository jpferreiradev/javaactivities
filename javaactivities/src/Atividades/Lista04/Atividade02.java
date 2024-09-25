package Atividades.Lista04;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.print("Informe um número: ");
        numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }
        if (numero > 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero negativo");
        }
    }
}
