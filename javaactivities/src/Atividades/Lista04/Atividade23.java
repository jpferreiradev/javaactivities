package Atividades.Lista04;

import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double distancia,litroUsado,distanciaViagem,tempoViagem;
        int velocidadeMedia;

        System.out.print("Informe a velocidade média: ");
        velocidadeMedia = scan.nextInt();
        System.out.print("Informe em quanto tempo foi a viagem: ");
        tempoViagem = scan.nextDouble();



        distancia = tempoViagem * velocidadeMedia;
        litroUsado = distancia / 12;

        System.out.println("Tempo gasto na viagem:" + tempoViagem );
        System.out.println("Velocidade média: " + velocidadeMedia + "km");
        System.out.println("Distância pecorrida: " + distancia + "km" );
        System.out.println("Quantidade de litros usados: " + litroUsado + "l");

    }
}
/*
Fórmula: distância = tempo x velocidade.

            litros usados = distância / 12.
 */