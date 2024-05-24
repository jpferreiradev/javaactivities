package Atividades.Lista01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        double altura;
        double largura;
        double profundidade;
        double valorVolume;

        System.out.println("Digite a altura:");
        altura = scan.nextDouble();
        System.out.println("Digite a largura:");
        largura = scan.nextDouble();
        System.out.println("Digite a profundidade:");
        profundidade = scan.nextDouble();
        valorVolume = altura * largura * profundidade;

        System.out.println("O cálculo do volume é:" + valorVolume);
        System.out.println("O cálculo do volume é: " + df.format(valorVolume));


    }
}
