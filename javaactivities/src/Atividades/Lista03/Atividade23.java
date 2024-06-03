package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade23 {
    public static void main(String[]args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double valorUm;
        double valorDois;
        double somar;
        double subtracao;
        double multiplicar;
        double divisao;
        int opcao;


        System.out.println("Informe o primeiro valor:");
        valorUm = scan.nextDouble();
        System.out.println("Informe o segundo valor: ");
        valorDois = scan.nextDouble();

        do{
            System.out.println("Escolha opção que deseja: ");
            opcao = scan.nextInt();
            if(opcao == 1){
                somar = valorUm + valorDois;
                System.out.println("A soma dos dois valores: " + somar);
            } else if (opcao == 2) {
                subtracao = valorUm - valorDois;
                System.out.println("A subtração dos dois valores: " + subtracao);
            } else if(opcao == 3){
                multiplicar = valorUm * valorDois;
                System.out.println("A multiplicação dos dois valores: " + multiplicar);
            } else if( opcao == 4){
                divisao = valorUm / valorDois;
                System.out.println("A divisão dos dois valores: " + divisao);
            }
        }
        while(opcao != 0);











    }
}
