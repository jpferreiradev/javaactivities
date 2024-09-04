package AtividadesOOP.Lista04.Atividade02.application;

import AtividadesOOP.Lista03.Atividade02.entities.Pessoa;
import AtividadesOOP.Lista03.Atividade02.entities.Professor;
import AtividadesOOP.Lista04.Atividade02.entities.Aluno;

import java.util.Date;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno("João Paulo", 1234, new Date(), "Sim", 2024, 350.0);
        //aluno.mostraRegistro();

        aluno.inicializaRegistro("Thay","123",new Date(),"Sim",1992);





    }
}

/*
 int quantidade;

        System.out.print("Informe a quantidade de alunos: ");
        quantidade = scan.nextInt();

        Aluno[] alunos = new Aluno[quantidade];
 */