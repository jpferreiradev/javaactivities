package Atividades;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        double temperatura;

        System.out.println("Digite a temperatura:");
        temperatura = scan.nextDouble();

        if( temperatura < -20 ){
            System.out.println("Hipotermia");
        } else if (temperatura > 20 && temperatura < 37.5) {
            System.out.println("Temperatura normal");
        } else if (temperatura > 37.5 && temperatura < 42) {
            System.out.println("Febre");
        } else if (temperatura >= 43) {
            System.out.println("Perigooo!");
        }
        {

        }



    }

}
