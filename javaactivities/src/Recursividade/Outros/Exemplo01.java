package Recursividade.Outros;

public class Exemplo01 {

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;

        }


    }

}