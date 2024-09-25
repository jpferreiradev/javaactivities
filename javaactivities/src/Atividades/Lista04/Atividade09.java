package Atividades.Lista04;

import java.util.Locale;
import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {

        //Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Informe o seu peso: ");
        peso = scan.nextDouble();
        System.out.print("Informe a sua altura: ");
        altura = scan.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Valor IMC: %.2f",imc);
        System.out.println();

        if (imc < 18.5) {
            System.out.println("Abaixo do peso...");
        } else if (imc > 18.6 || imc < 24.9) {
            System.out.println("Peso ideal, parabéns!");
        } else if (imc > 25 || imc < 29.9) {
            System.out.println("Levemimente acima do peso");
        }

    }
}

/*
else if (peso > 30 || peso <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (peso > 35 || peso <= 39.9) {
            System.out.println("Obesidade grau 2(Severa");
        } else if (peso >= 40) {
            System.out.println("Obesidade grau 3(mórbida)");
        }
 */