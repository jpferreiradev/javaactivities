package Atividades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        double salarioUsuario;
        double conversaoSalarioPorcetagem;

        System.out.println("Informe o seu salário");
        salarioUsuario = scan.nextDouble();
        System.out.println("O seu salário bruto é de:" + salarioUsuario);

        if (salarioUsuario < 1320) {
            conversaoSalarioPorcetagem = (7.5 / 100) * salarioUsuario;
            System.out.println("O desconto do seu salário foi de 7.5%, seu novo valor é de:" + conversaoSalarioPorcetagem);
        } else if (salarioUsuario > 1320 && salarioUsuario < 2571) {
            conversaoSalarioPorcetagem = ((double) 9/ 100) * salarioUsuario;
            System.out.println("O desconto do seu salário foi de 9%, seu novo valor é de:" + conversaoSalarioPorcetagem);
        } else if (salarioUsuario > 2571 && salarioUsuario < 3856){
            conversaoSalarioPorcetagem = ((double) 12 / 100) * salarioUsuario;
            System.out.println("O desconto do seu salário foi de 12%, seu novo valor é de" + conversaoSalarioPorcetagem);
        } else if (salarioUsuario > 3856 && salarioUsuario < 7507) {
            conversaoSalarioPorcetagem = ((double) 14 / 100) * salarioUsuario;
            System.out.println("O desconto do seu salário foi de 14%, seu novo valor é de" + conversaoSalarioPorcetagem);
        }


    }


}

/*

         conversaoSalarioPorcetagem = (7.5 / 100) * salarioUsuario;
            System.out.println("O desconto no seu salário foi de 7.5%, o  novo valor dele é de:" + conversaoSalarioPorcetagem);
        else if (salarioUsuario > 1.320 || salarioUsuario < 2.571) {
            conversaoSalarioPorcetagem = (9 / 100) * salarioUsuario;
            System.out.println("O desconto do seu salário foi de 9%, o novo valor dele é de: " + conversaoSalarioPorcetagem);
        }

        } else if (salarioUsuario > 2.571 || salarioUsuario <= 3.856) {
            conversaoSalarioPorcetagem = (12 / 100) * salarioUsuario;
            System.out.println("O desconto do seu salário foi de 12%, o novo valor dele é de" + conversaoSalarioPorcetagem);
        } else if (salarioUsuario > 3.856) {
            conversaoSalarioPorcetagem = (14 / 100) * salarioUsuario;
            System.out.println("O desconto do seu salário foi de 14%, o novo valor dele é:" + conversaoSalarioPorcetagem);
 */

/*

       switch(){

        }
 */

/*
até R$ 1.320,00	7,5%
de R$ 1.320,01 até R$  2.571,29	9%
de R$ 2.571,30 até R$ 3.856,94	12 %
de R$ 3.856,95 até R$ 7,507,49	14%
 */