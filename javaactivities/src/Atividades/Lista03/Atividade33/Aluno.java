package Atividades.Lista03.Atividade33;

public class Aluno {

    // Atributos
    private String numeroMatricula;
    private Double nota;

    // Construtor sem paramentrs
    public Aluno(){

    }
    // Construtor com parametros
    public Aluno(String numeroMatricula,double nota){
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
    }

    // Metodos get/set dos atributos

    public String getNumeroMatricula() {
        return numeroMatricula;
    }
    public void setNumeroMatrixcula(String numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }
    public double getNota(){
        return nota;
    }
    public void setNota(double nota){
        this.nota = nota;
    }

}
