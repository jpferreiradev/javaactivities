package Atividades.Lista03;

import java.util.Scanner;

public class Atividade60 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x;
        int y;

        System.out.printf("Informe o valor de X: ");
        x = scan.nextInt();
        System.out.println("Informe o valor de Y: ");
        y = scan.nextInt();

      verifica_quadrante(x,y);

    }
    static void verifica_quadrante(int x, int y){
        if(x <= 90 ){
            System.out.println("X - Primeiro quadrante");
        } else if (x <= 180 ) {
            System.out.println("X - Segundo quadrante ");
        } else if (x <= 270 ) {
            System.out.println("X - Terceiro quadrante");
        } else{
            System.out.println("X - Quarto quadrante ");
        }

        if(y <= 90 ){
            System.out.println("Y - Primeiro quadrante");
        } else if (y <= 180 ) {
            System.out.println("Y - Segundo quadrante ");
        } else if (y <= 270 ) {
            System.out.println("Y - Terceiro quadrante");
        } else{
            System.out.println("Y - Quarto quadrante ");
        }


    }
}

/*
   if(x > 0 || x < 90 ){
            System.out.println("X - Primeiro quadrante");
        } else if (x > 90 || x < 180 ) {
            System.out.println("X - Segundo quadrante ");
        } else if (x > 180 || x < 270 ) {
            System.out.println("X - Terceiro quadrante");
        } else{
            System.out.println("X - Quarto quadrante ");
        }

        if(y > 0 || y < 90 ){
            System.out.println("Y - Primeiro quadrante");
        } else if (y > 90 || y < 180 ) {
            System.out.println("Y - Segundo quadrante ");
        } else if (y > 180 || y < 270 ) {
            System.out.println("Y - Terceiro quadrante");
        } else{
            System.out.println("Y - Quarto quadrante ");
        }

 */