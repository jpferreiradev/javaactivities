package Atividades.Lista04;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int anoAtual, anoNascimento, anosDeVida;
        int mesAtual, ano, mesDeVida;
        int diaAtual, mes, diaDeVida;

        System.out.print("Informe o ano atual: ");
        anoAtual = scan.nextInt();
        System.out.print("Informe o ano que você nasceu: ");
        anoNascimento = scan.nextInt();
        anosDeVida = anoAtual - anoNascimento;

        System.out.print("Informe o mês atual: ");
        mesAtual = scan.nextInt();
        ano = 12;
        mesDeVida = ano - mesAtual;

        System.out.print("Informe o dia atual: ");
        diaAtual = scan.nextInt();
        mes = 30;
        diaDeVida = mes - diaAtual;

        System.out.println(anosDeVida + " anos " + mesDeVida + " meses" + diaDeVida + " dias de vida");


    }
}
