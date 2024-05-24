package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.print("Insira o primeiro número: ");
        numero = scan.nextInt();

        if(numero >= 0 && numero <= 9){
            System.out.println("Valor válido...");

        } else{
            System.out.println("Valor inválido...");
        }

    }
}
