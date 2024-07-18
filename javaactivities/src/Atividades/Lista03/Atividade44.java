package Atividades.Lista03;

import java.util.Scanner;

public class Atividade44 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int opcao;
        int grausCelsius;
        int grausFahrenheit;
        int conversaoTemperatura;
        double peso;
        double calculoImc;
        double altura;
        char stop;
        boolean continuar = true;


        do {
            System.out.print("Escolha entre as opções:  1,2,3,4:");
            opcao = scan.nextInt();
            if (opcao == 1) {
                System.out.print("Conversão de Graus Celsius em Graus Fahrenheit: ");
                System.out.print("Informe quantos Graus Celsius: ");
                grausCelsius = scan.nextInt();
                conversaoTemperatura = (9 * grausCelsius + 160) / 5;
                System.out.println("A temperatura em graus Fahrenheit é: " + conversaoTemperatura);
            } else if (opcao == 2) {
                System.out.print("Conversão de Graus Fahrenheit em Graus Celsius: ");
                System.out.print("Informe quantos Graus Fahrenheit: ");
                grausFahrenheit = scan.nextInt();
                conversaoTemperatura = (grausFahrenheit - 32) * 5 / 9;
                System.out.println("A temperatura em graus Celsius é: " + conversaoTemperatura);
            } else if (opcao == 3) {
                System.out.print("Informe o seu peso M: ");
                peso = scan.nextDouble();
                System.out.print("Informe a sua altura M: ");
                altura = scan.nextDouble();
                System.out.println("Seu peso é: " + peso);
                System.out.println("Sua altura é: " + altura);
                calculoImc = peso / (Math.pow(altura, 2));
                System.out.println("Seu IMC é: " + calculoImc);
            } else if (opcao == 4) {
                System.out.print("Informe o seu peso F: ");
                peso = scan.nextDouble();
                System.out.print("Informe a sua altura F : ");
                altura = scan.nextDouble();
                System.out.println("Seu peso é: " + peso);
                System.out.println("Sua altura é: " + altura);
                calculoImc = peso / (Math.pow(altura, 2));
                System.out.println("Seu IMC é: " + calculoImc);
            } else {
                System.out.println("Opção errada, informe novamente o numero.");
            }
            System.out.println("Deseja encerrar o programa? (S/N)");
            stop = scan.next().charAt(0);
            if (stop == 's' || stop == 'S') {
                continuar = false;
            }

        } while (continuar);

    }


}
