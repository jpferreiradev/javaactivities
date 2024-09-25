package Atividades.Lista04;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b, c, soma;

        System.out.print("Informe o valor de A: ");
        a = scan.nextInt();
        System.out.print("Informe o valor de B: ");
        b = scan.nextInt();
        System.out.print("Informe o valor de C: ");
        c = scan.nextInt();

        soma = a + b;
        if(soma > c){
            System.out.println("A soma é maior que C");
        } else{
            System.out.println("A soma não é maior que C");
        }

        System.out.println("Valor da soma: " + soma);
        System.out.println("Valor de C:" + c);
    }
}
