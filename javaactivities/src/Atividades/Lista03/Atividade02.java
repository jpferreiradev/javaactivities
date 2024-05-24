package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Double cotacaoDolar;
        Double dolar;
        Double real;
        Double convercaoDolarReal;


        System.out.print("Qual a cotação do dolar hoje:");
        cotacaoDolar = scan.nextDouble();
        System.out.println("Contação atual é: " + cotacaoDolar);
        System.out.print("Informe um valor em dólares: ");
        dolar = scan.nextDouble();
        convercaoDolarReal = cotacaoDolar * dolar;
        System.out.println("A conversão de dólar para real é: " + String.format("%.2f", convercaoDolarReal));


    }
}
