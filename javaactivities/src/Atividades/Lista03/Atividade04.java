package Atividades.Lista03;

import java.util.Locale;
import java.util.Scanner;

public class Atividade04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Como eu fiz:

        int a;
        int b;
        int c;
        int d;
        int propriedadeDistributiva;


        System.out.print("Informe o valor de A: ");
        a = scan.nextInt();
        System.out.print("Informe o valor de B: ");
        b = scan.nextInt();
        System.out.print("Informe o valor de C: ");
        c = scan.nextInt();
        System.out.print("Informe o valor de D: ");
        d = scan.nextInt();

        propriedadeDistributiva = a * (b+c+d);

        System.out.println(propriedadeDistributiva);


        // Correção:

        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[4] ;

        System.out.print("Exercício 4, leia o enunciado.\n\n"); //Desisto!

        for(int i=0; i<4; i++){
            System.out.print("Digite o valor "+(i+1)+": ");
            valores[i] = entrada.nextInt();
        }

        System.out.print("\nResultados:\n\n");

        System.out.print("Valor 1 e Valor 2:\n");
        System.out.print("	"+valores[0]+" + "+valores[1]+" = "+(valores[0]+valores[1])+"\n");
        System.out.print("	"+valores[0]+" * "+valores[1]+" = "+(valores[0]*valores[1])+"\n\n");

        System.out.print("Valor 1 e Valor 3:\n");
        System.out.print("	"+valores[0]+" + "+valores[2]+" = "+(valores[0]+valores[2])+"\n");
        System.out.print("	"+valores[0]+" * "+valores[2]+" = "+(valores[0]*valores[2])+"\n\n");

        System.out.print("Valor 1 e Valor 4:\n");
        System.out.print("	"+valores[0]+" + "+valores[3]+" = "+(valores[0]+valores[3])+"\n");
        System.out.print("	"+valores[0]+" * "+valores[3]+" = "+(valores[0]*valores[3])+"\n\n");

        System.out.print("Valor 2 e Valor 3:\n");
        System.out.print("	"+valores[1]+" + "+valores[2]+" = "+(valores[1]+valores[2])+"\n");
        System.out.print("	"+valores[1]+" * "+valores[2]+" = "+(valores[1]*valores[2])+"\n\n");

        System.out.print("Valor 2 e Valor 4:\n");
        System.out.print("	"+valores[1]+" + "+valores[3]+" = "+(valores[1]+valores[3])+"\n");
        System.out.print("	"+valores[1]+" * "+valores[3]+" = "+(valores[1]*valores[3])+"\n\n");

        System.out.print("Valor 3 e Valor 4:\n");
        System.out.print("	"+valores[2]+" + "+valores[3]+" = "+(valores[2]+valores[3])+"\n");
        System.out.print("	"+valores[2]+" * "+valores[3]+" = "+(valores[2]*valores[3])+"\n\n");

    }
}

/*
Scanner entrada = new Scanner(System.in);
		int[] valores = new int[4] ;

		System.out.print("Exercício 4, leia o enunciado.\n\n"); //Desisto!

		for(int i=0; i<4; i++){
			System.out.print("Digite o valor "+(i+1)+": ");
			valores[i] = entrada.nextInt();
		}

		System.out.print("\nResultados:\n\n");

		System.out.print("Valor 1 e Valor 2:\n");
		System.out.print("	"+valores[0]+" + "+valores[1]+" = "+(valores[0]+valores[1])+"\n");
		System.out.print("	"+valores[0]+" * "+valores[1]+" = "+(valores[0]*valores[1])+"\n\n");

		System.out.print("Valor 1 e Valor 3:\n");
		System.out.print("	"+valores[0]+" + "+valores[2]+" = "+(valores[0]+valores[2])+"\n");
		System.out.print("	"+valores[0]+" * "+valores[2]+" = "+(valores[0]*valores[2])+"\n\n");

		System.out.print("Valor 1 e Valor 4:\n");
		System.out.print("	"+valores[0]+" + "+valores[3]+" = "+(valores[0]+valores[3])+"\n");
		System.out.print("	"+valores[0]+" * "+valores[3]+" = "+(valores[0]*valores[3])+"\n\n");

		System.out.print("Valor 2 e Valor 3:\n");
		System.out.print("	"+valores[1]+" + "+valores[2]+" = "+(valores[1]+valores[2])+"\n");
		System.out.print("	"+valores[1]+" * "+valores[2]+" = "+(valores[1]*valores[2])+"\n\n");

		System.out.print("Valor 2 e Valor 4:\n");
		System.out.print("	"+valores[1]+" + "+valores[3]+" = "+(valores[1]+valores[3])+"\n");
		System.out.print("	"+valores[1]+" * "+valores[3]+" = "+(valores[1]*valores[3])+"\n\n");

		System.out.print("Valor 3 e Valor 4:\n");
		System.out.print("	"+valores[2]+" + "+valores[3]+" = "+(valores[2]+valores[3])+"\n");
		System.out.print("	"+valores[2]+" * "+valores[3]+" = "+(valores[2]*valores[3])+"\n\n");
	}

    // Como eu fiz:


     int a;
        int b;
        int c;
        int d;
        int propriedadeDistributiva;


        System.out.print("Informe o valor de A: ");
        a = scan.nextInt();
        System.out.print("Informe o valor de B: ");
        b = scan.nextInt();
        System.out.print("Informe o valor de C: ");
        c = scan.nextInt();
        System.out.print("Informe o valor de D: ");
        d = scan.nextInt();

        propriedadeDistributiva = a * (b+c+d);

        System.out.println(propriedadeDistributiva);


        // Feito com for

         Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int[] valores = new int[4];

        for(int i = 0; i < 4;i++){
            System.out.print("Digite o valor "+(i+1)+":" );
            valores[i] = scan.nextInt();
        }

        for(int e : valores){
           System.out.println(e);
       }


 */