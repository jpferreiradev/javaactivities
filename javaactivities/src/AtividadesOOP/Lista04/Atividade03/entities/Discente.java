package AtividadesOOP.Lista04.Atividade03.entities;

public class Discente extends Empregado {

    public Discente() {
    }

    public Discente(String nome, Double salario) {
        super(nome, salario);
    }



}

/*

 public void setTipoDiscente(String tipo){
    switch(tipo){
      case "escritorio":
      case "manutenção":
        setTipo(tipo);
        break;
      default:
        System.out.println("Atenção, tipo de discente errado.");

        // Usar o swith no set de uma classe;
    */