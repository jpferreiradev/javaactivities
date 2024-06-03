package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double altura;
        char sexo;
        double formula;

        System.out.print("Informe  a sua altura: ");
        altura = scan.nextDouble();
        System.out.print("Informe o seu sexo: ");
        sexo = scan.next().charAt(0);

        if(sexo == 'm' || sexo == 'M'){
            System.out.println("Sexo masculino");
            formula = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal é: " +String.format("%.2f",formula) + "kg");
        } else if (sexo == 'f' || sexo == 'F') {
            System.out.println("Sexo feminino");
            formula = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " + String.format("%.2f",formula) + "kg");
        }

    }
}
