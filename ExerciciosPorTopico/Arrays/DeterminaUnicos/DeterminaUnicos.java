// Autor: Lucas Gabriel Fontes da Silva
// Propósito: formar um conjunto numérico sem repetição de números a partir
// de entradas do usuário

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class DeterminaUnicos {
	public static void main (String[] args) {
		int[] array = new int[5];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira um número entre 10 e 100:"));
		
			while (array[i] < 10 || array[i] > 100) {
				array[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor inválido! " 
				+"Insira um número entre 10 e 100:"));
			}
		}
		
		ArrayList<Integer> conjunto = new ArrayList<Integer>();
			
		conjunto.add(array[0]);
			
		for (int i = 1; i < array.length; i++) {
			int teste = 0;
				
			for (int aux = 0; aux < i; aux++) {
				if (array[i] == array[aux]) {
					teste += 1;
				}
			}
				
			if (teste == 0) {
				conjunto.add(array[i]);
			}
		}
		
		Collections.sort(conjunto);
		
		String resultado = "Conjunto formado pelos números únicos: \n\n{";
		
		for (int i = 0; i < conjunto.size(); i++) {
			if (i+1 != conjunto.size()) {
				resultado += conjunto.get(i) + ", ";
			} else {
				resultado += conjunto.get(i);
			}
		}
		
		resultado += "}";
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}