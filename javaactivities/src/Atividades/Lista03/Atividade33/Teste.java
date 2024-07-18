package Atividades.Lista03.Atividade33;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double peso;
        double calculoImc;
        double altura;
        int numero = 2;


        System.out.print("Informe o seu peso: ");
        peso = scan.nextDouble();
        System.out.print("Informe a sua altura: ");
        altura = scan.nextDouble();

        calculoImc = peso / Math.pow(altura,2);

        System.out.println(calculoImc);


    }
}
