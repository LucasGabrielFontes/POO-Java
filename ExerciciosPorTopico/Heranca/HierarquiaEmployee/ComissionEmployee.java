public class ComissionEmployee extends Employee {
	
	// Variáveis de instância
	private double grossSales;
	private double comissionRate;
	
	// Método construtor
	public ComissionEmployee (String firstName, String lastName, String socialSecurityNumber, double grossSales, double comissionRate) {
		
		super(firstName, lastName, socialSecurityNumber);
		
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross Sales must be >= 0.0");
		}
		
		if (comissionRate < 0.0 || comissionRate >= 1) {
			throw new IllegalArgumentException("Comission Rate must be > 0.0 and < 1.0");
		}
		
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
		
	}
	
	// Métodos get e set
	public double getGrossSales () {
		return grossSales;
	}
	
	public void setGrossSales (double grossSales) {
		
		if (grossSales < 0.0) {
			throw new IllegalArgumentException("Gross Sales must be > 0.0");
		}
		
		this.grossSales = grossSales;
		
	}
	
	public double getComissionRate () {
		return comissionRate;
	}
	
	public void setComissionRate (double comissionRate) {
		
		if (comissionRate < 0.0 || comissionRate >= 1.0) {
			throw new IllegalArgumentException("Comission Rate must be > 0.0 and < 1.0");
		}
		
		this.comissionRate = comissionRate;
		
	}
	
	// Método toString
	@Override
	public String toString () {
		return super.toString() + String.format("Gross Sales: %.2f\nComission Rate: %.2f\n", 
		getGrossSales(), getComissionRate());
	}
	
	// Métodos principais
	public double earnings () {
		return getComissionRate() * getGrossSales();
	}
	
}