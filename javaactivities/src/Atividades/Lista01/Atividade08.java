package Atividades.Lista01;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int numeroA;
        int numeroB;
        int conversaoNumeros;

        System.out.println("Digite um número A: ");
        numeroA = scan.nextInt();
        System.out.println("Digite um número B: ");
        numeroB = scan.nextInt();
        System.out.println((int)Math.pow(numeroA,numeroB));



    }
}
