package Atividades.Lista04;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean valorA, valorB;
        valorA = true;
        valorB = true;

        if (valorA == valorB) {
            System.out.println("Ambos são falsos");
        } else if (valorA != valorB) {
            System.out.println("Aqui o resultado vai dar verdadeiro");
        }

    }
}