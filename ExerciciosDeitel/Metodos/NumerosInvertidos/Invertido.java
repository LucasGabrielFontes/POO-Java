// Autor: Lucas Gabriel Fontes da Silva
// Prósito: inverter um número digitado pelo usuário 

import javax.swing.JOptionPane;

public class Invertido {
	public static void main (String[] args) {
		
		String resp = "";
		
		do {
			int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para ser invertido:"));
			while (n < 0) {
				n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para ser invertido:"));
			}
			
			resp = JOptionPane.showInputDialog(null, n + " invertido: " + inverteNumero(n) +
			"\n\nDeseja repetir o processo? [S/N]:");
		} while (resp.toUpperCase().equals("S"));
		
	}
	
	public static int inverteNumero (int x) {
		int n = 0;
		
		for (; x != 0; x /= 10) {
			n = (n*10) + (x%10);
		}
		
		return n;
	}
}