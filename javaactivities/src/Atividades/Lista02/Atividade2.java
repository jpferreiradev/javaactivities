package Atividades.Lista02;

import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double salarioLiquido;
        int horasTrabalhadas;
        double valorHora;
        double totalImpostos;
        double salarioBruto;

        System.out.println("Informe o seu salario bruto:");
        salarioBruto = scan.nextDouble();
        System.out.println("Informe o seu salário líquido: ");
        salarioLiquido = scan.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        horasTrabalhadas = scan.nextInt();
        System.out.println("Informe o valor da sua hora trabalhada: ");
        valorHora = scan.nextDouble();



    }
}
