package AtividadesOOP.Lista02.Atividade03.aplication;

import AtividadesOOP.Lista02.Atividade03.entities.Apolice;

import java.util.Scanner;

public class ApoliceTeste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        Apolice apolice = new Apolice();
        apolice.setNome("JP");
        apolice.setIdade(20);
        apolice.setValorPremio(40.00);

        Apolice apoliceDois = new Apolice();
        apoliceDois.setNome("Thay");
        apoliceDois.setIdade(26);
        apoliceDois.setValorPremio(40.00);

        Apolice apoliceTres = new Apolice();
        apoliceTres.setNome("JPThay");
        apoliceTres.setIdade(39);
        apoliceTres.setValorPremio(40.00);



        apolice.calcularPremioApolice();
        apoliceDois.calcularPremioApolice();
        apoliceTres.calcularPremioApolice();

        System.out.println();
        apolice.oferecerDesconto("Curitiba");
        apoliceDois.oferecerDesconto("Belo Horizonte");
        apoliceTres.oferecerDesconto("Rio de Janeiro");

    }
}

  /*
        System.out.println("Informe a quantidade de apolices: ");
        int quantidade = scan.nextInt();

        Apolice[] apolices = new Apolice[quantidade];

        String nome;
        int idade;
        double valorDoPremio;


        for(int i = 0; i < apolices.length;i++){
            System.out.println("Informe o seu nome: ");
            nome = scan.next();
            System.out.println("Informe a sua idade: ");
            idade = scan.nextInt();
            System.out.println("Informe o valor do prêmio: ");
            valorDoPremio = scan.nextDouble();
            apolices[quantidade] = new Apolice(nome,idade,valorDoPremio);

        }
       */