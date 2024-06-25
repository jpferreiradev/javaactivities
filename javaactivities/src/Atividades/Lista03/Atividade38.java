package Atividades.Lista03;

import java.util.Scanner;

public class Atividade38 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double c; // codigo
        int n; // numeroHorasTrabalhadas
        int e; // excedente das horas
        double conversaoHoraSalario;
        double valorExcedenteSalario;
        double salarioTotal;
        boolean stop = false;
        char s;


        do {
            System.out.print("Informe a quantidade de horas trabalhadas: ");
            n = scan.nextInt();
            conversaoHoraSalario = n * 10;

            e = n - 50;

            if (n > 50) {
                valorExcedenteSalario = e * 20;
                salarioTotal = valorExcedenteSalario + conversaoHoraSalario;
                System.out.println("O valor excedente é:" + valorExcedenteSalario + " reais");
                System.out.println("Valor salário total: " + salarioTotal);
                System.out.println("Valor da conversão salário em horas trabalhadas:  " + conversaoHoraSalario);
            } else {
                System.out.println("Valor sem excedente é: " + e);
                System.out.println("Valor da conversão salário em horas trabalhadas:  " + conversaoHoraSalario);
            }

            System.out.println("Deseja encerrar o programa, informe S: ");
            s = scan.next().charAt(0);
            if (s == 's' || s == 'S') {
                stop = true;
            }


        } while (stop == false);


    }
}
/*
  e = n - 50;
        if(n > 50){
            valorExcedenteSalario  = e * 20;
            System.out.println("Valor excedente de horas:" + valorExcedenteSalario + "reais");
        } else{

        }
        //System.out.println("Valor excedente de horas: " + valorExcedenteSalario + " reais");
 */