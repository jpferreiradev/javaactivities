package Atividades.Lista03;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade57 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String frase;
        char vogais[] = {'a','e','i','o','u'};


        System.out.println("VOGAIS: ");
        for(int i = 0; i < vogais.length;i++){
            System.out.printf(" " + vogais[i]);
        }

        //System.out.println();
        System.out.print("Digite uma frase: ");
        frase = scan.nextLine();
        System.out.println("Frase: " + frase);


        /*
        char letra = 0;
        for(int i = 0; i < vogais.length;i++){
            if(frase.equals(vogais[i])){
                letra = letra + i;
            }
        }
    */





    }
}

/*
 for (char n : vogais) {
            System.out.printf(" " + n);

        }
 */