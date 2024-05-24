package Atividades.Lista02;

import java.util.Locale;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double calculoPI = Math.PI;
        double raio;
        double calculoRaio;


        System.out.println("Informe o tamanho do raio:");
        raio = scan.nextDouble();

        calculoRaio = calculoPI * Math.pow(raio, 2);

        System.out.println("O calculo do círculo é: " + String.format("%.2f",calculoRaio));


    }
}
