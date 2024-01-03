import java.util.Scanner;

public class EmployeeTest {
    public static void main (String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	Employee employees[] = new Employee[2];

	for (int i = 0; i < 2; i++) {
	    System.out.printf("Digite o nome do employee %d: ", i+1);
	    String nome = teclado.nextLine();
	
	    System.out.printf("Digite o sobrenome do employee %d: ", i+1);
	    String sobrenome = teclado.nextLine();

	    System.out.printf("Digite o salário mensal do employee %d: ", i+1);
	    double salario = teclado.nextDouble();
	    teclado.nextLine();

	    employees[i] = new Employee(nome, sobrenome, salario);
	}

	for (int i = 0; i < 2; i++) {
	    System.out.printf("Salário anual de %s: %.2f\n", employees[i].getNome(), (employees[i].getSalario() * 12)); 
	}

	for (int i = 0; i < 2; i++) {
	    System.out.printf("Salário de %s com um aumento de 10%%: %.2f\n", employees[i].getNome(), (employees[i].getSalario() * 1.1)); 
	}

	for (int i = 0; i < 2; i++) {
	    System.out.printf("Salário anual de %s com o aumento de 10%%: %.2f\n", employees[i].getNome(), (employees[i].getSalario() * 12) * 1.1);
	}
    }
}
