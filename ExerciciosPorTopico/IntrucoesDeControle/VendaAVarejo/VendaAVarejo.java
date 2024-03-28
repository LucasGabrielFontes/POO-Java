// Autor: Lucas Gabriel Fontes da Silva
// Propósito: simular o sistema de uma empresa varejista 
// que permite o usuário comprar produtos do catálogo 
// e visualizar o valor total da compra

import java.util.Scanner;

public class VendaAVarejo {
	public static void main (String[] args) {
		Produto produtos[] = new Produto[5];
		
		produtos[0] = new Produto (1, 2.98);
		produtos[1] = new Produto (2, 4.5);
		produtos[2] = new Produto (3, 9.98);
		produtos[3] = new Produto (4, 4.49);
		produtos[4] = new Produto (5, 6.87);
		
		System.out.printf("===== CATÁLOGO =====\n\n");
		for (int i = 0; i <  5; i++) {
			System.out.printf("Produto %d: R$%.2f\n", i+1, produtos[i].getPreco());
		}
		
		System.out.printf("\n");
		
		Scanner teclado = new Scanner (System.in);
		double precoTot = 0.0;
		String resp = "";
		
		do {
			System.out.printf("Digite o número de indentificação do produto que deseja comprar: ");
			int numI = teclado.nextInt();
			teclado.nextLine();
			precoTot += produtos[numI-1].getPreco();
			System.out.printf("\nPreco total até o momento: R$%.2f\n\n", precoTot);
			System.out.printf("Deseja adicionar outro produto? [S/N]: ");
			resp = teclado.nextLine();
		} while (!resp.toUpperCase().equals("N"));
	}
}