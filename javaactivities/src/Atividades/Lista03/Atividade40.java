package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade40 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double indice;
        boolean n = false;
        char stop;

        do {
            do {
                System.out.print("Informe o indice de poluição: ");
                indice = scan.nextDouble();
                if (indice < 0) {
                    System.out.println("Numero ínvalido, digite novamente um numero positivo... ");
                }
            } while (indice < 0);

            if (indice > 0 && indice <= 0.25) {
                System.out.println("Poluição aceitavel");
            }
             if (indice == 0.3) {
                System.out.println(" 1º grupo de empresas suspender suas atividades");
            }
             if (indice == 0.4) {
                System.out.println("1º e 2º grupo de empresas, suspenderem suas atividades");
            }
             if (indice >= 0.5) {
                System.out.println("Todos os grupos de empresas, devem paralisarem suas atividades");
            }

            System.out.print("Deseja encerrar o programa? (S/N): ");
            stop = scan.next().charAt(0);
            if (stop == 'S' || stop == 's') {
                n = true;
            }
        } while (n == false);


    }
}

/*

 */