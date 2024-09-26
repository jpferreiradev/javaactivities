package RascunhosETestesDosExercicios;

public class ExemploCresenteEDecresente {
    public static void main(String[] args) {


        System.out.println("Ordem crescente: ");
        for(int i = 0; i < 5;i++){
            System.out.printf(" " + i);
        }

        System.out.println();
        System.out.println("Ordem decresente: ");

        for(int i = 5; i > 0;i--){
            System.out.printf(" " + i);
        }
    }
}
