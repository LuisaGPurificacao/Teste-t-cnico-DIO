package exercicio1;

import java.util.Scanner;

public class Censo {

	public static void main(String[] args) {
		
		double salario = 0;
		int quantidadeFilhos = 0;
		int quantidadePessoas = 1;
		double somaSalarios = 0;
		int somaFilhos = 0;
		double mediaSalario = 0;
		double mediaFilhos = 0;
		double maiorSalario = 0;
		int qntdPessoas = 0;
		double percentual = 0;

		Scanner scan = new Scanner(System.in);

		int opcao = 1;

		do {
			System.out.println("Se voc� deseja parar digite 0, se deseja continuar digite 1");
			opcao = scan.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Voc� escolheu sair.\n");
				break;
			case 1:
				System.out.println("Insira o sal�rio da pessoa " + quantidadePessoas);
				salario = scan.nextDouble();
				if (salario > maiorSalario) {
					maiorSalario = salario;
				}
				if (salario <= 350) {
					qntdPessoas++;
					percentual = (qntdPessoas / quantidadePessoas) * 100;
				}
				System.out.println("Insira o n�mero de filhos da pessoa " +quantidadePessoas);
				quantidadeFilhos = scan.nextInt();
				quantidadePessoas++;
				break;
			default:
				System.out.println("Op��o inv�lida.\n");
				break;
			}
			somaSalarios += salario;
			mediaSalario = somaSalarios / quantidadePessoas;
			somaFilhos += quantidadeFilhos;
			mediaFilhos = somaFilhos / quantidadePessoas;
			
		} while (opcao != 0);

		System.out.println(String.format("M�dia de sal�rio da popula��o: %.2f", mediaSalario));
		System.out.println(String.format("M�dia de n�mero de filhos: %.2f", mediaFilhos));
		System.out.println("Maior sal�rio: R$" + maiorSalario);
		System.out.println("Percentual de pessoas com sal�rio at� R$350,00: " + percentual + "%");

	}

}
