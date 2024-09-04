package AtividadesOOP.Lista04.Atividade05.entities;

public class MotocicletaAVenda extends VeiculoAVenda{

    public MotocicletaAVenda() {
    }

    public MotocicletaAVenda(String modelo, String marca, String cor, Integer ano, Double precoDeVenda) {
        super(modelo, marca, cor, ano, precoDeVenda);
    }

    @Override
    public String toString() {
        //return super.toString();
        return "Motocicleta:\n"+"Modelo: " + super.getModelo() + ", Marca: " + super.getMarca() + ", Cor: " + super.getCor() + " ,Ano: " + super.getAno() +" ,Preço de venda: " + super.getPrecoDeVenda();


    }
}
