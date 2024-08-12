package RascunhosETestesDosExercicios;

public class Exemplo6 {
    public static void main(String[] args) {

        String n = "Esse texto tem espaços em branco ";

        // String com espaços
        System.out.println(n);
        // String sem os espaços
        System.out.println(n.replaceAll("\\s+", " "));

        System.out.println("Tamanho da String:");
        System.out.println(n);

        System.out.println("Tamanho dos espaços em branco errado: ");
        System.out.println(n.replaceAll("\\s+", " ").length());
        System.out.println();
        System.out.println("Tamanho dos espaços em branco certo: ");
        System.out.println(n.length()-n.replaceAll(" ", "").length());
        //texto.length()-texto.replaceAll(" ","").length();
    }
}
