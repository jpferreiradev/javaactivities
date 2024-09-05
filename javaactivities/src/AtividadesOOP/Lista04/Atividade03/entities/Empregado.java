package AtividadesOOP.Lista04.Atividade03.entities;

public class Empregado extends Pessoa{


    private Double salario;

    public Empregado(){

    }

    public Empregado(String nome, Double salario) {
        super(nome);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double fixarSalario(double salario){
        return 0;
    }
}
// Faltou o atributo tipo, para selecionar qual o tipo do empregado;