package AtividadesOOP.Lista04.Atividade03.entities;

public class Aluno extends Pessoa {

    private String estatuto;
    private Double media;

    public Aluno(){

    }



    public Aluno(String nome, String estatuto, Double media) {
        super(nome);
        this.estatuto = estatuto;
        this.media = media;
    }

    public String getEstatuto() {
        return estatuto;
    }

    public void setEstatuto(String estatuto) {
        this.estatuto = estatuto;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }


    @Override
    public String toString() {
        return super.toString() + ", Estatuto:" + estatuto + ", Média: " + media;
    }
}

/*
 public void mudarEstatuto(){
        System.out.println("Informe o novo estatuto: ");


    }
    public double mudarMedia(){
        return 0;
    }
 */