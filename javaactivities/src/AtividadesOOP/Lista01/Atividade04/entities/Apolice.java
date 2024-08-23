package AtividadesOOP.Lista01.Atividade04.entities;

public class Apolice {

    private String nome;
    private Integer idade;
    private Double valorPremio;

    public Apolice() {

    }

    public Apolice(String nome, Integer idade, Double valorPremio) {
        this.idade = idade;
        this.nome = nome;
        this.valorPremio = valorPremio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(Double valorPremio) {
        this.valorPremio = valorPremio;
    }

    public void imprimir(String nome, int idade, double valorPremio) {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Valor do prêmio: " + this.valorPremio);

    }
}

