package Recursividade;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ClasseTestes {
    public static void main(String []args){

        Scanner scan = new Scanner(System.in);
        //int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        System.out.println("Digite um valor: ");

        int valor = scan.nextInt();
        System.out.println("O valor é:" + ExemploDois.fatorialRecursivo(valor));
        //JOptionPane.showMessageDialog(null,"O fatorail é: " + ExemploDois.fatorialRecursivo(valor));




        //System.out.println(AtividadeUm.somatorio(3));




    }
}
