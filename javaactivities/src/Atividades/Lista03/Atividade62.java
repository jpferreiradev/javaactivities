package Atividades.Lista03;

import java.util.Scanner;

public class Atividade62 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double base;
        double altura;
        double calculoArea;

        System.out.printf("Informe o tamanho da base: ");
        base = scan.nextDouble();
        System.out.printf("Informe o tamanho da altura: ");
        altura = scan.nextDouble();

        System.out.println("O valor da hipotenusa é: " + hipotenusa(base, altura));


    }

    public static double hipotenusa(double base, double altura) {
        double calculoArea = Math.pow(base, 2) + Math.pow(altura, 2);
        return Math.sqrt(calculoArea);
    }

}
