package Atividades.Lista03;

import java.util.Scanner;

public class Atividade31 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Correção

        int numero=0;
        int quantidadePar = 0;
        int quantidadeImpar = 0;


        while(numero >= 0){
            System.out.println("Informe um número ( numero negativo finaliza o programa: ");
            numero = scan.nextInt();
            if(numero >=0){
                if(numero % 2 == 0){
                    quantidadePar++;
                } else{
                    quantidadeImpar++;
                }
            }
        }

        System.out.println("Quantidade de numeros pares:" + quantidadePar);
        System.out.println("Quantidade de números impares: " + quantidadeImpar);

    }
}

/*
Como eu fiz:
        int valor;

        System.out.print("Informe um número:  ");
        valor = scan.nextInt();
        int[] numero = new int[valor];


        for (int i = 0; i < numero.length; i++) {
            System.out.print("Informe o " + (1+i) + "valor: ");
            numero[i] = scan.nextInt();
        }

        System.out.println("Estes são os numeros: ");
        for (int n : numero) {
            System.out.print(" " + n);
        }
        System.out.println();

       int cont = 0;
        for (int n : numero) {
            if (n % 2 == 0) {
                System.out.print("Par :" + " " +  n);
            } else {
                System.out.println("Impar: " + " " + n);
            }

        }


    }

 */