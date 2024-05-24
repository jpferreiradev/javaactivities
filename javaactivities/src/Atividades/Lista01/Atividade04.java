package Atividades.Lista01;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        //String letra = "x";
        //String comando;
        char letra = 'x';
        char comando;

        System.out.println("Para sair do programa digite 'x'...");
        comando = scan.next().charAt(0);

        while(comando != letra){
            System.out.println("Para sair do programa digite 'x': ");
            System.out.println("Digite 'x' novamente para sair do programa.... ");
            comando = scan.next().charAt(0);
        }
        System.out.println("Finalizando programa...");




    }
}
