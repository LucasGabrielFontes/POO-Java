// Autor: Lucas Gabriel Fontes da Silva
// Propósto: jogo de adivinhação

import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class AdivinheNumero {
	public static void main (String[] args) {
		
		String resp = "";
		int pontuacao = 0;
		
		do {
			
			SecureRandom random = new SecureRandom();
		
			int adivinha = 1 + random.nextInt(999);
			int tentativa = Integer.parseInt(JOptionPane.showInputDialog(null, "Score: " + pontuacao + "\n\nGuess a number between 1 and 1000: "));
	
			while (tentativa != adivinha) {
				if (tentativa < adivinha) {
					tentativa = Integer.parseInt(JOptionPane.showInputDialog(null, "Too low. Try again: "));
				} else {
					tentativa = Integer.parseInt(JOptionPane.showInputDialog(null, "Too high. Try again: "));
				}
			}
		
			pontuacao += 1;
			resp = JOptionPane.showInputDialog(null, "Congratulations! You guessed the number.\n\n" +
			"Do you want to play again? [S/N]:");
			
		} while (resp.toUpperCase().equals("S"));
		
		JOptionPane.showMessageDialog(null, "You finished the game with " + pontuacao + " points.");
		
	}
}