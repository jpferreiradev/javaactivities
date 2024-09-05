package AtividadesOOP.Lista04.Atividade03.entities;

public class CorpoDocente extends Empregado{

    public CorpoDocente() {
    }

    public CorpoDocente(String nome, Double salario) {
        super(nome, salario);
    }

}

/*
public void setTipoDocente(String tipo){
    switch(tipo){
      case "demonstrador":
      case "monitor":
      case "professor":
        setTipo(tipo);
        break;
      default:
        System.out.println("Atenção, tipo de docente errado.");
    }
 */