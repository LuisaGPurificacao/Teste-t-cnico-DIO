package exercicio3;

import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double valorV = 0;
		double somaValorV = 0;
		double valorP = 0;
		double somaValorP = 0;
		double somaTotal = 0;
		
		for(int i = 0; i < 5; i++) {
			
			String codigo = scan.next();
			switch(codigo) {
			
			case "V":
				System.out.println("Insira o valor da transa��o � vista:");
				valorV = scan.nextDouble();
				break;
			
			case "P":
				System.out.println("Insira o valor da transa��o a prazo:");
				valorP = scan.nextDouble();
				break;
				
			default:
				System.out.println("Op��o inv�lida.");
				
			}
			somaValorV += valorV;
			somaValorP += valorP;
			somaTotal = somaValorP + somaValorV;
		}

		System.out.println("Valor total das compras � vista: " + somaValorV);
		System.out.println("Valor total das compras a prazo: " + somaValorP);
		System.out.println("Valor total das compras efetuadas: " + somaTotal);
		System.out.println("Valor da soma da primeira presta��o das compras a prazo: ");
		
	}
	
}
