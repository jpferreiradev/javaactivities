package RascunhosETestesDosExercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int candidata;

        System.out.print("Informe a quantidade de candidatas: ");
        candidata = scan.nextInt();

        ArrayList<String> nomes = new ArrayList<String>(candidata);
        String nome;

        //String[] nomes = new String[candidata];
        int[] idades = new int[candidata];

        for(String n : nomes){
            System.out.println("Informe o nomes das candidas: ");
            nome = scan.next();
        }

        System.out.println("Esses são os nomes da candidatas: ");
        for(String n : nomes){
            System.out.println(n);
        }

        /*
        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe a " + (i + 1) + " idade da pessoa: ");
            int idade = scan.nextInt();
        }
        */


    }

}

/*

        String nome;
        Integer idade;
        int posicao;

        System.out.print("Informe quantas posições vai ter o array: ");
        posicao = scan.nextInt();

        ArrayList<String> nomes = new ArrayList<String>(posicao);
        ArrayList<Integer> idades = new ArrayList<Integer>(posicao);



        for(int i = 0; i <nomes.size();i++){
            System.out.println("Informe o " + (i+1) + "nome da pessoa: ");
            nome = scan.next();
        }
        for(int i = 0; i <idades.size();i++){
            System.out.println("Informe a " + (i+1)+ " idade da pessoa: ");
        }

        for(String n : nomes){
            System.out.print(n);

        }
        for(Integer m : idades){
            System.out.println(m);

        }
        /*
        System.out.println("Os nomes são esses: ");
        for(String n : nomes){
            System.out.println(n);
        }
        */



