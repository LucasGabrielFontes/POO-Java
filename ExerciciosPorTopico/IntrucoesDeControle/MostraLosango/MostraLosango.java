// Autor: Lucas Gabriel Fontes da Silva
// Propósito: apresentar um losango por meio da busca de padrões

public class MostraLosango {
	public static void main (String[] args) {
		int espacos = 4;
		int ast = 1;
		
		for (int i = 0; i < 9; i++) {
			if (i < 5) {
				for (int aux = 0; aux < espacos; aux++) {
					System.out.printf(" ");
				}
				for (int aux = 0; aux < ast; aux ++) {
					System.out.printf("*");
				}
				System.out.printf("\n");
				if (i != 4) {
					espacos -= 1;
					ast += 2;
				} else {
					espacos += 1;
					ast -= 2;
				}
			} else {
				for (int aux = 0; aux < espacos; aux++) {
					System.out.printf(" ");
				}
				for (int aux = 0; aux < ast; aux ++) {
					System.out.printf("*");
				}
				System.out.printf("\n");
				espacos += 1;
				ast -= 2;
			}
		}
	}
}