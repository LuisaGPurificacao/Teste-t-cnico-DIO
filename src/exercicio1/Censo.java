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
			System.out.println("Se você deseja parar digite 0, se deseja continuar digite 1");
			opcao = scan.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Você escolheu sair.\n");
				break;
			case 1:
				System.out.println("Insira o salário da pessoa " + quantidadePessoas);
				salario = scan.nextDouble();
				if (salario > maiorSalario) {
					maiorSalario = salario;
				}
				if (salario <= 350) {
					qntdPessoas++;
					percentual = (qntdPessoas / quantidadePessoas) * 100;
				}
				System.out.println("Insira o número de filhos da pessoa " +quantidadePessoas);
				quantidadeFilhos = scan.nextInt();
				quantidadePessoas++;
				break;
			default:
				System.out.println("Opção inválida.\n");
				break;
			}
			somaSalarios += salario;
			mediaSalario = somaSalarios / quantidadePessoas;
			somaFilhos += quantidadeFilhos;
			mediaFilhos = somaFilhos / quantidadePessoas;
			
		} while (opcao != 0);

		System.out.println(String.format("Média de salário da população: %.2f", mediaSalario));
		System.out.println(String.format("Média de número de filhos: %.2f", mediaFilhos));
		System.out.println("Maior salário: R$" + maiorSalario);
		System.out.println("Percentual de pessoas com salário até R$350,00: " + percentual + "%");

	}

}
