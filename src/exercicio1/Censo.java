package exercicio1;

import java.util.Scanner;

public class Censo {

	// ATRIBUTOS
	double salario;
	int quantidadeFilhos;
	int quantidadePessoas = 1;

	// AÇÃO
	public double calcularMediaSalario() {
		double somaSalarios = +salario;
		double mediaSalario = somaSalarios / quantidadePessoas;
		return mediaSalario;
	}

	public double calcularMediaFilhos() {
		int somaFilhos = +quantidadeFilhos;
		double mediaFilhos = somaFilhos / quantidadePessoas;
		return mediaFilhos;
	}

	public double calcularMaiorSalario() {
		double maiorSalario = 0;
		if (salario > maiorSalario) {
			maiorSalario = salario;
		}
		return maiorSalario;
	}

	public double calcularPercentual() {
		int qntdPessoas = 0;
		double percentual = 0;
		if (salario > 350) {
			qntdPessoas++;
			percentual = (qntdPessoas / quantidadePessoas) * 100;
		}
		return percentual;
	}

	public static void main(String[] args) {

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
				double salario = scan.nextDouble();
				System.out.println("Insira o número de filhos da pessoa " + quantidadePessoas);
				int quantidadeFilhos = scan.nextInt();
				quantidadePessoas++;
				break;
			default:
				System.out.println("Opção inválida.\n");
				break;
			}
		} while (opcao != 0);

		System.out.println("Média de salário da população: " + calcularMediaSalario());
		System.out.println("Média de número de filhos: " + ccalcularMediaFilhos());
		System.out.println("Maior salário: R$" + calcularMaiorSalario());
		System.out.println("Percentual de pessoas com salário até R$350,00: " + calcularPercentual());

	}

}
