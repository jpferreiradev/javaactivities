package AtividadesOOP.Lista04.Atividade04.application;

import AtividadesOOP.Lista03.Atividade03.entities.Cliente;
import AtividadesOOP.Lista03.Atividade03.entities.PessoaFisica;
import AtividadesOOP.Lista03.Atividade03.entities.PessoaJuridica;
import AtividadesOOP.Lista04.Atividade04.entities.Livro;
import AtividadesOOP.Lista04.Atividade04.entities.LivroBiblioteca;
import AtividadesOOP.Lista04.Atividade04.entities.LivroLivraria;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Livro livro = new Livro();
        LivroLivraria livroLivraria = new LivroLivraria();
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca();

        System.out.print("Informe quantos livros seram: ");
        int quantidade = scan.nextInt();

        livro.setTitulo("Java");
        livro.setNomeAutor("James Goslang");
        livro.setEditora("Abril");
        livro.setAnoPublicacao(2010);
        livro.setNumeroDePaginas(400);
        livro.setCategoria("Programação");
        livro.setIdioma("PT-BR");

        System.out.println(livro.toString());






    }
}
