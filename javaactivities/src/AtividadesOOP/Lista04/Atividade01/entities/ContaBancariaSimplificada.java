package AtividadesOOP.Lista04.Atividade01.entities;

public class ContaBancariaSimplificada {

    private String nomeDoCorrentista;
    private Double saldo;
    private String contaEspecial;

    public ContaBancariaSimplificada() {

    }

    public ContaBancariaSimplificada(String nomeDoCorrentista, Double saldo, String contaEspecial) {
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;
        this.contaEspecial = contaEspecial;
    }

    public String getNomeDoCorrentista() {
        return nomeDoCorrentista;
    }

    public void setNomeDoCorrentista(String nomeDoCorrentista) {
        this.nomeDoCorrentista = nomeDoCorrentista;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getContaEspecial() {
        return contaEspecial;
    }

    public void setContaEspecial(String contaEspecial) {
        this.contaEspecial = contaEspecial;
    }

    public void abreConta(String nome, double deposito, String contaEspecial) {
        System.out.println("Conta criada com sucesso!");
    }

    public void abreContaSimples(String nome) {
        System.out.println("Conta simples criada com sucesso!");
    }

    public double deposita(double valor) {
        double deposita = valor + saldo;
        return deposita;
    }

    public double retira(double valor) {
        double retirar = valor - saldo;
        return retirar;
    }

    public void mostraDados() {
        System.out.println("Nome do correntista: " + nomeDoCorrentista);
        System.out.println("Saldo:" + saldo);
        System.out.println("Conta especial: " + contaEspecial);
    }

}
