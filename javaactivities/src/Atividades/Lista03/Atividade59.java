package Atividades.Lista03;

import java.util.Scanner;

public class Atividade59 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;

        System.out.print("Informe o seu nome: ");
        nome = scan.nextLine();

        System.out.println("O numero de caraceteres é: " + nome.length());

    }
}
