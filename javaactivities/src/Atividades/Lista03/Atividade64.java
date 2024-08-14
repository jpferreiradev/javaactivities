package Atividades.Lista03;

import java.util.Scanner;

public class Atividade64 {
    public static void main(String[] args) {

        // Como eu fiz:
        Scanner scan = new Scanner(System.in);

        int quantidade;


        System.out.printf("Informe a quantidade de vetores: ");
        quantidade = scan.nextInt();

        int vetores[] = new int[quantidade];

        System.out.println("1 - Carregar vetores:");
        for (int i = 0; i < vetores.length; i++) {
            System.out.println("Informe o " + (i + 1) + " vetor: ");
            vetores[i] = scan.nextInt();
        }

        System.out.println();
        System.out.println("2 - Listar vetores: ");
        for (int n : vetores) {
            System.out.printf(" " + n);
        }

        System.out.println();
        System.out.println("3 - Exibir apenas os números pares do vetor: ");
        for (int i = 0; i < vetores.length; i++) {
            if (vetores[i] % 2 == 0) {
                System.out.printf(" " + vetores[i]);
            }
        }

        System.out.println();
        System.out.println("4 - Exibir apenas os números ímpares do vetor: ");
        for (int i = 0; i < vetores.length; i++) {
            if (vetores[i] % 2 == 1) {
                System.out.printf(" " + vetores[i]);
            }
        }

        System.out.println();
        System.out.println("5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor: ");
        int posicao = 0;
        for (int i = 0; i < vetores.length; i++) {
            if (vetores[i] % 2 == 0) {
               posicao++;
            }
        }

        System.out.println("Quantidade de posições: " + posicao);

        System.out.println();
        System.out.println("6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor");
        int cont = 0;
        for (int i = 0; i < vetores.length; i++) {
            if (vetores[i] % 2 == 1) {
                cont++;
            }
        }
        System.out.println("Quantidade de posições: " + cont);
    }
}

// Foi usado o swtich como eu tinha pensado,
/*
1 - Carregar Vetor ok
2 - Listar Vetor
3 - Exibir apenas os números pares do vetor
4 - Exibir apenas os números ímpares do vetor
5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor
7 - Sair

 Deverá ser implementado um método para realizar cada uma das opções de 1 a 6.
 Correção:
 boolean continuar = true;
		while(continuar){
			System.out.print("Digite uma opção: ");
			int opcao = entrada.nextInt();
			switch(opcao){
				case 1:
					CarregarVetor();
					break;
				case 2:
					System.out.print(ListarVetor());
					break;
				case 3:
					System.out.print(ListarParesVetor());
					break;
				case 4:
					System.out.print(ListarImparesVetor());
					break;
				case 5:
					System.out.print(QuantidadeParesNosImparesVetor());
					break;
				case 6:
					System.out.print(QuantidadeImparesNosParesVetor());
					break;
				case 7:
					continuar = false;
					break;
				default:
					System.out.println("Número inválido.");
			}
		}
	}
	//1 - Carregar Vetor
	public static void CarregarVetor(){
		for(int x=0;x<10;x++){
			System.out.print("Digite o "+(x+1)+"° número do vetor: ");
			Vetor[x]= entrada.nextInt();
		}
		System.out.println("\nVetor carregado com sucesso!\n");
	}
	//2 - Listar Vetor
	public static String ListarVetor(){
		String ListaVetor = "Valores do vetor:\n";
		for(int x=0;x<10;x++){
			ListaVetor += "\t"+Vetor[x]+"\n";
		}
		return ListaVetor;
	}
	//3 - Exibir apenas os números pares do vetor
	public static String ListarParesVetor(){
		String ListaVetor = "Valores do vetor:\n";
		for(int x=0;x<10;x++){
			if(Vetor[x]%2==0){
				ListaVetor += "\t"+Vetor[x]+"\n";
			}
		}
		return ListaVetor;
	}
	//4 - Exibir apenas os números ímpares do vetor
	public static String ListarImparesVetor(){
		String ListaVetor = "Valores do vetor:\n";
		for(int x=0;x<10;x++){
			if(Vetor[x]%2==1){
				ListaVetor += "\t"+Vetor[x]+"\n";
			}
		}
		return ListaVetor;
	}
	//5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
	public static int QuantidadeParesNosImparesVetor(){
		int quantidade = 0;
		for(int x=1;x<10;x=x+2){
				if(Vetor[x]%2==0){
					quantidade++;
				}
		}
		return quantidade;
	}
	//6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor
	public static int QuantidadeImparesNosParesVetor(){
		int quantidade = 0;
		for(int x=0;x<10;x=x+2){
				if(Vetor[x]%2==1){
					quantidade++;
				}
		}
		return quantidade;
 */