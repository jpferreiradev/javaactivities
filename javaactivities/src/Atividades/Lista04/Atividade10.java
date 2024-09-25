package Atividades.Lista04;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {


       Scanner scan = new Scanner(System.in);

       double nota1,nota2,nota3,media;

        System.out.println("Informe a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.println("Informe a terceira nota: ");
        nota3 = scan.nextDouble();

        media = (nota1+nota2+nota3) / 3;
        System.out.printf("Sua média é: %.1f",media);


    }
}
