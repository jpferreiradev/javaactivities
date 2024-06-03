package Atividades.Lista03;

import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor;

        System.out.println("Informe um numero: ");
        valor = scan.nextInt();

        while (valor >= 0) {
            System.out.println("Numero positivo");
            valor = scan.nextInt();
            if (valor < 0) {
                System.out.println("Numero negativo");
                valor = scan.nextInt();
            }

        }


    }

}
















/*
        System.out.println("Precione a tecla x para parar o programa: ");
            x = scan.next();
 */