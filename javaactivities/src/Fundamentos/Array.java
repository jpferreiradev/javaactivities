package Fundamentos;

public class Array {
    public static void main(String[] args){

        int[] numeros = {1,2,3,4,5};

        // for "antigo"
        for(int i = 0; i < numeros.length; i++ ){
            System.out.println(numeros[i]);
        }

        System.out.println("-------------------------");
        System.out.println("Aqui em baixo é o forEach");
        // forEach
        for(int e : numeros){
            System.out.println(e);
        }
    }
}
