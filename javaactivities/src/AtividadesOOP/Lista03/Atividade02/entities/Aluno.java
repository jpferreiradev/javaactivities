package AtividadesOOP.Lista03.Atividade02.entities;

public class Aluno extends Pessoa {

    private Integer matricula;

    public Aluno() {

    }

    public Aluno(String nome, String sobrenome, Integer matricula) {
        super(nome, sobrenome);
        this.matricula = matricula;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno - " + "Nome: " + super.getNome() + ", Sobrenome: " + super.getSobrenome() + " , Matrícula: " + matricula;


    }
}
