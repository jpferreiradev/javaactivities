package Atividades.Lista03;

import java.util.Scanner;

public class Atividade39 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        char s;
        // faltou essa variavel
        boolean stop = false;

        do {
            System.out.print("Informe um número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Numero par! ");
            } else {
                System.out.println("Numero impar! ");
            }
            if (numero < 0) {
                System.out.println("Número negativo! ");
            } else {
                System.out.println("Número positivo! ");
            }

            System.out.println("Deseja encerrar o programa, informe S:  ");
            s = scan.next().charAt(0);
            if(s == 's'|| s == 'S'){
                stop = true;
            }


        } while(stop == false);



    }


}



/*
  if (numero % 2 == 0) {
                System.out.println("Numero par");
            } else {
                System.out.println("Numero impar ");
            }
            if (numero < 0) {
                System.out.println("Número negativo");
            } else {
                System.out.println("Número positivo!");
            }
 */