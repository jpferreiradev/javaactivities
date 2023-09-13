package Fundamentos;

import java.util.ArrayList;
public class ExempleArrayListDois {
    public static void main(String[]args){


        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("JP");
        nomes.add("Thay");
        nomes.add("Ferreira");
        nomes.add("Ricarte");

        for(String n : nomes){
            System.out.print(n + " ");
        }



    }
}
