package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int grauCelsius;
        int conversaoTemperatura;

        System.out.print("Informe quantos graus Celsius: ");
        grauCelsius = scan.nextInt();
        conversaoTemperatura = (9 * grauCelsius + 160) / 5;
        System.out.println("A temperatura em graus Celsius é:" + grauCelsius);
        System.out.println("A temperatura em graus Fahrenheit é: " + conversaoTemperatura);


    }
}
