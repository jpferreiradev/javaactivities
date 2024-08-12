package RascunhosETestesDosExercicios;

import java.util.Scanner;

public class Exemplo10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w', 'y', 'z'};

        System.out.print("Digite o primeiro caractere: ");
        char caractere = (char) entrada.nextLine().toLowerCase().charAt(0); // Aqui é uma dúvida?

        System.out.print("Digite o segundo caractere: ");
        char outro_charactere = (char) entrada.nextLine().toLowerCase().charAt(0);

        int primeiro_charactere = ChecarCharactere(caractere, alfabeto);
        int segundo_charactere = ChecarCharactere(outro_charactere, alfabeto);


        int diferencas = segundo_charactere - primeiro_charactere - 1;

        if (primeiro_charactere >= 0 && segundo_charactere >= 0 && diferencas >= 0) {
            System.out.println("O numero de caracteres entre eles é: " + diferencas);
        } else {
            System.out.println("Erro!");
        }

    }

    public static int ChecarCharactere(char ch, char[] alfabeto) {

        int numero = -1;
        for (int x = 0; x < alfabeto.length; x++) {
            if (alfabeto[x] == ch) {
                numero = x; // Receber o caractere
            }
        }
        return numero;
    }


}

/*
        Scanner entrada = new Scanner(System.in);

        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w', 'y', 'z'};

        System.out.print("Digite o primeiro caractere: ");
        char caractere = (char) entrada.nextLine().toLowerCase().charAt(0);

        int primeiro_charactere = ChecarCharactere(caractere, alfabeto);

        System.out.print("Digite o segundo caractere: ");
        char outro_charactere = (char) entrada.nextLine().toLowerCase().charAt(0);

        int segundo_charactere = ChecarCharactere(outro_charactere, alfabeto);


        int diferencas = segundo_charactere - primeiro_charactere - 1;
        if (primeiro_charactere >= 0 && segundo_charactere >= 0 && diferencas >= 0) {
            System.out.println("O numero de caracteres entre eles é: " + diferencas);
        } else {
            System.out.println("Erro!");
        }

    }

    public static int ChecarCharactere(char ch, char[] alfabeto) {

        int numero = -1;
        for (int x = 0; x < alfabeto.length; x++) {
            if (alfabeto[x] == ch) {
                numero = x;
            }
        }
        return numero;
    }

 */