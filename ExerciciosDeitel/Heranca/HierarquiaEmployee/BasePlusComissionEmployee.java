public class BasePlusComissionEmployee extends ComissionEmployee {

	// Variável de instância
	private double baseSalary;
	
	// Método construtor
	public BasePlusComissionEmployee (String firstName, String lastName, 
	String socialSecurityNumber, double grossSales, double comissionRate, 
	double baseSalary) {
		
		super(firstName, lastName, socialSecurityNumber, grossSales, comissionRate);
		
		if (baseSalary < 0.0) {
			
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
			
		}
		
		this.baseSalary = baseSalary;
		
	}
	
	// Métodos get e set
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary (double baseSalary) {
		
		if (baseSalary < 0.0) {
			
			throw new IllegalArgumentException("Base Salary must be >= 0.0");
			
		}
		
		this.baseSalary = baseSalary;
		
	}
	
	// Método toString 
	@Override
	public String toString () {
		return super.toString() + String.format("Base Salary: %.2f\n", getBaseSalary());
	}
	
	// Métodos principais
	@Override
	public double earnings() {
		return super.earnings() + getBaseSalary();
	}

}