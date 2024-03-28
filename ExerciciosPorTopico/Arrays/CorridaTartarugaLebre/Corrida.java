// Autor: Lucas Gabriel Fontes da Silva
// Propósito: simular a famosa corrida entre a tartaruga e a lebre

import java.security.SecureRandom;

public class Corrida {

	public static void main (String[] args) {
		
		SecureRandom aleatorio = new SecureRandom();
		
		int contador = 0;
		
		String[][] espaco = new String[2][70]; // Declara a matriz que irá representar o espaço da corrida
		inicializaEspaco(espaco); // Coloca os corredores em posição inicial
		
		System.out.printf("BANG!!!!\n");
		System.out.printf("LÁ VÃO ELES!!!!\n\n");
		
		while (!espaco[0][69].equals("T") && !espaco[1][69].equals("L")) {
			
			mostraEspaco(espaco);
			
			if (contador != 0) {
				if (verificaMesmaPosicao(espaco)) {
					System.out.printf("\n\nAI!!! A TARTARUGA MORDEU A LEBRE!");
				}
			}
			
			System.out.printf("\n\n");
			
			int movTart = 1 + aleatorio.nextInt(10);
			int movLebre = 1 + aleatorio.nextInt(10);
			
			if (movTart <= 5) {
				avancaPosicoes(espaco, "T", 3);
			} else if (movTart <= 7) {
				regressaPosicoes(espaco, "T", 6);
			} else {
				avancaPosicoes(espaco, "T", 1);
			}
			
			if (movLebre > 2) {
				
				if (movLebre <= 4) {
					avancaPosicoes(espaco, "L", 9);
				} else if (movLebre == 5) {
					regressaPosicoes(espaco, "L", 12);
				} else if (movLebre <= 8) {
					avancaPosicoes(espaco, "L", 1);
				} else {
					regressaPosicoes(espaco, "L", 2);
				}
				
			}
			
			if (!testaGanhador(espaco).equals("N")) {
				
				mostraEspaco(espaco);
				
				System.out.printf("\n\n");
				
				if (testaGanhador(espaco).equals("E")) {
					System.out.printf("OCORREU UM EMPATE!!");
				} else if (testaGanhador(espaco).equals("T")) {
					System.out.printf("A TARTARUGA VENCEU!!!!!!!");
				} else {
					System.out.printf("A LEBRE VENCEU!!!!!!!");
				}
				
			}
			
			contador += 1;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}
	
	public static void inicializaEspaco (String space[][]) {
		space[0][0] = "T";
		space[1][0] = "L";
		
		for (int i = 0; i < space.length; i++) {
			for (int j = 1; j < space[0].length; j++) {
				space[i][j] = "-";
			}
		}
	}


	public static void mostraEspaco (String space[][]) {
		for (int i = 0; i < space.length; i++) {
			for (int j = 0; j < space[0].length; j++) {
				System.out.printf("%s ", space[i][j]);
			}
			System.out.printf("\n");
		}
	}
	
	public static void avancaPosicoes (String space[][], String corredor, int posicoes) {
		
		if (corredor.equals("T")) {
			
			int coluna = 0;
			
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < space[0].length; j++) {
					if (space[i][j].equals("T")) {
						coluna = j;
						break;
					}
				}
			}
			
			space[0][coluna] = "-";
			
			if (coluna + posicoes < 70) {
				space[0][coluna + posicoes] = "T";
			} else {
				space[0][69] = "T";
			}
			
			
		} else {
			
			int coluna = 0;
			
			
			for (int i = 1; i < 2; i++) {
				for (int j = 0; j < space[1].length; j++) {
					if (space[i][j].equals("L")) {
						coluna = j;
						break;
					}
				}
			}
			
			space[1][coluna] = "-";
			
			if (coluna + posicoes < 70) {
				space[1][coluna + posicoes] = "L";
			} else {
				space[1][69] = "L";
			}
			
		}
		
	}
	
	public static void regressaPosicoes (String space[][], String corredor, int posicoes) {
		
		if (corredor.equals("T")) {
			
			int coluna = 0;
			
			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < space[0].length; j++) {
					if (space[i][j].equals("T")) {
						coluna = j;
						break;
					}
				}
			}
			
			space[0][coluna] = "-";
			
			if (coluna - posicoes >= 0) {
				space[0][coluna - posicoes] = "T";
			} else {
				space[0][0] = "T";
			}
			
		} else {
			
			int coluna = 0;
			
			for (int i = 1; i < 2; i++) {
				for (int j = 0; j < space[1].length; j++) {
					if (space[i][j].equals("L")) {
						coluna = j;
						break;
					}
				}
			}
			
			space[1][coluna] = "-";
			
			if (coluna - posicoes >= 0) {
				space[1][coluna - posicoes] = "L";
			} else {
				space[1][0] = "L";
			}
			
		}
		
	}
	
	public static String testaGanhador (String space[][]) {
		
		if (space[0][69].equals("T") && space[1][69].equals("L")) {
			return "E";
		} else if (space[0][69].equals("T")) {
			return "T";
		} else if (space[1][69].equals("L")) {
			return "L";
		} else {
			return "N";
		}
		
	}
	
	public static boolean verificaMesmaPosicao (String space[][]) {
		
		int coluna = 0;
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < space[0].length; j++) {
				if (space[i][j].equals("T")) {
					coluna = j;
					break;
				}
			}
		}
		
		if (space[1][coluna].equals("L")) {
			return true;
		} else {
			return false;
		}
		
	}
}