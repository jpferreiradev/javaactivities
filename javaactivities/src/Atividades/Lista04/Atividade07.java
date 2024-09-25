package Atividades.Lista04;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean a = true;
        boolean b = false;
        String valorA;
        String valorB;


        System.out.println("Informe a primeira letra, a(verdeiro) ou b (Falso)");
        valorA = scan.next();
        System.out.println("Informe a primeira letra, a(verdeiro) ou b (Falso)");
        valorB = scan.next();

        if(a == b){
            System.out.println("Os dois valores são verdadeiros...");
        } else{
            System.out.println("Os dois valores são falsos...");
        }
    }
}
