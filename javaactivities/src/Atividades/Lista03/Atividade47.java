package Atividades.Lista03;

import java.util.Scanner;

public class Atividade47 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidade;
        int x;
        int maior = 0;
        int menor = 0;
        int igual = 0;

        System.out.print("Informe a quantidade de números: ");
        quantidade = scan.nextInt();

        int[] numero = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe o " + (i + 1) + " número: ");
            numero[i] = scan.nextInt();
        }


        System.out.println("Os números são esses: ");
        for (int n : numero) {
            System.out.print(" " + n);
        }
        System.out.println();

        System.out.print("Informe o número x: ");
        x = scan.nextInt();

        for (int j = 0; j < numero.length; j++) {
            if (numero[j] > x) {
                System.out.println(numero[j]);
                maior++;
            } else if (numero[j] == x) {
                igual++;
            } else {
                menor++;
            }
        }

        System.out.println("Maiores: " + maior);
        System.out.println("Menores: " + menor);
        System.out.println("Igual: " + igual);
    }


}


// Como eu fiz:
/*

  int cont;
        for(int i =0; i < x.length;i++){
            if(valor > i){
                cont = i;
                System.out.println(cont);
            }
            if(valor < i){
                cont = i;
                System.out.println(cont);
            }
            if(valor == i){
                cont = i;
                System.out.println(cont);
            }
        }


        Scanner scan = new Scanner(System.in);

        int valor;
        int maior = 0;
        int menor = 0;
        int igual;
        int[] x = new int[10];


        System.out.print("Informe o número: ");
        valor = scan.nextInt();

        System.out.println();
        System.out.print("Numero informado: " + valor);
        System.out.println();
        System.out.println("Número inteiros positivos: ");

        for (int i = 0; i < x.length; i++) {
            System.out.print(" " + (i + 1));
        }



 */