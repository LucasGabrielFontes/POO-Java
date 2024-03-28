// Autor: Lucas Gabriel Fontes da Silva
// Propósito: imprimir triângulos de modo a exercitar a percepção de padrões

public class TriangulosPadroes {
	public static void main (String[] args) {
		int cont = 1;
		
		for (int i = 0; i < 10; i++) {
			for (int aux = 0; aux < cont; aux++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			cont += 1;
		}
		
		cont -= 1;
		
		System.out.printf("\n\n");
		
		for (int i = 0; i < 10; i++) {
			for (int aux = 0; aux < cont; aux++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			cont -= 1;
		}
		
		int espacos = 0;
		cont = 10;
		
		System.out.printf("\n\n");
		
		for (int i = 0; i < 10; i++) {
			for (int aux = 0; aux < espacos; aux++) {
				System.out.printf(" ");
			}
			for (int aux = 0; aux < cont; aux ++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			cont -= 1;
			espacos += 1;
		}
		
		espacos -= 1;
		cont += 1;
		
		System.out.printf("\n\n");
		
		for (int i = 0; i < 10; i++) {
			for (int aux = 0; aux < espacos; aux++) {
				System.out.printf(" ");
			}
			for (int aux = 0; aux < cont; aux ++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			espacos -= 1;
			cont += 1;
		}
	}
}