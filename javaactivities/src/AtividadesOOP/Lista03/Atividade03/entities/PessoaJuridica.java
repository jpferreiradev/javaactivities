package AtividadesOOP.Lista03.Atividade03.entities;

public class PessoaJuridica extends Cliente {

    private String cnpj;
    private String nomeFantasia;

    public PessoaJuridica(String cnpj, String nomeFantasia) {

    }

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("CNPJ:" + cnpj);
        System.out.println("Nome fantasia: " + nomeFantasia);
    }
}

