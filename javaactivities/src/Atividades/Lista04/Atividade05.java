package Atividades.Lista04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double salario,valorSalarioMinimo;

        valorSalarioMinimo = 1.000;

        System.out.print("Informe o seu salário: ");
        salario = scan.nextDouble();


        int cont = 0;
        for(int i = 0; i < valorSalarioMinimo;i++){
            cont = i;
            cont++;
        }
        System.out.println(cont);







    }
}

