package Recursividade.Exemplos;

import javax.swing.plaf.IconUIResource;

public class Exemplo1 {


    static int cont = 0;

    static void p() {
        cont++;
        if (cont <= 5) {
            System.out.println("Hello" + cont);
            p();
        }


    }

}
