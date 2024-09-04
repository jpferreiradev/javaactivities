package AtividadesOOP.Lista03.Atividade02.application;

import AtividadesOOP.Lista03.Atividade02.entities.Aluno;
import AtividadesOOP.Lista03.Atividade02.entities.Pessoa;
import AtividadesOOP.Lista03.Atividade02.entities.Professor;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidade,matricula;
        String nome,sobrenome,disciplina;

        System.out.print("Informe a quantidade de pessoas: ");
        quantidade = scan.nextInt();

        int valor = 0;

        Pessoa[] pessoas = new Pessoa[quantidade];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Informe o " + (i + 1) + " nome: ");
            nome = scan.next();
            scan.next();
            System.out.println("Informe o " + (i + 1) + " sobrenome: ");
            sobrenome = scan.next();
            System.out.println("Informe se é aluno ou professor");
            char opcao = scan.next().charAt(0);
            if (opcao == 'a' || opcao == 'A') {
                System.out.println("Informe a matrícula: ");
                matricula = scan.nextInt();
                pessoas[i] = new Aluno(nome, sobrenome, matricula);
            }
            if (opcao == 'p' || opcao == 'P') {
                System.out.println("Informe o nome da disciplina: ");
                disciplina = scan.next();
                pessoas[i] = new Professor(nome, sobrenome, disciplina);
            }

        }

        System.out.println();

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].toString());
        }


    }

}