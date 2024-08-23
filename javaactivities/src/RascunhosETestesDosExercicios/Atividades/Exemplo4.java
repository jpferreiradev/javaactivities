package RascunhosETestesDosExercicios.Atividades;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int NumeroPosicoes = 100, x = 0; //máximo 100 posições
        int[] numero = new int[NumeroPosicoes];

        int contar1 = 0, contar3 = 0, contar4 = 0; //existe um outro jeito, mas vou manter as coisas simples por enqunato

        do {
            System.out.print("Digite o próximo número (Digite -1 para sair): ");
            numero[x] = entrada.nextInt();
            if (numero[x] == 1)
                contar1++;
            if (numero[x] == 3)
                contar3++;
            if (numero[x] == 4)
                contar4++;
            x++;
        } while (numero[x - 1] != -1 && x < NumeroPosicoes);

        System.out.println("Quantidades:\nNumero 1 = " + contar1 + "\nNumero 3 = " + contar3 + "\nNumero 4 = " + contar4);
    }
}
