package AtividadesOOP.Lista04.Atividade04.entities;

public class LivroLivraria extends Livro {


    private Double preco;
    private Integer quantidadeLivros;
    private String formato;
    private Integer estoque;

    public LivroLivraria(){
        super();
    }



    public LivroLivraria(String titulo, String nomeAutor, String editora, Integer anoPublicacao, Integer numeroDePaginas, String categoria, String idioma, Double preco, Integer quantidadeLivros, String formato, Integer estoque) {
        super(titulo, nomeAutor, editora, anoPublicacao, numeroDePaginas, categoria, idioma);
        this.preco = preco;
        this.quantidadeLivros = quantidadeLivros;
        this.formato = formato;
        this.estoque = estoque;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidadeLivros() {
        return quantidadeLivros;
    }

    public void setQuantidadeLivros(Integer quantidadeLivros) {
        this.quantidadeLivros = quantidadeLivros;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
