package AtividadesOOP.Lista04.Atividade05.application;


import AtividadesOOP.Lista04.Atividade05.entities.AutomovelAVenda;
import AtividadesOOP.Lista04.Atividade05.entities.MotocicletaAVenda;
import AtividadesOOP.Lista04.Atividade05.entities.VeiculoAVenda;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        VeiculoAVenda veiculo = new VeiculoAVenda();
        AutomovelAVenda automovel = new AutomovelAVenda();
        MotocicletaAVenda motocicleta = new MotocicletaAVenda();

        veiculo.setModelo("March");
        veiculo.setMarca("Nissan");
        veiculo.setAno(2020);
        veiculo.setCor("Preto");
        veiculo.setPrecoDeVenda(40.000);

        System.out.println(veiculo.toString());

        automovel.setModelo("3008");
        automovel.setMarca("Peugeot");
        automovel.setAno(2015);
        automovel.setCor("Vinho");
        automovel.setPrecoDeVenda(45.000);

        System.out.println(automovel.toString());

        motocicleta.setModelo("Ninja");
        motocicleta.setMarca("Honda");
        motocicleta.setAno(2020);
        motocicleta.setCor("Azul");
        motocicleta.setPrecoDeVenda(120.00);

        System.out.println(motocicleta.toString());



    }
}
