// Autor: Lucas Gabriel Fontes da Silva
// Propósito: simular o sistema de um estacionamento que cobra R$2,00 pelas três primeiras 
// horas mais R$0,5 pelas horas (ou fragmentos de hora) adicionais

import javax.swing.JOptionPane;

public class Estacionamento {
	public static void main (String[] args) {
		int clientesDia = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de clientes do dia: "));
		double valorArr = 0.0;
	
		Cliente clientes[] = new Cliente[clientesDia];
	
		for (int i = 0; i < clientesDia; i++) {
			int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas de permanência do cliente " + (i+1) + ": "));
			int minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de minutos restantes de permanência do cliente " + (i+1) + ": "));
			clientes[i] = new Cliente (i+1, horas, minutos);
			clientes[i].calculaValorAP();
		}
		
		String mensagem = "Resumo do dia: \n\n";
		
		for (int i = 0; i < clientesDia; i++) {
			mensagem += "Cliente " + (i+1) + ": R$" + clientes[i].getValorAP() + "  |  " + clientes[i].getHoras() + "h " + clientes[i].getMinutos() + "min" + "\n";
			valorArr += clientes[i].getValorAP();
		}
		mensagem += "\nTotal arrecadado: R$" + valorArr + ".";
		
		JOptionPane.showMessageDialog(null, mensagem);
	}
}