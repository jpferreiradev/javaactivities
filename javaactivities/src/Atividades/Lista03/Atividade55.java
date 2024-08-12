package Atividades.Lista03;

import java.util.Scanner;

public class Atividade55 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String frase;
        boolean stop = true;

        System.out.print("Escreva uma frase: ");
        frase = scan.nextLine();

        System.out.println(frase);

        System.out.print("Tamanho da frase: ");
        System.out.println(frase.length());

        System.out.println("Tamanho dos espaços em branco certo: ");
        System.out.println(frase.length() - frase.replaceAll(" ", "").length());

        if (frase.length() < 50) {
            System.out.println("FRASE: " + frase.replaceAll("\\s+", " "));
        } else {
            System.out.println("Repita, a frase não pode passar mais de 50 caracteres, tente novamente: ");

        }
    }
}




