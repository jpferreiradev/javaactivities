package AtividadesBeecrowd;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Double a, b, c, media, somaNotas, somaPeso;
        Double pesoA, pesoB, pesoC;


        System.out.print("Informe a primeiro nota: ");
        a = scan.nextDouble();
        System.out.print("informe o peso da primeira nota: ");
        pesoA = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        b = scan.nextDouble();
        System.out.print("informe o peso da segunda nota: ");
        pesoB = scan.nextDouble();
        System.out.println("Informe a terceira nota: ");
        c = scan.nextDouble();
        System.out.print("informe o peso da terceira nota: ");
        pesoC = scan.nextDouble();

        somaNotas = a + b + c;
        somaPeso = pesoA + pesoB + pesoC;

        System.out.println("Soma das notas: " + somaNotas);
        System.out.println("Soma dos peso das notas:: " + somaPeso);
        media = somaNotas / somaNotas;

        System.out.println("Media:" + media);
    }
}

// Nota A - 2, nota B - 3, nota C - 5
