package Atividades.Lista03;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextInt();
        double b = scan.nextInt();
        //double x;

        //x = a / b;

        if (a % b == 0) {
            System.out.println("Esse número é múltiplo");
        } else {
            System.out.println("Esse número não é múltiplo");
        }
    }
}
