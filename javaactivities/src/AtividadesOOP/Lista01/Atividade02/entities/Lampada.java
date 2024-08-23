package AtividadesOOP.Lista01.Atividade02.entities;

public class Lampada {

        private String tipo;
        private Integer voltagem;
        private String cor;
        private String  marca;
        private Double preco;
        private Integer potencia;
        private Boolean status;

        public Lampada(){

        }
        public Lampada(String tipo, Integer voltagem,String cor,String marca,Double preco,Integer potencia,Boolean status){
            this.tipo = tipo;
            this.voltagem = voltagem;
            this.cor = cor;
            this.marca = marca;
            this.preco = preco;
            this.potencia = potencia;
            this.status = status;
        }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(Integer voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public boolean ascender(){
        System.out.println("Lampada acessa!");
        return true;
    }

    public boolean apagar(){
        System.out.println("Lampada apagada");
        return false;
    }
    @Override
    public String toString() {
        return "Lampada - " +
                "Tipo:" + tipo + '\'' +
                ", Voltagem: " + voltagem +
                ", Cor: " + cor + '\'' +
                ", Marca: " + marca + '\'' +
                ", Preço: " + preco +
                ", Potência: " + potencia +
                ", Status: " + status +
                '}';
    }
}
