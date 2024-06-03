package Atividades.Lista03;

import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int a;
        int b;

        System.out.print("Informe o número:");
        numero = scan.nextInt();

        if(numero >= 0){
            a = numero;
            System.out.println("O numero é A:" + numero);
        } else if (numero < 0) {
            b = numero;
            System.out.println("O número é B: " + numero);
        }
    }
}
