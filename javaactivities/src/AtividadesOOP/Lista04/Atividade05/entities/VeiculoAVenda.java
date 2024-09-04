package AtividadesOOP.Lista04.Atividade05.entities;

public class VeiculoAVenda {


    private String modelo;
    private String marca;
    private String cor;
    private Integer ano;
    private Double precoDeVenda;

    public VeiculoAVenda(){

    }

    public VeiculoAVenda(String modelo, String marca, String cor, Integer ano, Double precoDeVenda) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.precoDeVenda = precoDeVenda;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public void setPrecoDeVenda(Double precoDeVenda) {
        this.precoDeVenda = precoDeVenda;
    }

    @Override
    public String toString() {
        return "Veiculo:\n"+"Modelo: " + modelo + ", Marca: " + marca + ", Cor: " + cor + " ,Ano: " + ano +" ,Preço de venda: " + precoDeVenda;

    }
}

