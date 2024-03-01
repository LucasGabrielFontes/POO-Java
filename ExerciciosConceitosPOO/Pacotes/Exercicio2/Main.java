import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Objeto[] cenario = new Objeto[] {
			Scene.criarObjeto("Frodo", 1, 1),
			Scene.criarObjeto("Bilbo", 2, 1),
			Scene.criarObjeto(1, 2, 1, 1)
		};

		Scanner scanner = new Scanner(System.in);

		int n = cenario.length - 1;
		while (true) {

			try {
				System.out.println("Escolha um objeto de 0 a " + n + ":");
				int i = Integer.parseInt(scanner.nextLine());
				System.out.println(cenario[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.printf("O índice inserido é inválido\n");
			}
			
		}

	}

}
