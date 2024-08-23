package AtividadesOOP.Lista01.Atividade04.aplication;

import AtividadesOOP.Lista01.Atividade04.entities.Apolice;

public class ApoliceTeste {
    public static void main(String[] args) {

        Apolice apolice = new Apolice();
        apolice.setNome("JP");
        apolice.setIdade(32);
        apolice.setValorPremio(40.00);



        apolice.imprimir("JP",32,40.00);
    }
}
