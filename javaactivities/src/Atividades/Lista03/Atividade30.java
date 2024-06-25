package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade30 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);


        int[] numero = new int[11];

        int cal;
        System.out.print("Informe o número: ");
        int tabu = scan.nextInt();

        for (int i = 0; i < numero.length; i++) {
            cal = i * tabu;
            System.out.println(i + " * " + tabu + " = " + cal);

        }


    }
}
