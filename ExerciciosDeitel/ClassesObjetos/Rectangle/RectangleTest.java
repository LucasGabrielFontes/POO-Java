// Autor: Lucas Gabriel Fontes da Silva
// Propósito: analisar o funcionamento das estruturas throw e try... catch

import java.util.Scanner;

public class RectangleTest {

	public static void main (String[] args) {
	
		Scanner teclado = new Scanner(System.in);
	
		Rectangle ret = new Rectangle();
	
		System.out.printf("Digite o comprimento do retângulo: ");
		double comp = teclado.nextDouble();
		try {
			ret.setComprimento(comp);
		} catch (IllegalArgumentException e) {
			System.out.printf("%s\n\n", e.getMessage());
		}
		
		System.out.printf("Digite a largura do retângulo: ");
		double larg = teclado.nextDouble();
		try {
			ret.setLargura(larg);
		} catch (IllegalArgumentException e) {
			System.out.printf("%s\n\n", e.getMessage());
		}
		
		System.out.printf("Perimetro do retângulo %.2f x %.2f: %.2f\n", ret.getComprimento(), ret.getLargura(), ret.calculaPerimetro());
		System.out.printf("Área do retângulo %.2f x %.2f: %.2f\n\n", ret.getComprimento(), ret.getLargura(), ret.calculaArea());
		System.out.printf("Se você digitou algum valor inválido, o valor do comprimento e/ou da largura continuaram sendo os valores padrão: 1\n");
	}

}