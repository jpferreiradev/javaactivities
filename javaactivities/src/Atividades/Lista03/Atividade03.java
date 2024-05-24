package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String vendedor;
        double precoUnitario;
        int codigoPeca;
        int quantidadeVenda;
        double comissaoVendaTotal;
        double valorTotal;

        System.out.print("Informe o nome do vendedor: ");
        vendedor = scan.nextLine();
        System.out.print("Informe o código da peça: ");
        codigoPeca = scan.nextInt();
        System.out.print("Informe o preço unitário da peça: ");
        precoUnitario = scan.nextDouble();
        System.out.print("Informe a quantidade vendida: ");
        quantidadeVenda = scan.nextInt();
        valorTotal = precoUnitario * quantidadeVenda;
        System.out.println("O valor total da venda é de : " + valorTotal);
        comissaoVendaTotal = valorTotal * 0.05;
        System.out.println("O valor da comissão da venda é de: " + String.format("%.2f", comissaoVendaTotal));


    }
}
