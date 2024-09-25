package Atividades.Lista04;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int idade;
        double peso;
        String nome;

        System.out.println("Informe o seu nome: ");
        nome = scan.nextLine();
        System.out.println("Informe o seu peso: ");
        peso = scan.nextDouble();
        System.out.println("Informe a sua idade: ");
        idade = scan.nextInt();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + "kg");

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você ainda é menor de idade...");
        }
    }
}
