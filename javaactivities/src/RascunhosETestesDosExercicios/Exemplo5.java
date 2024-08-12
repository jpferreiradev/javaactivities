package RascunhosETestesDosExercicios;

public class Exemplo5 {
    public static void main(String[] args) {

        int a[] = new int[5];
        int b[] = new int[4];

        for(int i = 0; i < a.length;i++){
            System.out.println(i);
        }
        System.out.println();
        for(int i = 0; i < b.length;i++){
            System.out.println(i);
        }

        int cont = 0;
        for(int i = 0; i < a.length;i++){
            for(int j = 0 ; j < b.length;j++){
                if(a[i] == b[j]){
                    cont++;
                }
            }
        }
        System.out.println();
        System.out.println(cont);
    }
}

