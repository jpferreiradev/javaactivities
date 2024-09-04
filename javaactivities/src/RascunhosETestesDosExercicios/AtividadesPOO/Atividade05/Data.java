package RascunhosETestesDosExercicios.AtividadesPOO.Atividade05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Data {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //Locale.setDefault(Locale.US);

        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy",new Locale("pt","BR"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("pt", "BR"));

        LocalDate data = null;

        System.out.println("Digite uma data no formato dd/MM/yyyy");
        String date = scan.nextLine();
        try{
            data = LocalDate.parse(date,formatter);

        } catch (DateTimeParseException e){
            System.out.println("Data inválida, tente novamente");
        }


        System.out.println("Data: " + date);


    }
}
