package Fundamentos;

import java.util.Scanner;

public class DiferencaDaNegacaoExclamacao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        System.out.print("informe o seu nome: ");
        nome = scan.nextLine();
        System.out.println("Meu nome é: " + nome);

        System.out.print("Informe a sua idade: ");
        idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("Já pode ser preso!");
        } else {
            System.out.println("Ainda não pode ser preso!");
        }

        System.out.println();

        if (!(idade == 18)) { // Aqui ele nega a expressão toda
            System.out.println("Já pode ser preso!");
        } else {
            System.out.println("Ainda não pode ser preso!");
        }


    }
}
