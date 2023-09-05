package Atividades;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double valorTemperatura;
        double conversaoCelsusParaFahrenheit;
        double conversaoFahrenheitParaCelsus;


        System.out.println("Informe a temperaratura:");
        valorTemperatura = scan.nextDouble();
        conversaoCelsusParaFahrenheit = (valorTemperatura * 1.8) + 32;
        conversaoFahrenheitParaCelsus = (valorTemperatura - 32) / 1.8;

        System.out.println("O valor da conversão de Celsus para Fahrenheit  é: " + conversaoCelsusParaFahrenheit);
        System.out.println("O valor da conversão de Fahrenheit para Celsus é: " + conversaoFahrenheitParaCelsus);

    }
}
