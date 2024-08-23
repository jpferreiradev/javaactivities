package AtividadesOOP.Lista01.Atividade01.Entities;

public class Caneta {

    private String marca;
    private String cor;
    private Double tamanho;

    public Caneta(){

    }
    public Caneta(String marca, String cor, Double tamanho){
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public Double getTamanho(){
        return tamanho;
    }
    public void setTamanho(Double tamanho){
        this.tamanho = tamanho;
    }


    @Override
    public String toString() {
        return "Caneta: \n\tMarca:" + this.marca + "\n\tCor: " + this.cor + "\n\tTamanho:" + this.tamanho;

        /* Como eu fiz: Aprendi o \t, como se fosse o tab
        return "Caneta -" +
                " Marca:"+ this.marca+
                " Cor:" + this.cor+
                " Tamanho:" + this.tamanho;

         */
    }
}

/*
// Como eu fiz:

 /*
    public void cadastrarCaneta(){

    }
    public void exibirTodasCanetas(){

    }
    public int exibirQuantidadeCanetasCadastradas(){
        return 0;
    }
    public void filtrarCor(){

    }
     */
