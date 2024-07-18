package Atividades.Lista03;


import java.util.Locale;
import java.util.Scanner;

public class Atividade37 {
    public static void main(String[] args) {

        // Foi utilizado o switch no caso dessa questão, mas preferir usar o else if

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numero;
        int numeroDois;
        int opcao;
        boolean stop = false;
        char escolha;


        while (stop == false) {

            System.out.print("Informe o primeiro número: ");
            numero = scan.nextInt();
            System.out.print("Informe o segundo número: ");
            numeroDois = scan.nextInt();

            System.out.println("Escolha a opção de 1 a 4: \n1: Adição (+)\n2: Subtração (-)\n3: Multiplicação (*)\n4: Divisão (%)");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();

            if (opcao == 1) {
                System.out.println("A soma de " + numero + " mais " + numeroDois + "é : " + (numero + numeroDois));
            } else if (opcao == 2) {
                System.out.println("A subtração de " + numero + " mais " + numeroDois + " é: " + (numero - numeroDois));
            } else if (opcao == 3) {
                System.out.println("A multiplicaçõ de " + numero + " mais " + numeroDois + " é: " + (numero * numeroDois));
            } else if (opcao == 4) {
                System.out.println("A divisão de " + numero + " mais " + numeroDois + " é: " + (numero / numeroDois));
            } else {
                System.out.println("Opção errada, tente novamente....");
                opcao = scan.nextInt();
            }

            System.out.println("Deseja encerrar o programa: (S/N)");
            escolha = scan.next().charAt(0);
            if (escolha == 'S' || escolha == 's') {
                stop = true;
            }
        }


    }
}

/*
  Scanner entrada = new Scanner(System.in);
        int opcao;
        String charOpcao;
        boolean encerrar = false;

        while (encerrar == false) {

            System.out.println("Digite uma das opções para as operações:\n1 – Adição\n2 – Subtração\n3 – Multiplicação\n4 – Divisão\nopção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    pegar_numeros();
                    System.out.println("Resultado de " + primeiro + "+" + segundo + "=" + (primeiro + segundo));
                    break;
                case 2:
                    pegar_numeros();
                    System.out.println("Resultado de " + primeiro + "-" + segundo + "=" + (primeiro - segundo));
                    break;
                case 3:
                    pegar_numeros();
                    System.out.println("Resultado de " + primeiro + "*" + segundo + "=" + (primeiro * segundo));
                    break;
                case 4:
                    pegar_numeros();
                    System.out.println("Resultado de " + primeiro + "/" + segundo + "=" + (primeiro / segundo));
                    break;
                default:
                    System.out.println("Opção inválida, digite novamente a opção: ");
                    opcao = entrada.nextInt();
            }

            System.out.println("Deseja continuar?(s/n)");
            charOpcao = entrada.next();
            if (charOpcao == "N" || charOpcao == "n") {
                encerrar = true;
            }
        }


    }

    public static void pegar_numeros() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        primeiro = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        segundo = entrada.nextDouble();
    }
}

 */