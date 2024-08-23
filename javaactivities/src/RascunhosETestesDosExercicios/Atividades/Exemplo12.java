package RascunhosETestesDosExercicios.Atividades;

import java.util.Scanner;

public class Exemplo12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int NumeroVoltas,
                total = 0,
                media,
                MelhorTempo = 0,
                MelhorVolta = 0;

        System.out.print("Digite o número de voltas: ");
        NumeroVoltas = entrada.nextInt();

        int[] tempos = new int[NumeroVoltas];

        for (int x = 0; x < NumeroVoltas; x++) {
            System.out.print("Digite o tempo da " + (x + 1) + "ª volta (em segundos): ");
            tempos[x] = entrada.nextInt();
            //total+=tempos[x];
            total = total + tempos[x];
            if (tempos[x] < MelhorTempo || x == 0) {
                MelhorTempo = tempos[x];
                MelhorVolta = x + 1;
            }
        }
        media = total / NumeroVoltas;


        System.out.println("i.   O melhor tempo foi: " + MelhorTempo + " segundos.");
        System.out.println("ii.  Melhor volta foi a " + MelhorVolta + "ª.");
        System.out.println("iii. A média de tempo foi: " + media);

    }
}
