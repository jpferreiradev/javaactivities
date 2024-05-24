package Atividades.Lista03;

import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int x;


        System.out.print("Informe o número x: ");
        x = scan.nextInt();

        if( x >= 0){
            System.out.println("O módulo é: " + x);
        } else if (x < 0) {
            x = x * (-1);
            System.out.println("O módulo é: " + x);
        }
    }
}

/*
 if( x >= 0){
            System.out.println("O módulo é: " + x);
        } else if (x < 0) {
            x = -x * (-1);
            System.out.println("O módulo é: " + x);
        }
 */