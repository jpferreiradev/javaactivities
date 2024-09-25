package Atividades.Lista04;

import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salarioLiquido, valorHoraAula, percentualINSS, valorFinalHoraAula, salarioLiquidoFinal;
        int numeroAulaMes;


        System.out.print("Informe o valor da sua hora:");
        valorHoraAula = scan.nextDouble();
        System.out.print("Informe o número de aulas no mês: ");
        numeroAulaMes = scan.nextInt();
        System.out.print("Informe o percentual do INSS: ");
        percentualINSS = scan.nextDouble();


        valorFinalHoraAula = valorHoraAula * numeroAulaMes;
        salarioLiquido = percentualINSS * valorFinalHoraAula;
        salarioLiquidoFinal = valorFinalHoraAula - salarioLiquido;


        System.out.println("Valor final do preço das suas aulas nesse mês: " + valorFinalHoraAula);
        System.out.println("Desconto do valor do imposto do INSS:" + salarioLiquido);
        System.out.println("Salário liquido final: " + salarioLiquidoFinal);

    }
}
