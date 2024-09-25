package RascunhosETestesDosExercicios;

import java.util.Scanner;

public class ExemploCalculoPorcemtagem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double valor,calculoDesconto,porcetagem,valorFinal;

        System.out.print("Informe o valor da porcetagem: ");
        porcetagem = scan.nextInt();
        System.out.print("Informe o valor do produto: ");
        valor = scan.nextDouble();

        calculoDesconto = (porcetagem * valor) / 100;
        valorFinal = valor - calculoDesconto;

        System.out.println("Valor porcetagem: " + porcetagem + "%");
        System.out.println("Valor do produto: " + valor + " reais");
        System.out.println("Valor do desconto foi: " + calculoDesconto);
        System.out.println("Valor final do produto com o desconto de " + porcetagem + "%" + " é de R$ " + valorFinal + " reais");
    }
}
