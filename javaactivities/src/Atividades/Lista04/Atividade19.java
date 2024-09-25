package Atividades.Lista04;

import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = scan.nextInt();


        for (int i = 0; i < 10; i++) {
            System.out.println(numero + "x" + (i + 1) + " = " + numero * (i + 1));
        }
    }
}
