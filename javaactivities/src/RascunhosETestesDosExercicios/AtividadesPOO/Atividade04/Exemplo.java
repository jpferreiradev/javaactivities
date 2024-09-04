package RascunhosETestesDosExercicios.AtividadesPOO.Atividade04;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Entender realmente a diferença entre os operadores

        int a;
        int b;
        int c;
        int operadorNormal;
        int operadorDeAtribuicao;

        System.out.print("Informe o valor de A: ");
        a = scan.nextInt();
        System.out.print("Informe o valor de B: ");
        b = scan.nextInt();
        System.out.print("Informe o valor de C: ");
        c = scan.nextInt();

        operadorNormal = a + b;
        operadorDeAtribuicao= b += c;



        System.out.println("Operador normal:  " + operadorNormal);
        System.out.println("Exemplo de Operador de atribuição: " + operadorDeAtribuicao);

    }
}
