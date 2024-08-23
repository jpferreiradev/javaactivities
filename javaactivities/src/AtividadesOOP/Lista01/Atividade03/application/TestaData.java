package AtividadesOOP.Lista01.Atividade03.application;

import AtividadesOOP.Lista01.Atividade03.entities.Data;


import java.util.Scanner;

public class TestaData {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        Integer quantidade, dia, mes, ano;
        int quantidadeDeDatas = 0;

        System.out.print("Informe a quantidade de datas: ");
        quantidade = scan.nextInt();

        Data datas[] = new Data[quantidade];

        for (int i = 0; i < datas.length; i++) {
            System.out.println("Informe o dia: ");
            dia = scan.nextInt();
            System.out.println("Informe o mês: ");
            mes = scan.nextInt();
            System.out.println("Informe o ano: ");
            ano = scan.nextInt();
            datas[quantidadeDeDatas] = new Data(dia, mes, ano);
            datas[i].validarData(dia,mes,ano);
            quantidadeDeDatas++;

        }

        System.out.println();
        System.out.println("As datas são essas: ");
        for (int i = 0; i < datas.length; i++) {
            System.out.println(datas[i].toString());

        }

    }
}


/*
        Data data = new Data();
        data.setDia(1);
        data.setMes(12);
        data.setAno(1991);

        System.out.println(data.toString());
        //data.validarData(1,12,1988);
        */
