// Autor: Lucas Gabriel Fontes da Silva
// Propósito: praticar os métodos construtores sobrecarregados, o tratamento de exceções e a mudança de dados para o usuário

import java.util.Scanner;

public class TimeTest {

	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Escolha um opção para inserir a hora: \n\n" +
		"1- Iniciar por padrão\n" +
		"2- Horas, minutos e segundos\n" +
		"3- Horas\n" +
		"4- Horas e minutos\n");
		int escolha = teclado.nextInt();
		
		while (escolha < 1 || escolha > 4) {
			System.out.printf("Escolha inválida. Tente novamente: ");
			escolha = teclado.nextInt();
		}
		
		Time time;
		
		switch (escolha) {
			
			case 1:
			
				time = new Time();
				
				System.out.printf("Modelo padrão: %s\nHorário em segundos: %d\n", time.toUniversalString(), time.getSegundos());
			
			break;
			
			case 2:
			
				System.out.printf("Digite as horas, minutos e segundos separas por um espaço: ");
				int horas = teclado.nextInt();
				int minutos = teclado.nextInt();
				int segundos = teclado.nextInt();
				
				try {
					time = new Time(horas, minutos, segundos);
					System.out.printf("Modelo padrão: %s\nHorário em segundos: %d\n", time.toUniversalString(), time.getSegundos());
				} catch (IllegalArgumentException e) {
					System.out.printf("%s\n", e.getMessage());
				}
				
			break;
			
			case 3:
			
				System.out.printf("Digite as horas: ");
				horas = teclado.nextInt();
				
				try {
					time = new Time(horas);
					System.out.printf("Modelo padrão: %s\nHorário em segundos: %d\n", time.toUniversalString(), time.getSegundos());
				} catch (IllegalArgumentException e) {
					System.out.printf("%s\n", e.getMessage());
				}
				
			break;
			
			case 4:
					
				System.out.printf("Digite as horas e os minutos separados por um espaço: ");
				horas = teclado.nextInt();
				minutos = teclado.nextInt();
				
				try {
					time = new Time(horas, minutos);
					System.out.printf("Modelo padrão: %s\nHorário em segundos: %d\n", time.toUniversalString(), time.getSegundos());
				} catch (IllegalArgumentException e) {
					System.out.printf("%s\n", e.getMessage());
				}
					
			break;
			
		}
		
	}

}