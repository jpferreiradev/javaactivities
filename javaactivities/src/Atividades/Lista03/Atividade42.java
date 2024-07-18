package Atividades.Lista03;

import java.util.Scanner;

public class Atividade42 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int maior;
        int menor;
        int numero;


        System.out.print("Informe o número 0 para sair: ");
        numero = scan.nextInt();


        if (numero >= 0) {
            maior = numero;
            menor = numero;

            while(numero != 0){
                System.out.println("Digite outro numero: ");
                numero = scan.nextInt();
                if (numero > maior) {
                    maior = numero;
                }
                if (numero < menor && numero >= 0) {
                    menor = numero;
                }
            }
            System.out.println("Numero maior: " + maior);
            System.out.println("Numero menor: " + menor);
        }


    }
}
