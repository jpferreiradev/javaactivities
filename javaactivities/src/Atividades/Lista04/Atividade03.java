package Atividades.Lista04;

import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

      int a,b,c,valorIgual;

        System.out.print("Informe o valor de A: ");
        a = scan.nextInt();
        System.out.print("Informe o valor de B: ");
        b = scan.nextInt();

        if(a == b){
            valorIgual = a +b;
            System.out.println("Soma valores: " + valorIgual);

        } else{
            valorIgual = a * b;
            System.out.println("Multiplicação valores: " + valorIgual);
        }

    }
}
