package Atividades.Lista03;

import java.util.Scanner;

public class Atividade54 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a[] = new int[5];
        int b[] = new int[8];
        //int c[] = new int[];


        System.out.println("Elementos de A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.printf(" " + (i + 1));
        }
        System.out.println();
        System.out.println("Elementos de B: ");
        for (int i = 0; i < b.length; i++) {
            System.out.printf(" " + (i + 1));
        }
        System.out.println();


        int c = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] != b[j]) {
                    c = c + i;
                }
            }
        }
        System.out.println();
        System.out.println("Elementos de C: " + c);
    }
}
