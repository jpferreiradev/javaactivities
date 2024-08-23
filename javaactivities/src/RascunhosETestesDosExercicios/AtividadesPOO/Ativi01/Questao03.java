package RascunhosETestesDosExercicios.AtividadesPOO.Ativi01;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe qual o ano:");
        int ano = scan.nextInt();

        System.out.println(ano);

        if(ano % 4 == 0 ){
            System.out.println("Ano bissexto! ");
        } else{
            System.out.println("Esse ano não é bissexto!");
        }
    }
}
