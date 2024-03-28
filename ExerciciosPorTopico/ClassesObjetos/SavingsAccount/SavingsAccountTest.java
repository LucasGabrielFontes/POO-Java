// Autor: Lucas Gabriel Fontes da Silva
// Propósito: simular a mudança no saldo da poupança de clientes com diferentes taxas de juros

public class SavingsAccountTest {

	public static void main (String[] args) {
	
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(4);
		
		System.out.printf("One year with the annual interest rate of 4 percent: \n\n");
		System.out.printf("          saver1      saver2\n\n");
		
		for (int i = 0; i < 12; i++) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			
			System.out.printf("Month %02d: %.2f     %.2f", i+1, saver1.getSavingsBalance(), saver2.getSavingsBalance());
			
			System.out.printf("\n");
		}
		
		SavingsAccount.modifyInterestRate(5);
		
		System.out.printf("\nOne month after changing the annual interest rate from 4 percent to 5 percent:\n\n");
	
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.printf("saver1: R$%.2f\n", saver1.getSavingsBalance());
		System.out.printf("saver2: R$%.2f\n", saver2.getSavingsBalance());
	}

}