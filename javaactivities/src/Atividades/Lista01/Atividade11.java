package Atividades.Lista01;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome = "Jean";

        while(nome.equals("Jean")){
            System.out.println("Digite uma letra");
            nome = scan.nextLine();
            if (nome.equals("j")) {
                System.out.println("Digite outra letra:");
                nome = scan.nextLine();
                if (nome.equals("e")) {
                    System.out.println("Digite outra letra:");
                    nome = scan.nextLine();
                    if (nome.equals("a")) {
                        System.out.println("Digite outra letra:");
                        nome = scan.nextLine();
                        if (nome.equals("n")) {
                            System.out.println("Você digitou Jean");
                        }
                    }
                }
            } else {
                System.out.println("Você não digitou Jean, repita....");
            }
        }





    }
}

/* Primeira vez que eu fiz
 while(nome.equals("Jean")){
            System.out.println("Digite uma letra");
            nome = scan.nextLine();
            if (nome.equals("j")) {
                System.out.println("Digite outra letra:");
                nome = scan.nextLine();
                if (nome.equals("e")) {
                    System.out.println("Digite outra letra:");
                    nome = scan.nextLine();
                    if (nome.equals("a")) {
                        System.out.println("Digite outra letra:");
                        nome = scan.nextLine();
                        if (nome.equals("n")) {
                            System.out.println("Você digitou Jean");
                        }
                    }
                }
            } else {
                System.out.println("Você não digitou Jean, repita....");
            }
        }
 */

/* Segunda vez que eu fiz;
  String nome[] = {"J,e,a,n"};
        String letra;


        while()
        for(int i = 0; i < nome.length;i++){
            if(nome[i] == letra){

            }
        }

 */