package exercicio4;

import java.util.Scanner;

public class Concessionaria {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o valor do carro:");
		double valor = scan.nextDouble();
		
		double precoFinal = valor - (valor * 20/100);
		double precoParcelado6 = valor + (valor * 3/100);
		double precoParcelado12 = valor + (valor * 6/100);
		double precoParcelado18 = valor + (valor * 9/100);
		
		System.out.println("Preço final: " + precoFinal);
		System.out.println("");
		System.out.println("Quantidade de parcelas: 6");
		System.out.println("Valor total da parcela: " + precoParcelado6);
		System.out.println(String.format("Valor de cada parcela: %.2f", (precoParcelado6 / 6)));
		System.out.println("");
		System.out.println("Quantidade de parcelas: 12");
		System.out.println("Valor total da parcela: " + precoParcelado12);
		System.out.println(String.format("Valor de cada parcela: %.2f", (precoParcelado12 / 12)));
		System.out.println("");
		System.out.println("Quantidade de parcelas: 18");
		System.out.println("Valor total da parcela: " + precoParcelado18);
		System.out.println(String.format("Valor de cada parcela: %.2f", (precoParcelado18 / 18)));
		
	}
	
}
