package Atividades.Lista03;

import java.util.Scanner;

public class Atividade63 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.printf("Informe o número: ");
        numero = scan.nextInt();

       verifica(numero);

    }
    static void verifica(int numero){
        if(numero % 2 == 0){
            System.out.println("PAR");
        } else{
            System.out.println("ÍMPAR");
        }
    }
}
