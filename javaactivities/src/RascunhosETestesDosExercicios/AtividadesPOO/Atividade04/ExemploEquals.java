package RascunhosETestesDosExercicios.AtividadesPOO.Atividade04;

import java.util.Scanner;

public class ExemploEquals {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Informe o seu nome: ");
        String nome = scan.next();

        if(nome.equals("Paulo")){
            System.out.println("Nome igual");
        } else{
            System.out.println("Nome diferente");
        }
    }
}
