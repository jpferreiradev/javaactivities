package RascunhosETestesDosExercicios;

import java.util.Random;

public class Exemplo3 {
    public static void main(String[]args){

     // Classe Random


        Random gerador = new Random();

        for(int i = 0; i < 10;i++){
            System.out.println(gerador.nextInt(11));
        }
    }
}
