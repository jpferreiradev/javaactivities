package Atividades.Lista04;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int ladoA, ladoB, ladoC;

        System.out.print("Informe o tamanho do lado A: ");
        ladoA = scan.nextInt();
        System.out.print("Informe o tamanho do lado B: ");
        ladoB = scan.nextInt();
        System.out.print("Informe o tamanho do lado C: ");
        ladoC = scan.nextInt();

        if(ladoA == ladoB && ladoB == ladoC){
            System.out.println("Triângulo equilátero");
        } else if(ladoA == ladoB && ladoB != ladoC) {
            System.out.println("Triângulo isósceles ");
        } else{
            System.out.println("Triângulo escaleno");
        }

    }
}
