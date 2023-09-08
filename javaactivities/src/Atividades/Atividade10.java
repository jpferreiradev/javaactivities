package Atividades;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[]args){

        // vogais a,e,i,o,u
        Scanner scan = new Scanner(System.in);

        String letra;
        String[] vogais = {"a","e","i","o","u"};
        //int numero;


        System.out.println("Digite um letra: ");
        letra = scan.nextLine();
        //System.out.println("Digite um número: ");
        //numero = scan.nextInt();

        //System.out.println("Letra foi: " +"["+ letra +"]" + " e o número foi:" + numero);
        System.out.println("Letra foi: " +"["+ letra +"]");


        //System.out.println(vogais.length);
        if(letra.equals(vogais.length)){
            System.out.println("É uma vogal");
        } else {
            System.out.println("Não é uma vogal");
        }






    }
}
