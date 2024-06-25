package Atividades.Lista03;

public class Atividade35 {
    public static void main(String[] args) {

        int numero;

        for (numero = 1; numero <= 100; numero++) {
            if (numero % 10 == 0) {
                System.out.println(numero + " ->  Múltiplos  de 10");
            } else{
                System.out.println(numero);
            }

        }
    }
}
/*
Como eu fiz:
  int numero = 101;

        for (int i = 1; i < numero; i++) {
            System.out.println(i);
            if (numero % i == 0) {
                System.out.println();
            }

        }
    }

 */