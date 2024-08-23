package RascunhosETestesDosExercicios.AtividadesPOO.Ativide03Correcao;

import java.util.Scanner;

public class TestaData {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, ano;
        System.out.print("Digite o dia: ");
        dia = entrada.nextInt();
        System.out.print("Digite o mês: ");
        mes = entrada.nextInt();
        System.out.print("Digite o ano: ");
        ano = entrada.nextInt();


        Data calendario = new Data(dia, mes, ano);

        if (calendario.validarData(dia, mes, ano)) {
            System.out.print(calendario.getDia());
        } else {
            System.out.print("False");
        }



    }


}
