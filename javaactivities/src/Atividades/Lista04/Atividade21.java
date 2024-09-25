package Atividades.Lista04;

import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int a,b,resto,quociente;

        System.out.print("Informe o valor de A: ");
        a = scan.nextInt();
        System.out.print("Informe o valor B: ");
        b = scan.nextInt();

        resto = a % b;
        quociente = a / b;

        System.out.println("Valor do quociente: " + quociente );
        System.out.println("Valor do resto: " + resto );

    }
}
