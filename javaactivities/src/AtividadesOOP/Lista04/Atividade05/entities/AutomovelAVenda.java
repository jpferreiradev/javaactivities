package AtividadesOOP.Lista04.Atividade05.entities;

public class AutomovelAVenda extends VeiculoAVenda{

    public AutomovelAVenda(){

    }

    public AutomovelAVenda(String modelo, String marca, String cor, Integer ano, Double precoDeVenda) {
        super(modelo, marca, cor, ano, precoDeVenda);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
