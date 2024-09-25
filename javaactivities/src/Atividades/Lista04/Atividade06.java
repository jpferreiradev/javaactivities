package Atividades.Lista04;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario,calculoPorcentagem,novoSalario;
        double valorReajuste = 0.05;

        System.out.print("Informe o seu salário: ");
        salario = scan.nextDouble();

        calculoPorcentagem = salario * valorReajuste;
        novoSalario = salario + calculoPorcentagem;


        System.out.println("O valor do reajuste foi de: " + calculoPorcentagem);
        System.out.println("O valor com o reajuste foi de: " + novoSalario);




    }
}
