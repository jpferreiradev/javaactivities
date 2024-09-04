package AtividadesOOP.Lista04.Atividade04.entities;

public class LivroBiblioteca extends Livro{



    private Boolean disponivel;
    private Integer numeroExempleres;

    public LivroBiblioteca() {
       super();
    }

    public LivroBiblioteca(String titulo, String nomeAutor, String editora, Integer anoPublicacao, Integer numeroDePaginas, String categoria, String idioma, Boolean disponivel, Integer numeroExempleres) {
        super(titulo, nomeAutor, editora, anoPublicacao, numeroDePaginas, categoria, idioma);
        this.disponivel = disponivel;
        this.numeroExempleres = numeroExempleres;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Integer getNumeroExempleres() {
        return numeroExempleres;
    }

    public void setNumeroExempleres(Integer numeroExempleres) {
        this.numeroExempleres = numeroExempleres;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
