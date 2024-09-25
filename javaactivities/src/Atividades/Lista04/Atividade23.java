package Atividades.Lista04;

import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double distancia,litroUsado,distanciaViagem;
        int velocidadeMedia;

        System.out.print("Informe a velocidade média: ");
        velocidadeMedia = scan.nextInt();
        System.out.print("Informe a distância pecorrida: ");
        distanciaViagem = scan.nextDouble();


        //distancia = tempo * velocidadeMedia;
        litroUsado = distanciaViagem / 12;

        System.out.println("Tempo gasto na viagem:" );
        System.out.println("Velocidade média: " + velocidadeMedia + "km");
        System.out.println("Distância pecorrida: " + distanciaViagem + "km" );
        System.out.println("Quantidade de litros usados: " + litroUsado + "l");
    }
}
