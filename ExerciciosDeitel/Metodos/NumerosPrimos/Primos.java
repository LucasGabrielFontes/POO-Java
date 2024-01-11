// Autor: Lucas Gabriel Fontes da Silva
// Propósito: verificar, a partir de entradas do usuário, a primalidade de números

import javax.swing.JOptionPane;

public class Primos {
	public static void main (String[] args) {
		
		String resp = "";
		
		do {
			
			int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para verificar se é primo: "));
	
			if (testaPrimalidade(n)) {
				resp = JOptionPane.showInputDialog(null, n + " é um número primo\n\n" +
				"Deseja testar outro número? [S/N]:");
			} else {
				resp = JOptionPane.showInputDialog(null, n + " não é um número primo\n\n" +
				"Deseja testar outro número? [S/N]:");
			}
			
		} while (resp.toUpperCase().equals("S"));
		
	}
	
	public static boolean testaPrimalidade (int x) {
		if (x == 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(x); i++) {
				if (x%i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}