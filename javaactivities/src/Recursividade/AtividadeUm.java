package Recursividade;

public class AtividadeUm {

    public static int somatorio(int numero){
        if( numero == 1){
            return 1;
        }
        return numero * somatorio(numero - 1);
    }
}
