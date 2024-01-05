// Autor: Lucas Gabriel Fontes da Silva
// Propósito: apresentar um losango
//, com número de linhas definido pelo usuário
//, por meio da busca de padrões

import java.util.Scanner;

public class MostraLosangoModificado {
	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int espacos = 0;
		int ast = 0;
		int linhas = 0;
		String resp = "";
		
		do {
			System.out.printf("Digite a quantidade de linhas (número ímpar entre 1 e 19) do losango: ");
			linhas = teclado.nextInt();
			teclado.nextLine();
			while (linhas < 1 || linhas > 19 || linhas % 2 != 1) {
				System.out.printf("Quantidade de linhas inválida. Tente novamente: ");
				linhas = teclado.nextInt();
				teclado.nextLine();
			}
			espacos = 9;
			ast = 1;
			for (int i = 0; i < linhas; i++) {
				if (i < (linhas/2)+1) {
					for (int aux = 0; aux < espacos; aux++) {
						System.out.printf(" ");
					}
					for (int aux = 0; aux < ast; aux ++) {
						System.out.printf("*");
					}
					System.out.printf("\n");
					if (i != (linhas/2)) {
						espacos -= 1;
						ast += 2;
					} 	else {
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
			System.out.printf("\n");
			System.out.printf("Deseja testar outra quantidade de linhas? [S/N]: ");
			resp = teclado.nextLine();
		} while (!resp.toUpperCase().equals("N"));	
	}
}