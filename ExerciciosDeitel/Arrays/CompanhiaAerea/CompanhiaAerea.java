// Autor: Lucas Gabriel Fontes da Silva
// Propósito: simular um sistema de compras de passagens aéreas

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.security.SecureRandom;

public class CompanhiaAerea {
	
	public static void main (String[] args) {
		boolean[] assentosP1 = new boolean[5];
		boolean[] assentosP2 = new boolean[5];
		
		int prosseguir = 0;
		int contador = 0;
		
		ArrayList<Passageiro> passageiros = new ArrayList<Passageiro>();
		
		do {
			
			int resp = Integer.parseInt(JOptionPane.showInputDialog("========== EP AIR LINES ==========\n\n" +
			"Seja muito bem-vindo ao site da EP Air Lines!\nEscolha uma opção:\n\n" + 
			"1- Reservar assento\n2- Sair\n\n"));
		
			while (resp != 1 && resp != 2) {
				resp = Integer.parseInt(JOptionPane.showInputDialog("========== EP AIR LINES ==========\n\n" +
				"Opção inválida!\nTente novamente:\n\n" + 
				"1- Reservar assento\n2- Sair\n"));
			}
		
			if (resp == 1) {
				
				String nome = JOptionPane.showInputDialog("========== EP AIR LINES ==========\n\n" +
				"Para começar seu cadastro, insira o seu nome, por gentileza:\n");
				
				long cpf = Long.parseLong(JOptionPane.showInputDialog("========== EP AIR LINES ==========\n\n" +
				"Por fim, insira o seu CPF (apenas número, sem qualquer tipo de pontuação):\n\n"));
			
				while (calculaTamanhoCpf(cpf) != 11) {
					cpf = Long.parseLong(JOptionPane.showInputDialog("========== EP AIR LINES ==========\n\n" +
					"O CPF inserido é inválido! Tente novamente:\n\n"));
				}
				
				passageiros.add(new Passageiro(nome, cpf)); 
				
				int classeEscolhida = 0;
				
				if (verificaDisponibilidadeAssentos(assentosP1) && verificaDisponibilidadeAssentos(assentosP2)) {
					classeEscolhida = Integer.parseInt(JOptionPane.showInputDialog("========== EP AIR LINES ==========\n\n" +
					"Escolha a classe desejada:\n\n" +
					"1- Primeira Classe\n" +
					"2- Segunda Classe\n\n"));
					
					while (classeEscolhida != 1 && classeEscolhida != 2) {
						classeEscolhida = Integer.parseInt(JOptionPane.showInputDialog("========== EP AIR LINES ==========\n\n" +
						"Escolha inválida! Tente novamente:\n\n" +
						"1- Primeira Classe" +
						"2- Segunda Classe\n\n"));
					}
					
					SecureRandom aleatorio = new SecureRandom();
					
					if (classeEscolhida == 1) {
						int assento = aleatorio.nextInt(5);
						
						while (assentosP1[assento]) {
							assento = aleatorio.nextInt(5);
						}
						
						assentosP1[assento] = true;
						
						if (verificaDisponibilidadeAssentos(assentosP1) || verificaDisponibilidadeAssentos(assentosP2)) {
							prosseguir = Integer.parseInt(JOptionPane.showInputDialog(null, "===== CARTÃO DE EMBARQUE =====\n\n" + 
							"Nome: " + passageiros.get(contador).getNome() + "\n" +
							"CPF: " + (passageiros.get(contador).getCpf())/1000000 + "******" + "\n" +
							"Assento: " + (assento+1) + "\n" + 
							"Primeira classe.\n\n" +
							"Opções:\n" +
							"1- Voltar à página inicial\n" +
							"2- Sair\n\n"));
						} else {
							JOptionPane.showMessageDialog(null, "===== CARTÃO DE EMBARQUE =====\n\n" + 
							"Nome: " + passageiros.get(contador).getNome() + "\n" +
							"CPF: " + (passageiros.get(contador).getCpf())/1000000 + "******" + "\n" +
							"Assento: " + (assento+1) + "\n" + 
							"Primeira classe.\n\n" +
							"Obrigado por escolher a EP Airlines!\n");
						}
						
						
					} else {
						int assento = aleatorio.nextInt(5);
						
						while (assentosP2[assento]) {
							assento = aleatorio.nextInt(5);
						}
						
						assentosP2[assento] = true;
						
						if (verificaDisponibilidadeAssentos(assentosP1) || verificaDisponibilidadeAssentos(assentosP2)) {
							
							prosseguir = Integer.parseInt(JOptionPane.showInputDialog(null, "===== CARTÃO DE EMBARQUE =====\n\n" + 
							"Nome: " + passageiros.get(contador).getNome() + "\n" +
							"CPF: " + (passageiros.get(contador).getCpf())/1000000 + "******" + "\n" +
							"Assento: " + (assento+6) + "\n" + 
							"Segunda classe.\n\n"+
							"Opções:\n" +
							"1- Voltar à página inicial\n" +
							"2- Sair\n\n"));
							
						} else {
							JOptionPane.showMessageDialog(null, "===== CARTÃO DE EMBARQUE =====\n\n" + 
							"Nome: " + passageiros.get(contador).getNome() + "\n" +
							"CPF: " + (passageiros.get(contador).getCpf())/1000000 + "******" + "\n" +
							"Assento: " + (assento+6) + "\n" + 
							"Segunda classe.\n\n" +
							"Obrigado por escolher a EP Airlines!\n");
						}
					}
				} else if (verificaDisponibilidadeAssentos(assentosP1)){
					int escolha = Integer.parseInt(JOptionPane.showInputDialog("========== EP AIR LINES ==========\n\n" +
					"Olá, " + passageiros.get(contador).getNome() + "! Por questões de grande movimentação de pessoas, temos disponíveis " +
					"apenas assentos na Primeira Classe. Insira o que você deseja fazer: \n\n" +
					"1- Adquirir assento na Primeira Classe\n" +
					"2- Esperar próximo voo\n\n"));
					
					while (escolha != 1 && escolha != 2) {
						escolha = Integer.parseInt(JOptionPane.showInputDialog("========== EP AIR LINES ==========\n\n" +
						"Escolha inválida! Tente novamente: \n\n" +
						"1- Adquirir assento na Primeira Classe\n" +
						"2- Esperar próximo voo\n\n"));
					}
					
					if (escolha == 1) {
						SecureRandom aleatorio = new SecureRandom();
						
						int assento = aleatorio.nextInt(5);
						
						while (assentosP1[assento]) {
							assento = aleatorio.nextInt(5);
						}
						
						assentosP1[assento] = true;
						
						if (verificaDisponibilidadeAssentos(assentosP1)) {
							
							prosseguir = Integer.parseInt(JOptionPane.showInputDialog(null, "===== CARTÃO DE EMBARQUE =====\n\n" + 
							"Nome: " + passageiros.get(contador).getNome() + "\n" +
							"CPF: " + (passageiros.get(contador).getCpf())/1000000 + "******" + "\n" +
							"Assento: " + (assento+1) + "\n" + 
							"Primeira classe.\n\n" +
							"Opções:\n" +
							"1- Voltar à página inicial\n" +
							"2- Sair\n\n"));
							
						} else {
							JOptionPane.showMessageDialog(null, "===== CARTÃO DE EMBARQUE =====\n\n" + 
							"Nome: " + passageiros.get(contador).getNome() + "\n" +
							"CPF: " + (passageiros.get(contador).getCpf())/1000000 + "******" + "\n" +
							"Assento: " + (assento+6) + "\n" + 
							"Segunda classe.\n\n" +
							"Obrigado por escolher a EP Airlines!\n");
						}
						
					} else {
						JOptionPane.showMessageDialog(null, "Nosso próximo voo para o seu destino partirá em 3 horas." +
						" Fique atento aos horários, hein! Nos vemos logo.");
					}
				} else if (verificaDisponibilidadeAssentos(assentosP2)) {
					int escolha = Integer.parseInt(JOptionPane.showInputDialog("========== EP AIR LINES ==========\n\n" +
					"Olá, " + passageiros.get(contador).getNome() + "! Por questões de grande movimentação de pessoas, temos disponíveis " +
					"apenas assentos na Segunda Classe. Insira o que você deseja fazer: \n\n" +
					"1- Adquirir assento na Segunda Classe\n" +
					"2- Esperar próximo voo\n\n"));
					
					while (escolha != 1 && escolha != 2) {
						escolha = Integer.parseInt(JOptionPane.showInputDialog("========== EP AIR LINES ==========\n\n" +
						"Escolha inválida! Tente novamente: \n\n" +
						"1- Adquirir assento na Segunda Classe\n" +
						"2- Esperar próximo voo\n\n"));
					}
					
					if (escolha == 1) {
						SecureRandom aleatorio = new SecureRandom();
						
						int assento = aleatorio.nextInt(5);
						
						while (assentosP2[assento]) {
							assento = aleatorio.nextInt(5);
						}
						
						assentosP2[assento] = true;
						
						
						if (verificaDisponibilidadeAssentos(assentosP2)) {
							
							prosseguir = Integer.parseInt(JOptionPane.showInputDialog(null, "===== CARTÃO DE EMBARQUE =====\n\n" + 
							"Nome: " + passageiros.get(contador).getNome() + "\n" +
							"CPF: " + (passageiros.get(contador).getCpf())/1000000 + "******" + "\n" +
							"Assento: " + (assento+6) + "\n" + 
							"Segunda classe.\n\n" +
							"Opções: \n" +
							"1- Voltar à página inicial\n" +
							"2- Sair\n\n"));
							
						} else {
							JOptionPane.showMessageDialog(null, "===== CARTÃO DE EMBARQUE =====\n\n" + 
							"Nome: " + passageiros.get(contador).getNome() + "\n" +
							"CPF: " + (passageiros.get(contador).getCpf())/1000000 + "******" + "\n" +
							"Assento: " + (assento+6) + "\n" + 
							"Segunda classe.\n\n" +
							"Obrigado por escolher a EP Airlines!\n");
						}
						
						
					} else {
						JOptionPane.showMessageDialog(null, "Nosso próximo voo para o seu destino partirá em 3 horas." +
						" Fique atento aos horários, hein! Nos vemos logo.");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Por questões de lotação, todos os assentos já estão ocupados.\n\n" +
					"Não se preocupe, pois há outro voo para o mesmo destino daqui a 3 horas.\n\n" +
					"Fique atento e nos vemos logo!");
				}
			}
			
			contador += 1;
			
		} while (prosseguir == 1);
	}
	
	public static int calculaTamanhoCpf (long cpf) {
		int tam = 0;
		
		for (; cpf != 0; cpf /= 10) {
			tam += 1;
		}
		
		return tam;
	}
	
	public static boolean verificaDisponibilidadeAssentos (boolean[] assentos) {
		
		for (int i = 0; i < assentos.length; i++) {
			if (!assentos[i]) {
				return true;
			}
		}
		
		return false;
	}
}