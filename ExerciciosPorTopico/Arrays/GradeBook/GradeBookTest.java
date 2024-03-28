import javax.swing.JOptionPane;

public class GradeBookTest {
	public static void main (String[] args) {
		String curso = JOptionPane.showInputDialog("Seja bem-vindo ao Livro" +
		" de notas!\n\nPara começar, informe o nome do curso:");
		
		int TAM = Integer.parseInt(JOptionPane.showInputDialog("Agora, informe quantos alunos há na sala:"));
	
		while (TAM < 0) {
			TAM = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos inválida!" +
			" Tente novamente:"));
		}
	
		double notas[] = new double[TAM];
		String nomes[] = new String[TAM];
		
		for (int i = 0; i < TAM; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe o nome do aluno " + (i+1) + ":");
			notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Infome a nota de " + nomes[i] + ":"));
			while (notas[i] < 0) {
				notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Nota de " + nomes[i] + " inválida! Tente novamente:"));
			}
		}
		
		GradeBook myGradeBook = new GradeBook(curso, notas, nomes);
		
		JOptionPane.showMessageDialog(null, myGradeBook.mostraNotas() + 
		myGradeBook.mostraMedia() + myGradeBook.mostraMenorNota() +
		myGradeBook.mostraMaiorNota() + myGradeBook.mostraGraficoBarras());
	}
}