package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Ativiade01 {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Double quantidade_minima;
        Double quantidade_maxima;
        Double estoque_medio;

        System.out.print("Informe a quantidade mínima da peça: ");
        quantidade_minima = scan.nextDouble();
        System.out.print("Informe a quantidade máxima da peça: ");
        quantidade_maxima = scan.nextDouble();
        estoque_medio = (quantidade_minima + quantidade_maxima) / 2;
        System.out.println("O estoque médio de uma peça é: " + estoque_medio);


    }
}
