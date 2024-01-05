// Autor: Lucas Gabriel Fontes da Silva
// Propósito: calcular o valor aproximado de Pi com uma sequência padronizada

public class CalculaPi {
	public static void main (String[] args) {
		int denom = 3;
		double pi = 4;
		
		System.out.printf("Sequência utilizada para calcular PI:\n\n");
		System.out.printf("4 ");
		
		for (int i = 2; i <= 6; i++) {
			if (i % 2 == 0) {
				System.out.printf("- 4/%d ", denom);
			} else {
				System.out.printf("+ 4/%d ", denom);
			}
			denom += 2;
		}
		System.out.printf("+ ...");
		System.out.printf("\n\n");
		
		denom = 3;
		
		for (int i = 1; i < 200000; i++) {
			if (i % 2 == 1) {
				pi -= (double) 4/denom;
			} else {
				pi += (double) 4/denom;
			}
			denom += 2;
		}
		
		System.out.printf("Valor aproximado de PI com a soma dos 200.000 primeiros termos da sequência: %.5f." ,pi);
	}
}