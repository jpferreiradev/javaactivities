package Atividades.Lista03;

import java.util.Random;
import java.util.Scanner;

public class Atividade50 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Random gerador = new Random();

        int numero;
        int contadorVezes;
        boolean stop = false;
        int numeroSorteado;
        int tentativas = 0;


        System.out.print("Informe um número para ser sorteado entre 0 a 100: ");
        numero = scan.nextInt();
        System.out.println("Numero escolhido foi: " + numero);

        System.out.println(gerador.nextInt(100));


    }
}


/*
System.out.println(gerador.nextInt(100));

if (numero > gerador.nextInt(100)) {
                System.out.println("Numero maior");
            } else {
                System.out.println("Numero menor");
            }
  for (int i = 0; i < 1; i++) {

            System.out.println("Numero gerado: " + gerador.nextInt(2));
            if (numero == gerador.nextInt(2)) {
                System.out.println("Você acertou o número");
            }
            if(numero != gerador.nextInt(2) && numero > gerador.nextInt(2) ) {
                System.out.println("O numero é maior, tente novamente...");
                numero = scan.nextInt();
            }
            if(numero != gerador.nextInt(2) && numero < gerador.nextInt(2)){
                System.out.println("O numero é menor, tente novamente");
                numero = scan.nextInt();
            }


        }

 */