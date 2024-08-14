package RascunhosETestesDosExercicios;

import java.util.Random;
import java.util.Scanner;

public class Exemplo13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        boolean acertou = false;
        int chute;
        int tentativas = 0;

        int numero = gerador.nextInt(101);

        while (acertou == false) {
            System.out.print("Digite um número de 0 a 100: ");
            chute = entrada.nextInt();
            tentativas++;
            if (chute == numero) {
                System.out.println("Você acertou em " + tentativas + " tentativas!");
                acertou = true;
            } else if (chute > numero) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("O número é maior.");
            }
        }
    }

}
