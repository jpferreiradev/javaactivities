package Atividades.Lista04;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int escolha;
        String nome;
        double precoProduto, calculoPorcertagem, precoFinal;


        System.out.print("Informe o seu nome: ");
        nome = scan.nextLine();
        System.out.print("Informe o preço do produto: ");
        precoProduto = scan.nextDouble();

        System.out.println("Escolha a opção de pagamento no menu: ( De 1 a 4, 5 é a opção de sair: )");
        System.out.println("1: À vista, dinheiro ou pix, tem 15% de desconto");
        System.out.println("2: Á vista, no cartão de crédito tem 10% de desconto");
        System.out.println("3: Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4: Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%\n");
        System.out.println("Escolha o método de pagamento no menu: ");
        escolha = scan.nextInt();

        while (escolha != 5) {
            if (escolha == 1) {
                System.out.println("Você terá 15% de desconto por escolher essa opção:");
                calculoPorcertagem = (15 * precoProduto) / 100;
                precoFinal = precoProduto - calculoPorcertagem;
                System.out.println("O valor final do produto é de R$:" + precoFinal + " reais");
            } else if (escolha == 2) {
                System.out.println("Você terá 10% de desconto por escolher essa opção:");
                calculoPorcertagem = (10 * precoProduto) / 100;
                precoFinal = precoProduto - calculoPorcertagem;
                System.out.println("O valor final do produto é de R$:" + precoFinal + " reais");
            } else if (escolha == 3) {
                System.out.println("Parcelado no cartão em duas vezes:");
                precoFinal = precoProduto / 2;
                System.out.println("O valor vai ficar dividido em duas vezes, e ficara em duas parcelas de " + precoFinal);
            } else if (escolha == 4) {
                System.out.println("Parecelado no cartão em três vezes, preço normal do produto mais 10% de juros:");
                calculoPorcertagem = (10 * precoProduto) / 100;
                precoFinal = precoProduto + calculoPorcertagem;
                System.out.println("O valor final do produto é de R$:" + precoFinal + " reais");
            }
            System.out.println("Para sair informe 5:");
            escolha = scan.nextInt();

        }


    }
}

/*

         double valorProduto;

        System.out.println("Escolha o método de pagamento no menu: ");
        System.out.println("1: À vista, dinheiro ou pix, tem 15% de desconto");
        System.out.println("2: Á vista, no cartão de crédito tem 10% de desconto");
        System.out.println("3: Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4: Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%\n");

        //System.out.println("Valor do produto:" + valorProduto);
 */