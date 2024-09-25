package Atividades.Lista04;

import java.util.Random;
import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random random = new Random();

        System.out.print("Um valor aleatório entre 0 e 100: ");
        int numero = random.nextInt(100);
        System.out.println(numero);

    }
}
 // Aprendi a utilizar a classe Math, para gerar um número aleatorio
/*
  Random gerador = new Random(100);

        int numero = gerador.nextInt();


        System.out.println(numero);

        /*
        for(int i = 0; i < 10; i++){
           System.out.println(gerador.nextInt(10));
        }
        */