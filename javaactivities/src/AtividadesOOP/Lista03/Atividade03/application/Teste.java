package AtividadesOOP.Lista03.Atividade03.application;

import AtividadesOOP.Lista03.Atividade03.entities.Cliente;
import AtividadesOOP.Lista03.Atividade03.entities.PessoaFisica;
import AtividadesOOP.Lista03.Atividade03.entities.PessoaJuridica;

public class Teste {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("JP","Ferreira","999999999");
        Cliente pessoaFisica = new PessoaFisica("Paulo","Rua Ali Ali","32461290","04556789078");
        Cliente pessoaJuridica = new PessoaJuridica("Thaynara","Rua ali ali","99998976","2345678980","UU");

        System.out.println(cliente.toString());
        System.out.println();
        pessoaFisica.imprimirDados();
        System.out.println();
        pessoaJuridica.imprimirDados();







    }
}
