package Atividades;

import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String tamanhoPalavra;
        String[] vogais = {"a", "e", "i", "o", "u"};


        System.out.println("Digite uma palavra");
        tamanhoPalavra = scan.nextLine();

        System.out.println("A quantidade de palavras foi: " + tamanhoPalavra.length());

        System.out.println("Numero: " + vogais.length);


        if(tamanhoPalavra.length() != vogais.length){
            System.out.println("A quantidade de vogais foi:" + vogais.length);
        } else{
            System.out.println("A palavra não tem nenhuma vogal");
        }




    }
}

 /*
        for(int i = 0; i < tamanhoPalavra.length(); i++){
            System.out.println(i);


        }
        */