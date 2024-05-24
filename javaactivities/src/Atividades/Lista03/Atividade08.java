package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double raio;
        double altura;
        double conversaoVolume;

        System.out.print("Informe o tamanho do raio: ");
        raio = scan.nextDouble();
        System.out.print("Informe a altura do raio: ");
        altura = scan.nextDouble();
        conversaoVolume = Math.PI * Math.pow(raio,2) * altura;
        System.out.println("O valor do volume é: " + String.format("%.2f",conversaoVolume));


    }
}
