package Atividades.Lista03;

import java.util.Scanner;

public class Atividade41 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int idade;

        System.out.print("Informe a sua idade para saber a sua categoria como nadador: ");
        idade = scan.nextInt();

        if(idade >= 5 && idade <= 7 ){
            System.out.println("Infantil A");
        } else if (idade >= 8 && idade < 11) {
            System.out.println("Infantil B");
        } else if (idade == 12 || idade == 13) {
            System.out.println("Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Juvenil B");
        } else if(idade >= 18){
            System.out.println("Adultos");
        }

    }
}
