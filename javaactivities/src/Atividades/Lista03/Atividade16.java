package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numeroUm;
        int numeroDois;

        System.out.print("Insira o primeiro número: ");
        numeroUm = scan.nextInt();
        System.out.print("Insira o segundo número: ");
        numeroDois = scan.nextInt();

        if(numeroUm > numeroDois){
            System.out.println("Número maior: " + numeroUm);
            System.out.println("Numero menor: " + numeroDois);
        } else if (numeroDois > numeroUm ) {
            System.out.println("Número maior: " + numeroDois);
            System.out.println("Numero menor: " + numeroUm);
        } else{
            System.out.println("Numero iguais...");
        }

    }

}
