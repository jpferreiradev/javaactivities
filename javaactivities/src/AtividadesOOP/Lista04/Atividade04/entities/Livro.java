package AtividadesOOP.Lista04.Atividade04.entities;

public class Livro {

    private String titulo;
    private String nomeAutor;
    private String editora;
    private Integer anoPublicacao;
    private Integer numeroDePaginas;
    private String categoria;
    private String idioma;



    public Livro(){

    }

    public Livro(String titulo, String nomeAutor, String editora,Integer anoPublicacao, Integer numeroDePaginas, String categoria,String idioma) {
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.numeroDePaginas = numeroDePaginas;
        this.categoria = categoria;
        this.idioma = idioma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Integer numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Livro:" +
                "         titulo='" + titulo + '\'' +
                ", nomeAutor='" + nomeAutor + '\'' +
                ", editora='" + editora + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", numeroDePaginas=" + numeroDePaginas +
                ", categoria='" + categoria + '\'' +
                idioma='" + idioma + '\'' ;
        ;
    }
}
