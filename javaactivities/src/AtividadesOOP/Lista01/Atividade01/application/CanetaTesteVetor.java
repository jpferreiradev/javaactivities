package AtividadesOOP.Lista01.Atividade01.application;

import AtividadesOOP.Lista01.Atividade01.Entities.Caneta;

import java.util.ArrayList;
import java.util.Scanner;

public class CanetaTesteVetor {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        Caneta[] canetas = new Caneta[2];
        //ArrayList<Caneta> canetass = new ArrayList<Caneta>();
        Caneta c1 = new Caneta("BIC","Preta",10.5);


        c1.setMarca("BIC");
        c1.setCor("Preta");
        c1.setTamanho(10.5);

        System.out.println(c1.getMarca());
        System.out.println(c1.getCor());
        System.out.println(c1.getTamanho());

        int quantidadeCanetas = 0;
        for(int i = 0; i < canetas.length;i++){
            System.out.print("Informe qual o " + (i+1) + " nome da marca: ");
            String nome = scan.next();
            System.out.print("Informe qual " + (i+1) + " a cor: ");
            String cor = scan.next();
            System.out.print("Informe o tamanho da " + (i+1) + " caneta: ");
            double tamanho = scan.nextDouble();
            canetas[quantidadeCanetas] = new Caneta(nome,cor,tamanho); // Isso eu não lembrava
            quantidadeCanetas++;
        }


    }
}

/*


    //System.out.println(c1.toString());


 */