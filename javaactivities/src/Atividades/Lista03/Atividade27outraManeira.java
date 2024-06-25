package Atividades.Lista03;

import java.util.Scanner;

public class Atividade27outraManeira {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scan.nextInt();

        System.out.println("O fatorial de " + numero + " é: " + calculoFatorial(numero));


    }

    public static int calculoFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculoFatorial(n - 1);
        }
    }
}
