package Atividades.Lista04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salarioMinino, salarioUsuario,quantidadeSalario;


        salarioMinino = 1000;

        System.out.print("Informe o seu salário: ");
        salarioUsuario = scan.nextDouble();

        System.out.println("O valor do salário minimo é de R$" + salarioMinino + " reais");
        System.out.println("O valor do seu salário é de R$ " + salarioUsuario + " reais");

        quantidadeSalario  = salarioUsuario / salarioMinino;

        System.out.println("Quantidade de salários mininos é de " + quantidadeSalario + " salário/salários.");


    }
}

