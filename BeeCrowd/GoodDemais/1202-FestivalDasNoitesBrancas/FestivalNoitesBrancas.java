import java.util.Scanner;
import java.util.ArrayList;

public class FestivalNoitesBrancas {

	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		
		int[] comparador = {100};
		inicializaFibonacci10(fibonacci);
		
		int reps = teclado.nextInt();
		teclado.nextLine();
		
		for (int i = 0; i < reps; i++) {
			
			String binario = teclado.nextLine();
			
			int decimal = binarioParaDecimal(binario);
			
			int numFi = retornaNumFibonacci(fibonacci, comparador, decimal);
			
			System.out.printf("%03d\n", numFi);
			
		}
		
		teclado.close();
		
	}
	
	public static int retornaNumFibonacci (ArrayList<Integer> fi, int[] compara, int n) {
		
		if (n <= compara[0]) {
			
			return fi.get(n-1);
			
		} else {
			
			for (int i = compara[0]; i < n; i++) {
				
				fi.add(((fi.get(i-1)%1000) + (fi.get(i-2)%1000))%1000);
				
			}
			
			compara[0] = n;
			
			return fi.get(n-1);
			
		}
		
	}
	
	public static int binarioParaDecimal (String bin) {
		
		int dec = 0;
		int aux = 1;
		
		for (int i = bin.length() - 1; i >= 0; i--) {
			
			dec += Integer.parseInt(Character.toString(bin.charAt(i)))*aux;
			
			aux *= 2;
			
		}
		
		return dec;
		
	}
	
	public static void inicializaFibonacci10 (ArrayList<Integer> fi) {
		
		fi.add(1);
		fi.add(1);
		
		for (int i = 2; i < 100; i++) {
			fi.add(fi.get(i-1) + fi.get(i-2));
		}
		
	}
	
}