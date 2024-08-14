package Atividades.Lista03;

import java.util.Scanner;

public class  Atividade61 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario;
        double valorPercentualReajuste;
        double  novoSalario;
        double salarioTotal;


        System.out.println("Informe o seu salário: ");
        salario = scan.nextDouble();
        System.out.println("Informe o valor do reajuste do salário: ");
        valorPercentualReajuste= scan.nextDouble();

        System.out.println("Seu novo salário é: " + reajuste(salario,valorPercentualReajuste));




    }

    static double reajuste(double salario, double valorPercentualReajuste) {
        double  novoSalario;
        double salarioTotal;
        novoSalario = (valorPercentualReajuste / 100) * salario;
        salarioTotal = novoSalario + salario;

        return  salarioTotal;
    }
}
