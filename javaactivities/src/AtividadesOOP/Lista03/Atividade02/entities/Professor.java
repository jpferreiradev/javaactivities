package AtividadesOOP.Lista03.Atividade02.entities;

public class Professor extends Pessoa {

    private String disciplina;

    public Professor() {

    }

    public Professor(String nome, String sobrenome, String disciplina) {
        super(nome, sobrenome);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor - "  + "Nome: " + super.getNome() + ", Sobrenome: " + super.getSobrenome() + " , Disciplina: " + disciplina;
    }
}
