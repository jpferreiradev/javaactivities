package AtividadesOOP.Lista01.Atividade03.entities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Data {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Data() {

    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean validarData(int dia, int mes, int ano) {

        if (ano % 4 == 0) {
            System.out.println("Ano bissexto! ");
            return true;

        } else {
            System.out.println("Esse ano não é bissexto!");
            return false;
        }
    }

    @Override
    public String toString() {


        return dia + "/" + mes + "/" + ano;

    }
}