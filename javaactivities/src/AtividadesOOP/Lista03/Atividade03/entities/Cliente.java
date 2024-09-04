package AtividadesOOP.Lista03.Atividade03.entities;

public class Cliente {

      private String nome;
      private String endereco;
      private String telefone;

      public Cliente(){

      }

      public Cliente(String nome, String endereco,String telefone){
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
      }

      public String getNome() {
            return nome;
      }

      public void setNome(String nome) {
            this.nome = nome;
      }

      public String getEndereco() {
            return endereco;
      }

      public void setEndereco(String endereco) {
            this.endereco = endereco;
      }

      public String getTelefone() {
            return telefone;
      }

      public void setTelefone(String telefone) {
            this.telefone = telefone;
      }

      public void imprimirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Endereço: " + endereco);
            System.out.println("Telefone:  " + telefone);
      }


      @Override
      public String toString() {
            return "Cliente:" + "Nome:" + nome + "Endereço:" + endereco + "Telefone: " + telefone;
      }
}
