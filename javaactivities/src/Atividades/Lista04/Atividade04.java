package Atividades.Lista04;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, sucessor, antecessor;

        System.out.print("Informe um número: ");
        numero = scan.nextInt();

        sucessor = numero + 1;
        antecessor = numero - 1;

        System.out.println("Sucessor: " + sucessor);
        System.out.println("Antecessor: " + antecessor);
    }

}

