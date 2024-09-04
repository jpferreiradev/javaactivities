package AtividadesOOP.Lista04.Atividade02.entities;

import AtividadesOOP.Lista03.Atividade02.entities.Pessoa;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {



    private String nomeDoAluno;
    private Integer numeroDaMatricula; // Você colocou String, mas na corresão foi Integer
    private Date dataDeNascimento;
    private String eBolsista; // Aqui deveria ter usado boolean, e não um String
    private Integer anoDeMatricula;
    private Double mensalidade;


    public Aluno() {

    }

    public Aluno(String nomeDoAluno, int numeroDaMatricula, Date dataDeNascimento, String eBolsista, Integer anoDeMatricula, Double mensalidade) {
        this.nomeDoAluno = nomeDoAluno;
        this.numeroDaMatricula = numeroDaMatricula;
        this.dataDeNascimento = new Date();
        this.eBolsista = eBolsista;
        this.anoDeMatricula = anoDeMatricula;
        this.mensalidade = 400.0;
    }

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public int getNumeroDaMatricula() {
        return numeroDaMatricula;
    }

    public void setNumeroDaMatricula(int numeroDaMatricula) {
        this.numeroDaMatricula = numeroDaMatricula;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public Date setDataDeNascimento(Date dataDeNascimento) {
        return dataDeNascimento;
    }

    public String geteBolsista() {
        return eBolsista;
    }

    public void seteBolsista(String eBolsista) {
        this.eBolsista = eBolsista;
    }

    public Integer getAnoDeMatricula() {
        return anoDeMatricula;
    }

    public void setAnoDeMatricula(Integer anoDeMatricula) {
        this.anoDeMatricula = anoDeMatricula;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public void inicializaRegistro(String nome, String matricula, Date data, String bolsa, int ano) {
        System.out.println("Registro realizado com sucesso...");
    }

    public void calculaMensalidade() {

        System.out.println("Informe se você é bolsista: ");

        if (eBolsista == "s" || eBolsista == "S") {
            double desconto = (mensalidade * 0.5);
            System.out.println("Parabéns, você é bolsista, já tem um desconto de 50% na mensalidade que é de" + desconto);
        } else {
            System.out.println("Como você não é bolsita, o valor da mensalidade é de" + mensalidade);
        }
    }

    public void mostraRegistro() {
        System.out.println("Nome do aluno: " + nomeDoAluno);
        System.out.println("Número de matrícula: " + numeroDaMatricula);
        System.out.println("Data de nascimento: " + dataDeNascimento);
        System.out.println("É bolsista: " + eBolsista);
        System.out.println("Ano de matricula: " + anoDeMatricula);


    }
}
