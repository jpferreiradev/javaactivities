package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {

        // Pode ser feito dessa maneira
        Scanner scan = new Scanner(System.in);

        // Correção

        int valorNumeros;

        // Quantidade de números que irá calcular o fatorial
        System.out.print("Informe o número fatorial: ");
        valorNumeros = scan.nextInt();

        // Um array com esses números, pegando a quantidade e inserindo dentro do array
        int[] numeros = new int[valorNumeros];

        for(int i = 0; i < numeros.length;i++){
            System.out.println("Digite o número para calcular o valor fatorial:  ");
            numeros[i] = scan.nextInt();
        }
        for(int i = 0; i < numeros.length;i++){
            int resul = 1;
            for(int x = numeros[i]; x > 0;x--){
                resul = x * resul;
            }
            System.out.println("O valor fatorial de: " + numeros[i] + " é: " + resul);
        }
    }
}

// Como eu fiz:
/*
int fatorial;
        int[] numero = new int[0];

        System.out.print("Informe o número fatorial: ");
        fatorial = scan.nextInt();


        for(int i = 0; i < fatorial;i++){
            numero[i] = scan.nextInt();


        }


     Scanner scan = new Scanner(System.in);

        // Correção

        int valorNumeros;

        // Quantidade de números que irá calcular o fatorial
        System.out.print("Informe o número fatorial: ");
        valorNumeros = scan.nextInt();

        // Um array com esses números, pegando a quantidade e inserindo dentro do array
        int[] numero = new int[valorNumeros];

        for(int i = 0; i < numero.length;i++){
            System.out.println("Digite o número para calcular o valor fatorial:  ");
            numero[i] = scan.nextInt();
        }
        for(int i = 0; i < numero.length;i++){
            int resul = 1;
            for(int x = numero.length; x > 0;x--){
                resul = x * resul;
            }
            System.out.println("O valor fatorial de: " + numero[i] + " é: " + resul);
        }
    }
 */