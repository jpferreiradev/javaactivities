package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double velocidadeMedia;
        double tempoViagem;
        double distanciaMedia;
        double valorKmAutomovelLitro = 12.0;
        double litrosUsados;

        System.out.println("Informe o tempo gasto na viagem: ");
        tempoViagem = scan.nextDouble();
        System.out.println("Informe a velocidade média da viagem: ");
        velocidadeMedia = scan.nextDouble();
        distanciaMedia = tempoViagem * velocidadeMedia;
        litrosUsados = distanciaMedia / valorKmAutomovelLitro;

        System.out.println("Tempo gasto na viagem: " + tempoViagem + "h/hrs");
        System.out.println("Velocidade média foi: " + velocidadeMedia + "km/h");
        System.out.println("A distância pecorrida foi: " + distanciaMedia + "km");
        System.out.println("A quantidade de litros na viagem foi: " + litrosUsados + "l");







    }
}
