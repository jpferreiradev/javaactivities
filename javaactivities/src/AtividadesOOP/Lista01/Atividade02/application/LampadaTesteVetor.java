package AtividadesOOP.Lista01.Atividade02.application;

import AtividadesOOP.Lista01.Atividade02.entities.Lampada;

import java.util.Scanner;

public class LampadaTesteVetor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Lampada lap = new Lampada();
        Lampada lampadas[] = new Lampada[3];

        int quantidadeLampadas = 0;

        for (int i = 0; i < lampadas.length; i++) {
            System.out.println("Informe o tipo da " + (i + 1) + " lâmpada: ");
            String tipo = scan.next();
            System.out.println("Informe a voltagem da " + (i + 1) + " lâmpada: ");
            int voltagem = scan.nextInt();
            System.out.println("Informe a cor da " + (i + 1) + " lâmpada: ");
            String cor = scan.next();
            System.out.println("Informe a marca da " + (i + 1) + " lâmpada: ");
            String marca = scan.next();
            System.out.println("Informe o preço da " + (i + 1) + " lâmpada: ");
            double preco = scan.nextDouble();
            System.out.println("Informe a potencia da " + (i + 1) + " lâmpada: ");
            int potencia = scan.nextInt();
            System.out.println("Informe o status da " + (i + 1) + " lâmpada: ");
            boolean status = scan.nextBoolean();
            lampadas[quantidadeLampadas] = new Lampada(tipo, voltagem, cor, marca, preco, potencia, status);
            quantidadeLampadas++;
        }

        System.out.println("Lista de lâmpadas: ");
        for (int i = 0; i < lampadas.length; i++) {
            System.out.println(lampadas[i].toString());
        }
        System.out.println();
        System.out.println("Quantidade de lâmpada cadastradas: ");
        if (quantidadeLampadas > 0) {
            System.out.println("Existe " + quantidadeLampadas + " lâmpada cadastradas");
        } else {
            System.out.println("Não existe lâmpadas cadastradas");
        }

        int cont = 0;
        System.out.println("Informe a potência desejada: ");
        int potenciaDesejada = scan.nextInt();
        for (int i = 0; i < lampadas.length; i++) {
            if (potenciaDesejada > lampadas[i].getPotencia()) { // Errou aqui, era == e não >
                //cont = cont + i;
                cont++;
                //System.out.println(cont);
            }
        }

        System.out.println();
        double media;
        double somaPreco = 0;
         for(int i = 0; i < lampadas.length;i++){ // Soma de todos os preços
           //somaPreco = somaPreco + lampadas[i].getPreco();
           somaPreco += lampadas[i].getPreco();
        }
        System.out.println("Soma preço: " + somaPreco); // Pegar a soma dos preços
        media = somaPreco / quantidadeLampadas;
        for(int i = 0; i < lampadas.length;i++){
            if(lampadas[i].getPreco() < media){ // Foi colocado uma variavel para somar os valores do precos, faz essa variavel < media

            }
        }



    }

}

//System.out.println((quantidadeCanetas==1)?"Existe "+quantidadeCanetas+" caneta cadastrada":"Existem "+quantidadeCanetas+" canetas cadastradas");
/*
System.out.println("Preço médio menor ");

        for(int i = 0; i < lampadas.length;i++){

        }
 lap.setTipo("LED");
        lap.setVoltagem(30);
        lap.setCor("Amarela");
        lap.setMarca("Philps");
        lap.setPreco(30.0);
        lap.setPotencia(20);
        //lap.ascender();

        //System.out.println(lap.toString());

 */