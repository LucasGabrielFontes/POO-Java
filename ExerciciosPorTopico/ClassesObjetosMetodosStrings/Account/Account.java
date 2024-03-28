public class Account {
    // Atributos
    private String name;
    private double balance;

    // Método construtor
    public Account (String name, double balance) {
        this.name = name;
	if (balance > 0.0) {
	    this.balance = balance;
	}
    }

    // Métodos principais
    public void deposit (double depositAmount) {
	if (depositAmount > 0.0) {
	    this.balance += depositAmount;
	}
    }

    public void withdraw (double amount) {
	if (amount <= this.balance) {
	    this.balance -= amount;
	} else {
	    System.out.printf("Withdrawl amount exceeded account balance.\n");
	}
    }

    public double getBalance () {
	return balance;
    }

    public void setName (String name) {
	this.name = name;
    }

    public String getName () {
	return name;
    }
}