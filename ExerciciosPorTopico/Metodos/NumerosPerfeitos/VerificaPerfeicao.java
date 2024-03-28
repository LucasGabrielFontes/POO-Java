// Autor: Lucas Gabriel Fontes da Silva
// Propósito: verificar, a partir da entrada do usuário, se um número é perfeito ou não.
// Obs: entende-se por 'perfeito' um número cuja soma de seus divisores (exceto ele) resulta em seu valor

import javax.swing.JOptionPane;

public class VerificaPerfeicao {
	public static void main (String[] args) {
		String resp = "";
		
		do {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		
			if (isPerfect(numero)) {
				String conta = mostraConta(numero);
				resp = JOptionPane.showInputDialog(null, numero + " é um número perfeito:\n\n" + conta 
				+ " = " + numero + "\n\n Deseja testar outro número? [S/N]:");
			} else {
				String conta = mostraConta(numero);
				JOptionPane.showInputDialog(null, numero + " não é um número perfeito:\n\n" + conta 
				+ " != " + numero + "\n\nDeseja testar outro número? [S/N]:");
			}
		
		} while (!resp.toLowerCase().equals("n"));
		
	}
	
	public static boolean isPerfect (int num) {
		int teste = 1;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				teste += i;
			}
		}
		
		if (teste == num) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String mostraConta (int num) {
		String conta = "";
		int teste = 0;
		
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				teste = i;
			}
		}
		
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				if (i != teste) {
					conta += i + " + ";
				} else {
					conta += i;
				}	
			}
		}
		
		return conta;
	}
}