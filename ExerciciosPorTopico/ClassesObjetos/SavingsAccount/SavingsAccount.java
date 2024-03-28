public class SavingsAccount {

	// Atributos
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount (double balance) {
		this.savingsBalance = balance;
	}
	
	public SavingsAccount () {
		this(0);
	}
	
	// Métodos get e set
	public double getAnnualInterestRate () {
		return annualInterestRate;
	}
	
	public static void modifyInterestRate (double rate) {
		
		if (rate < 0) {
			throw new IllegalArgumentException("annual interest rate must be >= 0");
		}
		
		annualInterestRate = rate;
		
	}
	
	public double getSavingsBalance () {
		return savingsBalance;
	}
	
	public void setSavingsBalance (double balance) {
		
		if (balance < 0) {
			throw new IllegalArgumentException("savings balance must be > 0");
		}
		
		this.savingsBalance = balance;
	}

	// Método principal
	public void calculateMonthlyInterest () {
		this.setSavingsBalance(this.getSavingsBalance() + (this.getSavingsBalance()*(annualInterestRate/1200)));
	}
	
}