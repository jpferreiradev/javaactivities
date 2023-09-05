package Atividades;

import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        double valorKm;
        double valorConversao;

        System.out.println("Informe o valor do km/h:");
        valorKm = scan.nextDouble();
        valorConversao = (valorKm * 1.000) / 3.600;
        System.out.println("O valor da conversão é:" + valorConversao);



    }
}
