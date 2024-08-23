package RascunhosETestesDosExercicios.AtividadesPOO.Ativi01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Questao003 {
    public static void main(String[] args) throws ParseException {




        String s = "31/11/2009";
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = df.parse(s);
        DateFormat df2 = new SimpleDateFormat("MMMMM", new Locale("pt", "BR"));
        System.out.println(df2.format(dt)); // "Janeiro"








    }
}

/*
    Date data = new Date() ;

        int dataAtual =  Integer.parseInt(formatador.format(data));

        LocalDate local = LocalDate.now();
        LocalDate localDate = LocalDate
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
 */