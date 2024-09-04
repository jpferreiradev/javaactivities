package AtividadesOOP.Lista04.Atividade01.application;

import AtividadesOOP.Lista04.Atividade01.entities.ContaBancariaSimplificada;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ContaBancariaSimplificada contaBancaria = new ContaBancariaSimplificada("JP",40.0,"Não");
        ContaBancariaSimplificada contaBancariaSimples = new ContaBancariaSimplificada("Thay",50.0,"Não");


        System.out.println(contaBancaria.deposita(10));

        System.out.println(contaBancariaSimples.deposita(5));



        /*
        int numeroDeContas;

        System.out.println("Informe quantas contas seram abertas: ");
        numeroDeContas = scan.nextInt();

        ContaBancariaSimplificada[] contas = new ContaBancariaSimplificada[numeroDeContas];



        for(int i = 0; i < contas.length;i++){
            System.out.println("Informe ");
        }
        */




    }
}
