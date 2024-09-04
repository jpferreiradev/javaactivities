package AtividadesOOP.Lista02.Atividade03.entities;

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

    public void calcularPremioApolice() {
        if (idade >= 18 && idade <= 25) {
            valorPremio += (valorPremio * 20) / 100;
            System.out.println("Valor do prêmio: " + valorPremio);
        } else if (idade > 25 && idade <= 26) {
            valorPremio += (valorPremio * 15) / 100;
            System.out.println("Valor do prêmio: " + valorPremio);
        } else if (idade > 36) {
            valorPremio += (valorPremio * 10) / 100;
            System.out.println("Valor do prêmio: " + valorPremio);
        }


    }


    public void oferecerDesconto(String cidade) {
        if (cidade.equals("Curitiba")) {
            valorPremio += (valorPremio * 20) / 100;
            System.out.println("Se a cidade for Curitiba desconto de 20%: " + valorPremio);
        } else if (cidade.equals("Rio de Janeiro")) {
            valorPremio += (valorPremio * 15) / 100;
            System.out.println("Se a cidade for Rio de Janeiro desconto de 15%: " + valorPremio);
        } else if (cidade.equals("São Paulo")) {
            valorPremio += (valorPremio * 10) / 100;
            System.out.println("Se a cidade for São Paulo desconto de 10%: " + valorPremio);
        } else if (cidade.equals("Belo Horizonte")) {
            valorPremio += (valorPremio * 5) / 100;
            System.out.println("Se a cidade for Belo Horizonte  desconto é de 5%: " + valorPremio);


        }

    }
}

