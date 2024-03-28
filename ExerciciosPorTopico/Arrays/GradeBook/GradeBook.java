public class GradeBook {
	// Atributos
	private String courseName;
	private double[] grades;
	private String[] names;
	
	// Método construtor
	public GradeBook (String courseName, double[] grades, String[] names) {
		this.courseName = courseName;
		this.grades = grades;
		this.names = names;
	}
	
	// Métodos getters e setters
	public String getCourseName () {
		return courseName;
	}
	
	public void setCourseName (String courseName) {
		this.courseName = courseName;
	}
	
	
	// Métodos principais
	public String mostraNotas () {
		String notas = "Notas da turma de " + this.courseName + ": \n\n";
		
		for (int i = 0; i < grades.length; i++) {
			notas += (names[i] + ": " + grades[i] + "\n");
		}
		
		return notas;
	}
	
	public String mostraMedia () {
		String average = "\nMédia da turma: ";
		double media = 0.0;
		
		for (int i = 0; i < grades.length; i++) {
			media += grades[i];
		}
		
		media /= grades.length;
		
		average += String.format("%.2f\n", media);
		
		return average;
	}
	
	public String mostraMenorNota () {
		String menorS = "\nMenor nota: ";
		double menor = grades[0];
		
		for (int i = 1; i < grades.length; i++) {
			if (grades[i] < menor) {
				menor = grades[i];
			}
		}
		
		menorS += menor + "\n";
		
		return menorS;
	}
	
	public String mostraMaiorNota () {
		String maiorS = "\nMaior nota: ";
		double maior = grades[0];
		
		for (int i = 1; i < grades.length; i++) {
			if (grades[i] > maior) {
				maior = grades[i];
			}
		}
		
		maiorS += maior + "\n";
		
		return maiorS;
	}
	
	public String mostraGraficoBarras () {
		String barras = "\nGráfico de barras das notas: \n";
		
		for (int i = 0; i < 10; i++) {
			barras += String.format("%02d-%.1f: ", i, i+0.9);
			
			for (int aux = 0; aux < grades.length; aux++) {
				if (grades[aux] >= i && grades[aux] <= i+0.9) {
					barras += "*";
				}
			}
			
			barras += "\n";
			
			if (i == 9) {
				barras += String.format("       10: ");
				
				for (int aux = 0; aux < grades.length; aux++) {
					if (grades[aux] == 10) {
						barras += "*";
					}
				}
				
				barras += "\n";
			}
		}
		
		return barras;
	}
}