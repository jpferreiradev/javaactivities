package RascunhosETestesDosExercicios;

import java.util.Scanner;

public class Exemplo9 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String frase; // Entrada para receber a frase
        String Vogais = "aeiouAEIOU"; // As vogais para comparar com a frase
        String StringVogais = ""; // Essa eu não entendi, pode ser isso aqui: int n = 0; ?

        System.out.print("Digite uma frase: ");
        frase = entrada.nextLine();

        // Ele já pega e transforma a String em caracteres
        char[] ArrayChars = frase.toCharArray();

        for (int x = 0; x < ArrayChars.length; x++) {


            if (Vogais.contains("" + ArrayChars[x])) { // ""+Char - soma uma string "" com um charactere, transformando o caractere em string
                //StringVogais += ArrayChars[x];
                StringVogais = StringVogais + ArrayChars[x];
            }
        }

        System.out.println("Nova frase: " + StringVogais);
    }
}

