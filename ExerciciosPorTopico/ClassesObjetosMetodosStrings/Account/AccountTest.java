import java.util.Scanner;

public class AccountTest {
    public static void main (String[] args) {
	Account account1 = new Account("João Silva", 0.0);
	
	Scanner teclado = new Scanner(System.in);

	System.out.printf("Please enter your name: ");
	String name = teclado.nextLine();
	account1.setName(name);

	System.out.printf("Please enter deposit amount for account of %s: ", account1.getName());
	double amount = teclado.nextDouble();
	account1.deposit(amount);

	System.out.printf("Please enter withdraw amount for account of %s: ", account1.getName());
	amount = teclado.nextDouble();
	account1.withdraw(amount);

	System.out.printf("%s's account balance: %.2f", account1.getName(), account1.getBalance());
    }
}