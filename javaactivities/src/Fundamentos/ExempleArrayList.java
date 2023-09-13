package Fundamentos;

import java.util.ArrayList;

public class ExempleArrayList {
    public static void main(String[] args) {

        // Exemplo de um array de Strings
        ArrayList<String> carros = new ArrayList<>(100);
        //ArrayList<String> carros = new ArrayList<>(100); // Exemplo como você coloca o numero de posições do arrayList


        // Adicionar dados/ elementos - metodo add -> 3 elementos
        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo"); // Exemplo da posição que você quer adicionar no elemento;
        carros.add("Fusion");

        // Metodo para eleminar posições que não estão sendo usadas no arraylist
        carros.trimToSize();

        // Indica a posição que está o elementro, ele te retorna um int
        System.out.println(carros.indexOf("Polo"));

        // removendo o elemento
        System.out.println(carros.remove("Polo"));
        // removendo a posição
        System.out.println(carros.remove(1));
        // A true na impressão é porque ele foi removido;

        carros.clear(); //Metodo para zerar todo o array List


        // Escolher a posição que você quer que o elemento fique
        carros.add(1,"Argo");



        //exemplo de como obter um elemento especifico do nosso arrayList
        //System.out.println(carros.get(0)); // -> Saida "HRV";

        //for tradicional
        for(int i = 0; i < carros.size();i++){
            System.out.println(carros.get(i));
            //System.out.println("A posição 0 ocupada é: " + carros.get(0));
            //System.out.println(carros.get(i));
        }

        // Pecorrer esses elementos usando forEach
        /*
        for (String e : carros) {
            System.out.println(e);
        }

        */

        // eliminar posições que não estão sendo usadas


    }
}

/*
ArrayList<Integer> numeros = new ArrayList<>();

 numeros.add();

           numeros.add(11);
        numeros.add(22);
        numeros.add(33);
 for(int e: numeros){
            System.out.println(e);
        }
        System.out.println("------------------");

 */