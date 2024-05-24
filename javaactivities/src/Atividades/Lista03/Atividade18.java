package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int codigo;
        System.out.print("Informe o código: ");
        codigo = scan.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            default:
                System.out.println("Código inválido....");
        }

    }
}
