package Atividades.Lista01;

import java.util.Scanner;


public class Atividade10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        char[] vogais = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char letra;
        int numero;

        System.out.println("Digite uma letra:");
        letra = scan.next().charAt(0);
        System.out.println("Digite um número:");
        numero = scan.nextInt();
        System.out.println(letra);
        //System.out.println(numero);

        for (int i = 0; i < vogais.length; i++) {
            if(letra == vogais[i]){
                 System.out.println("É uma vogal...");
                 System.out.println(numero + letra);
                    break;
             } else{
                 System.out.println("Não é uma vogal...");
                break;
             }

        }

    }

}
