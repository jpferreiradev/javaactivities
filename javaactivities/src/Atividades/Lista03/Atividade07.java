package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int grausFahrenheit;
        int conversaoTemperatura;

        System.out.print("Informe quantos graus Fahrenheit: ");
        grausFahrenheit = scan.nextInt();
        conversaoTemperatura = (grausFahrenheit - 32) * 5 / 9;
        System.out.println("A temperatura em graus Fahrenheit é:" + grausFahrenheit);
        System.out.println("A temperatura em graus Celsius é: " + conversaoTemperatura);
    }
}
