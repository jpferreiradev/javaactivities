package Atividades.Lista03;

import Fundamentos.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Atividade48 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nomes[] = new String[20];
        int idades[] = new int[20];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o nome da " + (i + 1) + " candidata: ");
            nomes[i] = scan.nextLine();
        }


        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe a idade da " + (i + 1) + " candidata: ");
            idades[i] = scan.nextInt();
        }


        System.out.println("As candidatas são: ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome: " + nomes[i] + " - " + "Idade: " + idades[i]);
        }
        System.out.println();
        System.out.println("As candidatas selecionadas entre as idades de 18 e 20 anos são: ");

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] == 18 || idades[i] == 20) {
                System.out.println("Nome: " + nomes[i] + " - " + "Idade: " + idades[i]);
            }


        }

    }
}



