package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int anoNascimento;
        int anoAtual;
        int idadeAtual;
        int conversaoAnosDias;
        int conversaoAnosMes;

        System.out.print("Informe o ano que você nasceu: ");
        anoNascimento = scan.nextInt();
        System.out.print("Informe o ano atual: ");
        anoAtual = scan.nextInt();
        idadeAtual = anoAtual - anoNascimento;
        System.out.println("Sua idade atual é: " + idadeAtual + " anos");
        conversaoAnosDias = idadeAtual * 365;
        conversaoAnosMes = idadeAtual * 12;
        System.out.println();

        System.out.println("Sua idade atual é de " + idadeAtual + " anos e " + conversaoAnosDias + " dias e " + conversaoAnosMes + " meses");
    }
}
